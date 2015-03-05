package webapp.service;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import webapp.exception.DeptNotFoundExcption;
import webapp.model.Dept;
import webapp.model.Emp;
import webapp.service.DeptInfoService;
import webapp.util.EmployeeDataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/webapp/spring/beans.xml")
public class DeptInfoServiceTest {

	static Logger log = Logger.getLogger(DeptInfoServiceTest.class);

	@Autowired
	ApplicationContext factory;

	@Test
	public void testGetDeptInfo() {

		log.info("###@@@testGetDeptInfo()");

		DeptInfoService service = factory.getBean(DeptInfoService.class);

		Dept dept = service.getDeptInfo(20);
		assertNotNull(dept);
		log.info("deptno = " + dept.getDeptno());
		log.info("dname = " + dept.getDname());
		log.info("loc = " + dept.getLoc());
		log.info("Dept Not found...");
	}

	@Test
	public void testGetDeptInfoWithEmps() {
		log.info("###@@@testGetDeptInfoWithEmps()");

		DeptInfoService service = factory.getBean(DeptInfoService.class);

		Dept dept = service.getDeptInfoWithEmps(20);
		assertNotNull(dept);

		log.info(dept.getDeptno() + " " + dept.getDname());

		List<Emp> emps = dept.getEmps();
		if (emps != null) {
			for (Emp e : emps) {
				log.info(e.getEmpno() + " " + e.getEname());
			}
		}	

	}
	
	@Test
	public void testGetDeptInfoAll() {
		DeptInfoService service = factory.getBean(DeptInfoService.class);
		List<Dept> list = service.getDeptInfoAll();
		assertNotNull(list);
		
		for(Dept d : list) {
			log.info(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
		}
	}

}
