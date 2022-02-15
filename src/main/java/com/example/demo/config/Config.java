package com.example.demo.config;

import com.example.demo.model.Comment;
import com.example.demo.model.Parrot;
import com.example.demo.model.Person;
import com.example.demo.proxies.CommentNotificationProxy;
import com.example.demo.proxies.EmailCommentNotificationProxy;
import com.example.demo.reositories.CommentRepository;
import com.example.demo.reositories.DBCommentRepository;
import com.example.demo.services.CommentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.demo")
public class Config {

//    @Bean
//    public Parrot parrot1() {
//        Parrot p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    public Parrot parrot2() {
//        Parrot p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }

//    @Bean
//    public Person person(
//            @Qualifier("parrot2") Parrot parrot2) {     ❶
//        Person p = new Person(parrot2);
//        p.setName("Ella");
////        p.setParrot(parrot2);
//        return p;
//    }
//    @Bean
//    public CommentRepository commentRepository(){
//        return  new DBCommentRepository();
//    }
//    @Bean
//    public CommentNotificationProxy commentNotificationProxy(){
//        return new EmailCommentNotificationProxy();
//    }
//    @Bean
//    public CommentService commentService() {
//        return new CommentService();
//    }

}
