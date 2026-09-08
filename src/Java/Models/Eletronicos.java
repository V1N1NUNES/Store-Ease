package Java.Models;

public class Eletronicos extends Produto{
    private String config;

    public Eletronicos(String nome, String descricao, float preco, PRODUTOS produto, String config) {
        super(nome, descricao, preco,  produto);
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return super.toString() + "\nConfiguração: " + this.config;
    }
}
