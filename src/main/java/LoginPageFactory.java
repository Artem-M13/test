public class LoginPageFactory {
    public static LoginPage getPage(String platform){
        if (platform.equalsIgnoreCase("android")) {
            return new AndroidLoginPage();
        } else if (platform.equalsIgnoreCase("ios")) {
          return new IOSLoginPage();
        } else {
            try {
                throw new IllegalAccessException("Unsupported platform: " + platform);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
