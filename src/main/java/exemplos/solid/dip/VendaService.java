package exemplos.solid.dip;

public class VendaService {

    public Float totalVenda;
    public Produto produto;
    public Cliente cliente;
    private PromocaoInterface promocao;

    public VendaService(Produto produto,
                        Cliente cliente,
                        PromocaoInterface promocao
                        ) {
        this.produto = produto;
        this.cliente = cliente;
        this.promocao = promocao;
    }

    public Float vender(){
        System.out.println("Iniciando venda");

        this.totalVenda = promocao.calcula(this.produto.getValor());

        new EnviarEmail().enviarEmail();

        // Enviar SMS
        new EnviarSMS().enviarSMS();

        return this.totalVenda;
    }




}
