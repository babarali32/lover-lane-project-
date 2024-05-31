package LoversLaneStep;

import org.junit.After;
import org.junit.Before;
import utils.CommonMethods;

import static utils.CommonMethods.closeBrowser;
import static utils.CommonMethods.openBrowser;

public class Hooks extends CommonMethods {

    @Before
    public void precondition() {
        openBrowser();
    }

    @After
    public void postCondition() throws Exception {
        closeBrowser();
    }
}

