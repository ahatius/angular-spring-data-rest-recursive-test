package ahatius.springdatarest.angular.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Represents a job
 * 
 * @author ahatius
 *
 */
@Entity
public class Job {
  @Id
  @GeneratedValue
  private int jobId;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
  @JoinColumn(name = "customerId")
  private Customer customer;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "job",
      orphanRemoval = true)
  private List<JobDetail> jobDetails;

  /**
   * @return the jobId
   */
  public int getJobId() {
    return jobId;
  }

  /**
   * @param jobId the jobId to set
   */
  public void setJobId(int jobId) {
    this.jobId = jobId;
  }

  /**
   * @return the customer
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * @param customer the customer to set
   */
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * @return the jobDetails
   */
  public List<JobDetail> getJobDetails() {
    return jobDetails;
  }

  /**
   * @param jobDetails the jobDetails to set
   */
  public void setJobDetails(List<JobDetail> jobDetails) {
    this.jobDetails = jobDetails;
  }
}
