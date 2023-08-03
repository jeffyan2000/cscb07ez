package lecture6.singletonDataStore;

public class MySingletonDataStore {
    private static MySingletonDataStore instance = null;
    private String data;

    private MySingletonDataStore() {
        this.data = "default";
    }

    public static MySingletonDataStore getInstance() {
        if (instance == null) {
            instance = new MySingletonDataStore();
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
