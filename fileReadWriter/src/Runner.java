import javax.swing.*;
public class Runner {
    public static void main(String[] args) {
        //create an interface instance
        JFrame frame = new Interface();
        //set the size of the interface
        frame.setSize(1920,1080);
        //set visibility
        frame.setVisible(true);
        //end the program when exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}