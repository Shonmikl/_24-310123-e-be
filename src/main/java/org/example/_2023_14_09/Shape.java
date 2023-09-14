package org.example._2023_14_09;

public class Shape {
    public enum Type { CIRCLE, SQUARE }
    
    private Type type;
    
    public Shape(Type type) {
        this.type = type;
    }
    
    public double calculateArea() {
        if (type == Type.CIRCLE) {
        } else if (type == Type.SQUARE) {
        }
        return 0.0;
    }
}