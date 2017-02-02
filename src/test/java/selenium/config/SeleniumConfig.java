//package selenium.config;
//
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.context.annotation.PropertySource;
//
//import static com.codeborne.selenide.WebDriverRunner.CHROME;
//
//@(value = "SeleniumConfig")
//@PropertySource("classpath:application-test.properties")
//public class SeleniumConfig {
//
//    private String baseUrl;
//    private String baseRemoteUrl;
//    private String hubUrl;
//
//    public SeleniumConfig(@Value("${ejournal.test.webdriver.url}") String baseUrl,
//                          @Value("${ejournal.test.remote.webdriver.url}") String baseRemoteUrl,
//                          @Value("${ejournal.test.remote.hub.url}") String hubUrl) {
//        this.baseUrl = baseUrl;
//        this.baseRemoteUrl = baseRemoteUrl;
//        this.hubUrl = hubUrl;
//    }
////
////    @Bean
////    @Profile("integration")
////    public boolean getRemoteDriver() {
////        try {
////            com.codeborne.selenide.Configuration.baseUrl = baseRemoteUrl;
////            com.codeborne.selenide.Configuration.timeout = 10000;
////            com.codeborne.selenide.Configuration.browser = CHROME;
////            com.codeborne.selenide.Configuration.startMaximized = true;
////            com.codeborne.selenide.Configuration.remote = hubUrl;
////        } catch (Exception e) {
////            return false;
////        }
////        return true;
////    }
//
//    @Bean
//    @Profile("!integration")
//    public boolean getDriver() {
//        if (System.getProperty("os.name").startsWith("Windows")) {
//            String path = "./src/test/resources/driverchrome/chromedriver.exe";
//            System.setProperty("webdriver.chrome.driver", path);
//        }
//        try {
//            com.codeborne.selenide.Configuration.baseUrl = baseUrl;
//            com.codeborne.selenide.Configuration.timeout = 10000;
//            com.codeborne.selenide.Configuration.browser = CHROME;
//            com.codeborne.selenide.Configuration.startMaximized = true;
//        } catch (Exception e) {
//            return false;
//        }
//        return true;
//    }
//}
