package pages;

public class PaginaFundamentosTesting extends BasePage {

    private String introduccionTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clickIntroduccionTestingLink() {
        clickElement(introduccionTestingLink);
    }
}
