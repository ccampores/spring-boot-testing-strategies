package io.tpd.superheroes.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

/**
 * @author moises.macero
 */
@Component
public class SuperHeroFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) {}

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
    httpServletResponse.setHeader("X-SUPERHERO-APP", "super-header");
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {}
}
