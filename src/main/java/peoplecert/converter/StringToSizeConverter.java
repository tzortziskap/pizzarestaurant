package peoplecert.converter;

import peoplecert.entity.Size1;
import peoplecert.service.Size1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 *
 * @author user
 */
@Component
public class StringToSizeConverter implements Converter<String, Size1>{

    @Autowired
    Size1Service service;
    
    @Override
    public Size1 convert(String s) {
        int id = Integer.parseInt(s);
        Size1 size = service.getSize1ById(id);
        return size;
    }
    
}
