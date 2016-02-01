package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class FrameSystem_view extends Frame implements ActionListener,WindowListener
{

private TextField text1 = new TextField("", 10);

private TextField text2 = new TextField("", 10);

private Button button1 = new Button("‘«‚µŽZ");

private TextField text3 = new TextField("",10);
private TextField text4 = new TextField("", 10);

private TextField text5 = new TextField("", 10);

private Button button2 = new Button("ˆø‚«ŽZ");

private TextField text6 = new TextField("",10);

    public FrameSystem_view(){
    	addWindowListener(this);

         setTitle("Masaya System");

setLayout((LayoutManager) new FlowLayout(FlowLayout.CENTER));

add(text1);
add(new Label("+"));
    add(text2);

    add(button1);
    button1.addActionListener(this);
    add(new Label("“š‚¦"));
  add(text3);
  add(text4);
  add(new Label("-"));
      add(text5);

      add(button2);
      button2.addActionListener(this);
      add(new Label("“š‚¦"));
    add(text6);

    }	
    
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
         System.exit(0);		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

int val1 = Integer.parseInt(text1.getText());

int val2 = Integer.parseInt(text2.getText());

//text3.setText(String.valueOf(val1 + val2));

Calculation_lib clib = new Calculation_lib(val1, val2);

text3.setText(String.valueOf(clib.getPlus()));


		int val3 = Integer.parseInt(text4.getText());

		int val4 = Integer.parseInt(text5.getText());
		Calculation_lib blib = new Calculation_lib(val3, val4);

		text6.setText(String.valueOf(blib.getMinus()));

	}
}