package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.By.*;

public class CriarTarefaPage {
    private static final By btnCriarNovaTarefa = By.linkText("Criar Tarefa");
    private static final By categoria = By.id("category_id");
    private static final By opcoesCategoria = By.xpath("//option[. = '[Todos os Projetos] categoria teste']");
    private static final By frequencia= id("reproducibility");
    private static final By opcoesFrequencia = xpath("//option[. = 'sempre']");
    private static final By gravidade=id("severity");
    private static final By opcoesGravidade = xpath("//option[. = 'texto']");
    private static final By prioridade = id("priority");
    private static final By opcoesPrioridade = xpath("//option[. = 'nenhuma']");
    private static final By selecionarPerfilPlaforma = id("platform");
    private static final By selecionarPerfilOS = id("os");
    private static final By selecionarPerfilVersaoSO = id("os_build");
    private static final By campoResumo = id("summary");
    private static final By campoDescricao = id("description");
    private static final By campoEspacoParaReproduzir = id("steps_to_reproduce");
    private static final By campoInformacoesAdicionais = id("additional_info");
    private static final By marcadoreAtuais = id("tag_select");
    private static final By radioButtonPublico= cssSelector("tr:nth-child(12) label:nth-child(1) > .lbl");
    private static final By btnCriarNovaTarefaPg = xpath("//input[@value='Criar Nova Tarefa']");
    private static final By txtVerDetalhesDaTarefa = cssSelector(".widget-box:nth-child(1) .widget-title");


    public static void criarNovaTarefa(WebDriver driver){
        driver.findElement(btnCriarNovaTarefa).click();
        driver.findElement(categoria).click();
        {
            WebElement dropdown = driver.findElement(categoria);
            dropdown.findElement(opcoesCategoria).click();
        }
        driver.findElement(frequencia).click();
        {
            WebElement dropdown = driver.findElement(frequencia);
            dropdown.findElement(opcoesFrequencia).click();
        }
        driver.findElement(gravidade).click();
        {
            WebElement dropdown = driver.findElement(gravidade);
            dropdown.findElement(opcoesGravidade).click();
        }
        driver.findElement(prioridade).click();
        {
            WebElement dropdown = driver.findElement(prioridade);
            dropdown.findElement(opcoesPrioridade).click();
        }
        driver.findElement(selecionarPerfilPlaforma).sendKeys("Teste");
        driver.findElement(selecionarPerfilOS).sendKeys("Teste");
        driver.findElement(selecionarPerfilVersaoSO).sendKeys("Teste");
        driver.findElement(campoResumo).sendKeys("Teste");
        driver.findElement(campoDescricao).sendKeys("Teste");
        driver.findElement(campoEspacoParaReproduzir).sendKeys("Teste");
        driver.findElement(campoInformacoesAdicionais).sendKeys("Teste");
        driver.findElement(marcadoreAtuais).click();
        {
            WebElement dropdown = driver.findElement(marcadoreAtuais);
            dropdown.findElement(By.xpath("//option[. = 'Marcadores atuais']")).click();
        }
        driver.findElement(radioButtonPublico).click();
        driver.findElement(btnCriarNovaTarefaPg ).click();
    }
    public static void validaCriacaoDeTarefa(WebDriver driver){
        String msg = driver.findElement(txtVerDetalhesDaTarefa).getText();
        Assert.assertEquals(msg, "Ver Detalhes da Tarefa");
    }
}
