package edu.tucn.ispse.lecture12.ex6decorator;

/**
 * @author Radu Miron
 */
public class TestDecorator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        RedBorderShapeDecorator redBorderShapeDecorator = new RedBorderShapeDecorator(circle);
        redBorderShapeDecorator.draw();

        BlueBorderShapeDecorator blueBorderShapeDecorator = new BlueBorderShapeDecorator(square);
        blueBorderShapeDecorator.draw();
    }
}

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("circle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("square");
    }
}

abstract class ShapeDecorator extends Shape {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        if (shape == null) {
            throw new IllegalArgumentException("Cannot have a decorator without a shape");
        }

        this.shape = shape;
    }
}

class RedBorderShapeDecorator extends ShapeDecorator {
    public RedBorderShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
        this.shape.draw();
    }

    private void setRedBorder() {
        System.out.print("red ");
    }
}

class BlueBorderShapeDecorator extends ShapeDecorator {
    public BlueBorderShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setBlueBorder();
        this.shape.draw();
    }

    private void setBlueBorder() {
        System.out.print("blue ");
    }
}