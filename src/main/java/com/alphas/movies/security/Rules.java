package com.alphas.movies.security;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Component
@PropertySource("classpath:test-property-source.properties")
@ConfigurationProperties(prefix = "security")
public class Rules {
    private Map<String,SecurityData> securityDataMap;






}
