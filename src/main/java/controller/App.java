package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 启动类
 * 启动器存放的位置：
 * 		启动器可以和controller 位于同一个包下，或者位于controller 的上一级包中，
 * 		但是不能放到controller 的平级以及子包下。
 */
// 启动类需要注解 @SpringBootApplication，表示该类为启动类
@SpringBootApplication
public class App {
	// 启动类中需要包含一个main方法，此时run as Java application或者Spring Boot App都可以
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
