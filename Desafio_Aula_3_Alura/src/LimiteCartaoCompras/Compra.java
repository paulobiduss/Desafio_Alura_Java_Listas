package LimiteCartaoCompras;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compras: " + "Descricao: '" + descricao  + ", Valor da Compra: " + valor;
    }

    @Override
    public int compareTo(Compra outroCartao) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outroCartao.valor));
    }
}
