package Week3.abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Veri getirildi : ORACLE");
    }
}
