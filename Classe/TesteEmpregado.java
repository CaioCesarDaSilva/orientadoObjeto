package uscs;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e1 = new Empregado(1232, "Paulo Silva", "Gerente Financeiro", 15400.00);
        e1.imprimeEmpregado();
        
        Empregado e2 = new Empregado();
        e2.setCodEmpregado(4567);
        e2.setNome("Ana Paulo");
        e2.setCargo("Analista de Sistemas Senior"); // Correção aqui
        e2.setSalario(10700.00);
        
        e2.imprimeEmpregado();
    }
}
