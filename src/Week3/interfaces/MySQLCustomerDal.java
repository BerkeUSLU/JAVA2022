package Week3.interfaces;

public class MySQLCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("MySQL Customer Data Access Layer çalıştı!");
    }
}
