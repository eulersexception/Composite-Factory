# Composite and Factory Method

The goal of this exercise is to use the Composite pattern and the Factory Method pattern.

**You have the following tasks:**

### Part 1: Composite pattern

Use the Composite pattern to implement a hierarchy of geometric shapes and groupings of shapes.
Implement the following classes: 

✅[Shape](testClass[Shape]) 
✅[Circle](testClass[Circle])
✅[Triangle](testClass[Triangle]) 
✅[Rectangle](testClass[Rectangle])
✅[Group](testClass[Group]) 

Shape is an abstract class. 
The other shapes inherit from the shape class. Group is a grouping of shapes. Every shape has an attribute  
✅[drawing](testAttributes[Circle],testAttributes[Triangle],testAttributes[Rectangle],testAttributes[Group])

(name of object in a drawing (e.g. door knob)). Every shape class has a 
✅[draw](testMethods[Shape],testMethods[Circle],testMethods[Triangle],testMethods[Rectangle],testMethods[Group])

method which prints 
to the command line its drawing attribute and the name of the shape (e.g. drawing door knob: circle). 
If the shape is a group, it prints its drawing attribute and all the drawing attributes and shape names of the group members. 

@startuml

abstract class Shape {
+<color:testsColor(testMethods[Shape])>draw()</color>
}

class Circle {
-<color:testsColor(testAttributes[Circle])>drawing: String</color>
+<color:testsColor(testMethods[Circle])>draw()</color>
}

class Triangle {
-<color:testsColor(testAttributes[Triangle])>drawing: String</color>
+<color:testsColor(testMethods[Triangle])>draw()</color>
}

class Rectangle {
-<color:testsColor(testAttributes[Rectangle])>drawing: String</color>
+<color:testsColor(testMethods[Rectangle])>draw()</color>
}

class Group {
-<color:testsColor(testAttributes[Rectangle])>drawing: String</color>
+<color:testsColor(testMethods[Rectangle])>draw()</color>
+<color:testsColor(testMethods[Rectangle])>add()</color>
+<color:testsColor(testMethods[Rectangle])>remove()</color>
+<color:testsColor(testMethods[Rectangle])>getChild(): Shape</color>
}

Circle -up-|> Shape 
Triangle -up-|> Shape 
Rectangle -up-|> Shape 
Group -up-|> Shape 
Shape "*" -left-o "1" Group


@enduml

### Part 2: Factory Method pattern

✅[Create a ShapeFactory](testClass[ShapeFactory]) 
which creates all shapes. Use the Factory Method 
pattern.


### Part 3: Client

Create a ✅[Client](testHouse,testDoorKnob,testFlag,testTallTree)
class which holds the main method and a drawScene() method 
to create and draw the scene shown in the image below.
Every item in the image is either a shape or a group:

Items: 
- house, 
- shortTree, 
- tallTree, 
- leaves, 
- trunk, 
- roof, 
- window, 
- wall, 
- door, 
- door knob, 
- door frame, 
- flag, 
- flag pole, 
- flag top

![scene](https://raw.githubusercontent.com/sweIhm/images/master/shape_scene.PNG)
