package Week3.OOP;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        CustomerManager customerManagerTwo = new CustomerManager(new Customer(), new CarCreditManager());
        CustomerManager customerManagerThree = new CustomerManager(new Customer(), new MilitaryCreditManager());

        CustomerManager[] customerManagers = {customerManager,customerManagerTwo,customerManagerThree};
        for (CustomerManager customer: customerManagers) {
            customer.giveCredit();
        }
        //customerManager.giveCredit();
    }
}
