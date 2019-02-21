package cn.acyou.diana.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DianaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianaOrderApplication.class, args);
    }

}
