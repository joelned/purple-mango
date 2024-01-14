import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;
public class LoginPage implements ActionListener {
    JFrame LoginPageFrame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField PasswordField = new JPasswordField();
    JLabel Message = new JLabel("WELCOME TO PURPLE MANGO");
    JLabel userIDLabel = new JLabel();
    JLabel userPasswordLabel = new JLabel("Password");

    JLabel Message2 = new JLabel("Owned and Founded by Embiid");
    JLabel Message3 = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> LoginInfo2){
        loginInfo = LoginInfo2;

        LoginPageFrame.getContentPane().setBackground(new Color(128,0,128));

        Message.setBounds(40,0,400,50);
        Message.setForeground(Color.white);
        Message.setFont(new Font("Playfair Display",Font.BOLD,25));

        userIDLabel.setBounds(50,150,75,25);
        userIDLabel.setVisible(true);
        userIDLabel.setForeground(Color.white);
        userIDLabel.setFocusable(false);
        userIDLabel.setText("User ID: ");

        userIDField.setBounds(125,150,200,25);
        PasswordField.setBounds(125,200,200,25);

        userPasswordLabel.setBounds(50,100,75,25);
        userPasswordLabel.setVisible(true);
        userPasswordLabel.setForeground(Color.white);
        userPasswordLabel.setFocusable(false);
        userPasswordLabel.setText("Password: ");


        LoginPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginPageFrame.setResizable(false);
        LoginPageFrame.setSize(475,550);
        LoginPageFrame.setVisible(true);
        LoginPageFrame.add(userIDLabel);
        LoginPageFrame.add(userPasswordLabel);
        LoginPageFrame.add(loginButton);
        LoginPageFrame.add(resetButton);
        LoginPageFrame.add(userIDField);
        LoginPageFrame.add(PasswordField);
        LoginPageFrame.add(Message);
        LoginPageFrame.add(Message2);
        LoginPageFrame.add(Message3);
        //LoginPageFrame.add(userIDLabel);
        LoginPageFrame.setLayout(null);

        loginButton.setBounds(125,250,100,25);
        loginButton.addActionListener(this);

        resetButton.setBounds(230,250,100,25);
        resetButton.addActionListener(this);

        Message2.setBounds(50,457,390,25);
        Message2.setFont(new Font ("Italics",Font.ITALIC, 16));
        Message2.setForeground(Color.white);
        Message2.setFocusable(false);

        Message3.setBounds(120,350,300,25);
        Message3.setFont(new Font ("Playfair Display",Font.BOLD, 16));
        Message3.setForeground(new Color(128,0,128));
        Message3.setFocusable(false);





        userPasswordLabel.setBounds(50,200,75,25);
        userPasswordLabel.setVisible(true);



/*
        loginButton.setSize("")
        loginButton.setFont(new Font("Playfair Display", Font.BOLD, 14));
        loginButton.setEnabled(true);
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.black);
*/

    }
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == resetButton){
        userIDField.setText("");
        PasswordField.setText("");
    }
    if(e.getSource() == loginButton){
        String userID = userIDField.getText();
        String password = String.valueOf(PasswordField.getPassword());
        if(loginInfo.containsKey(userID)){
            if(loginInfo.get(userID).equals(password));
            Message3.setForeground(Color.green);
            Message3.setText("Login Successful" + " " + userIDField.getText());

        }
        else{
            Message3.setForeground(Color.red);
            Message3.setText("Wrong Password");
        }

    }
    }
}