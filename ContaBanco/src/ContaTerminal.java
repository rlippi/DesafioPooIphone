


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //int numero;
        String numero;
        String agencia, nomeCliente;
        double saldo = 0.0;  

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();
        
        System.out.println("Digite o número da Conta: ");
        numero = sc.next();
        //numero = sc.nextInt();
        
        System.out.println("Digite o Nome do Cliente: ");
        nomeCliente = sc.next();

        System.out.println("Digite o Saldo Inicial: ");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");






    }
}
