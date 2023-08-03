package lecture6.singletonDataStore;

public class MyNonSingletonDataStore {
    private String data;

    public MyNonSingletonDataStore() {
        this.data = "nothing";
    }

    public String getData() {
        return data;
    }

    public void setData(String data) { 
        System.out.println("Data changed from " + this.data + " to " + data);
        this.data = data;
    }
}
