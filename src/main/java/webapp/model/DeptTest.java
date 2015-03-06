package webapp.model;

import static org.junit.Assert.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeptTest {
	
	static Log log = LogFactory.getLog(DeptTest.class);

	@Test
	public void test1_String() {
		String s1 = new String("xxx");
		String s2 = new String("xxx");
		
		log.info("s1 == s2 : " + (s1 == s2));
		log.info("s1.equls(s2) : " + s1.equals(s2));
	}
	
	
	@Test
	public void test2_Dept() {
		Dept d1 = new Dept(100,"xxx","yyy");
		Dept d2 = new Dept(100,"xxx", "yyy");
		
		log.info("d1 == d2 : " + (d1 == d2));
		log.info("d1.equls(d2) : " + d1.equals(d2));
		
	}
	
	@Test
	public void test3_Dept() {
		Dept d1 = new Dept(100,"xxx","yyy");
		Dept d2 = new Dept(100,"xxx", "yyy");
		
		assertEquals(d1, d2);
	}

}