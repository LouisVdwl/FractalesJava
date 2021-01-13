import java.awt.*;

public class ExempleJulia {
    public ExempleJulia(){

        ImagePanel img = new ImagePanel(800, 800);

        Window wnd = new Window(img.getImage().getWidth(), img.getImage().getHeight(), -2, 2, -2, 2);

        for(int i = 0; i < wnd.width(); i++){
            for(int j = 0; j < wnd.height(); j++){
                int n = 0;
                Complex z0 = wnd.toComplex(new Point(i, j));
                Complex c = new Complex(0.289, 0.01);
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

