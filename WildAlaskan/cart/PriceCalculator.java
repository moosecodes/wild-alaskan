package WildAlaskan.cart;

public class PriceCalculator {
  protected ShoppingCart cart;

  public PriceCalculator(ShoppingCart cart) {
    this.cart = cart;
  }

  public void getTotal(ShoppingCart cart) {
    System.out.println(cart.getCartTotal());
  }
}
