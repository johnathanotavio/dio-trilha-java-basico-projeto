import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("Por favor, digite o número da Agência !");
            String agencia = scanner.next();
            
            System.out.println("Numero da Conta");
            int numero = scanner.nextInt();

            System.out.println("Nome");
            String nome = scanner.next();

            System.out.println("Sobre Nome");
            String sobreNome = scanner.next();
            
            System.out.println("Saldo");
            Double saldo = scanner.nextDouble();

            
            System.out.println("Olá " + nome.toUpperCase() + "  " + sobreNome.toUpperCase() + " obrigado por criar uma conta em nosso banco, sua agência é "  +  agencia.toUpperCase() + ", conta "+ numero + " e seu saldo " + saldo + " já está disponível para saque.");
            
        }
    }
}
