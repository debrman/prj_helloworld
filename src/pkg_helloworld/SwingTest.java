package pkg_helloworld;
//1111
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
///////////////////////////
public class SwingTest extends JFrame {
        private JLabel label0 = new JLabel("!!!!!!!!!!");    
	private JButton button = new JButton("Press");
	private JTextField input = new JTextField("", 5);
	private JLabel label = new JLabel("Input:");
	private JRadioButton radio1 = new JRadioButton("Select this");
	private JRadioButton radio2 = new JRadioButton("Select that");
	private JCheckBox check = new JCheckBox("Check", false);
	
	public SwingTest() {
	    super("Simple Example");
	    this.setBounds(500,500,700,300);
            this.setResizable(true);
            this.setTitle("Ooooooooooooooo");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //--------------------
	    Container container0 = this.getContentPane();
            container0.setLayout(new GridLayout(1,1));
            container0.add(label0);
            //--------------------
            
            Container container = this.getContentPane();
	    container.setLayout(new GridLayout(3,2,2,2));            
            container.add(label);
	    container.add(input);

	    ButtonGroup group = new ButtonGroup();
	    group.add(radio1);
	    group.add(radio2);
	    container.add(radio1);

	    radio1.setSelected(true);
	    container.add(radio2);
	    container.add(check);
	    button.addActionListener(new ButtonEventListener());
	    container.add(button);
	}
	
	class ButtonEventListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String message = "";
			message += "Button was pressed\n";
			message += "Text is " + input.getText() + "\n";
			message += (radio1.isSelected()?"Radio #1":"Radio #2") 
                                + " is selected\n"; 
			message += "CheckBox is " + ((check.isSelected())
                                ?"checked":"unchecked"); 
			JOptionPane.showMessageDialog(null,
		    		message,
		    		"Output",
		    	    JOptionPane.PLAIN_MESSAGE);
                        
                        System.out.println("<100:END>");
                        dispose(); // выход
		}
	}

	public static void main(int args) {
		SwingTest app = new SwingTest();
		app.setVisible(true);
                app.label0.setText("Параметр из БД = "+Integer.toString(args)); //вывожу полученный параметр на форму
	}
}