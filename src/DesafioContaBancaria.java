import java.util.Scanner;

public class DesafioContaBancaria {
    public static void main(String[] args) {
        String nome = "Cris";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("******************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************");

        int escolha = 0;

            String menu = """
                    \n** digite sua opção **
                    1- Consultar saldo
                    2- Transferir valor
                    3- Receber valor
                    4- Sair
                    
                    """;
            Scanner leitura = new Scanner(System.in);

            while (escolha != 4) {
                    System.out.println(menu);
                    escolha = leitura.nextInt();

                    if (escolha == 1) {
                            System.out.println("O saldo é de R$" + saldo);
                    } else if (escolha == 2) {
                            System.out.println("Digite o valor que voce quer transferir: ");
                            double valor = leitura.nextDouble();
                            if (valor > saldo) {
                                    System.out.println("Não há saldo para realizar a transferencia");
                            } else {
                                    saldo -= valor;
                                    System.out.println("O seu novo saldo é de R$ " + saldo);
                            }
                    } else if (escolha == 3){
                            System.out.println("Digite o valor que deseja receber: ");
                            double valor = leitura.nextDouble();
                            saldo += valor;
                            System.out.println("O seu novo saldo é de R$ " + saldo);
                    } else if (escolha != 4) {
                            System.out.println("Opção invalida");
                    }
            }
    }
}
