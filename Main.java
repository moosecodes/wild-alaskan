import WildAlaskan.cart.ShoppingCart;

public class Main {
  public static void main(String[] args) {
    var cart = new ShoppingCart();
    var total = cart.startShopping();
    System.out.println("Total: " + total);
  }
}
