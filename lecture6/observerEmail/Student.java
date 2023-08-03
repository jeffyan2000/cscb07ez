package lecture6.observerEmail;

public class Student implements MyObserver {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void update(MyObserverable observerable, String message) {
        System.out.println(name + " received message: " + message);
    }
}
