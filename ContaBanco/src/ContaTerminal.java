import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class ContaTerminal {     
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

          System.out.println("Digite o Numero da Agencia!");
          Integer agencia = scanner.nextInt();

          Random conta = new Random();
          Integer num_conta = conta.nextInt();

          System.out.println("Digite o Seu Nome!");
          String seu_nome = scanner.next();

          System.out.println("Quanto Gostaria de Depositar?");
          Float saldo = scanner.nextFloat();

          System.out.println("Olá " + seu_nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num_conta + " e seu saldo " + saldo + " já está disponivel para saque.");
        }
    }   
