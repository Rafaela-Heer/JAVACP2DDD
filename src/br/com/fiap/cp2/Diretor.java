package br.com.fiap.cp2;

public class Diretor extends Gerente{
    private float porcentagemParticipacaoLucros;

    public Diretor(String nome, String cpf, float salarioBase, float bonus, float porcentagemParticipacaoLucros) {
        super(nome, cpf, salarioBase, bonus);
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    public float getPorcentagemParticipacaoLucros() {
        return porcentagemParticipacaoLucros;
    }
    public void setPorcentagemParticipacaoLucros(float porcentagemParticipacaoLucros) {
        this.porcentagemParticipacaoLucros = porcentagemParticipacaoLucros;
    }

    @Override
    public float getSalarioFinal() {
        return (float) (getSalarioBase() + getBonus() + (getSalarioBase() * porcentagemParticipacaoLucros));
    }
}
