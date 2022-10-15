package Week3.interfaces;

public class OracleCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Oracle Customer Data Access Layer çalıştı!");
    }
}
