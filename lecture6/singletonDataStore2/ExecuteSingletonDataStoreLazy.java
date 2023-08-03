package lecture6.singletonDataStore2;


public class ExecuteSingletonDataStoreLazy {
    public static void main(String[] args) {
        System.out.println("Create reference to lazy loaded singleton data store");
        MySingletonDataStoreLazy dataStoreLazy = MySingletonDataStoreLazy.getInstance();
        dataStoreLazy.setData("Hello");
        System.out.println("from lazy data store: " + dataStoreLazy.getData());

        System.out.println("Create reference to non-lazy loaded singleton data store");
        MySingletonDataStore dataStore = MySingletonDataStore.getInstance();
        dataStore.setData("Goodbye");
        System.out.println("from non-lazy data store: " + dataStore.getData());
    }
}
