import java.awt.*;

public class Mandelbrot {
    public Mandelbrot(){
        Color noir;
        Color blanc;

        noir = new Color(0, 0, 0);
        blanc = new Color(255,255,255);

        ImagePanel img = new ImagePanel(800, 800);

        Window wnd = new Window(img.getImage().getWidth(), img.getImage().getHeight(), -2.5, 1, -1.75, 1.75);

        for(int i = 0; i < wnd.width(); i++){
            for(int j = 0; j < wnd.height(); j++){
                int n = 0;
                Complex z0 = new Complex(0, 0);
                Complex c = wnd.toComplex(new Point(i, j));
                Complex zn = z0;
                while(n < 255 && zn.modulus2() < 4){
                    zn = zn.square().add(c);
                    n++;
                }

                if(n >= 255){
                    img.getImage().setRGB(i, j, (0 << 16) + (0 << 8) + 0);
                }else{
                    img.getImage().setRGB(i, j, (n << 16) + (n << 8) + n);
                }
            }
        }

        Fenetre fen = new Fenetre(img);
    }
}
