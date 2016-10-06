// A GUI for Linear Programming Solver
// by Baihan Lin
// DoerLBH@gmail.com, University of Washington
// October 2016

package lpsolve;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lpsolve extends Applet {

	private TextArea input;
	private TextArea output;
	
//	private JTextArea input;
//	private JTextArea output;
//	private String in;
//	private String out;
//	private TextField temp;

	public void init () {

		// Construct the TextFields
//		this.input = new JTextArea(10, 40);
//		this.output = new JTextArea(10, 40);

		this.input = new TextArea(10, 40);
		this.output = new TextArea(10, 40);

		
		this.output.setEditable(false);
		Button b = new Button("Let's solve LP!!");

		// add the button to the layout
		this.add(input);
		this.add(b);
		this.add(output);

		// specify that action events sent by the
		// button or the input TextField should be handled 
		// by the same CapitalizerAction object

//		this.in = input.getText();
//		this.out = output.getText();
//		this.temp = new TextField(1000);
//		this.temp.setText(in);
		
//		lpsolveAction lp = new lpsolveAction(in, out);
//		b.addActionListener(lp);
//		this.temp.addActionListener(lp);
//		
//	    this.output.setText(out);

		lpsolveAction lp = new lpsolveAction(input, output);
	     b.addActionListener(lp);
//	     this.input.addActionListener(lp);

		
		// notice that ActionEvents produced by output are ignored.

	}
}