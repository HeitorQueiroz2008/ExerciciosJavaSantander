# Desafio

Criar um sistema de gerenciamento de usuários utilizando os conceitos de Programação Orientada a Objetos, modelando diferentes tipos de usuários por meio de uma hierarquia de classes.

O sistema deve representar três perfis de usuário (Gerente, Vendedor e Atendente), cada um com seus próprios atributos e comportamentos, compartilhando características em comum através da herança.

## Regras de Negócio

- Todo usuário possui:
    - Nome
    - Email
    - Senha
    - Informação se é administrador
- O **Gerente**:
    - Sempre é administrador.
    - Pode gerar relatório financeiro.
    - Pode consultar vendas.
- O **Vendedor**:
    - Nunca é administrador.
    - Possui uma quantidade de vendas.
    - Ao realizar uma venda, a quantidade de vendas deve ser incrementada.
    - Pode consultar vendas.
- O **Atendente**:
    - Nunca é administrador.
    - Possui um valor em caixa.
    - Ao receber um pagamento, o valor informado deve ser somado ao caixa.
    - Pode fechar o caixa.
- Todos os usuários podem:
    - Realizar login.
    - Realizar logoff.
    - Alterar seus dados.
    - Alterar sua senha.

## Funcionalidades Implementadas

- [ ] Criar classe base de usuário
- [ ] Criar classe Gerente
- [ ] Criar classe Vendedor
- [ ] Criar classe Atendente
- [ ] Implementar login e logoff
- [ ] Implementar alteração de dados
- [ ] Implementar alteração de senha
- [ ] Gerar relatório financeiro
- [ ] Consultar vendas
- [ ] Realizar venda incrementando a quantidade de vendas
- [ ] Receber pagamentos incrementando o valor em caixa
- [ ] Fechar o caixa
- [ ] Definir corretamente usuários administradores e não administradores

## Conceitos Praticados

- Herança
- Polimorfismo
- Sobrescrita de métodos (@Override)
- Encapsulamento
- Classes Abstratas
- Construtores
- Classes e Objetos
- Getters e Setters
- Regras de negócio
- Organização de responsabilidades entre classes