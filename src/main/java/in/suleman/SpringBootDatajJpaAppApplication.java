package in.suleman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.suleman.entity.CrudOpration;
import in.suleman.entity.Userdata;

@SpringBootApplication
public class SpringBootDatajJpaAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDatajJpaAppApplication.class, args);
		
		CrudOpration bean = context.getBean(CrudOpration.class);
		Userdata us = new Userdata();
		us.setId(101);
		us.setName("suleman");
		us.setNumber("10000000");
		
		us.setId(102);
		us.setName("khan");
		us.setNumber("99999999999");

		us.setId(103);
		us.setName("khan salman");
		us.setNumber("99999997686");
		bean.save(us);
		System.out.println("hi");
		
		context.close();
	}

}
