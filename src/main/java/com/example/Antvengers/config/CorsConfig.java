package com.example.Antvengers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        
        // Orígenes permitidos (ajusta según tu frontend)
        configuration.addAllowedOrigin("http://localhost:3000");    // React local
        configuration.addAllowedOrigin("http://localhost:5173");    // Vite local
        configuration.addAllowedOrigin("http://localhost:4200");    // Angular local
        configuration.addAllowedOrigin("*");                         // O permite todos (menos seguro)
        
        // Métodos HTTP permitidos
        configuration.addAllowedMethod("GET");
        configuration.addAllowedMethod("POST");
        configuration.addAllowedMethod("PUT");
        configuration.addAllowedMethod("DELETE");
        configuration.addAllowedMethod("OPTIONS");
        
        // Headers permitidos
        configuration.addAllowedHeader("*");
        
        // Credenciales
        configuration.setAllowCredentials(true);
        
        // Tiempo de caché para preflight
        configuration.setMaxAge(3600L);
        
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}
