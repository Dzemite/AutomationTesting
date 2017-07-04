package org.mytests.tests;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.mytests.uiobjects.epam.EpamSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.mytests.tests.dataproviders.*;
import org.testng.annotations.BeforeTest;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static org.mytests.uiobjects.epam.EpamSite.homepage;


/**
 * Created by Roman_Iovlev on 7/13/2015.
 */
public class InitTests extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() throws Exception {
        WebSite.init(EpamSite.class);
        logger.info("Run Tests");
    }

//    @BeforeTest
//    public static void beforeTest() {
//        homepage.open();
//    }

    @AfterMethod
    public void tearDown() {
        Verify.getFails();
    }
}
