package com.github.dge1992.ssm.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Web配置类
 */
@Configuration
public class WebMvcContext extends WebMvcConfigurerAdapter {

    /**
     * 配置静态资源访问
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/hello/**").addResourceLocations("classpath:/hello/");
        super.addResourceHandlers(registry);
    }

    /**
     * 配置自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
        .addPathPatterns("/**").excludePathPatterns("/login/login", "/login/toLogin");
        super.addInterceptors(registry);
    }
}
