import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal contaTerminal = new ContaTerminal();

        // Captura os dados do usuário
        System.out.println("Digite seu nome:");
        contaTerminal.NomeCliente = scanner.nextLine();

        System.out.println("Digite sua Agência:");
        contaTerminal.Agencia = scanner.nextLine();

        System.out.println("Digite sua Conta:");
        contaTerminal.Numero = scanner.nextInt();

        // Adicionar saldo
        System.out.println("Qual saldo você quer adicionar?");
        contaTerminal.adicionar_Dinheiro(scanner.nextDouble());  

        // Pergunta se o usuário deseja permitir o saque
        System.out.println("Deseja permitir saques? (true/false):");
        boolean permitirSaque = scanner.nextBoolean();
        contaTerminal.permitirSaque(permitirSaque);

        // Se o saque for permitido, solicita o valor para saque
        if (permitirSaque) {
            System.out.println("Qual valor você quer sacar?");
            contaTerminal.sacar_Dinheiro(scanner.nextDouble());
        } else {
            System.out.println("Saque não permitido.");
        }

    }
}