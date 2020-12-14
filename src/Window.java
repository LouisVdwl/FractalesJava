public class Window implements  Zoomable{
    private int imageWidth;
    private int imageHeight;
    private double minReal;
    private double maxReal;
    private double minImaginary;
    private double maxImaginary;
    @Override
    public int height() {
        return this.imageHeight;
    }

    @Override
    public int width() {
        return this.imageWidth;
    }

    @Override
    public void zoom(Point center, double factor) {

    }
}
