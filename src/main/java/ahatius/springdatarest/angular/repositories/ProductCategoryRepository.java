package ahatius.springdatarest.angular.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import ahatius.springdatarest.angular.entities.ProductCategory;

/**
 * Provides access to the ProductCategory repository
 * 
 * @author ahatius
 *
 */
public interface ProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Integer> {

}
