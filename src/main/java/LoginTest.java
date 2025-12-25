public class LoginTest {

    //Імітація виклику API
    public String getOtpFromApi() {
        return "123456";
    }

    public void runTest(String platform) {
        System.out.println("-- Запуск тесту: " + platform + "--");

        // Отримуємо потрібну сторінку через фабрику
        LoginPage loginPage = LoginPageFactory.getPage(platform);

        // Отримуємо код через API
        String otp = getOtpFromApi();

        // Виконуємо кроки в застосунку
        loginPage.enterOtp(otp);
        loginPage.clickLogin();

        System.out.println("Тест завершено успішно!\n");
    }

    public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.runTest("Android");
        test.runTest("iOS");
    }
}
