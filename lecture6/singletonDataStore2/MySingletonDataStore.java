package lecture6.singletonDataStore2;

public class MySingletonDataStore {
    private static final MySingletonDataStore instance = new MySingletonDataStore();
    private String data;

    private MySingletonDataStore() {
        this.data = "nothing";
    }

    public static MySingletonDataStore getInstance() {
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
