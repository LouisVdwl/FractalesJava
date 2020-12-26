public class Window implements Zoomable{

    public int imageWidth;
    public int imageHeight;
    public double minReal;
    public double maxReal;
    public double minImaginary;
    public double maxImaginary;

    public Window(int imageWidth, int imageHeight, double minReal, double maxReal, double minImaginary, double maxImaginary){
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.minReal = minReal;
        this.maxReal = maxReal;
        this.minImaginary = minImaginary;
        this.maxImaginary = maxImaginary;
    }

    public Complex toComplex(Point p){
        double realPart = this.minReal + p.x * (this.maxReal - this.minReal) / (this.imageWidth - 1);
        double imaginaryPart = this.minImaginary + p.y * (this.maxImaginary - this.minImaginary) / (this.imageHeight - 1);
        return new Complex(realPart, imaginaryPart);
    }

    public int height(){
        return this.imageHeight;
    }

    public int width(){
        return this.imageWidth;
    }

    public void zoom(Point center, double factor){

    }
}