package pe.edu.ucv.BD;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class clase {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiplicación Automática");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(10);
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false); // Para que el campo no sea editable

        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calcularResultado();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calcularResultado();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calcularResultado();
            }

            private void calcularResultado() {
                try {
                    double num1 = (textField1.getText().isEmpty()) ? 1 : Double.parseDouble(textField1.getText());
                    double num2 = (textField2.getText().isEmpty()) ? 1 : Double.parseDouble(textField2.getText());
                    double num3 = (textField3.getText().isEmpty() || textField3.getText().equals("0")) ? 1 : Double.parseDouble(textField3.getText());

                    double resultado = num1 * num2 * num3;
                    resultField.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    resultField.setText("Error");
                }
            }
        };

        textField1.getDocument().addDocumentListener(documentListener);
        textField2.getDocument().addDocumentListener(documentListener);
        textField3.getDocument().addDocumentListener(documentListener);

        panel.add(new JLabel("Número 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Número 2:"));
        panel.add(textField2);
        panel.add(new JLabel("Número 3:"));
        panel.add(textField3);
        panel.add(new JLabel("Resultado:"));
        panel.add(resultField);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}













