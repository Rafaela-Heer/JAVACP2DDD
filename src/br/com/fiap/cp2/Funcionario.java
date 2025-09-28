package br.com.fiap.cp2;

public class Funcionario {
    private String nome;
    private String cpf;
    private float salarioBase = 1000.00f;


    public Funcionario() {
    }
    public Funcionario(String nome, String cpf, float salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getSalarioFinal() {
        return salarioBase;
    }

    //Aumenta 10%
    public void aumentarSalario() {
        this.salarioBase += (float) (this.salarioBase * 0.10);
    }

    //Com parâmetro porcentagem
    public void aumentarSalario(double porcentagem) {
        this.salarioBase += (float) (this.salarioBase * (porcentagem / 100));
    }

    //Com porcentagem e bônus extra
    public void aumentarSalario(double porcentagem, double bonusExtra) {
        this.salarioBase += (float) (this.salarioBase * (porcentagem / 100) + bonusExtra);
    }
}


