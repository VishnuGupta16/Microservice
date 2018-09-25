package org.vg.utility;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class Util {
	
	public static HttpServletRequest getCurrentHttpRequest() {
		RequestAttributes currentRequestAttributes = RequestContextHolder.currentRequestAttributes();
		HttpServletRequest request = null;
		if(currentRequestAttributes instanceof ServletRequestAttributes) {
			request = ((ServletRequestAttributes)currentRequestAttributes).getRequest();
		}
		return request;
	}

}
