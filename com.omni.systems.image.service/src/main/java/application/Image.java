package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
public class Image extends SpringBootServletInitializer {
	
    public static void main(String[] args) {
        SpringApplication.run(Image.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	return builder.sources(Image.class);
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
    	return new WebMvcConfigurerAdapter() {
    		@Override
    		public void addCorsMappings(CorsRegistry registry) {
    			registry.addMapping("/**").allowedOrigins("http://localhost:4200");
    		}
    	};
    }
}
