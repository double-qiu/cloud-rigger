package cloud.sleuth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: SleuthClientApplication  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@SpringBootApplication
public class SleuthClientApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args){
        SpringApplication.run(SleuthClientApplication.class,args);
    }
}
