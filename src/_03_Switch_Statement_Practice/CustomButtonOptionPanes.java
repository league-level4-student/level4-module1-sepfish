package _03_Switch_Statement_Practice;

import java.applet.AudioClip;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	
	public void somethingSomething() {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday": 
			try {
				URI uri = new URI("https://www.homestuck.com/story");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "Monday":
			AudioClip sound = JApplet.newAudioClip(getClass().getResource("zte.wav"));
			sound.play();
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Ew, it's Tuesday...");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "IT'S HUMP DAY!!!");
			break;
		case "Thursday": //Put something here!!!!!!
			AudioClip sound1 = JApplet.newAudioClip(getClass().getResource("vriska.wav"));
			sound1.play();
			break;
		case "Friday":
			try {
				URI uri = new URI("https://docs.google.com/document/d/e/2PACX-1vT5XdG77iUZkibeAysT3aaSrGHJxjdPyKvxIt7TX7A2H9n9Uo7FKbO9VTgiQacxa2U3_FRb7oSOXepf/pub");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "Saturday": 
			try {
				URI uri = new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Boo...");
			break;
		}
	}
	
	public static void main(String[] args) {
		new CustomButtonOptionPanes().somethingSomething();
	}
}
