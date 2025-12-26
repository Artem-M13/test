package tests;

import api.ApiClient;
import pages.LoginPage;
import pages.LoginPageFactory;

public class MobileTest {
    public static void main(String[] args) {
        String platform = "Android"; // Можна змінити на іОS

        try {
            // Ініціалізація сторінки
            LoginPage loginPage = LoginPageFactory.getPage(platform);
            ApiClient api = new ApiClient();

            // Асинхронне отримання коду з API
            String otoCode = api.getOtpCode();
            System.out.println("Код отримано: " + otoCode);

            // Взаємодія з UI
            loginPage.enterOtp(otoCode);
            loginPage.clickLogin();

            System.out.println("Результат: Тест пройдено успішно!");

        } catch (Exception e) {
            System.out.println("Результат: Тест провалено! " + e.getMessage());
        }
    }
}