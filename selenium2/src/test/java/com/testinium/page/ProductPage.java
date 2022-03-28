package com.testinium.page;

import com.testinium.driver.BaseTest;
import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.Base64;
import java.util.List;
import java.util.Random;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);
    WebDriver driver;

    public ProductPage(){
        methods = new Methods();
        driver = BaseTest.driver;
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(By.xpath("//*[@id=\"product-577327\"]/div[2]/div[3]/a[4]/i"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//*[@id=\"product-577327\"]/div[2]/div[3]/a[4]/i"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-572810\"]/div[2]/div[3]/a[5]/i"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-565088\"]/div[2]/div[3]/a[4]/i"));
        methods.waitBySeconds(2); //son favoriye eklenen ürün
        methods.click(By.xpath("//*[@id=\"product-577328\"]/div[2]/div[3]/a[4]/i"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]/a/img"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector(".product-filter-header>.sort>select"), "Yüksek Oylama");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/div/div[1]/div/ul[2]/li[14]/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"product-74065\"]/div[3]/div/a/img"));//random kitap seçmiyor
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.id("button-cart"));
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        //favoriler sekmesine girmek için bu 2 si
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[3]/div[2]/div/div[3]/div[1]"));
        methods.click(By.xpath("//*[@id=\"product-572810\"]/div[2]/div[3]/a[4]/i"));//bunu deneyeceksin
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"cart\"]/div[1]"));
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/input[1]"));
        methods.sendKeys(By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/input[1]"), "2");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[4]/div[1]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));// yeni adress eklemek istiyorum
        methods.click(By.xpath("//*[@id=\"address-firstname-companyname\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"address-firstname-companyname\"]"), "Batuhan");
        methods.click(By.id("address-lastname-title"));
        methods.sendKeys(By.id("address-lastname-title"),"Şengün");
        Select drpCity=new Select(methods.findElement(By.id("address-zone-id")));
        drpCity.selectByVisibleText("İzmir");
        methods.waitBySeconds(3);
        Select drpTown=new Select(methods.findElement(By.name("county_id")));
        drpTown.selectByVisibleText("GAZİEMİR");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"district\"]"));
        methods.sendKeys(By.xpath("//*[@id=\"district\"]"), "abcabc");//mahalle
        methods.click(By.id("address-address-text"));
        methods.sendKeys(By.id("address-address-text"), "adress tarifim");
        methods.click(By.id("address-postcode"));
        methods.sendKeys(By.id("address-postcode"), "35040");
        methods.click(By.id("address-mobile-telephone"));
        methods.sendKeys(By.id("address-mobile-telephone"), "5442736486");
        methods.click(By.id("address-tax-id"));
        methods.sendKeys(By.id("address-tax-id"), "12815547632");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(7);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));// adresten sonraki next
        methods.waitBySeconds(5);
        methods.click(By.id("credit-card-owner"));
        methods.sendKeys(By.id("credit-card-owner"), "Mehmet Batuhan Şengün");
        methods.click(By.id("credit_card_number_1"));
        methods.sendKeys(By.id("credit_card_number_1"), "4987");
        methods.click(By.id("credit_card_number_2"));
        methods.sendKeys(By.id("credit_card_number_2"), "4938");
        methods.click(By.id("credit_card_number_3"));
        methods.sendKeys(By.id("credit_card_number_3"), "6152");
        methods.click(By.id("credit_card_number_4"));
        methods.sendKeys(By.id("credit_card_number_4"), "1033");
        Select kartAy=new Select(methods.findElement(By.id("credit-card-expire-date-month")));
        kartAy.selectByVisibleText("03");
        Select kartYil=new Select(methods.findElement(By.id("credit-card-expire-date-year")));
        kartYil.selectByVisibleText("2024");
        methods.click(By.id("credit-card-security-code"));
        methods.sendKeys(By.id("credit-card-security-code"), "858");
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//*[@id=\\\"header-bottom\\\"]/div/div[2]\""));
        methods.click(By.xpath("//*[@id=\"header-bottom\"]/div/div[2]"));//kitap yurdu logo
        methods.click(By.cssSelector(".menu.top.login"));
        methods.click(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));
        methods.waitBySeconds(5);










        /* Random random = new Random();
        List<WebElement> items = driver.findElements(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[1]/div[2]/ul/li[3]/span"));
        int value = items.size();
        items.get(random.nextInt(value)).click();
        methods.waitBySeconds(2);




        /*methods.click(By.cssSelector(".menu.top.my-list>ul>li>a"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu.top.my-list>ul>li>div>ul>li>a"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"product-565088\"]/div[1]/div[2]/a"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"product-512553\"]/div[2]/div[3]/a[3]"));
        methods.waitBySeconds(3);
       /* methods.waitBySeconds(3);
        methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (Düşük > Yüksek)");
        methods.waitBySeconds(5);

        */
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(3);

    }

    public void textControlTest(){
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " + text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(3);
    }

    public void valueControlTest(){
        methods.sendKeys(By.id("search-input"),"testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);
    }

}
