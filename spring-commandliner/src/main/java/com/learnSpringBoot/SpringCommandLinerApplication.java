package com.learnSpringBoot;

import com.learnSpringBoot.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringCommandLinerApplication implements CommandLineRunner {

	@Resource
	private HelloService helloService;

	public static void main(String[] args) {
		System.out.println("准备创建容器对象");
		SpringApplication.run(SpringCommandLinerApplication.class, args);
		System.out.println("容器对象创建之后" );
	}

	@Override
	public void run(String... args) throws Exception {
		String str = helloService.sayHello("Dong Yu");
		System.out.println("调用容器中的对象" + str);
		System.out.println("在容器对象创建好执行的方法");
	}
}