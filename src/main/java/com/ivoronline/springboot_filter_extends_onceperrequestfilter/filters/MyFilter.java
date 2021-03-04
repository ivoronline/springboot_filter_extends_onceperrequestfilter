package com.ivoronline.springboot_filter_extends_onceperrequestfilter.filters;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class MyFilter extends OncePerRequestFilter {

  @Override
  public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    //THIS CODE IS EXECUTED DURING HTTP REQUEST
    System.out.println("MyFilter  : Code for HTTP Request");

    //CALLS
    //  - doFilter() METHOD OF THE NEXT   FILTER  IN CHAIN
    //  - Endpoint   IF THERE ARE NO MORE FILTERS IN CHAIN
    //RETURNS FROM THIS METHOD DURING HTTP RESPONSE
    //  - CAUSING SUBSEQUENT CODE TO BE EXECUTED DURING HTTP RESPONSE
    //  - CAUSING FILTERS TO BE EXECUTED IN REVERSE ORDER DURING HTTP RESPONSE (BUT ONLY BELOW CODE)
    chain.doFilter(request, response);

    //THIS CODE IS EXECUTED DURING HTTP RESPONSE
    System.out.println("MyFilter  : Code for HTTP Response");

  }

}

