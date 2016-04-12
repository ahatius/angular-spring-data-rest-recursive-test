package ahatius.springdatarest.angular.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Represents the rate of a product
 * 
 * @author ahatius
 *
 */
@Entity
public class ProductRate {
  @Id
  @GeneratedValue
  private int productRateId;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "productId", referencedColumnName = "productId")
  private Product product;

  private double price;
  private double weight;

  /**
   * @return the productRateId
   */
  public int getProductRateId() {
    return productRateId;
  }

  /**
   * @param productRateId the productRateId to set
   */
  public void setProductRateId(int productRateId) {
    this.productRateId = productRateId;
  }

  /**
   * @return the product
   */
  public Product getProduct() {
    return product;
  }

  /**
   * @param product the product to set
   */
  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   * @return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * @return the weight
   */
  public double getWeight() {
    return weight;
  }

  /**
   * @param weight the weight to set
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }
}
