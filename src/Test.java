import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.security.PKCS12Attribute;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/19/2017.
 */
public class Test
{
    public static void main(String[] args) {



        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd hh mm ss");
        Date datedj = new Date();
        System.out.println(dateFormat.format(datedj));

        driver.close();





    }
}
