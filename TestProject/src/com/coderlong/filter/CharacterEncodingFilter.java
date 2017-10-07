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
 * <p>Description: �����ܵ��ַ���������� ��request response ���й���</p>
 * <p>Company:</p> 
 * @author code��
 * @date
 * @version 1.0
 */
public class CharacterEncodingFilter implements Filter {
	private String characterEncoding;//���ñ��뷽ʽ 
	private boolean enabled;//�Ƿ������ַ���������� 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		if (enabled || characterEncoding != null){
			//����Ĭ�ϵı��뷽ʽ
			request.setCharacterEncoding(characterEncoding);
			response.setCharacterEncoding(characterEncoding);
			
			chain.doFilter(request, response);//filter ���� 
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
