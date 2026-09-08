package Java.Service;

import Java.Models.Produto;

public class ViewService {
    public boolean validacaoMenus(int a, int b, int option) throws NumeroDigitadoExpetion{
        return option >= a && option <= b;


        //fazer com que a função faça a validação completa de número inválido e número inteiro
    }

    public boolean validacaoCriacaoProduto(Produto produto){
        return produto != null;
    }



}
