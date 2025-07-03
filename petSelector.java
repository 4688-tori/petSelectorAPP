
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class petSelector extends JFrame implements ActionListener {
    JRadioButton birdButton, catButton, dogButton, pigButton, rabbitButton;
    JLabel imageLabel;
    ButtonGroup group;

    public petSelector() {
        setTitle("RadioButtonDemo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        pigButton = new JRadioButton("Pig");
        rabbitButton = new JRadioButton("Rabbit");

        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(pigButton);
        group.add(rabbitButton);

        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        pigButton.addActionListener(this);
        rabbitButton.addActionListener(this);

        add(birdButton);
        add(catButton);
        add(dogButton);
        add(pigButton);
        add(rabbitButton);

        imageLabel = new JLabel();
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pet = "";
        String imagePath = "";

        if (e.getSource() == birdButton) {
            pet = "Bird";
            imagePath = "bird.png";
        } else if (e.getSource() == catButton) {
            pet = "Cat";
            imagePath = "cat.png";
        } else if (e.getSource() == dogButton) {
            pet = "Dog";
            imagePath = "dog.png";
        } else if (e.getSource() == pigButton) {
            pet = "Pig";
            imagePath = "rabbit.png";
        } else if (e.getSource() == rabbitButton) {
            pet = "Rabbit";
            imagePath = "rabbit.png";
        }

        imageLabel.setIcon(new ImageIcon(imagePath));
        JOptionPane.showMessageDialog(this, "You selected: " + pet);
    }

    public static void main(String[] args) {
        new petSelector();
    }
}
