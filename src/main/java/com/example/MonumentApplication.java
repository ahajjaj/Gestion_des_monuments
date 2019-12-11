package com.example;

	import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import com.example.entity.Celebrite;
import com.example.Dao.IprojetDao;

	@SpringBootApplication
	@ComponentScan(basePackages= {"com.example"})
	@EntityScan(basePackages= {"com.example"})
	
	public class MonumentApplication {

		public static void main(String[] args) {
			SpringApplication.run(MonumentApplication.class, args);
			
			
			//ApplicationContext ctx=SpringApplication.run(MonumentApplication.class, args);
			//IprojetDao ProjetDaoImpl=ctx.getBean(IprojetDao.class);
			//List<Celebrite>celebrite=IprojetDao.getCelebrite("");
		}

	}
