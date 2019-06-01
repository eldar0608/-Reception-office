package kg.it.receptionoffice.utils;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class EntityHelper {

    public static Object mapForm(Object source, Object target, String... whiteListProperties) {

        final BeanWrapper src = new BeanWrapperImpl(source);
        final BeanWrapper trg = new BeanWrapperImpl(target);

        for (final String propertyName : whiteListProperties)
            trg.setPropertyValue(propertyName, src.getPropertyValue(propertyName));

        return target;
    }
}