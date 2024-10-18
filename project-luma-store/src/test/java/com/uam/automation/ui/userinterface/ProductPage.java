package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


//@DefaultUrl("https://magento.softwaretestingboard.com/")
public class ProductPage {

    public static Target PRODUCT_OPTION = Target.the("product option").locatedBy("//a[@title='Hero Hoodie' and @class='product-item-link']");
    public static Target PRODUCT_SIZE = Target.the("product size").locatedBy("//div[@id='option-label-size-143-item-166']");
    public static Target PRODUCT_COLOR = Target.the("product color").locatedBy("//div[@id='option-label-color-93-item-53']");
    public static Target PRODUCT_QUANTITY = Target.the("product quantity").locatedBy("//input[@id='qty']");
    public static Target ADD_TO_CART_BUTTON = Target.the("Add to Cart").located(By.id("product-addtocart-button"));
    public static Target SHOPPING_CART = Target.the("shopping cart").locatedBy("//span[@class='counter-number']");
    public static Target PROCEED_TO_CHECKOUT_BUTTON = Target.the("Proceed to Checkout").located(By.id("top-cart-btn-checkout"));



}

