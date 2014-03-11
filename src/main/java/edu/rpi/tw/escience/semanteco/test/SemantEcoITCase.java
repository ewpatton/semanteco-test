package edu.rpi.tw.escience.semanteco.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SemantEcoITCase {
    public static final char PS = File.separatorChar;
    public static final String testResources = System.getProperty("basedir") +
            PS + "src" + PS + "test" + PS + "resources" + PS;

    protected Class<? extends WebDriver> driverClass = null;
    protected WebDriver driver = null;

    public SemantEcoITCase( Class<? extends WebDriver> driverClass ) {
        this.driverClass = driverClass;
    }

    @SuppressWarnings("rawtypes")
    public static Collection<Class[]> listDrivers(Class... drivers) {
        List<Class[]> classes = new ArrayList<Class[]>();
        for ( int i = 0 ; i < drivers.length; i ++ ) {
            classes.add( new Class[] { drivers[i] } ); 
        }
        return classes;
    }

    protected String resolveLink( WebElement el ) {
        String href = el.getAttribute("href");
        try {
            URL url = new URL( driver.getCurrentUrl() );
            return url.toURI().resolve( href ).toASCIIString();
        } catch(Exception e) {
            throw new IllegalArgumentException("Malformed URL", e);
        }
    }

    protected WebElement findButtonWithText(String text) {
        List<WebElement> els = driver.findElements(By.tagName("button"));
        for ( WebElement el : els ) {
            if ( el.getText().equals(text) ) {
                return el;
            }
        }
        return null;
    }

    public static void assertClickable(WebElement button) {
        assertNotNull(button);
        assertTrue(button.isDisplayed());
        assertTrue(button.isEnabled());
    }

    public static String getPathForTestResource( String file ) {
        return testResources + file;
    }

    @Before
    public void setUp() throws InstantiationException, IllegalAccessException {
        this.driver = driverClass.newInstance();
        driver.manage().window().setSize(new Dimension(1024, 768));
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }
}
