package Week3.overriding;

public class OgrenciKrediManager extends BaseKrediManager {

    final double interestRate = 1.10;
    public double hesapla(double tutar) {
        return tutar * interestRate;
    }
}
