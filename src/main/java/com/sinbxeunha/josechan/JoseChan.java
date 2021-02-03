package com.sinbxeunha.josechan;

import com.sinbxeunha.josechan.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@Component
@SpringBootApplication
@RestController
public class JoseChan implements ApplicationRunner {

    @Autowired
    ServiceInterface computerService;

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(new Class[]{JoseChan.class});
//        //设置上下文为注解上下文（也就是用注解配置容器）
//        app.setApplicationContextClass(AnnotationConfigApplicationContext.class);
//        //启动容器
//        app.run();
        SpringApplication.run(JoseChan.class);
//        String value = com.sinbxeunha.josechan.web.JoseChan.class.getAnnotation(Component.class).value();
//
//        System.out.println(value);
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Start com.sinbxeunha.josechan.web.JoseChan");

        double c = computerService.add(1.2, 2.3);

        System.out.println(c);
    }

    @RequestMapping(path="/", method = {RequestMethod.POST})
    @ResponseBody
    public String index(String data){
//        System.out.println("来了老弟");
        return "来了老弟";
    }

}
