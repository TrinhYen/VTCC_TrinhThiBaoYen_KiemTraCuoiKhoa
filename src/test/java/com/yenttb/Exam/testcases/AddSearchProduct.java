package com.yenttb.Exam.testcases;

import com.yenttb.Exam.pages.LoginPage;
import com.yenttb.Exam.pages.ProductDetailPage;
import com.yenttb.Exam.pages.ProductListPage;
import com.yenttb.common.BaseTest;
import com.yenttb.helpers.CaptureHelper;
import org.testng.annotations.Test;

public class AddSearchProduct extends BaseTest {

    private String PRODUCT_NAME = "yenttb";
    private LoginPage loginPage = new LoginPage();
    private ProductListPage productPage = new ProductListPage();
    private ProductDetailPage productDetailPage = new ProductDetailPage();

    @Test
    public void testAddNewProduct() {
        CaptureHelper.captureScreenshot("addNewProduct");
        CaptureHelper.startRecord("testAddNewProduct");
        //Fluent design pattern
        loginPage.loginCRM("admin@example.com", "123456")
                .openAddNewProductPage()
                .verifyRedirectToProductPage()
                .addNewProduct(PRODUCT_NAME);
        productPage.verifyAddProduct(PRODUCT_NAME);
    }

    @Test
    public void searchProduct() {
        productPage.searchProductName(PRODUCT_NAME);
        productDetailPage.verifyProductDetail(PRODUCT_NAME);
    }
}
