package com.example.demo;

import com.example.demo.config.Config;
import com.example.demo.model.Comment;
import com.example.demo.model.Person;
import com.example.demo.proxies.CommentNotificationProxy;
import com.example.demo.proxies.EmailCommentNotificationProxy;
import com.example.demo.reositories.CommentRepository;
import com.example.demo.reositories.DBCommentRepository;
import com.example.demo.services.CommentService;
import com.example.demo.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DemoApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext
				(Config.class);

 //

		CommentService s1 = context.getBean(CommentService.class);
		UserService s2 = context.getBean(UserService.class);


	}

}
