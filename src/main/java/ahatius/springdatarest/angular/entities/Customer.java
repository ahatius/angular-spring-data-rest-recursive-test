package ahatius.springdatarest.angular.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents a customer
 * 
 * @author ahatius
 *
 */
@Entity
public class Customer {
  @Id
  private int customerId;

  private String companyName1;
  private String companyName2;
  private String zip;
  private String city;

  /**
   * @return the customerId
   */
  public int getCustomerId() {
    return customerId;
  }

  /**
   * @param customerId the customerId to set
   */
  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  /**
   * @return the companyName1
   */
  public String getCompanyName1() {
    return companyName1;
  }

  /**
   * @param companyName1 the companyName1 to set
   */
  public void setCompanyName1(String companyName1) {
    this.companyName1 = companyName1;
  }

  /**
   * @return the companyName2
   */
  public String getCompanyName2() {
    return companyName2;
  }

  /**
   * @param companyName2 the companyName2 to set
   */
  public void setCompanyName2(String companyName2) {
    this.companyName2 = companyName2;
  }

  /**
   * @return the zip
   */
  public String getZip() {
    return zip;
  }

  /**
   * @param zip the zip to set
   */
  public void setZip(String zip) {
    this.zip = zip;
  }

  /**
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   * @param city the city to set
   */
  public void setCity(String city) {
    this.city = city;
  }
}
