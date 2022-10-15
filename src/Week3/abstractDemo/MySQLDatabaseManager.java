package Week3.abstractDemo;

public class MySQLDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySQL");
    }
}
