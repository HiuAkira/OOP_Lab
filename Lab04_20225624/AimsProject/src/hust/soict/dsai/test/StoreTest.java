package test;

import store.Store;
import media.*;

public class StoreTest {
  public static void main(String[] args) {
    Store store = new Store();
    DigitalVideoDisc dvd = new DigitalVideoDisc("Test", null, 0);
    store.addMedia(dvd);
    store.removeMedia(dvd);
  }
}
