import java.util.ArrayList;

class Mountain {
  private String name;
  private String country;
  private double elevation;

  public Mountain(String name, String country, double elevation) {
    this.name = name;
    this.country = country;
    this.elevation = elevation;
  }

  public String getName() {
    return name;
  }

  public String getCountry() {
    return country;
  }

  public double getElevation() {
    return elevation;
  }

  public void setElevation(double elevation) {
    this.elevation = elevation;
  }

  public double toMeters() {
    return elevation / 3.2808;
  }
}

public class Main {
  public static void main(String[] args) {
    ArrayList<Mountain> mountains = new ArrayList<>();

    mountains.add(new Mountain("Chimborazo", "Ecuador", 20549));
    mountains.add(new Mountain("Matterhorn", "Switzerland", 14692));
    mountains.add(new Mountain("Olympus", "Greece (Macedonia)", 9573));
    mountains.add(new Mountain("Everest", "Nepal", 29029));
    mountains.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344));
    mountains.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684));
    mountains.add(new Mountain("Zugspitze", "Switzerland", 9719));

    System.out.println("Mountain Details:");
    for (Mountain mountain : mountains) {
      System.out.println("Name: " + mountain.getName());
      System.out.println("Country: " + mountain.getCountry());
      System.out.println("Elevation (feet): " + mountain.getElevation());
      System.out.println("Elevation (meters): " + mountain.toMeters());
      System.out.println();
    }

    Mountain shortestMountain = findShortestMountain(mountains);
    System.out.println("Shortest Mountain:");
    System.out.println("Name: " + shortestMountain.getName());
    System.out.println("Elevation: " + shortestMountain.getElevation() + " feet");

  }

  public static Mountain findShortestMountain(ArrayList<Mountain> mountains) {
    Mountain shortestMountain = mountains.get(0);
    for (Mountain mountain : mountains) {
      if (mountain.getElevation() < shortestMountain.getElevation()) {
        shortestMountain = mountain;
      }
    }
    return shortestMountain;
  }
}


