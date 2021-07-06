package S6.R2;

public abstract class Product {
    Float price;
    String name;
    String sku;

    public static int stock = 20;






    public Product(Float price, String name, String sku ) {
        this.price = price;
        this.name = name;
        this.sku = sku;
    }

    public abstract float getTotalPrice(int quantity);

    public static void restock(Integer nuevo){
        stock += nuevo;
    }

    public static void eliminacion(Integer menos){
        stock -= menos;
    }

}
