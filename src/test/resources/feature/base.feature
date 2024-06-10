#language: pt
Funcionalidade: Testar site da ForwardCar com Reports
  Contexto:
    Dado que realizo login na pagina MantisBT

  @CT001
  Cenario: Criar Nova Tarefa
    Quando realizo a criacao de uma nova tarefa clicando no botao Criar Tarefa
    Entao sistema deve criar nova tarefa criada