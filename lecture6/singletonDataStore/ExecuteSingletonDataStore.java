package lecture6.singletonDataStore;

public class ExecuteSingletonDataStore {
    public static void main(String[] args) {
        System.out.println("---------------------- Non Singleton Data Store ----------------------");
        System.out.println("First data store");
        MyNonSingletonDataStore dataStore = new MyNonSingletonDataStore();
        dataStore.setData("Hello");
        System.out.println("from first data store: " + dataStore.getData());

        System.out.println("Another data store changing the data");
        MyNonSingletonDataStore anotherDataStore = new MyNonSingletonDataStore();
        System.out.println("from another data store: " + anotherDataStore.getData());

        anotherDataStore.setData("Goodbye");
        System.out.println("from first data store: " + dataStore.getData());

        System.out.println("---------------------- Singleton Data Store ----------------------");
        System.out.println("First data store");
        MySingletonDataStore dataStoreSingleton = MySingletonDataStore.getInstance();
        dataStoreSingleton.setData("Hello");
        System.out.println("from first data store: " + dataStoreSingleton.getData());

        System.out.println("Another data store changing the data");
        MySingletonDataStore anotherDataStoreSingleton = MySingletonDataStore.getInstance();
        System.out.println("from another data store: " + anotherDataStoreSingleton.getData());

        anotherDataStoreSingleton.setData("Goodbye");
        System.out.println("from first data store: " + dataStoreSingleton.getData());
    }
}
