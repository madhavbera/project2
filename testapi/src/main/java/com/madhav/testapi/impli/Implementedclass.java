package com.madhav.testapi.impli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.madhav.testapi.fiegnclient.Myfiegnclient;
@Component
public class Implementedclass implements Myfiegnclient{
	
	
	@Autowired
	Myfiegnclient fiegn;
	@Override
	public String getmessage()
	{
		String message=fiegn.getmessage();
		return "your message"+message;
	}

}
