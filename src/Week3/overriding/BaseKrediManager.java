package Week3.overriding;

public class BaseKrediManager {
    final double interestRate = 1.18;
    public double hesapla(double tutar) {
        return tutar * interestRate;
    }
}
