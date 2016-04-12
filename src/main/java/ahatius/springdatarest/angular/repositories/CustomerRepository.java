package ahatius.springdatarest.angular.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ahatius.springdatarest.angular.entities.Customer;

/**
 * Provides access to the Customer repository
 * 
 * @author ahatius
 *
 */
@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

}
