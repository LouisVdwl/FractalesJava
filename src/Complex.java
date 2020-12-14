public class Complex {
    final double real;
    final double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex(Complex c){
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    public Complex add(Complex z){
        return new Complex(this.real + z.real, this.imaginary + z.imaginary);
    }

    public Complex square(){
        double reel = this.real * this.real - this.imaginary * this.imaginary;
        double imag = (this.real * this.imaginary) * 2;
        return new Complex(reel, imag);
    }

    public double modulus2(){
        return Math.pow(this.real, 2) + Math.pow(this.imaginary, 2);
    }

    public String toString(){
        return "Nombre complexe, réel:" + this.real + ", imaginaire: " + this.imaginary;
    }

}
