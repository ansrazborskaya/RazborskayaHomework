package com.stormnet.homework.homework1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class VkTest {
    private WebDriver driver = new ChromeDriver();;
    private static String EMAIL_USERNAME;
    private static String EMAIL_PASSWORD;
    private final Wait<WebDriver> wait = new WebDriverWait(driver, 20).withMessage("Element was not found").ignoring(StaleElementReferenceException.class, ElementNotVisibleException.class);

    @BeforeTest
    public void profileSetup() {
        driver.manage().window().maximize();
        System.out.println("The profile setup process is completed.");
    }

    @BeforeClass
    public void init(){
        EMAIL_USERNAME = "";
        EMAIL_PASSWORD = "";
        System.out.println("User for vk is generated!");

    }

    @BeforeMethod
    public void authorization(){
        driver.get("https://vk.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("index_email")));
        WebElement username = driver.findElement(By.id("index_email"));
        username.sendKeys(EMAIL_USERNAME);
        WebElement password = driver.findElement(By.id("index_pass"));
        password.sendKeys(EMAIL_PASSWORD);
        WebElement button = driver.findElement(By.id("index_login_button"));
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("l_msg")));
        System.out.println("User is authorized.");
    }


    @Test
    public void vkMessageTest(){

        driver.findElement(By.id("l_msg")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Все сообщения']")));
        WebElement searchField = driver.findElement(By.id("im_dialogs_search"));
        searchField.sendKeys("Анастасия Малкавиан");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='_im_dialog_link']")));
        driver.findElement(By.xpath("//span[@class='_im_dialog_link']")).click();
        WebElement textField = driver.findElement(By.xpath("//*[@id='im_editable0']"));
        textField.sendKeys("Привет");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']")));
        driver.findElement(By.xpath("//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Привет']")));
        WebElement result =  driver.findElement(By.xpath("//div[text()='Привет']"));
        Assert.assertTrue(result.isDisplayed());
        System.out.println("The message is received: " + result.getText());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
