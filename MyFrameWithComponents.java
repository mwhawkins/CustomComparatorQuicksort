/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CompSci;

/**
 *
 * @author Michael
 */
import javax.swing.*;

public class MyFrameWithComponents {
  public static void main(String[] args) {
    JFrame frame = new JFrame("MyFrameWithComponents");

    // Add a button into the frame
    JButton jbtOK = new JButton("OK");
    frame.add(jbtOK);

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null); // New since JDK 1.4
    frame.setSize(400, 300);
  }
}