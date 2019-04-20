package edu.hm.cs.swa.cofa;

import java.util.Objects;

public class ShapeFactory extends AbstractShapeFactory {

    @Override
    public Shape createShape(ShapeEnum type, String drawing) {
        Objects.requireNonNull(drawing);
        switch(type) {
            case CIRCLE: return new Circle(drawing);
            case TRIANGLE: return new Triangle(drawing);
            case RECTANGLE: return new Rectangle(drawing);
            case GROUP: return new Group(drawing);
            default: throw new IllegalArgumentException("Wrong type of Shape requested!");
        }
    }

    public Group createGroup(String drawing) {
        Objects.requireNonNull(drawing);
        return (Group) createShape(ShapeEnum.GROUP, drawing);
    }
}
