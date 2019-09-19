package Listener;

import TestPackage.DriverFactory;
import io.qameta.allure.Attachment;
import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestNGListener;

public class AllureStepListener  implements StepLifecycleListener, ITestNGListener {

    @Override
    public void beforeStepStop(final StepResult result){
        saveAllureScreenshotAfterStep();
    }

    @Attachment(value = "Step screenshot", type = "image/png")
    private static byte[] saveAllureScreenshotAfterStep() {
       return  ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
