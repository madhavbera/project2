package com.madhav.testapi.fiegnclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="simple")
public interface Myfiegnclient {

	@GetMapping("/map")
	String getmessage();
}
