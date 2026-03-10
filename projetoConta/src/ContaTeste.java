import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        ContaTeste cc1 = new ContaTeste();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
        System.out.println("Escolha uma opção");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Consultar");
        System.out.println("4 - Cadastrar");
        System.out.println("9 - Sair");

        opc = Integer.parseInt(sc.nextLine());
        switch (opc) {
            case 1 -> cc1.execSacar();
            case 2 -> cc1.execDepositar();
            case 3 -> cc1.execConsultar();
            case 4 -> cc1.execCadastrar();
            case 9 -> {
                break;
        }
        }
        } while (opc != 9);
    }

    public void execSacar(){
        double valorSaque;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        valorSaque = Double.parseDouble(sc.nextLine());
        boolean sacou = cc.sacar(valorSaque);
        if (sacou) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Valor insuficiente");
        }
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da agencia: ");
        cc.agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = sc.nextLine();
        System.out.println("Digite o numero da conta: ");
        cc.conta= sc.nextLine();
        System.out.println("Conta cadastrada");
    }
    public void execConsultar(){
        cc.imprimir();
    }

    public void execDepositar(){
        double valorDeposito;
        boolean sacou;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        valorDeposito = Double.parseDouble(sc.nextLine());
        cc.depositar(valorDeposito);
        System.out.println("Deposito feito com sucesso");
    }
}
