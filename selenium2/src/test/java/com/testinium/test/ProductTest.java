package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.scrollAndSelect();

    }

    @Test
    public void getAttribute(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.textControlTest();
    }

    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();

        productPage.valueControlTest();
    }
}
