package exemplos.solid.dip;

public class PromocaoBF implements PromocaoInterface {

    public Float calcula(Float valorOriginal){
        System.out.println("Apliquei promocao BF");

        return 10f;
    }

    public Float retornarOutroFloat(){
        return 20f;
    }
}
