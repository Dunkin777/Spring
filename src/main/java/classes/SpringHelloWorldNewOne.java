package classes;

public class SpringHelloWorldNewOne {
    String message;
    String newOnemessage;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNewOnemessage() {
        return newOnemessage;
    }

    public void setNewOnemessage(String newOnemessage) {
        this.newOnemessage = newOnemessage;
    }

    private void doSomeJob() {
        System.out.println("This is another method to do some Job Inherited From Base Bean");
    }
}
