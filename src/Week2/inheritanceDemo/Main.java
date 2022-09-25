package Week2.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.hesapla();
        //TarimKrediManager tarimKrediManager = new TarimKrediManager();
        //tarimKrediManager.hesapla();
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());
        krediUI.KrediHesapla(new OgretmenKrediManager());
    }
}
