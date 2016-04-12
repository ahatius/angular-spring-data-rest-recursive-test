package ahatius.springdatarest.angular.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

/**
 * Represents the product
 * 
 * @author ahatius
 *
 */
@Entity
public class Product {
  @Id
  private int productId;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
  @JoinColumn(name = "productCategoryId", referencedColumnName = "productCategoryId")
  @MapsId("productCategoryId")
  private ProductCategory productCategory;

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "product")
  private List<ProductRate> productRates;

  private String name;

  /**
   * @return the productId
   */
  public int getProductId() {
    return productId;
  }

  /**
   * @param productId the productId to set
   */
  public void setProductId(int productId) {
    this.productId = productId;
  }

  /**
   * @return the productCategory
   */
  public ProductCategory getProductCategory() {
    return productCategory;
  }

  /**
   * @param productCategory the productCategory to set
   */
  public void setProductCategory(ProductCategory productCategory) {
    this.productCategory = productCategory;
  }

  /**
   * @return the productRates
   */
  public List<ProductRate> getProductRates() {
    return productRates;
  }

  /**
   * @param productRates the productRates to set
   */
  public void setProductRates(List<ProductRate> productRates) {
    this.productRates = productRates;
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
