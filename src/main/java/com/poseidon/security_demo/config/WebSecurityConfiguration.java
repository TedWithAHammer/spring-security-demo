package com.poseidon.security_demo.config;

import java.util.List;
import java.util.logging.Filter;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.SecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.WebSecurity;

/**
 * Created by leo on 2019/5/31.
 * Description:
 */
@SpringBootConfiguration
public class WebSecurityConfiguration {
    private WebSecurity webSecurity;
    private Boolean debugEnable;
//    private List<SecurityConfigurer<Filter, WebSecurity>> webSecurityConfigurers;

//    @Bean(name = {"springSecurityFilterChain"})
//    public Filter springSecurityFilterChain() throws Exception {
//        boolean hasConfigurers = webSecurity != null &&
//    }
}
