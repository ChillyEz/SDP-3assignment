public class Square extends Shape {

    private double a;

    public Square(RenderEngine renderer, double a){
        super(renderer);
        this.a = a;
    }

    @Override
    public void draw() {
        renderer.drawSquare(a);
    }
    @Override
    public void identify() {
        System.out.println("I am a Square with a side: " + a);
    }
}