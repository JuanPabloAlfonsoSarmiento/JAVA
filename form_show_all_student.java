package Usta.sistemas;

import javax.swing. *;
import java.awt. *;
import java.util.Objects;

public class form_show_all_student extends JDialog {
    // AUTOR: Juan Pablo Alfonso
    // DATE: 14/09/20
    //DESCRIPTION: This class shows all  data from the file d: /students.txt;

    public form_show_all_student (Frame parent) {
        super (parent, true);
        setLayout (new BorderLayout ());
        // Top panel.
        new JPanel();
        JLabel label_menu = new JLabel ("List of subjects", SwingConstants.CENTER);
        label_menu.setFont (new font (0, 20));
        parent.add (label_menu);
        // Central panel.
        String [] columnsNames = {"building", "floor", ""};
        new file_data_student();
        JTable data_table = new JTable (Objects.requireNonNull(file_data_student.f_all_data_students()), columnsNames);
        data_table.setBounds (10, 50, 590, 300);
        JScrollPane panel_central = new JScrollPane (data_table);
        // We add the two panels to the form.
        add (parent, BorderLayout.NORTH);
        add (panel_central, BorderLayout.CENTER);
        // General parameters of the form.
        setSize (600, 400);
        setVisible (true);
        setResizable (false);
        setLocationRelativeTo (null);

    }

    private class font extends Font {
        public font(int i, int i1) {
            super (Font.getFont(""));
        }
    }
}