// src/test/java/steps/Hooks.java
package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks {

    @Before
    public void setUp() {
        BasePage.initDriver(); // Método que inicializa el WebDriver
    }

    @After
    public void tearDown() {
        BasePage.closeBrowser(); // Método que cierra el WebDriver
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Captura de pantalla al fallar", "image/png", new java.io.ByteArrayInputStream(screenshot), ".png");
        }
        BasePage.closeBrowser();
    }
}