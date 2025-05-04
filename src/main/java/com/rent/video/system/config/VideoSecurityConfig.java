package com.rent.video.system.config;

import com.rent.video.system.services.JwtService;
import com.rent.video.system.services.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class VideoSecurityConfig {
    @Autowired
    private JWTAuthFilter jwtAuthFilter;

    public VideoSecurityConfig(JWTAuthFilter jwtAuthFilter) {
        this.jwtAuthFilter = jwtAuthFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth ->
//              auth.requestMatchers("/api/ping").permitAll()
//                .requestMatchers("/api/user/**").permitAll()
//                 .requestMatchers("/api/user/**").permitAll()
//              .requestMatchers("/apivideo/video/**").authenticated() // All requests require authentication
//               .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
//        ).httpBasic(Customizer.withDefaults());   //Enable basic auth
//        return httpSecurity.build();

        httpSecurity.csrf(csrf -> csrf.disable());
        httpSecurity.authenticationProvider(autheticationProvider());
        httpSecurity.authorizeHttpRequests(auth ->
                auth.requestMatchers("/api/ping").permitAll()
               .requestMatchers("/api/user/**").permitAll()
               .requestMatchers("/apivideo/video/**").authenticated());

        httpSecurity.sessionManagement(auth->auth.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        httpSecurity.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return httpSecurity.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    AuthenticationProvider autheticationProvider()
    {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.builder()
                .username("dpdcentral")
                .password(passwordEncoder().encode("Dpdcentral@1234"))
                .roles("customer","admin")
                .build();
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    AuthenticationManager autheticationManager(AuthenticationConfiguration configuration) throws Exception
    {
        return configuration.getAuthenticationManager();
    }



}
