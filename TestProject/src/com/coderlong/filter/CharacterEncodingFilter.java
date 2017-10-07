package com.coderlong.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.jsp.jstl.core.Config;
/****
 * 
 * 
 * <p>Title:</p>
 * <p>Description: 设置总的字符编码过滤器 对request response 进行过滤</p>
 * <p>Company:</p> 
 * @author code龙
 * @date
 * @version 1.0
 */
public class CharacterEncodingFilter implements Filter {
	private String characterEncoding;//设置编码方式 
	private boolean enabled;//是否开启该字符编码过滤器 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (enabled || characterEncoding != null){
			//设置默认的编码方式
			request.setCharacterEncoding(characterEncoding);
			response.setCharacterEncoding(characterEncoding);
			
			chain.doFilter(request, response);//filter 放行 
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		characterEncoding = config.getInitParameter("characterEncoding");
		String a = config.getInitParameter("enabled");
		if ("true".equals(a.trim())){
			enabled = true;
		}
		else{
			enabled = false;
		}
	}

}
