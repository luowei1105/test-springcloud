package com.fmgame.springcloud.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luowei
 * @date 2018年8月21日 下午8:50:53
 */
@RestController
public class FeignController {
	
	@Autowired
	private ServiceProvider schedualServiceHi;

	@RequestMapping(value = "/hello")
	public String hello() {
		return schedualServiceHi.hello("fegin");
	}
	
}
