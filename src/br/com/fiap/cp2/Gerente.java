package br.com.fiap.cp2;

public class Gerente extends Funcionario{
    private float bonus;

    public Gerente(String nome, String cpf, float salarioBase, float bonus){
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float getSalarioFinal() {
        return getSalarioBase() + bonus;
    }
}
