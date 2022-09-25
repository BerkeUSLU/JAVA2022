package Week2.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        //Product product = new Product(1,"Laptop","MSI Laptop",1000,3,"Siyah");
        Product product = new Product();
        product.setName("Laptop");
        product.setID(1);
        product.setDescription("MSI Laptop");
        product.setPrice(10000);
        product.setStockAmount(3);

        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());

    }
}
