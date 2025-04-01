import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class FlappyBird extends JPanel{
    int boardWidth = 360;
    int boardHeight = 640;

    public FlappyBird() {
        setPreferredSize(new Dimension(boardWidth,boardHeight));
        setBackground(Color.blue);
    }

}
