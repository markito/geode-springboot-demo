package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GeodeBootDemoApplication.class)
@WebAppConfiguration
public class GeodeBootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void myTest() {

	}

}

