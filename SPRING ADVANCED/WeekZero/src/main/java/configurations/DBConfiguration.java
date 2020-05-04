package configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public DBConfiguration() {
    }

    public DBConfiguration(String driverClassName, String url, String username, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Profile("dev")
    @Bean
    public String devDatabaseConnection() {
        return "DB connection for dev - H2";
    }

    @Profile("prod")
    @Bean
    public String prodDatabaseConnection() {
        return "DB connection to RDS_PROD - High performance Instance";
    }

    @Profile("test")
    @Bean
    public String testDatabaseConnection() {
        return "DB connection to RDS_TEST - Low performance Instance";
    }
}
