package Teste;

import hook.Hook;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CriarTarefaPage;
import pageObjects.LoginPage;

public class MyStepdefs {
    @Dado("que realizo login na pagina MantisBT")
    public void queRealizoLoginNaPaginaMantisBT() {
        LoginPage.inserirNomeUsuarioPgLogin(Hook.driver,"Fernanda_Zimmer");
        LoginPage.clicarBtnEntrar(Hook.driver);
        LoginPage.inserirSenhaUsuario(Hook.driver,"Fe852456**");
    }

    @Quando("realizo a criacao de uma nova tarefa clicando no botao Criar Tarefa")
    public void realizoACriacaoDeUmaNovaTarefaClicandoNoBotaoCriarTarefa() {
        CriarTarefaPage.criarNovaTarefa(Hook.driver);
    }

    @Entao("sistema deve criar nova tarefa criada")
    public void sistemaDeveCriarNovaTarefaCriada() {
        CriarTarefaPage.validaCriacaoDeTarefa(Hook.driver);
    }
}
