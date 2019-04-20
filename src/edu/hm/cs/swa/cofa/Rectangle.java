package edu.hm.cs.swa.cofa;

public class Rectangle extends Shape {

    private String drawing;

    public Rectangle(String drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        System.out.println("drawing "+drawing+": "+ShapeEnum.RECTANGLE.toString());
    }
}
