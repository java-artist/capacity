package com.caceis.capacity.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CapacityConfiguration {

	@Value("${spring.datasource.driverClassName}")
	private String driverClassName;

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String datasourceUsername;

	@Value("${spring.datasource.username}")
	private String datasourcePassword;

	public String getDatasourceUrl() {
		return datasourceUrl;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getDatasourceUsername() {
		return datasourceUsername;
	}

	public String getDatasourcePassword() {
		return datasourcePassword;
	}
}
