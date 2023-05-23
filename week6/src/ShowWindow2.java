import javax.swing. *;
import java.awt.*;


public class ShowWindow2 {

    public static void main(String[]args) {

        JLabel messageLabel;
        JLabel messageLabel2;
        JTextField labelTextField;
        JTextField labelTextField2;


        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 500;



        JFrame window = new JFrame();



        window.setTitle("My Simple Window");

        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.getContentPane().setBackground(Color.red);

        window.setLocationRelativeTo(null);

        window.setVisible(true);
        window.setLayout(null);

        messageLabel = new JLabel("This is my first big label!!!");
        messageLabel.setFont(new Font("Plain",Font.BOLD, 16));
        messageLabel.setBounds(1,5,200,30);

        labelTextField = new JTextField(10);
        labelTextField.setBounds(1,30,200,30);

        messageLabel2 = new JLabel("This is my second big label!!!");
        messageLabel2.setFont(new Font("Plain",Font.PLAIN, 14));
        messageLabel2.setBounds(1,60,200,30);

        labelTextField2 = new JTextField(10);
        labelTextField2.setBounds(1,90,200,25);

        window.add(messageLabel);

        window.add(labelTextField);

        window.add(messageLabel2);

        window.add(labelTextField2);









    }
}