package ahatius.springdatarest.angular.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import ahatius.springdatarest.angular.entities.ProductRate;

/**
 * Provides access to the ProductRate repository
 * 
 * @author ahatius
 *
 */
public interface ProductRateRepository extends PagingAndSortingRepository<ProductRate, Integer> {

}
