//we will import swing components for GUI they are like JFrame,JPanel,JButtons,JTextField built on to of AWT
import javax.swing.*;
//importing awt components for the management of layout they include stafff like frame,grid,oanel,textfield etc.
import java.awt.*;

//initialize with the class 
public class Main{
    public static void main(){
        //we will start with creating the main frame window with title 
        JFrame frame = new JFrame("Registration form");
        
        //set the size of the frame wemuse 550 * 550
        frame.setSize(550,550);
        
        //Ensure that the program exists when the window closes 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //we will set the layout for it to gridlayout with 7 rows and 2 columns
        frame.setLayout(new GridLayout(7, 2));
        
        //wwe implement the NAME,LABEL AND TEXT FIELD AREAS ON our frame
        
        //Creating a label for the name field  
        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField(); //creating a text field for user to input their name
        frame.add(nameLabel); //we are adding the labelto the frame
        frame.add(nameField); //we are adding the  field to the frame
        
        //Creating a label for the mobile field
        JLabel mobileLabel = new JLabel("Mobile ");
        JTextField mobileField = new JTextField(); //creating a text field for user to input their number
        frame.add(mobileLabel); //we are adding the labelto the frame
        frame.add(mobileField); //we are adding the  field to the frame
        
        //Creating a label for gender are with radion JButtons
        JLabel genderLabel = new JLabel("Gender"); //we will create the gender label
        JPanel genderPanel = new JPanel (new FlowLayout()); //thid panel will create a flowlayout to hold radio buttons
        JRadioButton maleButton = new JRadioButton("MALE"); //creating a radio button for the male gender
        JRadioButton femaleButton = new JRadioButton("Female"); //creatinga radio buton for the female gender
        ButtonGroup genderGroup = new ButtonGroup(); //creating a button group to group the radiobuttons
        genderGroup.add(maleButton); //adding the male radio buttons to the group
        genderGroup.add(femaleButton); //adding the female radio buttons to the group
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        frame.add(genderLabel);
        frame.add(genderPanel);
        

        
        
        
    }
}