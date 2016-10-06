package lpsolve;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lpsolveAction implements ActionListener {

	  private String in;
	  private String out;

	  public lpsolveAction(String in, String out) {
	    this.in = in;
	    this.out = out;
	  }

	  public void actionPerformed(ActionEvent ae) {

		  out = in.toUpperCase();

	  }

	}