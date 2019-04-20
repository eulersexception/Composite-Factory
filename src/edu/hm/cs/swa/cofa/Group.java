package edu.hm.cs.swa.cofa;

import java.util.ArrayList;
import java.util.List;

public class Group extends Shape {

    private List<Shape> shapes;
    private String drawing;

    public Group(String drawing) {
        this.drawing = drawing;
        shapes = new ArrayList<>();
    }

    @Override
    public void draw() {
        System.out.println("drawing "+drawing+": "+ShapeEnum.GROUP.toString());
        shapes.stream().forEach(Shape::draw);
    }

    public void add(Shape newShape) {
        shapes.add(newShape);
    }

    public void remove(Shape unnecessaryShape) {
        shapes.remove(unnecessaryShape);
    }

    public Shape getChild() {
        return shapes.get(1);
    }

}
