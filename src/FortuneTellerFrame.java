import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class FortuneTellerFrame extends JFrame
{
    JPanel mainPnl, titlePnl, displayPnl, btnPnl;
    JLabel titleLbl;
    ImageIcon icon;
    JScrollPane scroller;
    JTextArea fortuneTA;
    JButton quitBtn, fortuneBtn;


    int curFortuneDex = -1;
    int newDex;

    String[] fortunes = //this is quite cool -------CHANGE TO FUNNY STUFF------
            {
                    "F1",
                    "F2",
                    "F3",
                    "F4",
                    "F5",
                    "F6",
                    "F7",
                    "F8",
                    "F9",
                    "F10",
                    "F11",
                    "F12"
            };
    Random rnd = new Random();

    public FortuneTellerFrame()
    {
        //sub method time for each of the 3 panels

        setTitle("Fortune Teller");
        setSize(800, 800); //-----------this is where you do centering later on 3/4--------
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        add(mainPnl);
        //createTitlePanel();
        createDisplayPanel();
        createButtonPanel();




        setVisible(true);
    }

    private void createButtonPanel() //quit done // add fortune stuff
    {
        btnPnl = new JPanel();
        btnPnl.setLayout(new GridLayout(1,2));
        quitBtn = new JButton("Quit");
        fortuneBtn = new JButton("Read My Fortune!");

        fortuneBtn.addActionListener(
                (ActionEvent ae) ->
                {//grab a random index(int) that isn't the same as the last chosen
                    do{
                        newDex = rnd.nextInt(fortunes.length);

                        }while(newDex != curFortuneDex);
                    curFortuneDex = newDex;
                    fortuneTA.append(fortunes[curFortuneDex] + "\n");

                }
                );

        btnPnl.add(fortuneBtn);
        btnPnl.add(quitBtn);
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        mainPnl.add(BorderLayout.SOUTH, btnPnl);

    }

    private void createDisplayPanel()
    {
        displayPnl = new JPanel();

        fortuneTA =  new JTextArea(12, 60);
        scroller = new JScrollPane(fortuneTA);

        displayPnl.add(scroller);

        mainPnl.add(displayPnl, BorderLayout.CENTER);
    }



}
