## Desafio

Criar um sistema capaz de controlar uma máquina de banho para um petshop, permitindo:

- Dar banho no pet
- Abastecer com água
- Abastecer com shampoo
- Verificar nível de água
- Verificar nível de shampoo
- Verificar se há um pet na máquina
- Colocar pet na máquina
- Retirar pet da máquina
- Limpar máquina

## Regras de Negócio

- A máquina permite apenas **1 pet por vez**.
- Cada banho consome:
    - 10 litros de água
    - 2 litros de shampoo
- A capacidade máxima da máquina é:
    - 30 litros de água
    - 10 litros de shampoo
- O abastecimento adiciona 2 litros por acionamento, tanto para água quanto para shampoo.
- Se um pet for retirado da máquina sem estar limpo, será necessário realizar a limpeza antes de permitir a entrada de outro pet.
- A limpeza da máquina consome:
    - 3 litros de água
    - 1 litro de shampoo

## Funcionalidades Implementadas

- [ ] Colocar pet na máquina
- [ ] Retirar pet da máquina
- [ ] Dar banho no pet
- [ ] Abastecer água
- [ ] Abastecer shampoo
- [ ] Verificar nível de água
- [ ] Verificar nível de shampoo
- [ ] Verificar presença de pet
- [ ] Limpar máquina
- [ ] Menu interativo
- [ ] Encerrar aplicação

## Conceitos Praticados

- Classes e Objetos
- Encapsulamento
- Construtores
- Métodos
- Getters e Setters
- Estruturas condicionais
- Controle de estados
- Entrada de dados com Scanner