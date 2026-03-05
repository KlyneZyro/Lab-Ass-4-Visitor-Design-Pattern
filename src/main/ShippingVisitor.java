package main;

//ShippingVisitor.java (The Visitor Interface)
public interface ShippingVisitor {
 // The visitor must have a specific method for every type of concrete furniture
 void visit(Chair chair);
 void visit(Table table);
 void visit(Sofa sofa);
}