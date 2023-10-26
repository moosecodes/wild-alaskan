package WildAlaskan.cart;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

import WildAlaskan.box.Box;
import WildAlaskan.box.CustomBox;
import WildAlaskan.box.WildComboBox;
import WildAlaskan.box.WildSalmonBox;
import WildAlaskan.box.WildWhiteFishBox;

public class ShoppingCart {
  private Scanner scanner = new Scanner(System.in);
  private Deque<Box> cart = new ArrayDeque<Box>();
  private int selection = -1;

  private void beginPrompts(int selection) {
    System.out.println("\n* Welcome to Wild Alaskan in Java *\n");
    System.out.println("Please select a box to add to the cart:\n");
    System.out.println("\t1) Wild Combo Box");
    System.out.println("\t2) Wild Salmon Box");
    System.out.println("\t3) Wild White Fish Box");
    System.out.println("\t4) Custom Box");
    System.out.println("\t0) End Shopping\n");

    while (selection != 0) {
      selection = scanner.nextInt();
      var message = this.addBox(selection - 1);

      System.out.println(message);
    }
  }

  protected String getCartTotal() {
    double total = 0.0;
    for (Box box : cart) {
      total += box.getBoxTotal();
    }
    return "$" + total;
  }

  public String addBox(int selection) {
    var boxes = new ArrayList<Box>();
    boxes.add(new WildComboBox());
    boxes.add(new WildSalmonBox());
    boxes.add(new WildWhiteFishBox());
    boxes.add(new CustomBox());

    if (selection < 0) {
      return "Finished selection.";
    } else if (selection >= 0 && selection <= boxes.size() - 1) {
      this.cart.add(boxes.get(selection));
      return "Added " + boxes.get(selection).getBoxTotal();
    } else {
      return "Invalid selection: " + selection + 1;
    }
  }

  public String startShopping() {
    beginPrompts(selection);
    return getCartTotal();
  }
}
