
/*
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class demo {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        String url = "https://accounts.google.com/signin";

        driver.get(url);

        driver.findElement(By.id("identifierId")).sendKeys("raj8805");

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebDriverWait wait=new WebDriverWait(driver, 20);

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("asassassa");

        driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

    }

}


 */

import java.lang.*;
import java.util.Scanner;


class demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str= sc.nextLine();
        int start= sc.nextInt();
        int end = sc.nextInt();
        System.out.println(str.substring(start,end));
    }
}