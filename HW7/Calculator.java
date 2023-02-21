
/**
 * @author Nhu Ly
 * @date 11/27/2022
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Calculator extends JFrame implements ActionListener {
    /**
     * @param MAX_INPUT_LENGTH Maximum length of input
     * @param INPUT_MODE       The input mode
     * @param RESULT_MODE      Gives out 1 result
     * @param ERROR_MODE       The Error mode
     */
    final int MAX_INPUT_LENGTH = 20;
    final int INPUT_MODE = 0;
    final int RESULT_MODE = 1;
    final int ERROR_MODE = 2;

    /**
     * Variables
     */
    int displayMode;
    boolean clearOnNextDigit, percent;
    double lastNumber;
    String lastOperator;

    private JLabel jlbOutput;
    private JButton jbnButtons[];
    private JPanel jplMaster, jplControl;

    /**
     * Constructor
     */
    public Calculator() {
        /**
         * Set up the frame
         */
        setBackground(Color.gray);

        jplMaster = new JPanel();
        jlbOutput = new JLabel("0");
        jlbOutput.setHorizontalTextPosition(JLabel.RIGHT);
        jlbOutput.setPreferredSize(new Dimension(300, 30));
        jlbOutput.setBackground(Color.WHITE);
        jlbOutput.setOpaque(true);

        /**
         * Add the components to the frame
         */
        getContentPane().add(jlbOutput, BorderLayout.NORTH);

        jbnButtons = new JButton[17];

        JPanel jplButtons = new JPanel();

        /**
         * Create digit buttons from 0->9
         */
        for (int i = 0; i <= 9; i++) {
            // set each Jbutton label to the value of index
            jbnButtons[i] = new JButton(String.valueOf(i));
        }

        /**
         * Create operator buttons
         */
        jbnButtons[10] = new JButton(".");
        jbnButtons[11] = new JButton("=");
        jbnButtons[12] = new JButton("/");
        jbnButtons[13] = new JButton("*");
        jbnButtons[14] = new JButton("-");
        jbnButtons[15] = new JButton("+");

        jplControl = new JPanel();
        jplControl.setLayout(new GridLayout(1, 1, 2, 2));
        jbnButtons[16] = new JButton("Clear All");
        jplControl.add(jbnButtons[16]);

        /**
         * Set up the layout for the frame of 4x5 panel
         */
        jplButtons.setLayout(new GridLayout(4, 5, 2, 2));

        /**
         * Add the buttons to the panel starts from the top left
         */

        for (int i = 7; i <= 9; i++) {
            jplButtons.add(jbnButtons[i]);
        }

        /**
         * Add button +
         * Second row
         */
        jplButtons.add(jbnButtons[12]);

        for (int i = 4; i <= 6; i++) {
            jplButtons.add(jbnButtons[i]);
        }

        /**
         * Add button *
         * Third row
         */
        jplButtons.add(jbnButtons[13]);

        for (int i = 1; i <= 3; i++) {
            jplButtons.add(jbnButtons[i]);
        }

        /**
         * Add button -
         * Fourth row
         * Add all of the remain buttons
         */
        jplButtons.add(jbnButtons[14]);
        jplButtons.add(jbnButtons[0]);
        jplButtons.add(jbnButtons[10]);
        jplButtons.add(jbnButtons[15]);
        jplButtons.add(jbnButtons[11]);

        jplMaster.setLayout(new BorderLayout());
        jplMaster.add(jplControl, BorderLayout.SOUTH);
        jplMaster.add(jplButtons, BorderLayout.NORTH);

        getContentPane().add(jplMaster, BorderLayout.SOUTH);
        requestFocus();

        for (int i = 0; i < jbnButtons.length; i++) {
            jbnButtons[i].addActionListener(this);
        }

        clearAll();

        addWindowListener(new WindowAdapter() {

            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * 
     * Add the action performed
     */
    public void actionPerformed(ActionEvent e) {
        double result = 0;

        /**
         * Display all of the buttons on the calculator
         */
        for (int i = 0; i < jbnButtons.length; i++) {
            if (e.getSource() == jbnButtons[i]) {
                switch (i) {
                    case 0:
                        addDigitToDisplay(i);
                        break;

                    case 1:
                        addDigitToDisplay(i);
                        break;

                    case 2:
                        addDigitToDisplay(i);
                        break;

                    case 3:
                        addDigitToDisplay(i);
                        break;

                    case 4:
                        addDigitToDisplay(i);
                        break;

                    case 5:
                        addDigitToDisplay(i);
                        break;

                    case 6:
                        addDigitToDisplay(i);
                        break;

                    case 7:
                        addDigitToDisplay(i);
                        break;

                    case 8:
                        addDigitToDisplay(i);
                        break;

                    case 9:
                        addDigitToDisplay(i);
                        break;

                    case 10:
                        addDecimalPoint();
                        break;

                    case 11:
                        processEquals();
                        break;

                    case 12:
                        processOperator("/");
                        break;

                    case 13:
                        processOperator("*");
                        break;

                    case 14:
                        processOperator("-");
                        break;

                    case 15:
                        processOperator("+");
                        break;

                    case 16:
                        clearAll();
                        break;
                }
            }
        }
    }

    /**
     * Getters and Setters
     */
    void setDisplayString(String s) {
        jlbOutput.setText(s);
    }

    String getDisplayString() {
        return jlbOutput.getText();
    }

    /**
     * Conditions to the input digits
     * 
     * @param digit
     */
    void addDigitToDisplay(int digit) {
        if (clearOnNextDigit)
            setDisplayString("");

        String inputString = getDisplayString();

        if (inputString.indexOf("0") == 0) {
            inputString = inputString.substring(1);
        }

        if ((!inputString.equals("0") || digit > 0) && inputString.length() < MAX_INPUT_LENGTH) {
            setDisplayString(inputString + digit);
        }

        displayMode = INPUT_MODE;
        clearOnNextDigit = false;
    }

    void addDecimalPoint() {
        displayMode = INPUT_MODE;

        if (clearOnNextDigit)
            setDisplayString("");

        String inputString = getDisplayString();

        if (inputString.indexOf(".") < 0)
            setDisplayString(new String(inputString + "."));
    }

    void processSignChange() {
        if (displayMode == INPUT_MODE) {
            String input = getDisplayString();

            if (input.length() > 0 && !input.equals("0")) {
                if (input.indexOf("-") == 0)
                    setDisplayString(input.substring(1));

                else
                    setDisplayString("-" + input);
            }

        }

        else if (displayMode == RESULT_MODE) {
            double numberInDisplay = getNumberInDisplay();

            if (numberInDisplay != 0)
                displayResult(-numberInDisplay);
        }
    }

    /**
     * Clear all button
     */
    void clearAll() {
        setDisplayString("0");
        lastOperator = "0";
        lastNumber = 0;
        displayMode = INPUT_MODE;
        clearOnNextDigit = true;
    }

    double getNumberInDisplay() {
        String input = jlbOutput.getText();
        return Double.parseDouble(input);
    }

    void processOperator(String op) {
        if (displayMode != ERROR_MODE) {
            double numberInDisplay = getNumberInDisplay();

            if (!lastOperator.equals("0")) {
                try {
                    double result = processLastOperator();
                    displayResult(result);
                    lastNumber = result;
                }

                catch (DivideByZeroException e) {
                }
            }

            else {
                lastNumber = numberInDisplay;
            }

            clearOnNextDigit = true;
            lastOperator = op;
        }
    }

    void processEquals() {
        double result = 0;

        if (displayMode != ERROR_MODE) {
            try {
                result = processLastOperator();
                displayResult(result);
            }

            catch (DivideByZeroException e) {
                displayError("Cannot divide by zero!");
            }

            lastOperator = "0";
        }
    }

    /**
     * Prevent the error of divided by zero
     * 
     * @return
     * @throws DivideByZeroException
     */
    double processLastOperator() throws DivideByZeroException {
        double result = 0;
        double numberInDisplay = getNumberInDisplay();

        if (lastOperator.equals("/")) {
            if (numberInDisplay == 0)
                throw (new DivideByZeroException());

            result = lastNumber / numberInDisplay;
        }

        /**
         * Create the equations for all of the operator buttons
         */
        if (lastOperator.equals("*"))
            result = lastNumber * numberInDisplay;

        if (lastOperator.equals("-"))
            result = lastNumber - numberInDisplay;

        if (lastOperator.equals("+"))
            result = lastNumber + numberInDisplay;

        return result;
    }

    /**
     * Print out the result
     * 
     * @param result
     */
    void displayResult(double result) {
        setDisplayString(Double.toString(result));
        lastNumber = result;
        displayMode = RESULT_MODE;
        clearOnNextDigit = true;
    }

    void displayError(String errorMessage) {
        setDisplayString(errorMessage);
        lastNumber = 0;
        displayMode = ERROR_MODE;
        clearOnNextDigit = true;
    }

    public static void main(String args[]) {
        Calculator calci = new Calculator();
        Container contentPane = calci.getContentPane();
        calci.setTitle("Calculator");
        calci.setSize(400, 400);
        calci.pack();
        calci.setLocation(400, 250);
        calci.setVisible(true);
        calci.setResizable(false);
    }

}

class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super();
    }

    public DivideByZeroException(String s) {
        super(s);
    }
}
