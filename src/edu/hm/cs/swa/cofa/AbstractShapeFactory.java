package edu.hm.cs.swa.cofa;

public abstract class AbstractShapeFactory {

    public abstract Shape createShape(ShapeEnum type, String drawing);
}
