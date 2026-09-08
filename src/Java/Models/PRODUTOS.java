package Java.Models;

public enum PRODUTOS {
    FARMACEUTICO ("Produto farmaceutico", 3),
    ALIMENTICIOS("Produto alimentício", 2),
    ELETRONICOS("Produto eletrônicos", 1);

    String descricao;
    int numeracao;

    PRODUTOS(String descricao, int numeracao) {
        this.descricao = descricao;
        this.numeracao = numeracao;
    }

    public String getDescricao() {
        return descricao;
    }
    public int getNumeracao() {
        return numeracao;
    }
}
