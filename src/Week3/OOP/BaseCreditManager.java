package Week3.OOP;

public abstract class BaseCreditManager implements ICreditManager {
    @Override
    public abstract void calculate();

    public void save() {
        System.out.println("Kaydedildi!");
    }


}
