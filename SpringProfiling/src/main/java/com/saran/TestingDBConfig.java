package com.saran;



import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestingDBConfig implements DatabaseConfig{

	@Override
	public DataSource createDataSource() {
		System.out.println("Production DB Environment");
		DriverManagerDataSource dSource = new DriverManagerDataSource();
		return dSource;
	}

}
