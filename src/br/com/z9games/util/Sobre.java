package br.com.z9games.util;

import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JDialog;

public class Sobre extends JDialog {

	public Sobre() {
	}

	public Sobre(Frame owner) {
		super(owner);
	}

	public Sobre(Dialog owner) {
		super(owner);
	}

	public Sobre(Window owner) {
		super(owner);
	}

	public Sobre(Frame owner, boolean modal) {
		super(owner, modal);
	}

	public Sobre(Frame owner, String title) {
		super(owner, title);
	}

	public Sobre(Dialog owner, boolean modal) {
		super(owner, modal);
	}

	public Sobre(Dialog owner, String title) {
		super(owner, title);
	}

	public Sobre(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
	}

	public Sobre(Window owner, String title) {
		super(owner, title);
	}

	public Sobre(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
	}

	public Sobre(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
	}

	public Sobre(Window owner, String title, ModalityType modalityType) {
		super(owner, title, modalityType);
	}

	public Sobre(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
	}

	public Sobre(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
	}

	public Sobre(Window owner, String title, ModalityType modalityType,
			GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
	}

}
