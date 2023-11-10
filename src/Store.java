import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;
    this.earnings = 0;
    itemList = new ArrayList();
    storeList.add(this);
    //storeList += this.store;
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index < itemList.size()) {
        Item item1 = itemList.get(index);
        item1.getName();
        earnings +=  item1.getCost();
        
        System.out.println("\n•---------•");
        System.out.printf("%s sold for %s.%n", item1.getName(), item1.getCost());
    }
    else {
        System.out.printf("%s only has %s item/s.%n", this.name, itemList.size());
    }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    for(Item item: itemList) {
        if (name.equalsIgnoreCase(item.getName())) {
            this.earnings += item.getCost();
            System.out.printf("%n%s sold for %s.%n", item.getName(), item.getCost());
            return;
        }
      }
    System.out.printf("%s doesn't sell %s.%n", this.name, name);
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    for(Item item: itemList) {
        if (item == i) {
            sellItem(i.getName());
            this.earnings += i.getCost();
            //System.out.printf("%n%s ay binenta nang %s.", i.getName(), i.getCost());
            return;
        }
      }
    System.out.printf("%s doesn't sell %s.%n", this.name, i.getName());
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
    System.out.println("\n•---------•");
    System.out.printf("Items in the %s that are %s:%n", this.name,type);
    for (Item item : itemList){
        if (item.getType().equalsIgnoreCase(type)) {
            System.out.printf("%-10.25s - %s%n", item.getName(), item.getCost());
        }
    }
    
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
     System.out.println("\n•---------•");
      System.out.printf("Items in the %s that cost less than %s: %n", this.name,maxCost);
     for (Item item : itemList) {
          if (item.getCost() <= maxCost) {
              System.out.printf("%-10.25s - %s%n", item.getName(), item.getCost());
          }
      }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
      System.out.println("\n•---------•");
      System.out.printf("Items in the %s that cost more than %s: %n", this.name,minCost);
      for (Item item : itemList) {
          if (item.getCost() >= minCost) {
              System.out.printf("%-10.25s - %s%n", item.getName(), item.getCost());
          }
      }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
      System.out.println("\n•---------•");
      System.out.println("The Earnings of the Stores:");
      storeList.forEach((e) -> System.out.printf("%-10.25s - %s%n", e.getName(), e.getEarnings()));
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
