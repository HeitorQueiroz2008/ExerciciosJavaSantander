## Desafio

Criar um sistema capaz de controlar as funções básicas de um carro, permitindo:

- Ligar o carro
- Desligar o carro
- Acelerar
- Diminuir velocidade
- Virar para esquerda
- Virar para direita
- Consultar velocidade
- Trocar marchas

## Regras de Negócio

- O carro deve iniciar desligado.
- O carro deve iniciar em ponto morto (marcha 0).
- O carro deve iniciar com velocidade igual a 0 km/h.
- O carro desligado não pode realizar nenhuma ação.
- Cada aceleração aumenta a velocidade em 1 km/h.
- A velocidade máxima permitida é de 120 km/h.
- Cada redução de velocidade diminui a velocidade em 1 km/h.
- A velocidade mínima permitida é de 0 km/h.
- O carro possui 6 marchas além do ponto morto.
- Não é permitido pular marchas durante a troca.
- Na marcha 0 (ponto morto), o carro não pode acelerar.
- Os limites de velocidade para cada marcha são:
  - 1ª marcha: 0 a 20 km/h
  - 2ª marcha: 21 a 40 km/h
  - 3ª marcha: 41 a 60 km/h
  - 4ª marcha: 61 a 80 km/h
  - 5ª marcha: 81 a 100 km/h
  - 6ª marcha: 101 a 120 km/h
- O carro só pode ser desligado quando estiver em ponto morto e com velocidade igual a 0 km/h.
- O carro só pode virar para esquerda ou direita quando estiver entre 1 km/h e 40 km/h.

## Funcionalidades Implementadas

- [x] Ligar carro
- [x] Desligar carro
- [x] Acelerar
- [x] Diminuir velocidade
- [x] Trocar marchas
- [ ] Virar para esquerda
- [ ] Virar para direita
- [ ] Consultar velocidade
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