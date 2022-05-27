package com.example.community;

import com.example.community.dao.TestDao;
import com.example.community.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Test
	public void testApplicationContext() {
		System.out.println(applicationContext);
		System.out.println("---------------------");
		TestDao bean = applicationContext.getBean(TestDao.class);
		System.out.println(bean.select());
		System.out.println("---------------------");
		TestDao oldImpl = applicationContext.getBean("oldImpl", TestDao.class);
		System.out.println(oldImpl.select());
	}

	@Test
	public void testBeanManagement() {
		TestService bean = applicationContext.getBean(TestService.class);
		System.out.println(bean);
		System.out.println("----------------------");
		bean = applicationContext.getBean(TestService.class);
		System.out.println(bean);
	}

	@Test
	public void testBeanConfig() {
		SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Autowired
	private TestDao testDao;
	@Autowired
	private TestService testService;
	@Autowired
	private SimpleDateFormat simpleDateFormat;
	@Autowired
	@Qualifier("oldImpl")
	private TestDao testDao1;

	@Test
	public void testDI() {
		System.out.println(testDao.select());
		System.out.println("---------------------");
		System.out.println(testDao1.select());
	}

}
