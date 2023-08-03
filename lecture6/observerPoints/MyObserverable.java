package lecture6.observerPoints;

import java.util.ArrayList;
import java.util.List;

public class MyObserverable {
    private String message;
    private List<MyObserver> observers;

    public MyObserverable(String message) {
        this.message = message;
        this.observers = new ArrayList<MyObserver>();
    }

    public void addObserver(MyObserver observer) {
        this.observers.add(observer);
    }

    public void notifyObserver() {
        this.observers.forEach(observer -> observer.update(this, this.message));
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }
}
