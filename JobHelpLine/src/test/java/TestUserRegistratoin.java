import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dhana.Application;
import com.dhana.service.UserService;
import com.dhana.util.Role;
import com.dhana.vo.UserCreateForm;

/**
 * This project is developed for the purpose of helping job seekers
 * Developed by Dhanabalan Venkitusamy
 * File Name: TestUserRegistratoin.java
 * Date : May 30, 2016
 */

/**
 * @author DhanabalanV
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class TestUserRegistratoin {
	
	@Autowired
	UserService userService;
	
	@Test
	public void testCreateUser(){
		UserCreateForm user = new UserCreateForm();
		user.setEmail("dhanabalanvk@gmail.com");
		user.setFirstName("Dhanabalan");
		user.setLastName("Venkitusamy");
		user.setPassword("sivam");
		user.setRole(Role.ADMIN);
		user.setUserName("dhana");
		user.setMobileNumber(Long.valueOf("9976598205"));
		userService.create(user);
	}
	
}
