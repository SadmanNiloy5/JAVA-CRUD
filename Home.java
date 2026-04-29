import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Home extends JFrame {

    private Container c;
    @SuppressWarnings("unused")
    private ImageIcon icon, logo, hlogo,img1;
    @SuppressWarnings("unused")
    private JLabel label1, imgLabel,imgLabel2;
    private Font f1, f2, f3;
    private JButton btn1, btn3, btn4, btn5, btn6, nBtn;
    private Cursor cursor;

	

    Home() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SADMAN CINEPLEX");
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		
       
		 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        img1 = new ImageIcon("D:/niloybhai/Movie/images/movie2.jpg");
		imgLabel2 = new JLabel(img1);
		imgLabel2.setBounds(650, 100,400,320);
		c.add(imgLabel2);
		

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 20);
        f2 = new Font("Segoe UI", Font.BOLD, 15);
		f3 = new Font("Segoe UI", Font.BOLD, 31);

        // Title
        label1 = new JLabel();
        label1.setText("RESPECT T YOUR ELDERS");
        label1.setBounds(140, 130, 700, 90);
        label1.setFont(f3);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("WELCOME!!");
        label1.setBounds(140, 200, 600, 80);
        label1.setFont(f1);
        c.add(label1);
		
		
		label1 = new JLabel();
        label1.setText("WELCOME TO SADMAN CINEPLEX!");
        label1.setBounds(140, 300, 600, 70);
        label1.setFont(f1);
        c.add(label1);
		
		
		
		

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // JButtons
      

        btn1 = new JButton("ABOUT US");
        btn1.setBounds(250, 10, 150, 30);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn3 = new JButton("SIGN UP");
        btn3.setBounds(1000, 10, 130, 30);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00000"));
        c.add(btn3);
		
		
		
	    btn4 = new JButton("Admin Login");
        btn4.setBounds(710, 10, 130, 30);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#C00000"));
        c.add(btn4);
		
		btn5 = new JButton("LOG IN");
        btn5.setBounds(860, 10, 130, 30);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        c.add(btn5);
		
		
		btn6 = new JButton("ENTER");
        btn6.setBounds(140, 450, 230, 50);
        btn6.setFont(f2);
        btn6.setCursor(cursor);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00000"));
        c.add(btn6);
		
		
		
		
		
		
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        // Login/Home
		
        /*btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration tr = new Registration();
                tr.setVisible(true);
            }
        });
		*/
		

        // Register / About Us
		
       /* btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                AboutUs us = new AboutUs();
                us.setVisible(true);
                setVisible(false);
            }
        });
		*/

         /*   btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                    homepage hp = new homepage();
					hp.setVisible(true);
					setVisible(false);
            }
        });*/
		
      btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration tr = new Registration();
                tr.setVisible(true);
            }
        });
		
		
		   /*   btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Perth tr = new Perth();
                tr.setVisible(true);
            }
        });*/
		
// Lets Travel button 

       /* btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                    homepage hp = new homepage();
					hp.setVisible(true);
					setVisible(false);
            }
        });*/
		
		//Log In
		btn5.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {

                Login us = new Login();
                us.setVisible(true);
                setVisible(false);
            }
        });
		
		//AdminLogin
		
				btn4.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent ae) {

                AdminLogin us = new AdminLogin();
                us.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

        Home frame = new Home();
        frame.setVisible(true);
    }
}
