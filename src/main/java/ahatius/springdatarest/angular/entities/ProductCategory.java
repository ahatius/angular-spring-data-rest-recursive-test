package ahatius.springdatarest.angular.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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

  @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "productCategory")
  private List<Product> products;

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

  /**
   * @return the products
   */
  public List<Product> getProducts() {
    return products;
  }

  /**
   * @param products the products to set
   */
  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
