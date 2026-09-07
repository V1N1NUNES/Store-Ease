package Java.Models;

public class Eletronicos extends Produto{
    private String config;

    protected Eletronicos(String nome, String descricao, float preco) {
        super(nome, descricao, preco);
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
