import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BT_WebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/clients");

        //Đăng nhập
        driver.findElement(By.xpath(AddNewCustomer.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(AddNewCustomer.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(AddNewCustomer.buttonLogin)).click();

        driver.findElement(By.xpath(AddNewCustomer.menuCustomer)).click();
        driver.findElement(By.xpath(AddNewCustomer.buttonAddNewCustomer)).click();

        //Nhập vào các trường input
        driver.findElement(By.xpath(AddNewCustomer.inputCompany)).sendKeys("Viettel 5");
        driver.findElement(By.xpath(AddNewCustomer.inputVATNumber)).sendKeys("VAT02845384");
        driver.findElement(By.xpath(AddNewCustomer.inputPhone)).sendKeys("091334646");
        driver.findElement(By.xpath(AddNewCustomer.inputWebsite)).sendKeys("https://vietteltelecom.vn/vx/");
        Thread.sleep(1000);

        //Trường Group
        WebElement dropDownGroup = driver.findElement(By.xpath(AddNewCustomer.dropdownGroup));
        dropDownGroup.click();
        driver.findElement(By.xpath(AddNewCustomer.searchGroup)).sendKeys("sil"); //Search rồi chọn giá trị
        driver.findElement(By.xpath("//a[@id='bs-select-1-2']/descendant::span[.='Silver']")).click();
        dropDownGroup.click();
        Thread.sleep(1000);

        //Trường Currency
        driver.findElement(By.xpath(AddNewCustomer.dropdownCurrency)).click();
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click(); //Không search mà chọn luôn
        Thread.sleep(1000);

        //Truờng Chọn ngôn ngữ- Default Language
        driver.findElement(By.xpath(AddNewCustomer.dropdownDefaultLanguage)).click();
        driver.findElement(By.xpath("//a[@id='bs-select-3-2']/descendant::span[normalize-space()='Polish']")).click();
        Thread.sleep(1000);

        //Điền vào các trường input
        driver.findElement(By.xpath(AddNewCustomer.inputAdress)).sendKeys("Viêt Nam");
        driver.findElement(By.xpath(AddNewCustomer.inputCity)).sendKeys("Hà Nội");
        driver.findElement(By.xpath(AddNewCustomer.inputState)).sendKeys("New");
        driver.findElement(By.xpath(AddNewCustomer.inputZipCode)).sendKeys("0001101");
        Thread.sleep(1000);

        //Trường chọn Country
        driver.findElement(By.xpath(AddNewCustomer.dropdownCountry)).click();
        driver.findElement(By.xpath(AddNewCustomer.searchCountry)).sendKeys("vi");
        driver.findElement(By.xpath("//span[normalize-space()='Vietnam']")).click();
        driver.findElement(By.xpath(AddNewCustomer.dropdownCountry)).click();
        Thread.sleep(500);

        //Click button Save
        driver.findElement(By.xpath(AddNewCustomer.buttonSave)).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
