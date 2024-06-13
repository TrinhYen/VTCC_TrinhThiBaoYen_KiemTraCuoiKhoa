package com.yenttb.Exam.pages;

import com.yenttb.keywords.WebUI;
import org.openqa.selenium.By;

public class CommonPage {

    public CommonPage() {
    }

    public By inputSearch = By.xpath("//input[@id='search_input']");
    public By menuDashboard = By.xpath("//span[normalize-space()='Dashboard']");
//    public By menuProject = By.xpath("//span[normalize-space()='Projects']");
    public By menuProduct = By.xpath("//span[text()='Products']");
    public By menuAddProduct = By.xpath("//span[normalize-space()='Add New Product']");

    public AddNewProduct openAddNewProductPage() {
        WebUI.clickElement(menuProduct);
        WebUI.clickElement(menuAddProduct);
        WebUI.waitForPageLoaded();
        return new AddNewProduct();
    }

    public void searchCommon(String text){
        WebUI.setText(inputSearch, text);
    }

    //Khởi tạo từng class riêng để gọi dùng cho nhanh
    LoginPage loginPage;
    DashboardPage dashboardPage;
    AddNewProduct addNewProductPage;
    ProductListPage showAllProductPage;
    ProductDetailPage productDetailPage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public DashboardPage getDashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }

    public AddNewProduct getAddNewProductPage() {
        if (addNewProductPage == null) {
            addNewProductPage = new AddNewProduct();
        }
        return addNewProductPage;
    }

    public ProductListPage getAllProductPage() {
        if (showAllProductPage == null) {
            showAllProductPage = new ProductListPage();
        }
        return showAllProductPage;
    }

    public ProductDetailPage getProductDetailPage() {
        if (productDetailPage == null) {
            productDetailPage = new ProductDetailPage();
        }
        return productDetailPage;
    }

}
