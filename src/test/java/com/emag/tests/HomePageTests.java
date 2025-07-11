package com.emag.tests;

import com.emag.init.BaseTest;
import com.emag.pages.HomePage;
import com.emag.stepDefinition.HomePageSteps;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class HomePageTests extends BaseTest {


    @Test
    public void testHomePage() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.checkMyAccountIsDisplayed();
        homePage.clickOnHeader();
        homePage.checkMyAccountIsDisplayed();
        homePage.clickOnSearchButton();
        homePage.enterTextInTextField("Mishu");
    }

    @Test
    public void testHomePage2() {
        //HomePageSteps page = new HomePageSteps();
        //
        //page.user_landed_homepage();
        //WebDriver driver = getDriver();
        WebDriver driver = getDriver();
        HomePageSteps homePageSteps = new HomePageSteps(driver);
        homePageSteps.user_landed_homepage();
        homePageSteps.userClicksOnHeader();
    }

    @Test
    public void testResigilate() throws InterruptedException {
        WebDriver driver = getDriver();
        HomePageSteps homePageSteps = new HomePageSteps(driver);
        homePageSteps.user_landed_homepage();
        homePageSteps.clickOnResigilate();

    }
    @Test
    public void test() {

        Integer[] a = new Integer[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 2;
        //a.
        System.out.println(a[2] + " " + a[1]);
        //Integer[] b = (Integer[]) Arrays.stream(a).distinct().toArray();
        //System.out.println(b);
        System.out.println(Arrays.stream(a).distinct().toList());

        ArrayList<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('b');
        System.out.println(chars);

        Set<Character> chars2 = new HashSet<>() ;
        chars2.add('a');
        chars2.add('b');
        chars2.add('c');
        System.out.println(chars2.size());


        String m = "abcde";
        for (int i=0;i<m.length();i++) {
            System.out.println(m.charAt(i));
        }
        System.out.println(m.chars().toString());
        //System.out.println(abc.a);
        try{
            Assert.assertTrue(2==30);
        } catch (Exception exp) {
            System.out.println("eroare");
        }
        HomePage page = new HomePage(getDriver());
    }
}
