import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Profile extends JFrame {

    private Container c;
    @SuppressWarnings("unused")
    private ImageIcon icon, logo, welcome;
    private JLabel imgLabel;
    private Font f1;
    private JButton btn1, btn2, nBtn;
    private Cursor cursor;

    Profile() {
    
         this.setTitle("SADMAN CINEPLEX");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#AFF2DD"));


        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

    
       logo = new ImageIcon(getClass().getResource("/images/C.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(20, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
        

        f1 = new Font("Segoe UI Black", Font.BOLD, 25);


        cursor = new Cursor(Cursor.HAND_CURSOR);


        btn1 = new JButton("OK");
        btn1.setBounds(190, 480, 100, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);
		
		
		btn2 = new JButton("Click Here To log in");
        btn2.setBounds(750, 300, 300, 50);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#C00000"));
        c.add(btn2);
		
		
		
		

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);


        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home bc = new Home();
                bc.setVisible(true);
            }
        });
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Login bc = new Login();
                bc.setVisible(true);
            }
        });
		
		
    }

    public static void main(String[] args) {

        Profile p = new Profile();
        p.setVisible(true);
    }
}
