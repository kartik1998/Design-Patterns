package Adapter;

public class ChromeDriver implements WebDriver {
    @Override
    public void getElement() {
        System.out.println("Get Element From ChromeDriver");
    }

    @Override
    public void selectElement() {
        System.out.println("Select Element from ChromeDriver");
    }
}
