package Java.Models;

import java.util.UUID;

public abstract class Produto {
    protected String nome;
    protected String descricao;
    protected float preco;
    protected String id;

    protected Produto(String nome, String descricao, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.id = UUID.randomUUID().toString();
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    protected void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nProduto:" + "\n- Nome= " + nome + "\n- Descricao= " + descricao + "- Preço=" + preco;
    }
}
