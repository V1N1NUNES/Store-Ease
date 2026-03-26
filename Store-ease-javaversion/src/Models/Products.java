package Models;

public class Products extends RegisterProducts{
    String categoryProduct;

    //constructor of Abstract class + category of product
    public Products(String nameproduct, int amount, float price, String categoryProduct) {
        super(nameproduct, amount, price);
        this.categoryProduct = categoryProduct;
    }

    //getters and setters of category
    public String getCategoryProduct() {
        return categoryProduct;
    }
    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }
}
