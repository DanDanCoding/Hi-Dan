package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, 
			FilterChain chain) // 이 흐름을 다음으로 넘길지를 결정함
			throws IOException, ServletException {
		
		//인코딩 설정을 여기서 하기, 모든 서블릿은 인코딩 설정이 된 상태로 적용됨
		request.setCharacterEncoding("UTF-8");
		
		chain.doFilter(request, response);//요청을 하고 받는 것을 설정해 둠
										  //다음 실행을 관할하고 어디로 갈 지 설정 가능
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
