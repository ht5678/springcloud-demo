package com.springcloud.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 管理界面:
 * http://localhost:8761/
 * 
 * @author yuezh2   2017年8月29日 下午3:34:34
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaserverApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}
	

}
