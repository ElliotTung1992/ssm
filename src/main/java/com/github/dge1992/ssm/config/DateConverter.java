package com.github.dge1992.ssm.config;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date>{

    @Override
    public Date convert(String source) {
        int length = source.length();
        String pattern = null;
        switch (length){
            case 10:
                pattern = "yyyy-MM-dd";
                break;
            case 19:
                pattern = "yyyy-MM-dd HH:mm:ss";
                break;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
