package springbook.user.domain;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import springbook.user.dao.UserDAO;
import springbook.user.etc.ConnectionMaker;
import springbook.user.etc.DConnectionMaker;

@Configuration
public class DAOFactory {
	@Bean
	public UserDAO userDAO() {
		UserDAO userDAO = new UserDAO();
		userDAO.setDataSource(dataSource());
		return userDAO;
	}
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost:3306/board?serverTimezone=UTC");
		dataSource.setUsername("jspexam");
		dataSource.setPassword("jsppw");
		
		return dataSource;
	}
}
