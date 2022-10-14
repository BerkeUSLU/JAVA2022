package Week3.overriding;

public class OgretmenKrediManager extends BaseKrediManager {
    final double interestRate = 1.08;
    public double hesapla(double tutar) {
        return tutar * interestRate;
    }
}
