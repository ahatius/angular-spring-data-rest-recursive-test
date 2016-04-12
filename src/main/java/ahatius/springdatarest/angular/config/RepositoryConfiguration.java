package ahatius.springdatarest.angular.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import ahatius.springdatarest.angular.entities.Customer;
import ahatius.springdatarest.angular.entities.Job;
import ahatius.springdatarest.angular.entities.JobDetail;
import ahatius.springdatarest.angular.entities.Product;
import ahatius.springdatarest.angular.entities.ProductCategory;
import ahatius.springdatarest.angular.entities.ProductRate;

/**
 * Configures the repositories to expose the ids for selected entities
 * 
 * @author ahatius
 *
 */
@Configuration
public class RepositoryConfiguration extends RepositoryRestConfigurerAdapter {
  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    config.exposeIdsFor(Job.class);
    config.exposeIdsFor(JobDetail.class);
    config.exposeIdsFor(Customer.class);
    config.exposeIdsFor(Product.class);
    config.exposeIdsFor(ProductRate.class);
    config.exposeIdsFor(ProductCategory.class);
  }
}
