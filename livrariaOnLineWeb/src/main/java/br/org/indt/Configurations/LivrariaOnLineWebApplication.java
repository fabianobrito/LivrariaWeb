package br.org.indt.Configurations;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class LivrariaOnLineWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaOnLineWebApplication.class, args);
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("mysql:jdbc://127.0.0.1:3306/heroku_e28fbd907984c36");
		dataSource.setUsername("root");
		dataSource.setPassword("farah");		
		return dataSource;
	}
}