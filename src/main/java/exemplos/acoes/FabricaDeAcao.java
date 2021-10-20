package exemplos.acoes;

import exemplos.acoes.AcaoDirigir;
import exemplos.acoes.AcaoInterface;
import exemplos.acoes.AcaoPintar;
import exemplos.acoes.TipoAcao;

public class FabricaDeAcao {

    // Simple Factor
    // Permite encapsular a criação de um objeto

    public static AcaoInterface criarAcao(TipoAcao tipoAcao) {

        switch(tipoAcao){
            case DIRIGIR:
                return new AcaoDirigir();
            case PINTAR:
                return new AcaoPintar();
            default:
                return null;
        }

    }
}
