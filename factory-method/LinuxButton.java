import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LinuxButton implements Button {

  private final JPanel jPanel = new JPanel();
  private final JFrame jFrame = new JFrame();
  private JButton jButton;

  @Override
  public void render() {
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Hello world!");
    label.setOpaque(true);
    label.setBackground(new Color(235, 235, 123));
    label.setFont(new Font("Dialog", Font.BOLD, 44));
    label.setHorizontalAlignment(SwingConstants.CENTER);
    jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    jFrame.getContentPane().add(jPanel);
    jPanel.add(label);
    onClick();
    jPanel.add(jButton);

    jFrame.setSize(320, 200);
    jFrame.setVisible(true);
    onClick();
  }

  @Override
  public void onClick() {
    jButton = new JButton("Exit");
    jButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jFrame.setVisible(false);
        System.exit(0);
      }
    });
  }

}
