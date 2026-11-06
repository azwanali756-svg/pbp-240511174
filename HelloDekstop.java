import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloDekstop {
    public static void main(String[] args) {
        // Membuat jendela (frame)
        JFrame frame = new JFrame("Aplikasi Desktop");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menambahkan teks label
        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.add(label);

        // Menampilkan jendela ke layar
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}