package Week3.OOP;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Taşıt kredisi Hesaplandı!");
    }
}
