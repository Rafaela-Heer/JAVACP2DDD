import br.com.fiap.cp2.Departamento;
import br.com.fiap.cp2.Diretor;
import br.com.fiap.cp2.Funcionario;
import br.com.fiap.cp2.Gerente;

// Classe usada apenas para demonstrar como usar os métodos feitos nas classes.

public class Main {
    public static void main(String[] args) {

        // Exemplo de criar um departamento com capacidade fixa para 3 funcionários
        Departamento departamentoTI = new Departamento("TI", 3);

        // Exemplo de criar funcionário, gerente e diretor
        Funcionario funcionario1 = new Funcionario("Joana", "564.251.578-60", 5000);
        Gerente gerente1 = new Gerente("Gabriel", "485.246.471-02", 15000, 1000);
        Diretor diretor1 = new Diretor("Rafaela", "527.619.138-46", 25000, 2000, 0.01f);

        // Exemplo de adicionar funcionários no departamento
        departamentoTI.adicionarFuncionario(funcionario1);
        departamentoTI.adicionarFuncionario(gerente1);
        departamentoTI.adicionarFuncionario(diretor1);

        // Exemplo de como mostrar folha total do departamento
        System.out.println("Departamento: " + departamentoTI.getNome());
        System.out.println("Folha total: R$ " + departamentoTI.calcularFolhaPagamento());

        // Exemplo pra testar aumento de salário
        funcionario1.aumentarSalario(); // aumenta 10%(pedido)
        gerente1.aumentarSalario(20); // aumenta 20% (pode colocar o quanto preferir)
        diretor1.aumentarSalario(15, 500); // aumenta 15% + bônus de 500

        System.out.println("\nApós aumentos:");
        System.out.println(funcionario1.getNome() + " - Salário final: R$ " + funcionario1.getSalarioFinal());
        System.out.println(gerente1.getNome() + " - Salário final: R$ " + gerente1.getSalarioFinal());
        System.out.println(diretor1.getNome() + " - Salário final: R$ " + diretor1.getSalarioFinal());

        // Exemplo de como recalcular folha após aumento
        System.out.println("\nNova folha total: R$ " + departamentoTI.calcularFolhaPagamento());
    }
}