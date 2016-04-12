package ahatius.springdatarest.angular.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import ahatius.springdatarest.angular.entities.JobDetail;

/**
 * Provides access to the JobDetail repository
 * 
 * @author ahatius
 *
 */
@Repository
public interface JobDetailRepository extends PagingAndSortingRepository<JobDetail, Integer> {

}
