import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia!");
          int numero = sc.nextInt();
       
        System.out.println("Usuario: ");
           String agencia = sc.next();
        
        System.out.println("Digite o seu nome!");
             String nomeCliente = sc.next();

        System.out.println("Digite agora o seu saldo!");
        double saldo = sc.nextDouble();
        
        System.out.printf("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

sc.close();
    }

}
