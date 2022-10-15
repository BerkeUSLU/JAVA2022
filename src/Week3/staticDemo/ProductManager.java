package Week3.staticDemo;

public class ProductManager {
    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("Bu ürün doğrulandı & sisteme eklendi!");
            System.out.println("ID: " + product.id + " Name: " + product.name + " Price: " + product.price);
        }
        else {
            System.out.println("Bu ürün doğrulanamaz -- İsim, fiyat veya ID bilgisi hatalı!");
            System.out.println("ID: " + product.id + " Name: " + product.name + " Price: " + product.price);
        }
    }
}
