package Java.Models;

public class Alimenticios extends Produto {
    private String dataValidade;
    private String procedencia;

    protected Alimenticios(String nome, String descricao, float preco, PRODUTOS produto, String dataValidade, String procedencia) {
        super(nome, descricao, preco, produto);
        this.dataValidade = dataValidade;
        this.procedencia = procedencia;
    }

    public String getDataValidade() {
        return dataValidade;
    }
    public String getProcedencia() {
        return procedencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nData de validade: " + this.dataValidade + "\nProcedencia e produção: " + this.procedencia;
    }
}
