package Week3.polymorphismDemo;

public class Main {
    public static void main(String[] args) {
        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
        for (BaseLogger logger: loggers) {
            logger.log("EXAMPLE");
        }*/
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
