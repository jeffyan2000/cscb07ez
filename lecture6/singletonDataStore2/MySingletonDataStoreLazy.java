package lecture6.singletonDataStore2;

public class MySingletonDataStoreLazy {
    private static MySingletonDataStoreLazy instance;
    private String data;

    private MySingletonDataStoreLazy() {
        this.data = "nothing";
    }

    public static MySingletonDataStoreLazy getInstance() {
        if (instance == null) {
            instance = new MySingletonDataStoreLazy();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        System.out.println("Data changed from " + this.data + " to " + data);
        this.data = data;
    }
}
