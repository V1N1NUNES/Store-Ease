package Java.DB;

import Java.Models.Produto;

import java.util.ArrayList;
import java.util.List;

public abstract class DataBasesStoreEasy {
    private static final List<Produto> produtosEletronicos = new ArrayList<>();
    private static final List<Produto> produtosAlimenticios= new ArrayList<>();
    private static final List<Produto> produtosFarmaceuticos= new ArrayList<>();
    private static final List<List<Produto>> ListaProdutos = new ArrayList<>();

    //adicionando lista de produtos automáticamente
    static{
        ListaProdutos.add(produtosAlimenticios);
        ListaProdutos.add(produtosFarmaceuticos);
        ListaProdutos.add(produtosEletronicos);
    }

    //retorno de estoque completo
    public static List<Produto> getProdutosAlimenticios() {
        return produtosAlimenticios;
    }
    public static List<Produto> getProdutosFarmaceuticos() {
        return produtosFarmaceuticos;
    }
    public static List<Produto> getProdutosEletronicos() {
        return produtosEletronicos;
    }
    public static List<List<Produto>> getListaProdutos() {
        return ListaProdutos;   // arrumar a mostra de todas as listas e produtos
    }

    //busca por produto específico

    //Adicionar produtos

    //Remover produto especifico

    //atualização de produto específico





    /** IDEIA DE IMPLEMENTAÇÃO DE RECUROSOS ADICIONAIS E FUNCIONALIDADES
     * 1- Adição de novas categorias de produtos e criação de novas listas
     */

}
