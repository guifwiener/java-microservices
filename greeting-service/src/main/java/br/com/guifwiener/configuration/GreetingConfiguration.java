package br.com.guifwiener.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("greeting-service")
@PropertySource(value = "classpath:application.yml", encoding = "UTF-8")
public class GreetingConfiguration {

    private String greeting;
    private String defaultValue;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public GreetingConfiguration() {}


}
