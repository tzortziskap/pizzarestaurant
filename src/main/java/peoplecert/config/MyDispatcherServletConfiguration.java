package peoplecert.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import peoplecert.converter.StringToIngredientConverter;
import peoplecert.converter.StringToPaymentConverter;
import peoplecert.converter.StringToSizeConverter;

@Configuration//this is a spring configuration class
@EnableWebMvc//Our application will contain Annotations in some classes. So take them into account
@ComponentScan(basePackages = "peoplecert")//start scanning from base package emergon to find classes with Annotations
public class MyDispatcherServletConfiguration implements WebMvcConfigurer {

    @Autowired
    private StringToSizeConverter stringToSizeConverter;
    
    @Autowired
    private StringToPaymentConverter stringToPaymentConverter;
    @Autowired
    private StringToIngredientConverter stringToIngredientConverter;

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(stringToSizeConverter);
        registry.addConverter(stringToPaymentConverter);
        registry.addConverter(stringToIngredientConverter);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/resource/");
    }

}
