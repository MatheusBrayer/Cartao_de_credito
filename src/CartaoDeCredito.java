import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

    public boolean lancamentoCompra(Compras item) {
        if (this.saldo >= item.getValor()) {
            this.saldo -= item.getValor();
            compras.add(item);
            return true;
        } else {
            return false;
        }

    }
}
