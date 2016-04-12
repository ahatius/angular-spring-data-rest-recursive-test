package ahatius.springdatarest.angular.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Represents a detail of a job.
 * 
 * @author ahatius
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "jobDetailId",
    scope = JobDetail.class)
public class JobDetail {
  @Id
  @GeneratedValue
  private int jobDetailId;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "jobId")
  private Job job;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "productRateId")
  private ProductRate productRate;

  /**
   * @return the jobDetailId
   */
  public int getJobDetailId() {
    return jobDetailId;
  }

  /**
   * @param jobDetailId the jobDetailId to set
   */
  public void setJobDetailId(int jobDetailId) {
    this.jobDetailId = jobDetailId;
  }

  /**
   * @return the job
   */
  public Job getJob() {
    return job;
  }

  /**
   * @param job the job to set
   */
  public void setJob(Job job) {
    this.job = job;
  }

  /**
   * @return the productRate
   */
  public ProductRate getProductRate() {
    return productRate;
  }

  /**
   * @param productRate the productRate to set
   */
  public void setProductRate(ProductRate productRate) {
    this.productRate = productRate;
  }


}
