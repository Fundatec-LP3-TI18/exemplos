package exemplos.patterns.strategy.acoes;

public class AcaoDirigir implements AcaoInterface {

    public void executarAcao(){
        System.out.println("Estou dirigindo");
        System.out.println("CÓDIGO DE DIREÇÃO");
        System.out.println("CÓDIGO DE DIREÇÃO");
        this.fazerRealidadeAumentada();
        this.olharSemaforo();
        System.out.println("CÓDIGO DE VIRAR DIRECAO");
    }

    private void olharSemaforo() {
        System.out.println("CÓDIGO DE SEMAFORO");
    }

    private void fazerRealidadeAumentada() {
        System.out.println("CÓDIGO DE RA");
    }
}
