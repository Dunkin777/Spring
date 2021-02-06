package classes;

public class CountingSales {
    private int counter = 0;
    public void afterAdvice(){
        counter++;
        System.out.println("current count: " + counter);
    }
}
