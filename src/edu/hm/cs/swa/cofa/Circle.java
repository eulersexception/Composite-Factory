package edu.hm.cs.swa.cofa;

public class Circle extends Shape {

    private String drawing;

    public Circle(String drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        System.out.println("drawing "+drawing+": "+ShapeEnum.CIRCLE.toString());
    }
}
