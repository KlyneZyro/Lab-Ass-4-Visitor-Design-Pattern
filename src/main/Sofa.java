package main;

//Sofa.java
public class Sofa implements Furniture {
 private double weight;
 private double shippingDistance;

 public Sofa(double weight, double shippingDistance) {
     this.weight = weight;
     this.shippingDistance = shippingDistance;
 }

 public double getWeight() {
     return weight;
 }

 public double getShippingDistance() {
     return shippingDistance;
 }

 @Override
 public void accept(ShippingVisitor visitor) {
     visitor.visit(this); // Passes itself as a Sofa
 }
}