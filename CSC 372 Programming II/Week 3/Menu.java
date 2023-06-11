import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.util.Random;

public class Menu extends JFrame implements ActionListener{

    // declarations
    JMenuItem menuDateAndTime, menuPrint, menuChangeColor, menuExit;
    JMenuBar menuBar;
    JTextField field;
    JMenu menu;
    JFrame frame;

    public Menu(){

        // create frame
            frame = new JFrame();
            frame.setLayout(null);

            // create menu bar
            menuBar = new JMenuBar();
            field = new JTextField();
            menu = new JMenu("Options");

            // create items for menu bar
            menuDateAndTime = new JMenuItem("Date and Time");
            menuPrint = new JMenuItem("Print File");
            menuChangeColor = new JMenuItem("Change Frame Color");
            menuExit = new JMenuItem("Exit");

            // add menu items to menu
            menu.add(menuDateAndTime);
            menu.add(menuPrint);
            menu.add(menuChangeColor);
            menu.add(menuExit);

            // add menu to bar
            menuBar.add(menu);
            frame.setJMenuBar(menuBar);

            // add the actions to each item
            menuDateAndTime.addActionListener(this);
            menuPrint.addActionListener(this);
            menuChangeColor.addActionListener(this);
            menuExit.addActionListener(this);

            // create a field and frame
            field.setBounds(150,50,150,30);
            frame.add(field);
            frame.setVisible(true);
            frame.setSize(500,350);

    }
        @Override
        public void actionPerformed(ActionEvent event){
            if(event.getSource() == menuDateAndTime) {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss");
            LocalDateTime current = LocalDateTime.now();
            field.setText(date.format(current)+"");
            }

                if(event.getSource() == menuPrint){
                String log = field.getText(); try {
                FileWriter fileWrite = new FileWriter("log.txt");
                fileWrite.write(log);
                fileWrite.close();
            } catch(Exception ex){
                field.setText("Exception is "+ex);
                }
        }

            if(event.getSource() == menuChangeColor) {
                Random rand = new Random();
                int r, g, b;
                int low = 10;
                int high = 100;
                int result = rand.nextInt(high-low) + low;
                r= result;
                b = result;
                int gLow = 102;
                int gHigh = 256;
                int greenResult = rand.nextInt(gHigh-gLow);
                g = greenResult;
                frame.getContentPane().setBackground(new Color(r, g, b));
            }

            if(event.getSource() == menuExit){
                frame.setVisible(false);
            }
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }

    public static void main(String args[]){

    Menu newMenu = new Menu();

    newMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    newMenu.pack();
    newMenu.setVisible(true);

    }
}
