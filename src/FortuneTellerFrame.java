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
    int newDex = 1;

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
        mainPnl.setSize(75%, 100%);//////FCKNFJOE:BGJOWS
        createTitlePanel();
        createDisplayPanel();
        createButtonPanel();




        setVisible(true);
    }

    private void createTitlePanel()
    {

        titlePnl = new JPanel();
        icon = new ImageIcon("src/crystalBall.png", "Crystal Ball Icon");


        titleLbl = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        titleLbl.setFont(new Font("Comic Sans MS", Font.PLAIN, 48));

        //
        titleLbl.setVerticalTextPosition(JLabel.BOTTOM);
        titleLbl.setHorizontalAlignment(JLabel.CENTER);


        titlePnl.add(titleLbl);
        mainPnl.add(titlePnl, BorderLayout.NORTH);
    }

    private void createDisplayPanel() //DONE
    {
        displayPnl = new JPanel();

        fortuneTA =  new JTextArea(12, 60);
        scroller = new JScrollPane(fortuneTA);

        displayPnl.add(scroller);
        mainPnl.add(displayPnl, BorderLayout.CENTER);
    }



    private void createButtonPanel() //DONE
    {
        btnPnl = new JPanel();
        btnPnl.setLayout(new GridLayout(1,2));

        quitBtn = new JButton("Quit");
        quitBtn.setFont(new Font("Monospaced", Font.PLAIN, 24));
        fortuneBtn = new JButton("Read My Fortune!");
        fortuneBtn.setFont(new Font("Monospaced", Font.PLAIN, 24));

        btnPnl.add(fortuneBtn);
        btnPnl.add(quitBtn);

        fortuneBtn.addActionListener(
                (ActionEvent ae) ->
                {//grab a random index(int) that isn't the same as the last chosen
                    do{
                        newDex = rnd.nextInt(fortunes.length);
                        //System.out.println("Your Fortune: " + newDex);

                        }while(newDex == curFortuneDex);
                    curFortuneDex = newDex;

                    fortuneTA.append(fortunes[curFortuneDex] + "\n");
                    fortuneTA.setFont(new Font("Times New Roman", Font.PLAIN, 22));

                }
                );

        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

        mainPnl.add(BorderLayout.SOUTH, btnPnl);

    }





}
