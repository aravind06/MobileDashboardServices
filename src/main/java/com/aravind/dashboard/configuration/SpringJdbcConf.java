package com.aravind.dashboard.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.aravind.dashboard")
public class SpringJdbcConf {
	@Bean
    public JdbcTemplate mysqlDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mobile_info");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
 
       return new JdbcTemplate(dataSource);
    }
}
