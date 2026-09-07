package Java.Models;

public class Farmaceutico extends Produto {
    private String dataFabricacao;  //trasnformar no tipo "Data"

    protected Farmaceutico(String nome, String descricao, float preco,  String dataFabricacao) {
        super(nome, descricao, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public String getConfig() {
        return dataFabricacao;
    }
    public void setConfig(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData de fabricação: " + this.dataFabricacao;
    }
}
