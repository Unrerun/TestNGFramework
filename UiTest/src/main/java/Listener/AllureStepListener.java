package Listener;

import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;

public class AllureStepListener implements StepLifecycleListener {

    @Override
    public void beforeStepStop(final StepResult result){
        ScreenShooter.saveAllureScreenshotAfterStep();
    }
}
