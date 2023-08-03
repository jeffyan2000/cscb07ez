package lecture6.observerPoints;

public class Student extends MyObserverable{
    private String name;

    public Student(String name) {
        super("");
        this.name = name;
    }

    public void answerQuestion() {
        System.out.println("Student " + name + " is answering the question.");
        this.setMessage("answerQuestion");
    }
}
