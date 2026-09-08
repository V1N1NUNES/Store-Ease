package Java.Models;

import java.util.UUID;

public abstract class Produto {
    protected String nome;
    protected String descricao;
    protected float preco;
    protected String id;
    protected PRODUTOS produto;

    protected Produto(String nome, String descricao, float preco, PRODUTOS produto) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.id = UUID.randomUUID().toString();
        this.produto = produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    public PRODUTOS getProduto() {
        return this.produto;
    }

    @Override
    public String toString() {
        return "\nProduto:" + "\n- Nome= " + nome + "\n- Descricao= " + descricao + "- Preço=" + preco;
    }
}
