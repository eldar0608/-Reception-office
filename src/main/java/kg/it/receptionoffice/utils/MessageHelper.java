package kg.it.receptionoffice.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MessageHelper {

    @Autowired
    private MessageSource ms;

    private static MessageSource messageSource;

    @PostConstruct
    private void initStaticDao() {
        messageSource = this.ms;
    }

    public String trans(String name) {
        return messageSource.getMessage(name, null, LocaleContextHolder.getLocale());
    }

    public static String translate(String name) {
        return messageSource.getMessage(name, null, LocaleContextHolder.getLocale());
    }

}
