package ahatius.springdatarest.angular.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import ahatius.springdatarest.angular.entities.Job;

/**
 * Provides access to the Job repository
 * 
 * @author ahatius
 *
 */
public interface JobRepository extends PagingAndSortingRepository<Job, Integer> {

}
