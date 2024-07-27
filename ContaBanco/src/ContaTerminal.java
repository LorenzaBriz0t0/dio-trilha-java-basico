import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Seja bem vindo ao terminal do Banco AlgumBanco!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da agência com dígito:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        nome += scanner.nextLine();
   

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +"!"+"Obrigado por criar uma conta em nosso banco."+"Sua agência é"+" "+ agencia + ",conta " + numero + " e seu saldo de R$" + saldo +" já está disponível para saque!");

    }
    
    }

