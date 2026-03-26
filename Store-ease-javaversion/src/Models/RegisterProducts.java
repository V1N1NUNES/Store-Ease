package Models;

public abstract class RegisterProducts {
    String nameproduct;
    int amout;
    float price;


    // construtor
    public RegisterProducts(String nameproduct, int amount, float price)
    {
        this.nameproduct = nameproduct;
        this.amout = amount;
        this.price = price;
    }

    //getters and setters
    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
