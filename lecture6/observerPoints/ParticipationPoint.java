package lecture6.observerPoints;

public class ParticipationPoint implements MyObserver{
    private int points;

    public ParticipationPoint() {
        this.points = 0;
    }

    @Override
    public void update(MyObserverable observerable, String message) {
        System.out.println("Participation point received a message: " + message);
        this.points++;
    }

    public String getPoints() {
        return "" + this.points;
    }
}
