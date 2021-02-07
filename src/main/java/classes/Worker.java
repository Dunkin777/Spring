package classes;

public class Worker {
    private int id;
    private String firstName;
    private String lastName;
    private String Role;
    private int age;

    public Worker() {
    }

    public Worker(int id, String firstName, String lastName, String role, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Role = role;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
