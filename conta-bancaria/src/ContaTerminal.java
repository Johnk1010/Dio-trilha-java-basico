import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu Nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Sobrenome");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo da conta");
        double saldo = scanner.nextDouble();

        //Imprimindo as informações do usuário.

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");





    }
}
