package Week3.interfaces;

public class CustomerManager {
    private ICustomerDal iCustomerDal;

    public CustomerManager(ICustomerDal iCustomerDal) {
        this.iCustomerDal = iCustomerDal;
    }
    public void add() {
        // iş kodları
        iCustomerDal.add();
    }
}
