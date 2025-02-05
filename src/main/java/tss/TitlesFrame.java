package tss;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * The {@code TitlesFrame} class represents a window containing a graphical panel.
 * It extends {@link JFrame} and initializes the UI components.
 *
 * <p>The frame displays a panel of type {@code TitlesPanel} and has predefined dimensions.</p>
 *
 * @author Erlkonig
 * @version 1.0
 */
public class TitlesFrame extends JFrame {

   /**
    * Constructs a new {@code TitlesFrame} and initializes the UI.
    */
   public TitlesFrame() {
      this.initUI();
   }

   /**
    * Initializes the user interface by setting the title, default close operation,
    * adding a {@code TitlesPanel}, and configuring the frame's size and position.
    */
   private void initUI() {
      this.setTitle("Криві фігури");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.add(new TitlesPanel(58));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component) null);
   }

   /**
    * The entry point of the application.
    *
    * @param args command-line arguments (not used)
    */
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}