package Week3.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySQLDatabaseManager();
        customerManager.getCustomers();

    }
}
