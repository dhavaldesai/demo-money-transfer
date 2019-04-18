/**
 * 
 */
package com.demo.remittance.config;

import java.util.List;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.demo.remittance.model.DatasourceProperties;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author dhaval
 *
 *         Maintains all the application configuration beans like to db, redis,
 *         http etc.
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@MapperScan("com.demo.remittance.dao")
@ComponentScan("com.demo.remittance")
@PropertySources({ @PropertySource("classpath:remittance-${envTarget:dev}.properties"),
		@PropertySource("classpath:datasource-${envTarget:dev}.properties") })
public class RemittanceConfig  extends WebMvcConfigurerAdapter {

	@Autowired
	private DatasourceProperties dataProp; 
		
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		System.out.println(dataProp);
        final HikariDataSource ds = new HikariDataSource();
        ds.setMaximumPoolSize(5);
        //ds.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setJdbcUrl(dataProp.getJdbcUrl());        
        ds.addDataSourceProperty("user", dataProp.getUsernameSql());
        ds.addDataSourceProperty("password", dataProp.getPassword());
        ds.addDataSourceProperty("cachePrepStmts", dataProp.getCachePrepStmts());
        ds.addDataSourceProperty("prepStmtCacheSize", dataProp.getPrepStmtCacheSize());
        ds.addDataSourceProperty("prepStmtCacheSqlLimit", dataProp.getPrepStmtCacheSqlLimit());
        ds.addDataSourceProperty("useServerPrepStmts", dataProp.getUseServerPrepStmts());
        return ds;
    }
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		sessionFactory.setDataSource(dataSource());
		return sessionFactory;
	}
	
	@Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {

        converters.add(new MappingJackson2HttpMessageConverter());
        super.configureMessageConverters(converters);
    }
}
