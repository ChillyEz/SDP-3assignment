public class Circle extends Shape {
    
    private double radius;

    public Circle(RenderEngine renderer, double radius){
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.drawCircle(radius);
    }

    @Override
    public void identify() {
        System.out.println("I am a Circle with radius: " + radius);
    }
}