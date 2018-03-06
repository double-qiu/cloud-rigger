package com.aido.cloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ClassName: CloudConfigServerApplication  
 * 配置中心启动类
 * @author DOUBLE
 * @version
 */
@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class,args);
	}
}
