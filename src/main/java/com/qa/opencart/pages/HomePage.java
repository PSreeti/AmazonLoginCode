package com.qa.opencart.pages;

import com.qa.opencart.utils.ElementUtil;
//import jdk.dynalink.beans.StaticClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private ElementUtil elementUtil;

    public String Product1;
    public String Product2;
    public String Product3;
    public String TotalItem;


    By categories = By.xpath("//*[@id=\"nav-xshop\"]/a[2]");

            //By.xpath("//*[text()='Best Sellers']");
    By item1 = By.linkText("HIT Crawling Insect Killer – Cockroach Killer Spray (700ml) | Instant Kill | Deep-Reach Nozzle | Fresh Fragrance");
                    //xpath("//*[text()='HIT Crawling Insect Killer – Cockroach Killer Spray (700ml) | Instant Kill | Deep-Reach Nozzle | Fresh Fragrance']");
    By item1click = By.id("submit.add-to-cart");
    By item2 = By.linkText("GLUN Bolt Electronic Portable Fishing Hook Type Digital LED Screen Luggage Weighing Scale, 50 kg/110 Lb (Black)");

            //xpath("//*[text()='GLUN Bolt Electronic Portable Fishing Hook Type Digital LED Screen Luggage Weighing Scale, 50 kg/110 Lb (Black)']");
    By item2click = By.id("submit.add-to-cart");
    By item3 = By.linkText("URBAN FOREST Black Leather Men's Card Holder With Pen Combo (UBF126BLK10208)");

    By item3click = By.id("add-to-cart-button");
    By Cart = By.id("nav-cart-count");
    By totalItem = By.id("sc-subtotal-label-buybox");



    public HomePage(WebDriver driver) {
            this.driver = driver;
            elementUtil = new ElementUtil(this.driver);
        }

        public void selectItem()
        {
            elementUtil.doClick(categories);
            elementUtil.doClick(item1);
            elementUtil.doClick(item1click);
            driver.navigate().back();
            driver.navigate().back();
            elementUtil.doClick(item2);
            elementUtil.doClick(item2click);
            driver.navigate().back();
            driver.navigate().back();
            elementUtil.doClick(item3);
            elementUtil.doClick(item3click);
            elementUtil.doClick(Cart);

            Product1= elementUtil.doGetText(item1);
            Product2= elementUtil.doGetText(item2);
            Product3 = elementUtil.doGetText(item3);
            TotalItem = elementUtil.doGetText(totalItem);


        }


}
