package aims.cart;

import aims.disc.DigitalVideoDisc;

public class Cart {
  public static final int MAX_NUMBERS_ORDERD = 20;
  private DigitalVideoDisc itemsOrderd[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERD];
  private int itemQuantity = 0;

  public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    if (itemQuantity == MAX_NUMBERS_ORDERD) {
      System.out.println("The cart is almost full");
      return;
    }

    itemsOrderd[itemQuantity++] = disc;
    System.out.println("The disc has been added");
  }

  //Section 2: Working with method overloading
  // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
  //   for(int i = 0; i <dvdList.length; i++) {
  //     if (itemQuantity >= MAX_NUMBERS_ORDERD) { 
  //       System.out.println("The cart is almost full");
  //       break;
  //     }
  //     itemsOrderd[itemQuantity++] = dvdList[i];
  //     System.out.println("The disc " + i + " has been added");
  //   }
  // }

  public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
    for(DigitalVideoDisc disc : dvdList) {
      if (itemQuantity >= MAX_NUMBERS_ORDERD) { 
        System.out.println("The cart is almost full");
        break;
      }
      itemsOrderd[itemQuantity++] = disc;
      System.out.println("The disc " + disc + " has been added");
    }
  }

  public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {

  }

  //Section 6
  public void printCart() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    for (int i = 0; i < itemsOrderd.length; i++) {   
      if(itemsOrderd[i] != null) {
        System.out.println((i + 1) + ". DVD - " + itemsOrderd[i].toString());
      }        
    }
    System.out.println("Total cost: " + this.totalCost());
    System.out.println("**************************************************");
  }

  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    if (itemQuantity == 0) {
      System.out.println("The cart is almost empty");
      return;
    }

    boolean removed = false;

    for (int i = 0; i < itemsOrderd.length; i++) {
      if (itemsOrderd[i] != null && itemsOrderd[i].equals(disc)) {
        for (int j = i; j < itemQuantity - 1; j++) {
          itemsOrderd[j] = itemsOrderd[j + 1];
        }
        itemsOrderd[itemQuantity - 1] = null;
        removed = true;
        break;
      }
    }

    if (!removed) {
      System.out.println("Could not find the searched disc in cart!");
      return;
    }

    itemQuantity--;
    System.out.println("The disc has been removed!");
  }

  public float totalCost() {
    float total = 0f;
    for (int i = 0; i < itemsOrderd.length; i++) {   
      if(itemsOrderd[i] != null)   
        total += itemsOrderd[i].getCost();
    }
    return total;
  }
}
