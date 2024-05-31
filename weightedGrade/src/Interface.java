import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame{
    //create prompts and input boxes
    JLabel pointTotalPrompt = new JLabel("Total points:");
    JTextField pointTotalKey = new JTextField(20);
    JLabel earnedPointsPrompt = new JLabel("Earned points:");
    JTextField earnedPointsKey = new JTextField(20);
    JLabel assignmentPercentagePrompt = new JLabel("Percentage of this assignment:");
    JTextField assignmentPercentageKey = new JTextField(20);
    JLabel totalWeightedGradePrompt = new JLabel("Weighted grade:");
    JLabel totalWeightedGradeKey = new JLabel("0.0");

    public Interface(){
        //set the title of the window
        this.setTitle("Weighted Grade");
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        panel.setLayout(null);

        //set font of the text
        Font myFont = new Font(Font.SANS_SERIF,  Font.BOLD, 24);

        //add prompts and input space to the panel
        panel.add(pointTotalPrompt);
        pointTotalPrompt.setBounds(400,260,400,40);
        pointTotalPrompt.setFont(myFont);

        panel.add(pointTotalKey);
        pointTotalKey.setBounds(800,260,300,40);
        pointTotalKey.setFont(myFont);

        panel.add(earnedPointsPrompt);
        earnedPointsPrompt.setBounds(400,310,400,40);
        earnedPointsPrompt.setFont(myFont);

        panel.add(earnedPointsKey);
        earnedPointsKey.setBounds(800,310,300,40);
        earnedPointsKey.setFont(myFont);

        panel.add(assignmentPercentagePrompt);
        assignmentPercentagePrompt.setBounds(400,360,400,40);
        assignmentPercentagePrompt.setFont(myFont);

        panel.add(assignmentPercentageKey);
        assignmentPercentageKey.setBounds(800,360,300,40);
        assignmentPercentageKey.setFont(myFont);

        //Add a button to trigger calculation
        JButton calculate = new JButton("Click here to calculate");
        calculate.setBounds(800,420,300,40);
        calculate.setFont(myFont);
        panel.add(calculate);

        //create a click-on function and run pressButton method
        calculate.addActionListener((e)->{
            pressButton();
        });

        //create prompt and output; set bounds and font
        panel.add(totalWeightedGradePrompt);
        totalWeightedGradePrompt.setBounds(400,470,300,40);
        totalWeightedGradePrompt.setFont(myFont);
        panel.add(totalWeightedGradeKey);
        totalWeightedGradeKey.setBounds(800,470,300,40);
        totalWeightedGradeKey.setFont(myFont);
    }
    public void pressButton(){
        WeightedGrades weightedGrades = new WeightedGrades();
        //get the value from user's input
        weightedGrades.setPointTotal(Double.parseDouble(pointTotalKey.getText()));
        weightedGrades.setEarnedPoints(Double.parseDouble(earnedPointsKey.getText()));
        weightedGrades.setAssignmentPercentage(Double.parseDouble(assignmentPercentageKey.getText()));
        //calculate the result
        weightedGrades.calculateWeightedGrades();
        //print out the result
        totalWeightedGradeKey.setText(String.valueOf(weightedGrades.getTotalWeightedGrade()));
    }
}