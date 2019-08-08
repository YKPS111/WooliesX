package PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MyStore {

    public WebDriver driver;
    By searchField = By.xpath("//*[@id=\"search_query_top\"]");  
    By searchButton = By.xpath("//*[@id=\"searchbox\"]/button");   
    By firstProductLink = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a");  
    By addtoCartButton = By.xpath("//*[@id=\"add_to_cart\"]/button/span");   
    By continueShoppingButton = By.xpath("//title[@value = 'Continue shopping']");
    By searchButton1 = By.xpath("//*[@id=\"searchbox\"]/button");   
    By secondProductLink = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a");
    By addtoCartButton1 = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By gotoCartButton = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b");
    By proceedtoCheckoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
    By emailAddressField= By.xpath("//*[@id=\"email\"]");
    By passwordField= By.xpath("//*[@id=\"passwd\"]");
    By signinButton= By.xpath("//*[@id=\"SubmitLogin\"]/span");
    By secondProceedtoCheckoutButton = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By tandcCheckbox= By.xpath("//*[@id=\"cgv\"]");
    By finalproceedtoCheckoutButton = By.xpath("//*[@id=\"form\"]/p/button/span");
    By paybybankWireButton = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a/span");
    By confirmOrderButton= By.xpath("//*[@id=\"cart_navigation\"]/button/span");
    By orderConfirmationNote= By.xpath("//*[@id=\"center_column\"]/div/p/strong");
    
    
    
    /**
     * Constructor to initialize the driver
     * @param driver
     */
    public MyStore(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Function to search for "Dresses" product type
     * @param task
     */
    public void setSearchTask(String task) {
        driver.findElement(searchField).sendKeys(task, Keys.TAB);
    }

    /**
     * Function to click on Search Button
     */
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    /**
     * Function to click on First Product from the search result
     */
    
    public void clickfirstProductLink() {
        driver.findElement(firstProductLink).click();
    }

    /**
     * Function to click on Add to cart button
     * @throws InterruptedException 
     */
    
    public void clickaddtoCartButton() throws InterruptedException {
        driver.findElement(addtoCartButton).click();
        Thread.sleep(5000);
    }
    
    /**
     * Function to click on Continue Shopping button
     * @throws InterruptedException 
     */
    
    public void clickcontinueShoppingButton() throws InterruptedException {
    	
        driver.findElement(continueShoppingButton).click();
        //Thread.sleep(5000);
        
    }
    /**
     * Function to search for "Dresses" product type
     * @param task*/
     
    public void setSearchTask1(String task) {  
    	 driver.findElement(searchField).sendKeys(task, Keys.TAB);
  

        
    }

    /**
    /**
     * Function to click on Search Button
     */
    public void clickSearchButton1() {
    	
        driver.findElement(searchButton1).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }

    
    
    /**
     * Function to click on Second Product from the search result
     */
    
    public void clicksecondProductLink() {
        driver.findElement(secondProductLink).click();
    }
    
    /**
     * Function to click on Add to cart button
     */
    
    public void clickaddtoCartButton1() {
        driver.findElement(addtoCartButton1).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        
    }
    
    
    
    
    /**
     * Function to click on Proceed to checkout button
     */
    
    public void clickGotoCart() {
        driver.findElement(gotoCartButton).click();
    }
    
    /**
     * Function to click on Proceed to checkout button
     */
    
    public void clickproceedtoCheckoutButton() {
        driver.findElement(proceedtoCheckoutButton).click();
    }
    
    
    /**
     * Function to Enter the email address  
     * @param task
     */
    public void enterEmail(String task) {
        driver.findElement(emailAddressField).sendKeys(task, Keys.TAB);
    }
    
    /**
     * Function to Enter the password  
     * @param mtask
     */
    public void enterPassword(String mtask) {
        driver.findElement(passwordField).sendKeys(mtask, Keys.TAB);
    }
    
    /**
     * Function to click on Sign in button
     */
    
    public void clickSigninButton() {
        driver.findElement(signinButton).click();
    }
    
    /**
     * Function to click on Checkout button for the second time
     */
    
    public void clickSecondproceedtoCheckoutButton() {
        driver.findElement(secondProceedtoCheckoutButton).click();
    }
    
    
    /**
     * Function to click (Check) on Terms and Conditions Check box
     */
    
    public void clicktandcCheckbox() {
        driver.findElement(tandcCheckbox).click();
    }
    
    /**
     * Function to click on Proceed to checkout button for the last time 
     */
    
    public void clickfinalproceedtoCheckoutButton() {
        driver.findElement(finalproceedtoCheckoutButton).click();
    }
    
    public void clickpaybybankWireButton() {
        driver.findElement(paybybankWireButton).click();
    }
    
    public void clickconfirmOrderButton() {
        driver.findElement(confirmOrderButton).click();
    }
    
    
    
    /*public void orderConfirmationText() {
        driver.findElement(orderConfirmationNote).getText();
     
    }*/
}
