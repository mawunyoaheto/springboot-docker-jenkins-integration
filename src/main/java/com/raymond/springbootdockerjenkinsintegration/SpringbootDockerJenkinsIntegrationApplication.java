package com.raymond.springbootdockerjenkinsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerJenkinsIntegrationApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Jenkins Docker Integration demo!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerJenkinsIntegrationApplication.class, args);
    }

}
