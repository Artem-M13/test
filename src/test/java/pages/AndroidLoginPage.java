package pages;

// Реалізація для Android
public class AndroidLoginPage implements LoginPage {
    private final String loginButton = "id:com.myapp:id/btn_login";
    private final String otpField = "id:com.myapp:id/input_otp";

    @Override
    public void enterOtp(String code) {
        System.out.println("[Android] Введення OTP: " + code);
        // driver.findElement(By.id(otpField)).sendKeys(code);
    }

    @Override
    public void clickLogin() {
        System.out.println("[Android] Натискання кнопки Login");
        // driver.findElement(By.id(loginButton)).click();
    }
}
