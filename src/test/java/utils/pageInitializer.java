package utils;

import LoversLanePages.LLStorePage;
import LoversLanePages.LLHomePageVerificationPage;
import LoversLanePages.LLLoginPage;
import LoversLanePages.LLCheckoutPage;

public class pageInitializer {
    // Define page objects for LOVERSLANE
    public static LoversLanePages.LLLoginPage llLoginPage;
    public static LoversLanePages.LLCheckoutPage llCheckoutPage;
    public static LoversLanePages.LLHomePageVerificationPage llInfoVerificationPage;
    public static LLStorePage llStorePage;
    public static void InitializerPageObject(){
        llCheckoutPage=new LLCheckoutPage();
        llLoginPage=new LLLoginPage();
        llInfoVerificationPage=new LLHomePageVerificationPage();
        llStorePage=new LLStorePage();
    }

}