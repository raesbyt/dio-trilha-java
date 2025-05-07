import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da Agencia!");
        String agencia = input.nextLine();
        System.out.println("Por favor, digite o numero da Conta!");
        int conta = input.nextInt();
        input.nextLine();
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = input.nextLine();
        System.out.println("Por favor, digite a quantia para saldo!");
        double saldo = input.nextDouble();

        System.out.println("\nOlá "
                            .concat(nomeCliente)
                            .concat(" obrigado por criar uma conta em nosso banco, \n")
                            .concat("sua agência é ")
                            .concat(agencia)
                            .concat(", conta ")
                            .concat(String.valueOf(conta))
                            .concat("\ne o seu saldo ")
                            .concat(String.valueOf(saldo))
                            .concat(" já está disponível para saque."));

        input.close();
    }
}
