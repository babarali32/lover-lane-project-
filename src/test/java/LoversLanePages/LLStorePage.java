package LoversLanePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


import java.util.List;

    public class LLStorePage extends CommonMethods  {

        @FindBy(xpath = "//span[@itemprop='openingHours']")
        public List<WebElement> storeTimings;

        public LLStorePage() {
            PageFactory.initElements(driver, this);
        }
    }

