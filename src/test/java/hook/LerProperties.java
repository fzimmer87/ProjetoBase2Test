package hook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class LerProperties {
    String baseUri;
    String chrome;
    String configChromeDriver;
    String caminhoedgedriver;
    String configedgedriver;
    String caminhofirefoxdriver;
    String configfirefoxdriver;
    int drivers;
    private Properties prop = new Properties();
    public LerProperties() throws IOException {
        prop.load(Files.newInputStream(Paths.get("src/test/resources/properties/driver.properties")));
        prop.load(Files.newInputStream(Paths.get("src/test/resources/properties/url.properties")));

        this.baseUri = prop.getProperty("baseURI");
        this.chrome = prop.getProperty("caminhochromedriver");
        this.configChromeDriver = prop.getProperty("configchromedriver");
        this.caminhoedgedriver = prop.getProperty("configedgedriver");
        this.configedgedriver = prop.getProperty("caminhoedgedriver");
        this.drivers = Integer.parseInt(prop.getProperty("drivers"));
        this.caminhofirefoxdriver = prop.getProperty("caminhofirefoxdriver");
        this.configfirefoxdriver = prop.getProperty("configfirefoxdriver");

    }

    public String getBaseUri() {
        return baseUri;
    }

    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public String getChrome() {
        return chrome;
    }

    public void setChrome(String chrome) {
        this.chrome = chrome;
    }

    public String getConfigChromeDriver() {
        return configChromeDriver;
    }

    public void setConfigChromeDriver(String configChromeDriver) {
        this.configChromeDriver = configChromeDriver;
    }

    public String getCaminhoedgedriver() {
        return caminhoedgedriver;
    }

    public void setCaminhoedgedriver(String caminhoedgedriver) {
        this.caminhoedgedriver = caminhoedgedriver;
    }

    public String getConfigedgedriver() {
        return configedgedriver;
    }

    public void setConfigedgedriver(String configedgedriver) {
        this.configedgedriver = configedgedriver;
    }

    public String getCaminhofirefoxdriver() {
        return caminhofirefoxdriver;
    }

    public void setCaminhofirefoxdriver(String caminhofirefoxdriver) {
        this.caminhofirefoxdriver = caminhofirefoxdriver;
    }

    public String getConfigfirefoxdriver() {
        return configfirefoxdriver;
    }

    public void setConfigfirefoxdriver(String configfirefoxdriver) {
        this.configfirefoxdriver = configfirefoxdriver;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
    }
}


