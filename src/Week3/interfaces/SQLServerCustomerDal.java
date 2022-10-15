package Week3.interfaces;

public class SQLServerCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("SQL Server Customer Data Access Layer çalıştı!");
    }
}
