package Usta.sistemas;

import javax.swing. *;
import java.awt. *;

public class form_acercade extends JFrame {
    public form_acercade() {
        setLayout(new BorderLayout());
        // Panel superior.
        JPanel panel_superior = new JPanel();
        JLabel label_menu = new JLabel("About", SwingConstants.CENTER);
        label_menu.setFont(new Font("Arial", 0, 20));
        panel_superior.add(label_menu);
        // Panel central.
        JPanel panel_central = new JPanel();
        JLabel label_maker = new JLabel("This software was created by: Juan Pablo Alfonso", SwingConstants.CENTER);
        JLabel label_maker1 = new JLabel("Juan Pablo Alfonso engineering student at Santo Tomás University, ", SwingConstants.LEFT);
        panel_central.add(label_maker);
        panel_central.add(label_maker1);
        // We add the panels to the form.
        add(label_menu, BorderLayout.NORTH);
        add(panel_central, BorderLayout.CENTER);
        // Parameters of the form.

        setVisible(true);
        setResizable(false);
        setBounds(0, 0, 600, 400);
        setLocationRelativeTo(null);
    }
}