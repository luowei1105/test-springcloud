package com.fmgame.springcloud.feign.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import feign.Feign;

/**
 * @author luowei
 * @date 2018年8月23日 下午2:23:54
 */
@Deprecated
public class DisableHystrixCOnfiguration {
	
	@Bean
	@Scope("prototype")
	public Feign.Builder feignBuilder() {
		return Feign.builder();
	}

}

