public class ContaTerminal {
    
    int Numero = 1021;
    String Agencia = "067-8";
    String NomeCliente = "Gabriel Lima";
    double Saldo = 237.48;
    boolean sacar = true;  

    public void sacar_Dinheiro(double valorSaque) {
        // Verifica se o saldo é suficiente para o saque e se a operação de saque está permitida
        if (Saldo >= valorSaque && sacar == true) {
            Saldo -= valorSaque;  // Subtrai o valor do saque do saldo atual
            System.out.println("Saque realizado com sucesso.");
            System.out.println("Seu saldo é: R$" + Saldo);
        } else if (sacar == false) {
            System.out.println("Operação de saque não permitida.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    
    public void adicionar_Dinheiro(double valorDeposito) {
        Saldo += valorDeposito;  // Adiciona o valor do depósito ao saldo atual
        System.out.println("Depósito realizado com sucesso.");
        System.out.println("Seu saldo é: R$" + Saldo);
    }

    // Método para habilitar ou desabilitar a permissão de saque
    public void permitirSaque(boolean permitir) {
        this.sacar = permitir;
    }
}
