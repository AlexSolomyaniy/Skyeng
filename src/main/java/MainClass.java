import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\alexs\\IdeaProjects\\testselenium\\drivers" +
                "\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*driver.get("https://ru.wikipedia.org/wiki/");
        driver.navigate().to("http://seleniumhq.org");
        System.out.println(driver.getCurrentUrl());

        WebElement text = new driver.findElement(By.name("Search"));*/

        /*driver.get("https://www.wikipedia.org/");
        driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Hush");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).getAttribute("value"));
        driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();*/

        //Test 1
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys("Login");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys("Pass");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div/button")).click();

        WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div"));

        if (text.getText().equals("Login correct"))
            System.out.println("Pass");
        else
            System.out.println("Fail");



        //Test 2
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).clear();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys("Login");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys("Pass");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div/button")).click();

        WebElement text2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div"));

        if (text2.getText().equals("Invalid credentials"))
            System.out.println("Pass");
        else
            System.out.println("Fail");


        //Test 3
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div/button")).click();

        WebElement text3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div"));

        if (text3.getText().equals("Invalid credentials"))
            System.out.println("Pass");
        else
            System.out.println("Fail");


        //Test 4
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).clear();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys("Login");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys
                ("Pass don`t correct");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div/button")).click();

        WebElement text4 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div"));

        if (text4.getText().equals("Invalid credentials"))
            System.out.println("Pass");
        else
            System.out.println("Fail");


        //Test 5
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).clear();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).sendKeys
                ("Login");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div/button")).click();

        WebElement text5 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[3]/div"));

        if (text5.getText().equals("Invalid credentials"))
            System.out.println("Pass");
        else
            System.out.println("Fail");


        //Test 6
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[1]/input")).clear();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).clear();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input")).sendKeys("Pass");

        WebElement text6 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/form/div[2]/input"));

        if (text6.getText().equals("Pass"))
            System.out.println("Pass");
        else
            System.out.println("Fail");


        //Test 7
        driver.get("https://id.skyeng.ru/login?redirect=https%3A%2F%2Fskyeng.ru");

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/select")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/select/option[2]")).click();

        WebElement text7 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[1]"));


        if (text7.getText().equals("Язык:"))
            System.out.println("Pass");
        else
            System.out.println("Fail");



    }
}
