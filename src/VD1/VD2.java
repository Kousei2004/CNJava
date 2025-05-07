package VD1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;  // Import thư viện JOptionPane

public class VD2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VD2 frame = new VD2();
                    frame.setVisible(true); 
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public VD2() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  
        setBounds(100, 100, 300, 200);
        setSize(300, 200);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));  
        setContentPane(contentPane);
        
        JButton btnNewButton = new JButton("EXIT");
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\GTwb_Y3XwAEJlWO (1).jpg"));
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

 
        btnNewButton.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(
                this, 
                "Bạn có chắc chắn muốn thoát?", 
                "Xác nhận thoát", 
                JOptionPane.YES_NO_OPTION
            );
            
         
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);  
            }
        });

     
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(97)
        			.addComponent(btnNewButton)
        			.addContainerGap(124, Short.MAX_VALUE))
        );
        gl_contentPane.setVerticalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addGap(65)
        			.addComponent(btnNewButton)
        			.addContainerGap(67, Short.MAX_VALUE))
        );
        contentPane.setLayout(gl_contentPane);
    }
}
