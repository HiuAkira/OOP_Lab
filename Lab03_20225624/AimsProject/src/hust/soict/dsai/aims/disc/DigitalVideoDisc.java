package aims.disc;

public class DigitalVideoDisc {
  private String title;
  private String category;
  private String director;
  private int length;
  private float cost;
  //Section 5: Classifier Member & Instance Member
  private int id;
  static int nbDigitalVideoDisc = 0;  

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getCategory() {
    return category;
  }

  public String getDirector() {
    return director;
  }

  public int getLength() {
    return length;
  }

  public float getCost() {
    return cost;
  }

  public void setTitle(String titleString) {
    this.title = titleString;
  }

  public DigitalVideoDisc(String title) {
    this.id = nbDigitalVideoDisc++;
    this.title = title;
  }

  public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    this.id = nbDigitalVideoDisc++;
    this.title = title;
    this.category = category;
    this.director = director;
    this.length = length;
    this.cost = cost;
  }

  public DigitalVideoDisc(String title, String category, String director, float cost) {
    this(title, category, director, 0, cost); 
  }

  public DigitalVideoDisc(String title, String category, float cost) {
    this(title, category, null, 0, cost);
  }  
  
  @Override
  public String toString() {
    return this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost();
  }
  
  public static void searchById(DigitalVideoDisc[] cart, int id) {
    boolean found = false;
    for (DigitalVideoDisc dvd : cart) {
      if (dvd.getId() == id) {
        System.out.println("DVD found by ID: " + dvd);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("No DVD found with ID: " + id);
    }
  }

  public static void searchByTitle(DigitalVideoDisc[] cart, String title) {
    boolean found = false;
    for (DigitalVideoDisc dvd : cart) {
      if (dvd.getTitle().equalsIgnoreCase(title)) {
        System.out.println("DVD found by Title: " + dvd);
        found = true;
      }
    }
    if (!found) {
      System.out.println("No DVD found with Title: " + title);
    }
  }
}
