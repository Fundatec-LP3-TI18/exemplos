package exemplos.solid.dip;

public class PromocaoPessoaFisica implements PromocaoInterface {

    public Float calcula(Float valorOriginal){
        System.out.println("Apliquei promocao PF");

        return 10f;
    }

    public Float retornarOutroFloat(){
        return 20f;
    }
}
