import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo ;
        
        System.out.println("numero:");
        numero = scanner.nextInt();
        
        scanner.nextLine();
        
        System.out.println(" Agência:");
        agencia = scanner.nextLine();
        
        System.out.println(" nomeCliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println(" Conta:");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        

    }
}
