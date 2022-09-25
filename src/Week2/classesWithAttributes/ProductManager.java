package Week2.classesWithAttributes;

public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println(product.getName() + " isimli ürün eklendi!");
    }

    public void Add2(int id, String name, String description, int stockAmount, double price) {

    }
}
