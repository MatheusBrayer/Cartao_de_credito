import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CartaoDeCredito novoCartao = new CartaoDeCredito(1000);
        MenuPrincipal menuPrincipal = new MenuPrincipal(novoCartao);
        menuPrincipal.exibirMenu();
    }
}
