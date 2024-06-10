package pageObjects;

import hook.Hook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LoginPage {


    private static final By nomeDeUsuario = id("username");
    private static final By btnEntrar = xpath("//input[@value='Entrar']");
    private static final By campoSenha = id("password");


    public static void inserirNomeUsuarioPgLogin(WebDriver driver,String nome){
        driver.findElement(nomeDeUsuario).sendKeys(nome);
    }
    public static void clicarBtnEntrar(WebDriver driver){

        driver.findElement(btnEntrar).click();
    }
    public static void inserirSenhaUsuario(WebDriver driver,String nome){
        driver.findElement(campoSenha).sendKeys(nome);
        clicarBtnEntrar(Hook.driver);
    }
}
