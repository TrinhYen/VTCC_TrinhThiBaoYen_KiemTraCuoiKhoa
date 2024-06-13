package com.yenttb.Exam.pages;

import com.yenttb.keywords.WebUI;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductDetailPage extends CommonPage{

    public ProductDetailPage() {
    }

    private By nameDetail = By.xpath("//div[@class='col-xl-7 col-lg-6']//h1");

    public ProductDetailPage verifyProductDetail(String productName) {
        new CommonPage().getProductDetailPage();
        WebUI.waitForPageLoaded();
        Assert.assertEquals(WebUI.getElementAttribute(nameDetail, "value"), productName, "The Product name not match.");
        return this;
    }
}
