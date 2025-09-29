<h1 align="center"> CP2 Domain Driven Design - JAVA</h1>

## Descrição do Pedido
 Sistema de gestão de funcionários para uma empresa que possui diferentes tipos de funcionários em seu departamento. O sistema representa diferentes categorias de funcionários, como Funcionários Comuns, Gerentes e Diretores, cada um com comportamentos e atributos específicos. Além disso, é possível calcular o salário com base no tipo de funcionário e suas particularidades, como bônus ou comissões.

 
## Estrutura do Projeto

- **Funcionario (superclasse)**  
  - Atributos: `nome`, `cpf`, `salarioBase`  
  - Métodos:  
    - `getSalarioFinal()` → retorna o salário base.  
    - `aumentarSalario()` sobrecarregado (10%, porcentagem, porcentagem+extra).  
  - Construtores: padrão e com parâmetros.  

- **Gerente (subclasse de Funcionario)**  
  - Atributo adicional: `bonus`  
  - `getSalarioFinal()` sobrescrito para retornar `salarioBase + bonus`.  

- **Diretor (subclasse de Gerente)**  
  - Atributo adicional: `porcentagemParticipacaoLucros`  
  - `getSalarioFinal()` sobrescrito para retornar:  
    ```
    salarioBase + bonus + (salarioBase * porcentagemParticipacaoLucros)
    ```

- **Departamento**  
  - Atributos: `nome`, `Funcionario[] funcionarios`  
  - Métodos:  
    - `adicionarFuncionario(Funcionario f)`  
    - `calcularFolhaPagamento()`  

- **Main**  
  - Classe de teste pra funcionalidades das classes.

---

## Integrantes:
- **Rafaela Heer Robinson** - 560249
- **Lucas Alves Piereti** - 559533
- **Julia Hadja Kfouri Nunes** - 559410
