package exemplos.patterns.strategy;

import exemplos.patterns.strategy.acoes.AcaoInterface;

public class Robozinho {

    AcaoInterface acaoCoringa;

    public Robozinho(AcaoInterface acao) {
        this.acaoCoringa = acao;
    }

    public void efetuarAcao(){
        acaoCoringa.executarAcao();
    }


}
