package WildAlaskan.box;
import WildAlaskan.seafood.CohoSalmon;
import WildAlaskan.seafood.PacificCod;
import WildAlaskan.seafood.PacificHalibut;
import WildAlaskan.seafood.PacificRockfish;
import WildAlaskan.seafood.SockeyeSalmon;
import WildAlaskan.seafood.WildAlaskaPollock;

public class WildComboBox extends Box {
  public WildComboBox() {
    items.add(new CohoSalmon());
    items.add(new SockeyeSalmon());
    items.add(new PacificCod());
    items.add(new PacificHalibut());
    items.add(new PacificRockfish());
    items.add(new WildAlaskaPollock());
  }
}
