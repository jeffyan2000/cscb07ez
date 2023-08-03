package lecture6.observerPoints;

public class ExecuteObserverPoints {
    public static void main(String[] args) {
        Student jeff = new Student("Jeff");
        ParticipationPoint participationPoint = new ParticipationPoint();
        jeff.addObserver(participationPoint);

        System.out.println("Jeff has " + participationPoint.getPoints() + " points.");
        jeff.answerQuestion();
        System.out.println("Jeff has " + participationPoint.getPoints() + " points.");
        jeff.answerQuestion();
        System.out.println("Jeff has " + participationPoint.getPoints() + " points.");
    }
}
