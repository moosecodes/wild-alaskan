package WildAlaskan.box;
import WildAlaskan.seafood.PacificCod;
import WildAlaskan.seafood.PacificHalibut;
import WildAlaskan.seafood.PacificRockfish;

public class WildWhiteFishBox extends Box {
  public WildWhiteFishBox() {
    items.add(new PacificCod());
    items.add(new PacificCod());
    items.add(new PacificHalibut());
    items.add(new PacificHalibut());
    items.add(new PacificRockfish());
    items.add(new PacificRockfish());
  }
}
