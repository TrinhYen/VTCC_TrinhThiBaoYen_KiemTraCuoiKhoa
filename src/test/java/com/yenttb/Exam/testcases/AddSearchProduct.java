package com.yenttb.Exam.testcases;

import com.yenttb.Exam.pages.LoginPage;
import com.yenttb.Exam.pages.ProductDetailPage;
import com.yenttb.Exam.pages.ProductListPage;
import com.yenttb.common.BaseTest;
import org.testng.annotations.Test;

public class AddSearchProduct extends BaseTest {

    //private LoginPage loginPage;
    //private ProductListPage productPage;
//    private ProductDetailPage productDetailPage;
    private String PRODUCT_NAME = "yenttb";
    private LoginPage loginPage = new LoginPage();
    ProductListPage productPage = new ProductListPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();

    @Test
    public void testAddNewProduct() {

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