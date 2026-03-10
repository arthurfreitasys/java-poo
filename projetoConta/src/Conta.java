public class Conta {
    public String conta;
    public String agencia;
    public double saldo;
    public String nomeCliente;

    public boolean sacar(double valor){
    if (saldo < 0 || saldo < valor){
        return false;
    } else {
        return true;
    }
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void imprimir(){
        System.out.println("Nome do cliente: "+nomeCliente);
        System.out.println("Conta: "+conta);
        System.out.println("agencia: "+agencia);
        System.out.println("saldo: "+saldo);
    }
}
