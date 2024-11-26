package aims.store;
import java.util.ArrayList;

import aims.disc.DigitalVideoDisc;

public class Store {
  private ArrayList<DigitalVideoDisc> itemsInStore;

  public Store() {
    itemsInStore = new ArrayList<>();
  }

  public void addDVD(DigitalVideoDisc dvd) {
    itemsInStore.add(dvd);
  }

  public void removeDVD(DigitalVideoDisc dvd) {
    if(itemsInStore.contains(dvd))
      itemsInStore.remove(dvd);
    else 
      System.out.println("DVD not found!");
  }
}
