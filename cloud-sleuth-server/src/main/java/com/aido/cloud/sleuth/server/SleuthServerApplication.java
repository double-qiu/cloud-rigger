package com.aido.cloud.sleuth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * ClassName: SleuthServerApplication  
 * (TODO:简述该类作用)
 * @author DOUBLE
 * @version
 */
@SpringBootApplication
@EnableZipkinServer
public class SleuthServerApplication {
    public static void main(String[] args){
        SpringApplication.run(SleuthServerApplication.class,args);
    }
}
