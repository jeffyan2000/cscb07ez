package lecture6.observerEmail;

public class ExecuteObserverEmail {
    public static void main(String[] args) {
        EmailMessage email = new EmailMessage();
        Student jack = new Jack();
        Student jeff = new Jeff();
        email.addObserver(jack);
        email.addObserver(jeff);
        email.sendEmail();
    }
}
