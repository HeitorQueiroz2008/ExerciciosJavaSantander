# Desafio

Criar um sistema capaz de controlar os diferentes tipos de ingressos comercializados em um cinema, permitindo:

- Criar um ingresso comum
- Criar um ingresso de meia entrada
- Criar um ingresso família
- Calcular o valor real de cada ingresso
- Informar o nome do filme
- Informar se o filme é dublado ou legendado

## Regras de Negócio

- Todo ingresso possui:
    - Valor base
    - Nome do filme
    - Tipo de exibição (dublado ou legendado)
- O ingresso comum retorna o próprio valor informado.
- O ingresso de meia entrada retorna **50%** do valor original.
- O ingresso família calcula o valor multiplicando pelo número de pessoas.
- Caso o ingresso família seja para mais de **3 pessoas**, deve ser aplicado um desconto de **5%** sobre o valor total.

## Funcionalidades Implementadas

- [ ] Criar ingresso comum
- [ ] Criar ingresso meia entrada
- [ ] Criar ingresso família
- [ ] Calcular valor do ingresso comum
- [ ] Calcular valor da meia entrada
- [ ] Calcular valor do ingresso família
- [ ] Aplicar desconto de 5% para famílias com mais de 3 pessoas

## Conceitos Praticados

- Herança
- Polimorfismo
- Sobrescrita de métodos (@Override)
- Encapsulamento
- Construtores
- Classes e Objetos
- Regras de negócio