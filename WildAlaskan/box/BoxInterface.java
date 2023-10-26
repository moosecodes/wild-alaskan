package WildAlaskan.box;
import java.util.Deque;

import WildAlaskan.product.Product;

public interface BoxInterface {
  void add(Product product);
  void remove(Product product);  
  Deque<Product> view();
  void clear();
}
