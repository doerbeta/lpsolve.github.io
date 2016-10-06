// A GUI for Linear Programming Solver
// by Baihan Lin
// DoerLBH@gmail.com, University of Washington
// October 2016


import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;

public class lpsolveAction implements ActionListener {

	//	private String in;
	//	private String out;
	private TextArea in;
	private TextArea out;


	//	public lpsolveAction(String in, String out) {
	public lpsolveAction(TextArea in, TextArea out) {

		this.in = in;
		this.out = out;
	}

	public void actionPerformed(ActionEvent ae) {

		//		out = in.toUpperCase();

		String s = in.getText();
		out.setText(s.toUpperCase());

	}

}