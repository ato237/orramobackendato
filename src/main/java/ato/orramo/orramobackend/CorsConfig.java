package ato.orramo.orramobackend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000/","http://www.orramo.com","https://www.orramo.com","https://orramo.herokuapp.com/","https://elated-volhard-723c45.netlify.app/").allowedMethods("POST", "GET");
    }
}
