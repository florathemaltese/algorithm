import javax.swing.*;
import java.awt.*;

public class Interface extends JFrame {

    //use JFrame to create the interface
    JLabel readLabel = new JLabel("Input file name");
    static JTextField readFileName = new JTextField(200);
    JButton readButton = new JButton("Read from the file");
    static JTextArea readFileArea = new JTextArea();
    JLabel writeLabel = new JLabel("Please enter output file name");
    static JTextField writeFileName = new JTextField(200);
    JButton writeButton = new JButton("Write from the file");
    static JTextArea writeFileArea = new JTextArea();


    public Interface(){
        //give the interface a title
        this.setTitle("Data Processing");
        //add the panel and remove the layout
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        panel.setLayout(null);

        //set font and size of text
        Font myFont = new Font(Font.SANS_SERIF,  Font.BOLD, 24);
        //set the position
        panel.add(readLabel);
        readLabel.setBounds(100,100,400,40);
        readLabel.setFont(myFont);
        panel.add(readFileName);
        readFileName.setBounds(100,200,300,40);
        readFileName.setFont(myFont);
        readFileName.setText("annual.csv");
        panel.add(readButton);
        readButton.setBounds(100,300,300,40);
        readButton.setFont(myFont);
        panel.add(readFileArea);
        readFileArea.setBounds(100,360,600,250);
        readFileArea.setFont(myFont);
        panel.add(writeLabel);
        writeLabel.setBounds(800,100,400,40);
        writeLabel.setFont(myFont);
        panel.add(writeFileName);
        writeFileName.setBounds(800,200,300,40);
        writeFileName.setFont(myFont);
        panel.add(writeButton);
        writeButton.setBounds(800,300,300,40);
        writeButton.setFont(myFont);
        panel.add(writeFileArea);
        writeFileArea.setBounds(800,360,600,250);
        writeFileArea.setFont(myFont);

        //give writeFileArea a line wrap
        writeFileArea.setLineWrap(true);

        //create a new FileReadWriter instance
        FileReadWriter fileReadWriter = new FileReadWriter();

        //add action listener for interaction of the 2 buttons using Lambda
        readButton.addActionListener(e -> {
            readFileArea.setText(fileReadWriter.readFile("annual.csv"));
        });
        writeButton.addActionListener(e -> {
            writeFileArea.setText(fileReadWriter.writeFile(writeFileName.getText()));
        });
    }
}
