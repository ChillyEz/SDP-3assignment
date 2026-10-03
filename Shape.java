public abstract class Shape {
    protected RenderEngine renderer;

    public Shape(RenderEngine renderer) {
        this.renderer = renderer;
    }
    public void setRenderer(RenderEngine renderer) {
        this.renderer = renderer;
    }
    
    public abstract void identify();
    public abstract void draw();
} 