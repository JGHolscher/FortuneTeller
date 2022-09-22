import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FortuneTellerFrame extends JFrame
{
    JPanel mainPnl, titlePnl, displayPnl, btnPnl;
    JLabel titleLbl;
    ImageIcon icon;
    JScrollPane scroller;
    JTextArea fortuneTxt;
    JButton quitBtn, fortuneBtn;


    public FortuneTellerFrame()
    {
        //sub method time for each of the 3 panels

        setTitle("Fortune Teller");
        setSize(800, 800); //-----------this is where you do centering later on--------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        add(mainPnl);
        //createTitlePanel();
        //createDisplayPanel();
        createButtonPanel();




        setVisible(true);
    }

    private void createButtonPanel()
    {
        btnPnl = new JPanel();
        btnPnl.setLayout(new GridLayout(1,2));
        quitBtn = new JButton("Quit");


        fortuneBtn = new JButton("Read My Fortune!");

        btnPnl.add(fortuneBtn);
        btnPnl.add(quitBtn);
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        mainPnl.add(BorderLayout.SOUTH, btnPnl);

    }



}
