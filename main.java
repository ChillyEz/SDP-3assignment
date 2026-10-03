public class main {
    public static void main(String[] args) {
        // Client
        // vector Square creation
        System.out.println("");
        
        System.out.println("============ Vector Square =========");
        RenderEngine vector = new VectorRenderer();

        Shape square = new Square(vector, 10.0);
        
        square.draw();
        square.identify();

        // raster Circle creation
        System.out.println("============ Raster Circle =========");
        RenderEngine raster = new RasterRenderer();

        Shape circle = new Circle(raster, 5.0);

        circle.draw();
        circle.identify();
        //Switching
        System.out.println("========== Switching ========");

        circle.setRenderer(vector);

        circle.draw();
        circle.identify();


        System.out.println("");

    }
}