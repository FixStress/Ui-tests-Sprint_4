package ru.yandex.samokat.tests.chrome.orderstests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.samokat.pages.HomePage;
import ru.yandex.samokat.pages.orderpages.StatusOrderPage;

public class StatusOrdersTests {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver).open();
    }

    @After
    public void tearDown() {
        driver.quit();

    }

    // Тестирование на отображение сообщения о не найдёном заказу
    // При вводе несуществующего заказа
    @Test
    public void NegativeTestsOrderStatus() {
        HomePage homePage = new HomePage(driver)
                .goToOrderStatus("24252627");
        StatusOrderPage statusOrderPage = new StatusOrderPage(driver);
        statusOrderPage.notFoundImage();
    }


}
