package testFromScratch;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Unit test for simple App.
 */
public class GoogleTest extends BaseTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldOpenGooglePage() {
        driver.get("https://google.com.ua");
        String pageTitle = driver.getTitle();
        assertTrue(pageTitle.equals("Google"));
    }

    @Test
    public void shouldVerifyInputOnGooglePage() {
        assertTrue(true);
    }

    @Test
    public void shouldSearchForUnicorns() {
        assertTrue(true);
    }
}
