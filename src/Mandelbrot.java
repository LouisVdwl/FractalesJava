import java.awt.*;

public class Mandelbrot {
    public Mandelbrot(){
        Complex zn;
        Color noir;
        Color blanc;

        noir = new Color(255, 0, 120);
        blanc = new Color(0,0,0);
        zn = new Complex(-2.5, 1.75);

        ImagePanel img = new ImagePanel(800, 800);
        int red = 255;int green = 0;int blue = 120;
        img.getImage().setRGB(20, 50, noir.getRGB());

        Window wnd = new Window(img, -2.5, 1.75, 1, -1.75);

        for(int y = 0; y < wnd.height(); y++){
            for(int x = 0; x<wnd.width(); x++){
                Point pActuel = new Point(x, y);
                zn = zn.square().add(wnd.toComplex(pActuel));
                if(zn.square() < 4){

                }

            }
        }

        Fenetre fen = new Fenetre(img);
    }
}
