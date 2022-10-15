package Week3.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new SQLServerCustomerDal());
        //customerManager.iCustomerDal = new SQLServerCustomerDal();
        customerManager.add();
    }
}
