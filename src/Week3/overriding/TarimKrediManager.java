package Week3.overriding;

public class TarimKrediManager extends BaseKrediManager{
    final double interestRate = 1.05;
    public double hesapla(double tutar) {
        return tutar * interestRate;
    }
}
