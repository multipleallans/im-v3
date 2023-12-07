package com.im;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.sql.DataSource;
import java.util.Properties;

@EnableDubbo
@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication
public class ImServiceProviderApplication {

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(ImServiceProviderApplication.class, args);
    }

//    @Bean(name = "sessionFactory")
//    public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
//        Properties properties = new Properties();
//        // application.properties 要有相关hibernate的配置
//        properties.put("hibernate.dialect", env.getProperty("spring.jpa.properties.hibernate.dialect"));
//        properties.put("hibernate.show_sql", env.getProperty("spring.jpa.show-sql"));
//        properties.put("current_session_context_class", env.getProperty("spring.jpa.properties.hibernate.current_session_context_class"));
//        // Fix Postgres JPA Error:
//        // Method org.postgresql.jdbc.PgConnection.createClob() is not yet implemented.
//        // properties.put("hibernate.temp.use_jdbc_metadata_defaults",false);
//        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//        // 这里修改下，改成需要扫描Entity的类
//        factoryBean.setPackagesToScan("com.im.entity");
//        factoryBean.setDataSource(dataSource);
//        factoryBean.setHibernateProperties(properties);
//        factoryBean.afterPropertiesSet();
//        //
//        return factoryBean.getObject();
//    }
}
