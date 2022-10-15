package Week3.staticDemo;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Keyboard";
        product.price = 1000;
        product.id = 0;
        ProductManager productManager = new ProductManager();
        productManager.add(product);

        DatabaseHelper.CRUD.delete();
        DatabaseHelper.CRUD.update();
        DatabaseHelper.Connection.createConnection();

    }
}
