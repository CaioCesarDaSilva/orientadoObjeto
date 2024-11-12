

package uscs;


public class Aluno extends Pessoa {
    private int matricula;
        
    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public void ImprimeAluno(){
        super.ImprimePessoa();
        System.out.println("Matricula: " + matricula);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
