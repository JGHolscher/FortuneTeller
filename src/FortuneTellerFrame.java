import javax.swing.*;
import java.awt.*;

public class FortuneTellerFrame extends JFrame
{
    public FortuneTellerFrame()
    {
        JPanel mainPnl, titlePnl, displayPnl, btnPnl;
        JLabel titleLbl;
        ImageIcon icon;
        JScrollPane scroller;
        JTextArea fortuneTxt;
        JButton Quit, fortuneBtn;


        //sub method time for each of the 3 panels

        setTitle("Fortune Teller");
        setSize(800, 800); //-----------this is where you do centering later on--------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
