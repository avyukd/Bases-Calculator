
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ProjectGUI1 extends JFrame{

	private JFrame window;
	
	private JPanel panel;
	
	private JRadioButton dec;
	private JRadioButton hex;
	private JRadioButton bin;
	private JRadioButton oct;
	
	private JButton todec;
	private JButton tohex;
	private JButton tobin;
	private JButton tooct;
	
	
	private JLabel label;
	
	private JTextField input;
	
	public ProjectGUI1(){
		
		window = new JFrame();
		window.setTitle("Convertor");
		window.setSize(300,250);
		panel = new JPanel();
		panel.setLayout(null);
		
		
		dec = new JRadioButton("dec",true);
		hex = new JRadioButton("hex");
		oct = new JRadioButton("oct");
		bin = new JRadioButton("bin");
		
		todec = new JButton("dec");
		tohex = new JButton("hex");
		tooct = new JButton("oct");
		tobin = new JButton("bin");
	
		input = new JTextField();
		
		label = new JLabel("Enter Number", JLabel.CENTER);
		ButtonGroup group = new ButtonGroup();
		dec.setBounds(10, 10, 65, 25);
		bin.setBounds(85, 10, 65, 25);
		hex.setBounds(160, 10, 65, 25);
		oct.setBounds(235, 10, 65, 25);
		
		group.add(dec);
		group.add(bin);
		group.add(hex);
		group.add(oct);
		
		panel.add(dec);
		panel.add(bin);
		panel.add(hex);
		panel.add(oct);
		
		todec.setBounds(15, 100, 60, 25);
		tobin.setBounds(80, 100, 60, 25);
		tohex.setBounds(145, 100, 60, 25);
		tooct.setBounds(210, 100, 60, 25);
		
		input.setBounds(40,50,200,35);
		
		panel.add(input);
		
		panel.add(todec);
		panel.add(tobin);
		panel.add(tohex);
		panel.add(tooct);
		
		label.setBounds(25, 150, 250, 25);
		panel.add(label);
		
		window.add(panel);
		
		window.setVisible(true);
		setDecCallback();
		setBinCallback();
		setHexCallback();
		setOctCallback();
	
	}

	public void setDecCallback(){
		todec.addActionListener(new ActionListener(){

			@Override
			// bin to dec
			public void actionPerformed(ActionEvent arg0) {
				if(bin.isSelected()){
					
					String result= "" + Integer.parseInt(input.getText(),2);
					label.setText(result);
				}
				else if(dec.isSelected()){
					label.setText(input.getText());				
				}
				else if(hex.isSelected()){
					String result= "" + Integer.parseInt(input.getText(),16);
					label.setText(result);
					
				}
				else if(oct.isSelected()){
					String result= "" + Integer.parseInt(input.getText(),8);
					label.setText(result);
				}
				else{
					return;
				}
			}
		});		
	}
	public void setBinCallback(){
		tobin.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				if(bin.isSelected()){
					label.setText(input.getText());	
					
				}
				else if(dec.isSelected()){
					int x = Integer.parseInt(input.getText());
					String l = Integer.toString(x,2);
					label.setText(l);
				}
				else if(hex.isSelected()){
					int x = Integer.parseInt(input.getText(),16);
					String l = Integer.toString(x,2);
					label.setText(l);
					
				}
				else if(oct.isSelected()){
					int x = Integer.parseInt(input.getText(),8);
					String l = Integer.toString(x,2);
					label.setText(l);
				}
				else{
					return;
				}
						
			}
		});
	}
	public void setHexCallback(){
		tohex.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(bin.isSelected()){
					int x = Integer.parseInt(input.getText(),2);
					String l = Integer.toString(x,16);
					label.setText(l);
					
				}
				else if(dec.isSelected()){
					int x = Integer.parseInt(input.getText());
					String l = Integer.toString(x,16);
					label.setText(l);
				}
				else if(hex.isSelected()){
					label.setText(input.getText());	
				}
				else if(oct.isSelected()){
					int x = Integer.parseInt(input.getText(),8);
					String l = Integer.toString(x,16);
					label.setText(l);
				}
				else{
					return;
				}
			}
		});		
	}
	public void setOctCallback(){
		tooct.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(bin.isSelected()){
					int x = Integer.parseInt(input.getText(),2);
					String l = Integer.toString(x,8);
					label.setText(l);
					
				}
				else if(dec.isSelected()){
					int x = Integer.parseInt(input.getText());
					String l = Integer.toString(x,8);
					label.setText(l);
				}
				else if(hex.isSelected()){
					int x = Integer.parseInt(input.getText(),16);
					String l = Integer.toString(x,8);
					label.setText(l);
				}
				else if(oct.isSelected()){
					
					label.setText(input.getText());	
				}
				else{
					return;
				}
			}
		});		
	}
	
	public static void main(String[] args){
		ProjectGUI1 p = new ProjectGUI1();
		System.out.println("hi");
	}
	
}
