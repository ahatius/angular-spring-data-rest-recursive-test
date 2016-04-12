package ahatius.springdatarest.angular.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import ahatius.springdatarest.angular.entities.Product;

/**
 * Provides access to the Product repository
 * 
 * @author ahatius
 *
 */
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
