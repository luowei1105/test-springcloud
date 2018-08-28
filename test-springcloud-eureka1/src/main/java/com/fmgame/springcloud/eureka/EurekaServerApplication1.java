package com.fmgame.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luowei
 * @date 2018年8月20日 下午8:43:45
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication1 {
	
	public static void main(String[] args) {
		 SpringApplication.run(EurekaServerApplication1.class, args);
	}
	
}
