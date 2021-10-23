package exemplos.solid.dip;

public class PromocaoPessoaJuridica implements PromocaoInterface {

    public Float calcula(Float valorOriginal){
        System.out.println("Apliquei promocao PJ");
        return 10f;
    }

}
