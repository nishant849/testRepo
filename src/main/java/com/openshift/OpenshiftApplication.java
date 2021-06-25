package com.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class OpenshiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenshiftApplication.class, args);
        System.out.println("----------------APPLICATION STARTED---------");
    }
}
