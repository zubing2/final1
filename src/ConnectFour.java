import javax.swing.*;

public class ConnectFour extends JFrame{
    private JPanel mainPanel;
    private JButton column1;
    private JButton column2;
    private JButton column3;
    private JButton column4;
    private JButton column6;
    private JButton column5;
    private JButton column7;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JTextArea textArea4;
    private JTextArea textArea5;
    private JTextArea textArea6;
    private JTextArea textArea7;
    private JTextArea textArea8;
    private JTextArea textArea9;
    private JTextArea textArea10;
    private JTextArea textArea11;
    private JTextArea textArea12;
    private JTextArea textArea13;
    private JTextArea textArea14;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;

    public void mainGUIWindow() {
        createUIComponents();
    }
    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Connect Four");
        setSize(1250, 500);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);




    }


}
