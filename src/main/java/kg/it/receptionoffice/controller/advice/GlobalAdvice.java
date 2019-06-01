package kg.it.receptionoffice.controller.advice;

import kg.it.receptionoffice.utils.MessageHelper;
import kg.it.receptionoffice.utils.StringHelper;
import kg.it.receptionoffice.utils.UriHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalAdvice {
    private final MessageHelper messageHelper;

    @Autowired
    public GlobalAdvice(MessageHelper messageHelper) {
        this.messageHelper = messageHelper;
    }

    @ModelAttribute("messageHelper")
    public MessageHelper messageHelper() {
        return messageHelper;
    }

    @ModelAttribute("stringHelper")
    public StringHelper stringHelper() {
        return StringHelper.getInstance();
    }

    @ModelAttribute("uriHelper")
    public UriHelper uriHelper(HttpServletRequest request) {
        return new UriHelper(request);
    }
}
