package com.saran;

import javax.sql.DataSource;

public interface DatabaseConfig {
	DataSource createDataSource();
}
