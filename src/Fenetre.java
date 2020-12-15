import java.awt.*;
import javax . swing .*;
class Fenetre extends JFrame {
    public Fenetre (ImagePanel img){
        // operations d’ initialisation de la fenetre
        JFrame fen = new JFrame () ;

        fen . setSize (800 , 800) ;
        fen . setTitle ("Fractales") ;

        fen.add(img);

        fen . setVisible ( true ) ;
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

