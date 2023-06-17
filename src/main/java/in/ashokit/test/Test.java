package in.ashokit.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.SpringJDBCConfiguration;
import in.ashokit.beans.UserDaoImpl;

public class Test {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);
		UserDaoImpl userDao = ctx.getBean(UserDaoImpl.class);
		String userName = userDao.getUserName(1);
		System.out.println("User Name:"+userName);
	}

}
