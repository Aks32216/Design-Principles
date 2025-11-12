//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        You are building a graphics editing application like Figma or Photoshop.
//        The app should allow users to duplicate existing shapes (like Circle, Rectangle, etc.) without recreating them from scratch.
//        Each shape has basic properties like:
//          x, y (position)
//          color
//          and shape-specific properties (like radius for Circle, width and height for Rectangle).
//        The system should:
//                Support cloning of shapes so that new shapes are created as copies of existing ones.
//                Use a Shape Registry (cache) to store prototypes and retrieve clones on demand.
//                Be easily extendable for new shapes in the future.
//        Task:
//              Design classes and interfaces to support this behavior using the Prototype Design Pattern.
//              Write Java code to demonstrate cloning behavior.
//        (Bonus) Explain what happens if a shape contains complex nested objects — how would you handle deep cloning?
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Shape rectangle = new RectangleShape(1,2,"green",4,5);
        Shape circle = new CircleShape(2,3,"blue",5);

        Shape circleClone = circle.clone();
        Shape rectangeClone = rectangle.clone();

    }
}