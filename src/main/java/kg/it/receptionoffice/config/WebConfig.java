package kg.it.receptionoffice.config;


import kg.it.receptionoffice.component.ErrorDisplayInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
    private MessageSource messageSource;
    private LocaleChangeInterceptor localeChangeInterceptor;

    @Autowired
    public WebConfig(MessageSource messageSource, LocaleChangeInterceptor localeChangeInterceptor) {
        this.messageSource = messageSource;
        this.localeChangeInterceptor = localeChangeInterceptor;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/assets/");
        registry
                .addResourceHandler("/robots.txt")
                .addResourceLocations("classpath:/assets/robots.txt");
        registry
                .addResourceHandler("/favicon.ico")
                .addResourceLocations("classpath:/assets/favicon.ico");
        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");

        registry
                .addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/fonts/");

    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor);
        registry.addInterceptor(new ErrorDisplayInterceptor());
    }

    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean factory = new LocalValidatorFactoryBean();
        factory.setValidationMessageSource(messageSource);
        return factory;
    }


}

