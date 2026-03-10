import java.util.Scanner;

public class ProdutoTeste {
    public Produtos prod = new Produtos();

    public static void main(String[] args) {
        ProdutoTeste prod1 = new ProdutoTeste();
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("---- Menu principal ----");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Entrada de estoque");
            System.out.println("3 - Saida de estoque");
            System.out.println("4 - Imprimir dados do produto");
            System.out.println("9 - Sair");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1 -> prod1.execCadastrar();
                case 2 -> prod1.execEntradaEstoque();
                case 3 -> prod1.execSaidaEstoque();
                case 4 -> prod1.execImprimir();
                case 9 -> {
                    System.out.println("Saindo..");
                    return;
                }
            }
        } while (opc != 9);

    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a ID do produto: ");
        prod.idProduto = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o nome do produto: ");
        prod.nome = sc.nextLine();
        System.out.printf("Digite o preço: ");
        prod.preco = Double.parseDouble(sc.nextLine());
    }

    public void execEntradaEstoque(){
        Scanner sc = new Scanner(System.in);
        int valorEntrada = 0;
        System.out.println("Selecione a quantidade desejada: ");
        valorEntrada = Integer.parseInt(sc.nextLine());
        prod.darEntrada(valorEntrada);
    }

    public void execSaidaEstoque(){
        Scanner sc = new Scanner(System.in);
        int valorSaida = 0;
        System.out.println("Selecione a quantidade desejada: ");
        valorSaida = Integer.parseInt(sc.nextLine());
        boolean estoqueDisponivel = prod.darBaixa(valorSaida);
        if (estoqueDisponivel){
            System.out.printf("Venda feita com sucesso ");
        } else {
            System.out.printf("Falta de estoque ");
        }
    }

    public void execImprimir(){
        prod.imprimir();
    }
}