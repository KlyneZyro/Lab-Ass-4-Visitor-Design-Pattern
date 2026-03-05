package main;

//Furniture.java (The Element Interface)
public interface Furniture {
 // Every piece of furniture must be able to "accept" a shipping visitor
 void accept(ShippingVisitor visitor);
}