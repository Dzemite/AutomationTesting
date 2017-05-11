package com.epam.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class LoginPanel extends PageFactory{

    @FindBy(className="profile-photo")
    public static WebElement LoginLable;

}
