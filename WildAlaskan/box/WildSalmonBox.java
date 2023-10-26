package WildAlaskan.box;
import WildAlaskan.seafood.CohoSalmon;
import WildAlaskan.seafood.SockeyeSalmon;

public class WildSalmonBox extends Box {
  public WildSalmonBox() {
    items.add(new CohoSalmon());
    items.add(new CohoSalmon());
    items.add(new CohoSalmon());
    items.add(new SockeyeSalmon());
    items.add(new SockeyeSalmon());
    items.add(new SockeyeSalmon());
  }
}
