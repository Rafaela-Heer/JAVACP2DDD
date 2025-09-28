package br.com.fiap.cp2;

public class Departamento {
    private String nome;
    private int id;
    private Funcionario[] funcionarios;

    public Departamento(String nome, int capacidade) {
        this.nome = nome;
        this.funcionarios = new Funcionario[capacidade];
        this.id = 0;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (id < funcionarios.length) {
            funcionarios[id] = f;
            id++;
        } else {
            System.out.println("Capacidade máxima do departamento atingida!");
        }
    }

    public double calcularFolhaPagamento() {
        double total = 0.0;
        for (int i = 0; i < id; i++) {
            total += funcionarios[i].getSalarioFinal();
        }
        return total;
    }
}
