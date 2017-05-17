package com.epam.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Roman_Nikolaev on 5/11/2017.
 */
public class Page<T> extends PageFactory {

    T obj;

    public T get(WebDriver driver) {
        if (obj != null) {
            initElements(driver, obj);
            return obj;
        }
        obj = (T) new Page();
        initElements(driver, obj);
        return obj;
    }

}
