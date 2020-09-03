package cc.local.injection.client;

import cc.local.injection.protocol.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjectionClientApplication {

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.test());
		SpringApplication.run(InjectionClientApplication.class, args);
	}

}
