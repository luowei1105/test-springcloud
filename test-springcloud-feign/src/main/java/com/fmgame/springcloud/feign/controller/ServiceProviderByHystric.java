package com.fmgame.springcloud.feign.controller;

import org.springframework.stereotype.Service;

/**
 * @author luowei
 * @date 2018年8月22日 上午11:08:45
 */
@Service
public class ServiceProviderByHystric implements ServiceProvider {

	@Override
	public String hello(String name) {
		 return "sorry "+ name;
	}

}
