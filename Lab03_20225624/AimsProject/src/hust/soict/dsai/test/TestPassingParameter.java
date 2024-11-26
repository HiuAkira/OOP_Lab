package test;

import aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
  public static void main(String[] args) {
    DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
    DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");        

    jungleDVD = swap(cinderellaDVD, cinderellaDVD = jungleDVD);
    System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

    changeTitle(jungleDVD, cinderellaDVD.getTitle());
    System.out.println("jungle dvd title: " + jungleDVD.getTitle());    
  }  

  //Update correct swap method
  public static <T> T swap(T itself, T dum) {
    return itself;
  }

  public static void changeTitle(DigitalVideoDisc dvd, String title) {
    String oldTitle = dvd.getTitle();
    dvd.setTitle(title);
    dvd = new DigitalVideoDisc(oldTitle);
  }
}
