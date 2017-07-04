package org.mytests.uiobjects.epam;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.uiobjects.epam.pages.HomePage;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "https://jdi-framework.github.io/tests/")
public class EpamSite extends WebSite {
    @JPage(url = "index.htm")
    public static HomePage homepage;

}
