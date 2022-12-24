package in.skr.spring_security_api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFile(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((request)->request
        .antMatchers("/","/Login","/about").permitAll()
        .anyRequest().authenticated())
        .formLogin();
    return http.build();
    }
}
