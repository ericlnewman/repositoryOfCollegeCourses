import java.awt.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import java.time.*;

public class AgeCalculatorGUI extends JFrame implements ActionListener {

    private JLabel birthYearLabel;     // Label for birth year
    private JLabel ageLabel;            // Label for age
    private JTextField birthYearField;  // Displays birth year 
    private JTextField ageField;        // Displays age
    private JButton ageSolveButton;   // Calculates age with button

    /* Constructor creates GUI components and adds GUI components
        using a GridBagLayout. */
        AgeCalculatorGUI() {
        // Used to specify GUI component layout
        GridBagConstraints layoutComponents = null;

        // Set frame's title
        setTitle("Age Calculator");

        // Set birth year and age labels
        birthYearLabel = new JLabel("Birth year:");
        ageLabel = new JLabel("Your age in years:");

        birthYearField = new JTextField(15);
        birthYearField.setEditable(true);
        birthYearField.setText("0");

        ageField = new JTextField(15);
        ageField.setEditable(false);

        // Create button to calculate age
        ageSolveButton = new JButton("Calculate Age");
        
        // Use the action listener and this to handle button presses
        ageSolveButton.addActionListener(this);

        // Use a GridBagLayout
        setLayout(new GridBagLayout());
        layoutComponents = new GridBagConstraints();

        // Specify component's grid location
        layoutComponents.gridx = 0;
        layoutComponents.gridy = 0;
        
        // make a standard set of 10 pixels padding
        layoutComponents.insets = new Insets(10, 10, 10, 10);
        
        add(birthYearLabel, layoutComponents);       // Add components in top left of layout
        
        layoutComponents.gridx = 1;
        layoutComponents.gridy = 0;
        layoutComponents.insets = new Insets(10, 10, 10, 10);
        add(birthYearField, layoutComponents);            // Add components in top right of layout
       
        layoutComponents.gridx = 0;
        layoutComponents.gridy = 1;
        layoutComponents.insets = new Insets(10, 10, 10, 10);
        
        add(ageLabel, layoutComponents);            // Add components in middle left of layout

        layoutComponents.gridx = 1;
        layoutComponents.gridy = 1;
        layoutComponents.insets = new Insets(10, 10, 10, 10);

        add(ageField, layoutComponents);       // Add components in middle right of layout

        layoutComponents.gridx = 0;
        layoutComponents.gridy = 2;
        layoutComponents.insets = new Insets(10, 10, 10, 10);
        add(ageSolveButton, layoutComponents);          // Add button to left of layout

        layoutComponents.insets = new Insets(10, 0, 1, 10);
        layoutComponents.gridx = 1;
        layoutComponents.gridy = 2;
        add(JOptionPane, layoutConst);
    }

   /* Method is automatically called when an event 
      occurs (e.g, button is pressed) */
   @Override
   public void actionPerformed(ActionEvent event) {
        String input = birthYearField.getText(); // user's input for birth year
        int birth = Integer.parseInt(input); // change string to int
            
            if (birth > 0) { // Check if input input is positive
                int year = Year.now().getValue();
                int age = year - birth;
                ageField.setText(Integer.toString(age)); // Convert from an integer to String
            }
            else {
                // Show failure dialog
                JOptionPane.showMessageDialog(this, "Enter a positive value!");
            }

   }

   /* Creates a Frame and makes it visible */
   public static void main(String[] args) {
      // Creates LabelFrame and its components
      AgeCalculatorGUI calcFrame = new AgeCalculatorGUI();

      calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      calcFrame.pack();
      calcFrame.setVisible(true);
   }
}

