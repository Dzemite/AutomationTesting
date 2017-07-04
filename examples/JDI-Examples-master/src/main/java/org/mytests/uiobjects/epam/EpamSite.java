package org.mytests.uiobjects.epam;

import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.mytests.enums.LeftMenu;
import org.openqa.selenium.support.FindBy;
import org.mytests.uiobjects.epam.pages.*;

/**
 * Created by Roman_Iovlev on 8/30/2015.
 */
@JSite(domain = "https://jdi-framework.github.io/tests/")
public class EpamSite extends WebSite {

    @JPage(url = "/")
    public static HomePage homePage;
    @JPage(url = "/page6.htm", title = "Careers")
    public static SimpleTablePage simpleTablePage;

    @FindBy(css = ".sidebar-menu a span")
    public static Menu<LeftMenu> leftMenu;


}
