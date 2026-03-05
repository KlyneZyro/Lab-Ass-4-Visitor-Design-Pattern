package main;

//StandardShippingCalculator.java
public class StandardShippingCalculator implements ShippingVisitor {
 private double totalShippingCost = 0;

 // Chairs are lightweight: Flat rate of $15 + $0.50 per kg
 @Override
 public void visit(Chair chair) {
     double cost = 15.00 + (chair.getWeight() * 0.50);
     System.out.println("Chair shipping cost: $" + cost);
     totalShippingCost += cost;
 }

 // Tables are charged based on the surface area they take up in the truck
 @Override
 public void visit(Table table) {
     double cost = table.getArea() * 2.00; 
     System.out.println("Table shipping cost: $" + cost);
     totalShippingCost += cost;
 }

 // Sofas are bulky: Base rate + weight + distance formula
 @Override
 public void visit(Sofa sofa) {
     double cost = 50.00 + (sofa.getWeight() * 1.2) + (sofa.getShippingDistance() * 0.8);
     System.out.println("Sofa shipping cost: $" + cost);
     totalShippingCost += cost;
 }

 public double getTotalShippingCost() {
     return totalShippingCost;
 }
}