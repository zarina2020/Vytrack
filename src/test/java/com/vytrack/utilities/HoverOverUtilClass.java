package com.vytrack.utilities;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverOverUtilClass {

    public static void hoverOver(WebElement target) {

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(target).perform();

    }
}
