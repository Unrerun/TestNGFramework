//package Listener;
//
//import TestPackage.DriverFactory;
//import io.qameta.allure.Attachment;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//public class ScreenShooter extends AllureStepListener {
//
//
//
//    @Attachment(value = "Fail screenshot", type = "image/png")
//    public static byte[] saveAllureScreenshotOnFail() {
//        return ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
//    }
//}
