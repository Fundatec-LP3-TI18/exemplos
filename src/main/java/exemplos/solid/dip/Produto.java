package exemplos.solid.dip;

public class Produto {


    Float valor;
    String nome;

    public Produto(Float valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
