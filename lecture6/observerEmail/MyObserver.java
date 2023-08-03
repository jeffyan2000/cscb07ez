package lecture6.observerEmail;

public interface MyObserver {
    public void update(MyObserverable observerable, String message);
}
