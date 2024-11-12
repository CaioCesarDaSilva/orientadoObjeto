

package uscs;


public class TestaAluno {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana Souza", 31, 1234);
        Aluno aluno2 = new Aluno("Bia Nunes", 25, 5678);
        Aluno aluno3 = new Aluno("Paulo Santos", 45, 9876);
        
        aluno1.ImprimeAluno();
        aluno2.ImprimeAluno();
        aluno3.ImprimeAluno();
        
    }

}
