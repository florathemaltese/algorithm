import javax.swing.*;

public class WeightedGradesRunner {
    public static void main(String[] args) {
        //Create a new interface window
        JFrame frame = new Interface();

        //set the size of the window
        frame.setSize(1920,1080);

        //set the visibility of the window
        frame.setVisible(true);

        //end the program when the users exit the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}