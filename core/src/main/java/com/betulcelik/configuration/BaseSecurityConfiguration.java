package com.betulcelik.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class BaseSecurityConfiguration {
    private final PasswordEncoder passwordEncoder;
    //private final UserDetailsService userService;

    /*
    //Kimlik Doğrulama için gereklidir
    @Bean
    public AuthenticationProvider authenticationProvider()
    {

        //veri tabanı ile çalıştığımız için Dao
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setPasswordEncoder(passwordEncoder);
        authenticationProvider.setUserDetailsService(userService);
        return authenticationProvider;
    }*/

    //Kimlik doğrulama işlemlerini yönetir, kimlik bilgilerini doğrulamak için Authenticationprovidera yönlendirilir
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}
