package Adapter;

public class Main {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.selectElement();
        chromeDriver.getElement();

        IEDriver ieDriver = new IEDriver();
        ieDriver.clickElement();
        ieDriver.findElement();

        WebDriver webDriver = new WebDriverAdapter(ieDriver);
        webDriver.selectElement();
        webDriver.getElement();
    }
}
