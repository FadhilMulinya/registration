import javax.swing.*; // Importing Swing components for GUI creation and includes components like JPanel,JFrame,JLabel
import javax.swing.table.DefaultTableModel; // Importing DefaultTableModel for the JTable
import java.awt.*; // Importing AWT components for GUI layout and includes staff like frame,button,textarea
import java.awt.event.ActionEvent; // Importing ActionEvent for handling events
import java.awt.event.ActionListener; // Importing ActionListener for event handling

/**
 * RegistrationForm is a GUI application that allows users to enter registration details
 * and display the information in a table.
 */
public class Registration extends JFrame {

    // Declaring components used in the form
    private JTextField idField, nameField, addressField, contactField;
    private JRadioButton maleButton, femaleButton;
    private JTable table;
    private DefaultTableModel tableModel;

    /**
     * Constructor for the RegistrationForm.
     * Sets up the GUI components and layout of the registration form.
     */
    public Registration() {
        // Setting the title of the JFrame window
        setTitle("Registration Form");

        // Setting the size of the JFrame window
        setSize(600, 400);

        // Ensuring the application exits when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Using FlowLayout for arranging components sequentially
        setLayout(new FlowLayout());

        // Creating labels for form fields
        JLabel idLabel = new JLabel("ID");
        JLabel nameLabel = new JLabel("Name");
        JLabel genderLabel = new JLabel("Gender");
        JLabel addressLabel = new JLabel("Address");
        JLabel contactLabel = new JLabel("Contact");

        // Creating text fields for user input
        idField = new JTextField(15);
        nameField = new JTextField(15);
        addressField = new JTextField(15);
        contactField = new JTextField( 15);

        // Creating radio buttons for selecting gender
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        // Grouping radio buttons so only one can be selected at a time
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // Creating buttons for form actions
        JButton registerButton = new JButton("Register");
        JButton exitButton = new JButton("Exit");

        // Creating a table to display registered users
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Gender", "Address", "Contact"}, 0);
        table = new JTable(tableModel);

        // Wrapping the table in a scroll pane for better viewing
        JScrollPane tableScrollPane = new JScrollPane(table);

        // Adding components to the JFrame
        add(idLabel);
        add(idField);
        add(nameLabel);
        add(nameField);
        add(genderLabel);
        add(maleButton);
        add(femaleButton);
        add(addressLabel);
        add(addressField);
        add(contactLabel);
        add(contactField);
        add(registerButton);
        add(exitButton);
        add(tableScrollPane);

        /**
         * ActionListener for the Register button.
         * This handles the registration process, adding the input data to the table.
         */
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieving input data from text fields and radio buttons
                String id = idField.getText();
                String name = nameField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String address = addressField.getText();
                String contact = contactField.getText();

                 // Checking if compulsory fields are filled
        if (id.isEmpty() || name.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all compulsory fields.");
            return;
        }

                // Adding the retrieved data as a new row in the table
                tableModel.addRow(new Object[]{id, name, gender, address, contact});

                // Clearing the input fields after registration
                idField.setText("");
                nameField.setText("");
                addressField.setText("");
                contactField.setText("");
                genderGroup.clearSelection();
            }
        });

        /**
         * ActionListener for the Exit button.
         * This handles the exit action, closing the application when clicked.
         */
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exiting the application
            }
        });
    }

    /**
     * The main method that launches the RegistrationForm application.
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        // Using SwingUtilities.invokeLater to ensure the GUI is created on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Creating an instance of RegistrationForm and making it visible by saying true
                new Registration().setVisible(true);
            }
        });
    }
}
