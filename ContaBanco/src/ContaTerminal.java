public class ContaTerminal {
    
    int Numero = 1021;
    String Agencia = "067-8";
    String NomeCliente = "Gabriel Lima";
    double Saldo = 237.48;

    public void sacar_Dinheiro(double novoSaldo){
        Saldo = novoSaldo;
        System.out.println("Seu saldo é: R$" + novoSaldo);
    }

    public void adicionar_Dinheiro(double novoSaldo){
        Saldo = novoSaldo;
        System.out.println("Seu saldo é: R$" + novoSaldo);
    }


}
