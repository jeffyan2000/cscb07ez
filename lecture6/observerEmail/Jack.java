package lecture6.observerEmail;

public class Jack extends Student{
    public Jack() {
        super("Jack");
    }

    @Override
    public void update(MyObserverable observerable, String message) {
        super.update(observerable, message);
        System.out.println("Jack wants to know who wrote the email.");
        System.out.println("The email was written by " + ((EmailMessage)observerable).getSender() + ".");
    }
}
