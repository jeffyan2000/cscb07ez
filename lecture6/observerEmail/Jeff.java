package lecture6.observerEmail;

public class Jeff extends Student{
    public Jeff() {
        super("Jeff");
    }

    @Override
    public void update(MyObserverable observerable, String message) {
        super.update(observerable, message);
        System.out.println("Jeff wants to know when was the email sent.");
        System.out.println("The email was sent " + ((EmailMessage)observerable).getDate() + ".");
    }
}
