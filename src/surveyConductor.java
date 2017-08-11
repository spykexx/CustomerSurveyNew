import javax.swing.*;

/**
 * Created by Spykexx on 8/10/2017.
 */
class surveyConductor{
    public surveyConductor(){
        String sTitle = JOptionPane.showInputDialog("Please Enter Title"); //ask user for title
        if (!sTitle.equals("") ) { //If user enters in a custom title
            Survey gui = new Survey(sTitle); //pass in title entered
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //give JFrame parameters for closing
            gui.setSize(325, 450); //set size
            gui.setLocationRelativeTo(null); //set to center of the screen
            gui.setVisible(true); //display the JFrame
            gui.pack();
        } else  { //If no title is entered
            Survey gui = new Survey(); //create new instance with no parameters
            gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //give JFrame parameters for closing
            gui.setSize(325, 530); //set size
            gui.setLocationRelativeTo(null); //set to center of the screen
            gui.setVisible(true); //display the JFrame
            gui.pack();
        }
    }
}