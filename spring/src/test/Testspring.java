package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jc.entity.User;
import com.jc.serviceimpl.UserServiceImpl;

public  class Testspring {

	@Test
	public void spring(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user =(User) applicationContext.getBean("User");
		user.setUid(99);
		user.setUname("¶Ö¶Ö¶Ö");
		System.out.println(user);
		
	}
	@Test
	public void aaa(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl userserivce =(UserServiceImpl) applicationContext.getBean("userservice");
		userserivce.update();
	}
	
}
