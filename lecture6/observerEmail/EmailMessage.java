package lecture6.observerEmail;

public class EmailMessage extends MyObserverable{
    private String sender;
    private String date;

    public EmailMessage() {
        super("");
        this.sender = "Peter";
        this.date = "today";
    }

    public String getSender() {
        return sender;
    }

    public String getDate() {
        return date;
    }

    public void sendEmail() {
        System.out.println("Email sent.");
        setMessage("There is a new email");
    }
}
