package LimiteCartaoCompras;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComprasCartao {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
    public ComprasCartao(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }
    public boolean comprasLancadas(Compra compra){
        if(this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        } else {
            return false;
        }
    }

}
