public class Produtos {
    public int idProduto;
    public String nome;
    public int quantidade;
    public double preco;

    public boolean darBaixa(int qntd){
        if (quantidade <= 0 || qntd > quantidade ){
            return false;
        } else {
            quantidade -= qntd;
            return true;
        }
    }

    public void darEntrada(int qntd){
        quantidade += qntd;
    }

    public void imprimir(){
        System.out.println("--------------------");
        System.out.println("Dados do produto: ");
        System.out.println("Id: "+idProduto);
        System.out.println("Nome: "+nome);
        System.out.println("Quantidade: "+quantidade);
        System.out.println("Preço: "+preco);
        System.out.println("---------------------");
    }


}
