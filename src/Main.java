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
        JRadioButton femaleButton = new JRadioButton("FEMALE"); //creating a radio button for the male gender
        JRadioButton maleButton = new JRadioButton("MALE"); //creatinga radio buton for the female gender
        ButtonGroup genderGroup = new ButtonGroup(); //creating a button group to group the radiobuttons
        genderGroup.add(maleButton); //adding the male radio buttons to the group
        genderGroup.add(femaleButton); //adding the female radio buttons to the group
        genderPanel.add(maleButton); //adding the male radio button to the group
        genderPanel.add(femaleButton); //adding of the femal radio button to th e group
        frame.add(genderLabel); //adding of the gender label to the frame
        frame.add(genderPanel); //adding of the gener panel to the group

        //Adding of the DOB Label and the combo boxes
        JLabel ageLabel = new JLabel("D.O.B"); //creating a label for the DOB fields
        JPanel agePanel = new JPanel(new FlowLayout());  //creating a panel with the flowlayout that will hold combo boxes
        //we will create arrays for days months and years
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] year = {"1985","1986","1987","1988","1989","1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006","2007"};
        JComboBox<String> dayCombo = new JComboBox<>(day); //creating a combo box for the days
        JComboBox<String> monthCombo = new JComboBox<>(month); //creating a combo box for the months
        JComboBox<String> yearCombo = new JComboBox<>(year); //creating a combo box for the year
        agePanel.add(dayCombo); //adding the day combo box to the panel
        agePanel.add(monthCombo); //adding the month combo box t the panel
        agePanel.add(yearCombo); //adding the year combo box to the pannel
        frame.add(ageLabel); //adding the age/dob label to thr frame with the combo boxes
        frame.add(agePanel); //adding the panel  to the frame with the combo boxes

        //Adding the address lable and text area

        JLabel addressLabel = new JLabel("Address"); //creating a label for the address field
        JTextArea addressArea = new JTextArea(); //creating a text area for user to input their address
        addressArea.setRows(4); //setting the number of rows here 
        frame.add(addressLabel); //adding the address label to the frame
        frame.add(addressArea); //adding the text area to the frame

        //Terms and conditions check box
        JCheckBox termsCheck = new JCheckBox("Accept Terms and Conditions. "); //we have created a checkbox with the terms and conditions
        frame.add(termsCheck); //Adding of the checkbox to the frame
        frame.add(new JLabel("")); //Adding of an empty label to have proper spacing and alignmemt

        //SUbmit and the Reset Buttons Implementations
        JPanel buttonPanel = new JPanel (new FlowLayout()); //CREATING A NEW FLOWLAYOUT BUTTON TO HOLD THE SUBMIT AND RESET BUTTONS
        JButton submitButton = new JButton("Submit"); //now we create a submit button
        JButton resetButton = new JButton("Reset"); //now we create a rest button
        buttonPanel.add(submitButton); //we will add the submit button to the panel
        buttonPanel.add(resetButton); //we will add the reset button to the panel
        frame.add(buttonPanel); //we will then add the whole panel to the frame 

        //To create some alignment we will ad an aempty label 
        frame.add(new JLabel(""));

        //To wind up we will set the whole frame visibility to true so as it can apear on the screen
        frame.setVisible(true);
        
    }
}