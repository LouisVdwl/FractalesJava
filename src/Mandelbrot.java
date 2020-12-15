import java.awt.*;

public class Mandelbrot {
    public Mandelbrot(){
        Complex zn;
        Color noir;
        Color blanc;

        noir = new Color(255, 0, 120);
        blanc = new Color(255,255,255);
        zn = new Complex(-2.5, 1.75);

        ImagePanel img = new ImagePanel(800, 800);

        Window wnd = new Window(img, -2.5, 1.75, 1, -1.75);

        for(int y = 0; y < 800; y++){
            for(int x = 0; x < 800; x++){
                Point pActuel = new Point(x, y);
                Complex c = wnd.toComplex(pActuel);
                zn = zn.square().add(c);
                if(zn.modulus2() < 4){
                    System.out.println("ok");
                    img.getImage().setRGB(x, y, noir.getRGB());
                }else{
                    img.getImage().setRGB(x, y, blanc.getRGB());
                }

            }
        }

        Fenetre fen = new Fenetre(img);
    }
}
