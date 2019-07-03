import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Celsius_Converter {
    private JPanel panel1;
    private JTextField textField1;
    private JLabel celsiusLabel;
    private JLabel fahrenheitLabel;
    private JButton button1;

    private String selected = "Fahrenheit";
    private DecimalFormat df = new DecimalFormat("###.##");


    public Celsius_Converter() {


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().length() > 0) {
                    Double inputValue = Double.parseDouble(textField1.getText());
                    if (selected.equals("Fahrenheit")) {
                        //(0°C × 9/5) + 32 = 32°F
                        Double convertedValue = (inputValue * 9 / 5) + 32;
                        fahrenheitLabel.setText(df.format(convertedValue) + " Fahrenheit");
                    } else if (selected.equals("Celsius")) {
                        //(32°F − 32) × 5/9 = 0°C
                        Double convertedValue = (inputValue - 32) * 5 / 9;
                        fahrenheitLabel.setText(df.format(convertedValue) + " Celsius");
                    }
                }
            }
        });
    }


    public JPanel getPanel1() {
        return panel1;
    }

    public void setCelsiusLabel(JLabel celsiusLabel) {
        this.celsiusLabel = celsiusLabel;
    }
}