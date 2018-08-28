package com.fmgame.springcloud.provider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author luowei
 * @date 2018年8月20日 下午2:36:24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceProviderApplication.class, args);
	}
}
