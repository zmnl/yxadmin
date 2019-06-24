package group.yunxin.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan(value = "group.yunxin.mapper") 
@SpringBootApplication(scanBasePackages = "group.yunxin.*")
public class Application extends SpringBootServletInitializer
{ 
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
//	{
//		return application.sources(Application.class);
//	}
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
}
