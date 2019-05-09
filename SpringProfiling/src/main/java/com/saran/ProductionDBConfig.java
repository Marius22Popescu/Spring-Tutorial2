package com.saran;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Prod")
@Configuration
public class ProductionDBConfig implements DatabaseConfig{

	@Bean
	public DataSource createDataSource() {
		System.out.println("Production DB Environment");
		DriverManagerDataSource dSource = new DriverManagerDataSource();
		return null;
	}

}
