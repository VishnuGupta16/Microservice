//package org.vg.config;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//@Configuration
//public class CustomFilter extends OncePerRequestFilter {
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest arg0, HttpServletResponse arg1, FilterChain arg2)
//			throws ServletException, IOException {
//		System.out.println(arg0.getRequestURL());
//		arg2.doFilter(arg0, arg1);
//	}
//
//}
