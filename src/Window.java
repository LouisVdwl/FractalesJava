public class Window implements  Zoomable{
    private int imageWidth;
    private int imageHeight;
    private double minReal;
    private double maxReal;
    private double minImaginary;
    private double maxImaginary;

    public Window(ImagePanel img, double reelMin, double imagMin, double reelMax, double imagMax){
        this.imageWidth = img.getWidth();
        this.imageHeight = img.getHeight();
        this.minReal = reelMin;
        this.maxReal = reelMax;
        this.minImaginary = imagMin;
        this.maxImaginary = imagMax;
    }

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

    public Complex toComplex(Point p){
        double reel = minReal + p.x * (maxReal-minReal) / (imageWidth-1);
        double imag = maxImaginary + p.y * (minImaginary-maxImaginary) / (imageHeight-1);
        return new Complex(reel, imag);
    }
}
