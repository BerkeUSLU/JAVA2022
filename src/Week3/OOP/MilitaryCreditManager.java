package Week3.OOP;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı!");
    }
}
