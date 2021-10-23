package exemplos.patterns.strategy;

import exemplos.patterns.strategy.acoes.AcaoDirigir;
import exemplos.patterns.strategy.acoes.AcaoInterface;
import exemplos.patterns.strategy.acoes.AcaoPintar;
import exemplos.patterns.strategy.acoes.TipoAcao;

import static exemplos.patterns.strategy.acoes.TipoAcao.DIRIGIR;
import static exemplos.patterns.strategy.acoes.TipoAcao.PINTAR;

public class FabricaDeAcao {

    public static AcaoInterface fabricarAcao(TipoAcao tipo){
        if(DIRIGIR.equals(tipo)) {
            return new AcaoDirigir();
        } else if (PINTAR.equals(tipo)) {
            return new AcaoPintar();
        }

        return new AcaoDirigir();
    }

}
