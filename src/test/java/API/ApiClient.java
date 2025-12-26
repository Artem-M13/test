package API;

import java.util.Optional;

public class ApiClient {
    private int attempts = 0;

    // Імітація запиту до АРІ, код з'являється на 4 спробі
    public Optional<String> fetchOtpFromApi() {
        attempts++;
        if (attempts >= 4) return Optional.of("1122");
        return Optional.empty();
    }

    // Механізм очікування
    public String getOtpCode() throws InterruptedException {
        int maxRetries = 6;
        long waitTimeMs = 2000; // 2 секунди між спробами

        for (int i = 0; i < maxRetries; i++) {
            System.out.println("Опитування АРІ... спроба " + (i + 1));
            Optional<String> code = fetchOtpFromApi();

            if (code.isPresent()) {
                return code.get();
            }
            Thread.sleep(waitTimeMs);
        }
        throw new RuntimeException("Помилка: Час очікування ОТР коду вичерпано!");
    }
}