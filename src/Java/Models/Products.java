package Java.Models;

public abstract class Products {

    String name;
    float price;
    int amount;

    //constructors
    public Products(String name, float price, int amount, double id){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }



//                                  getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
// ADICIONAR OUTRO JEITO DE VIZUALIZAR/MODIFICAR ATRIBUTOS DOS OBJETOS

//                                    Other methods

//    public double IdGenerate(){
//        // - Generate Id logic
//        return;
//    }

}
