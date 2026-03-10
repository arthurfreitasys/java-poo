public class computadorTeste {
    public static void main(String[] args) {
    Computador computador1 = new Computador();
    computador1.nome = "Computador 1";
    computador1.cor = "Preto";
    computador1.marca = "HP";
    computador1.modelo = "2007";
    computador1.preco = 2000;
    computador1.numeroSerie = 123415;
    computador1.imprimir();
    computador1.calcularValor();
    computador1.imprimir();
        Computador computador2 = new Computador();
        computador2.nome = "Computador 2";
        computador2.cor = "Branco";
        computador2.marca = "IBM";
        computador2.modelo = "2017";
        computador2.preco = 6000;
        computador2.numeroSerie = 11353415;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        boolean alterou = computador2.alterarValor(2500);
        if (alterou){
            System.out.println("Valor alterado");
        } else {
            System.out.println("Valor não alterado");
        }
        computador2.imprimir();
    }
}
