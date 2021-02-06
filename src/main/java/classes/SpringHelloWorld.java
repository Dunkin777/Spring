package classes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringHelloWorld implements InitializingBean, DisposableBean {
    private String message;

    public void getMessage() {
        System.out.println("Hello message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void doSomeJob() {
        System.out.println("This is another method to do some Job");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is method after init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("This is method after destroy");
    }
}
