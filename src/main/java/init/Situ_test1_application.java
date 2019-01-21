package init;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
@MapperScan(value="mapper")
public class Situ_test1_application {
	public static void main(String[] args) {
		SpringApplication.run(Situ_test1_application.class, args);
	}
};
