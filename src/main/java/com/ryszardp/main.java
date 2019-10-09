package com.ryszardp;

import com.ryszardp.config.AppConfig;
import com.ryszardp.domain.materials.Chipboard;
import com.ryszardp.repository.jdbc.ChipboardDao;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ChipboardDao chipboardDao = (ChipboardDao) context.getBean("chipboardDaoImpl");

        List<Chipboard> chipboard = chipboardDao.findAll();
        System.out.println(chipboard);
    }
}
