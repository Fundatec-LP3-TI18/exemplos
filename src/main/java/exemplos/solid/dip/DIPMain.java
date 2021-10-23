package exemplos.solid.dip;

public class DIPMain {

    public static void main(String[] args) {
        System.out.println("OLA DIP");


        // Criar as dependencias
        Produto camisa = new Produto(100f, "Camisa");
        Cliente cliente = new Cliente();

        String teclado = "BF";

        // Fabrica
        PromocaoInterface promocao = null;
        if(teclado.equals("PF")){
            promocao = new PromocaoPessoaFisica();
        } else if (teclado.equals("PJ")){
            promocao = new PromocaoPessoaJuridica();
        } else if (teclado.equals("BF")){
            promocao = new PromocaoBF();
        }

        // Da venda
        VendaService venda = new VendaService(
            camisa,
            cliente,
            promocao
        );

        Float valorTotalVenda = venda.vender();
        System.out.println(valorTotalVenda);
    }
}
