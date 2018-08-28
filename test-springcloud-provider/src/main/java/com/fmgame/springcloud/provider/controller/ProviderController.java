package com.fmgame.springcloud.provider.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luowei
 * @date 2018年8月20日 下午3:28:57
 */
@RestController
public class ProviderController {

	@Autowired
	private DiscoveryClient client;

	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam String name) throws InterruptedException {
		ServiceInstance instance = client.getLocalServiceInstance();
//		// 让处理线程等待几秒钟
//		int sleepTime = new Random().nextInt(2000);
//		Thread.sleep(sleepTime);
//		System.err.println(sleepTime);
		return "hello " + name + ". serviceId=" + instance.getServiceId() 
			+ ", host:post=" + instance.getHost() + ":" + instance.getPort();
	}
	
}
