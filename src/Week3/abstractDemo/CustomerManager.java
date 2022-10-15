package Week3.abstractDemo;

public class CustomerManager {
    BaseDatabaseManager baseDatabaseManager;
    public void getCustomers() {
        baseDatabaseManager.getData();
    }
}
