package WildAlaskan.box;
import java.util.ArrayDeque;
import java.util.Deque;

import WildAlaskan.product.Product;

public abstract class Box implements BoxInterface {
  protected Deque<Product> items = new ArrayDeque<Product>();

  public void add(Product product) {
    items.add(product);
  }

  public void remove(Product product) {
    items.remove(product);
  }

  public Deque<Product> view() {
    return this.items;
  }

  public void clear() {
    items.clear();
  }

  public double getBoxTotal() {
    var totalPrice = 0;
    for(Product item : items) {
      totalPrice += item.getPrice();
    }
    return totalPrice;
  }

}
