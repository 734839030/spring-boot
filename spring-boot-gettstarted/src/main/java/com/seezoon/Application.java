package com.seezoon;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*SpringApplication application = new SpringApplication(Application.class);
		application.addListeners(new ApplicationListener<ApplicationStartedEvent>(){
			@Override
			public void onApplicationEvent(ApplicationStartedEvent arg0) {
				System.out.println("started。。。。。。。。。。。。。。。");
			}
		});
		application.setBanner(new Banner() {
			//打印系统信息自定义
			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				out.println("hello spring boot");
			}
		});
		application.run(args);*/
	}
}
