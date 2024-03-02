package org.example;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners({ScreenShooter.class})

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
//yy
    

    WebDriver driver = new ChromeDriver();



    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("BeforeSuite");

    }

    @BeforeTest
    public void BeforeTest() {
        System.out.println("BeforeTest");
        System.out.println("before executing any test method within the same test class");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("BeforeClass");
        System.out.println("before executing the first test method within the same test class");

    }

    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("BeforeMethod");
        driver.get("https://www.google.com/");
        System.out.println("before executing any and every test method within the same test class");


    }


    @Test(priority = -10, invocationCount = 2)
    @Parameters("edge")
    public void te1() {
        Configuration.startMaximized = true;
        Configuration.savePageSource = false;
        Configuration.reportsFolder = "src/main/resources/screens";
        ScreenShooter.captureSuccessfulTests = true;
        WebElement ser = driver.findElement(By.id("APjFqb"));
        ser.click();
        ser.sendKeys("1maroaaaam");
        //სოფტასსერშენ
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ser.getText(), "1maroaaaam");
    }

}

