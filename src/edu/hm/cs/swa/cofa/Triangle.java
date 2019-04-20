package edu.hm.cs.swa.cofa;

public class Triangle extends Shape {

    private String drawing;

    public Triangle(String drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        System.out.println("drawing "+drawing+": "+ShapeEnum.TRIANGLE.toString());
    }

}
