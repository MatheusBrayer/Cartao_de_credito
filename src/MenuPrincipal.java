import java.util.Scanner;

public class MenuPrincipal {
    Scanner scanner = new Scanner(System.in);
    private CartaoDeCredito cartao;

    public MenuPrincipal (CartaoDeCredito cartao) {
        this.cartao=cartao;
    }

    public void exibirMenu() {
        var opcao = 0;
        while (opcao != 4) {
            System.out.println("***************");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - Realizar nova compra");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Consultar lista de compras");
            System.out.println("4 - Sair");
            System.out.println("***************");
            System.out.println("\n Digite sua opção:");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1: {
                    boolean loop = true;
                    while (loop) {
                        realizarCompra();
                        System.out.println("1 - Finalizar operação");
                        System.out.println("2 - Cadastrar nova compra.");
                        System.out.println("3 - Voltar ao menu principal.");
                        int continuar = scanner.nextInt();
                        if (continuar == 1) {
                            opcao=4;
                            break;
                        } else if (continuar==3) {
                            loop = false;
                        }
                    }
                }
                    break;
                case 2: {
                    consultarSaldo();
                    System.out.println("1 - Finalizar operação");
                    System.out.println("2 - Voltar ao menu principal.");
                    int continuar = scanner.nextInt();
                    if (continuar == 1) {
                        opcao = 4;
                    }
                    break;
                }
                case 3: {
                    listaDeCompras();
                    System.out.println("1 - Finalizar operação");
                    System.out.println("2 - Voltar ao menu principal.");
                    int continuar = scanner.nextInt();
                    if (continuar == 1) {
                        opcao = 4;
                    }
                    break;
                }
                case 4: {
                    System.out.println("Operação finalizada!");
                    break;
                }
                default:
                    System.out.println("Opção invalida!");
            }
        }

    }

    public void realizarCompra(){
        scanner.nextLine();
        System.out.println("Digite o nome do item: ");
        var descricao = scanner.nextLine();

        System.out.println("Digite o valor do produto: R$");
        var valor = scanner.nextDouble();

        Compras novaCompra = new Compras(descricao, valor);

        boolean sucesso = cartao.lancamentoCompra(novaCompra);

        if (sucesso){
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void consultarSaldo (){
        System.out.println("Saldo: R$" + cartao.getSaldo());
    }

    public void listaDeCompras(){
        if (cartao.getCompras().isEmpty()) {
            System.out.println("Nenhuma compra realizada!");
        } else {
            for (Compras item : cartao.getCompras()) {
                System.out.println(item);
            }
        }
    }

}

