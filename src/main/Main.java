package main;
//Main.java (Client Code)
public class Main {
 public static void main(String[] args) {
     // 1. Create our furniture elements
     Furniture diningChair = new Chair(5.0);        // 5kg chair
     Furniture diningTable = new Table(2.0, 1.0);   // 2x1 meter table
     Furniture loungeSofa = new Sofa(80.0, 150.0);  // 80kg sofa, 150 miles away

     // 2. Create our visitor
     StandardShippingCalculator shippingCalculator = new StandardShippingCalculator();

     // 3. Process the shipping costs
     System.out.println("Calculating individual shipping costs...");
     System.out.println("----------------------------------------");
     
     diningChair.accept(shippingCalculator);
     diningTable.accept(shippingCalculator);
     loungeSofa.accept(shippingCalculator);

     System.out.println("----------------------------------------");
     System.out.println("Total Shipping Cost: $" + shippingCalculator.getTotalShippingCost());
 }
}