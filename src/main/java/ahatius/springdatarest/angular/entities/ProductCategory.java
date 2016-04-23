package ahatius.springdatarest.angular.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Represents the category of a product
 * 
 * @author ahatius
 *
 */
@Entity
public class ProductCategory {
  @Id
  private int productCategoryId;

  private String name;

  /**
   * @return the productCategoryId
   */
  public int getProductCategoryId() {
    return productCategoryId;
  }

  /**
   * @param productCategoryId the productCategoryId to set
   */
  public void setProductCategoryId(int productCategoryId) {
    this.productCategoryId = productCategoryId;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }
}
