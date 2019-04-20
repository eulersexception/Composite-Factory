package edu.hm.cs.swa.cofa;

public class Client {

    public static void main(String[] args) {
        drawScene();
    }

    public static void drawScene() {

        // TODO: Create a Client class which holds the main method to create and draw the scene shown in the image below.
        // Every item in the image is either a shape or a group:
        // items: house, shortTree, tallTree, leaves, trunk, roof, house, window, wall, door, door knob, door frame, flag, flag pole, flag top
        //
        // Example:
            ShapeFactory factory = new ShapeFactory();

            Group flag = (Group) factory.createShape(ShapeEnum.GROUP, "flag");
            flag.add(factory.createShape(ShapeEnum.CIRCLE, "flag top"));
            flag.add(factory.createShape(ShapeEnum.RECTANGLE, "flag pole"));
            flag.add(factory.createShape(ShapeEnum.TRIANGLE, "flag"));

            Group door = factory.createGroup("door");
            door.add(factory.createShape(ShapeEnum.RECTANGLE, "door frame"));
            door.add(factory.createShape(ShapeEnum.CIRCLE, "door knob"));

            Group house = factory.createGroup("house");
            house.add(factory.createShape(ShapeEnum.RECTANGLE, "wall"));
            house.add(factory.createShape(ShapeEnum.TRIANGLE, "roof"));
            house.add(factory.createShape(ShapeEnum.RECTANGLE, "window"));
            house.add(flag);
            house.add(door);

            Group smallTree = factory.createGroup("small tree");
            smallTree.add(factory.createShape(ShapeEnum.RECTANGLE, "small tree trunk"));
            smallTree.add(factory.createShape(ShapeEnum.CIRCLE, "small tree leaves"));

            Group tallTree = factory.createGroup("tall tree");
            tallTree.add(factory.createShape(ShapeEnum.RECTANGLE, "tall tree trunk"));
            tallTree.add(factory.createShape(ShapeEnum.CIRCLE, "tall tree leaves"));

            Group scene = (Group) factory.createShape(ShapeEnum.GROUP,"scene");
            scene.add(house);
            scene.add(tallTree);
            scene.add(tallTree);
            scene.draw();
    }
}
