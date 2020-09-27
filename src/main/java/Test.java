import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sharelane.com/cgi-bin/main.py");

        WebElement signUp = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]/td/table/tbody/tr/td[4]/a"));
        signUp.click();

        WebElement zipCode = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        zipCode.sendKeys("12345");

        WebElement continueBtn = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        continueBtn.click();

        WebElement firstName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input"));
        firstName.sendKeys("alex");

        WebElement lastName = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input"));
        lastName.sendKeys("alex");

        WebElement email = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/input"));
        email.sendKeys("popeskulaleksandr@gmail.com");

        WebElement password = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td[2]/input"));
        password.sendKeys("1111");

        WebElement confirmPassw = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/input"));
        confirmPassw.sendKeys("1111");

        WebElement registerBtn = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[5]/td/table/tbody/tr[2]/td/table/tbody/tr[6]/td[2]/input"));
        registerBtn.click();

        WebElement accountCr = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span"));

        WebElement emaiL = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b"));

        WebElement passwd = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[6]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]"));

        Assert.assertEquals("Account is created!", accountCr.getText());

        Assert.assertNotNull("Email", emaiL.getText());

        Assert.assertNotNull("Password", passwd.getText());

        driver.close();
        driver.quit();







    }
}
