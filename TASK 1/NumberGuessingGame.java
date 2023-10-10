import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessingGame {
    private JButton guessButton;
    private JTextField textField1;
    private JTextField MyNumber;
    private JTextField ComputerNumber;
    private JPanel mypanel;
    private JTextField textField3;

    public NumberGuessingGame() {


        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int myno = Integer.parseInt(MyNumber.getText());
                int no2 = (int) (Math.random() * 100);

                if (myno == no2) {
                    textField1.setText("You guessed the correct number");
                } else if (myno + 1 == no2 || myno - 2 == no2) {
                    textField1.setText("You are too close");
                } else {
                    textField1.setText("You guessed wrong number... Try Again");

                }
                ComputerNumber.setText(Integer.toString(no2));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new NumberGuessingGame().mypanel);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
