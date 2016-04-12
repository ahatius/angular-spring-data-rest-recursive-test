package ahatius.springdatarest.angular.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Sets up the configuration for the database and entity management
 * 
 * @author ahatius
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = {"ahatius.springdatarest.angular.repositories"})
public class PersistenceConfiguration {
  @Value("${db.host}")
  private String host;
  @Value("${db.port}")
  private int port;
  @Value("${db.name}")
  private String name;
  @Value("${db.user}")
  private String user;
  @Value("${db.password}")
  private String password;

  /**
   * Creates the EntityManagerFactory
   * 
   * @return Returns a LocalContainerEntityManagerFactoryBean
   */
  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource());
    em.setPackagesToScan(new String[] {"ahatius.springdatarest"});

    JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);
    em.setJpaProperties(additionalProperties());

    return em;
  }

  @Bean
  DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl(
        "jdbc:mysql://" + host + ":" + port + "/" + name + "?rewriteBatchedStatements=true");
    dataSource.setUsername(user);
    dataSource.setPassword(password);

    return dataSource;
  }

  @Bean
  PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
    return new PersistenceExceptionTranslationPostProcessor();
  }


  /**
   * 
   * @param emf
   * @return Returns a PlatformTransactionManager
   */
  @Bean
  public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
    JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(emf);

    return transactionManager;
  }

  /**
   * Adds additional properties for the hibernate dialect and naming strategy
   * 
   * @param emf
   * @return Returns a Properties object containing the dialect and naming strategy
   */
  Properties additionalProperties() {
    Properties properties = new Properties();
    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
    properties.setProperty("hibernate.ejb.naming_strategy",
        "org.hibernate.cfg.ImprovedNamingStrategy");

    return properties;
  }
}
