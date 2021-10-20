package exemplos;

import exemplos.acoes.AcaoInterface;
import exemplos.acoes.FabricaDeAcao;
import exemplos.acoes.TipoAcao;

import java.util.Scanner;

import static exemplos.acoes.TipoAcao.*;

public class ContextoPrincipal {


    public static void main(String[] args) throws Exception {
        System.out.println("Ecolha seu modulo 1 - Dirigir e 2 - Pintar");

        // Terminal
        Scanner scanner = new Scanner(System.in);
        Long entradaTerminal = scanner.nextLong();

        // Cliente chegou e pediu um robo que pinta
        TipoAcao enumEncontrado = procurarAcao(entradaTerminal);

        // Fabrica
        AcaoInterface acaoCriada = FabricaDeAcao.criarAcao(enumEncontrado);

        // Strategy
        Robozinho robozinho = new Robozinho(acaoCriada);

        // Cliente na casa dele
        robozinho.efetuarRotina();
    }



}
