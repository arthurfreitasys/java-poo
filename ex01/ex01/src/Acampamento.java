public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("Dados do acampante: ");
        System.out.println("Nome: "+nome);
        System.out.println("Equipe: "+equipe);
        System.out.println("idade: "+idade);
    }
    public void separarGrupo(){
        if (idade < 6){
            equipe = '-';
            return;
        }
        if (idade <= 10){
            equipe = 'A';
        }
        if (idade <= 20){
            equipe = 'B';
        }
        if (idade > 21) {
            equipe = 'C';
        }
    }

}
