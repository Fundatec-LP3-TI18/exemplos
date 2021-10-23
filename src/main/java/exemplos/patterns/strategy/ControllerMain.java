package exemplos.patterns.strategy;

import exemplos.patterns.strategy.acoes.AcaoInterface;
import exemplos.patterns.strategy.acoes.TipoAcao;

import java.util.Scanner;

import static exemplos.patterns.strategy.acoes.TipoAcao.*;

public class ControllerMain {


    public static void main(String[] args) throws Exception {
        // Cliente chegando na loja
        // Entrada de dados - Tela
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha seu tipo de robo \n 1 - Dirigir \n 2- Pintar");
        Long idAcao = teclado.nextLong();

        TipoAcao tipoAcao = TipoAcao.procurarAcao(idAcao);

        // Fabrica
        AcaoInterface acaoEscolhida = FabricaDeAcao.fabricarAcao(tipoAcao);

        // Strategy
        Robozinho robozinhoTop = new Robozinho(acaoEscolhida);
        robozinhoTop.efetuarAcao();

    }



}
