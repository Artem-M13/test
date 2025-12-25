//Реалізація для iOS
public class IOSLoginPage implements LoginPage {
    private final String loginButton = "accessibilityId:login_button";
    private final String otpField = "accessibilityId:otp_field";

    @Override
    public void enterOtp(String code) {
        System.out.println("[iOS] Введення OTP: " + code);
        // driver.findElement(AppiumBy.accessibilityId(otpField)).sendKeys(code);
    }

    @Override
    public void clickLogin() {
        System.out.println("[iOS] Натискання кнопки Login");
        // driver.findElement(AppiumBy.accessibilityId(loginButton)).click();
    }
}