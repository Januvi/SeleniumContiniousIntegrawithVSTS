package in.at.maven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class firsttestscriptTest {
    // this test comes under both sanity and regression groups
    @Test(groups = {"SanityTest", "RegressionTest"})
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rcsfaweb.z22.web.core.windows.net/login");
        Thread.sleep(3000);
        driver.quit();
        
    }
    @Test(groups ={"SanityTest"})
    public void test2(){
        System.out.println("this test2 comes under sanity test groups");

    }

    @Test(groups ={"SanityTest"})
    public void test3(){
        System.out.println("this test3 comes under sanity test groups");

    }

    @Test(groups ={"RegressionTest"})
    public void test4(){
        System.out.println("this test4 comes under Regression test groups");

    }

    @Test(groups ={"RegressionTest"})
    public void test5(){
        System.out.println("this test5 comes under Regression test groups");

    }
    
}
