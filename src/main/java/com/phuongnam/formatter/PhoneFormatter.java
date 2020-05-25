package com.phuongnam.formatter;

import com.phuongnam.model.Phone;
import com.phuongnam.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class PhoneFormatter implements Formatter<Phone> {
    private PhoneService phoneService;
    @Autowired
    public PhoneFormatter(PhoneService phoneService){
        this.phoneService=phoneService;
    }
    @Override
    public Phone parse(String text, Locale locale) throws ParseException {
        return phoneService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Phone object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
