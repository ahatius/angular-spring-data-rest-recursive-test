package ahatius.springdatarest.angular.entities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Provides the Index view
 * 
 * @author ahatius
 *
 */
@Controller
public class IndexViewController {
  /**
   * Povides the Index view
   * 
   * @param name
   * @param model
   * @return Returns the Index view
   */
  @RequestMapping({"/", "/index", "/index.html"})
  public String index() {
    return "index";
  }
}
