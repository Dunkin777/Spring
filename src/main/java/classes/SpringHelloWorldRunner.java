package classes;

import classes.events.CustomEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springXMLConfig.xml");

        context.start(); //запускаем приложение

        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.getMessage();

        SpringHelloWorldNewOne springHelloWorldNewOne = (SpringHelloWorldNewOne) context.getBean("springHelloWorldNewOne");
        System.out.println(springHelloWorldNewOne.getNewOnemessage());

        CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("publisher");

        SellDepartment sellDepartment = (SellDepartment) context.getBean("sellDepartment");
        sellDepartment.sellProduct(); //внедрена зависсимость DI

        publisher.publishEvent();

        Seller sellerMisha = (Seller) context.getBean("sellerMisha");
        sellerMisha.getMood();
        sellerMisha.getRating();
        sellerMisha.getDocuments();
        sellerMisha.getPrices();


        context.stop();
    }
}
