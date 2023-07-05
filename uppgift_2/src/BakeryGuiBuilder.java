import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

public class BakeryGuiBuilder {
    void buildGui() {

        BakeryViewModel bakeryViewModel = new BakeryViewModel();
        var frame = new JFrame();
        frame.setSize(400, 400);
        var cakePanel = new JPanel();

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        var sprinkleButton = new JButton("Add Sprinkles");
        var selectedCake = new AtomicReference<Cake>();

        var scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(380, 200)); // Set preferred size of the scroll pane

        frame.add(scrollPane, BorderLayout.CENTER); // Add scroll pane to the frame

        var chocolateCakeButton = new JButton("Chocolate Cake");
        chocolateCakeButton.addActionListener(e -> {
            Cake cake = new ChocolateCake();
            bakeryViewModel.newCake(cake);
            selectedCake.set(cake);
        });

        var vanillaCakeButton = new JButton("Vanilla Cake");
        vanillaCakeButton.addActionListener(e -> {
            Cake cake = new VanillaCake();
            bakeryViewModel.newCake(cake);
            selectedCake.set(cake);
        });


        var strawBerryCake = new JButton("Strawberry Cake");
        strawBerryCake.addActionListener(e -> {
            Cake cake = new StrawberryCake();
            bakeryViewModel.newCake(cake);
            selectedCake.set(cake);
        });

        sprinkleButton.addActionListener(e -> {
            if (selectedCake.get() != null) {
                Cake cakeWithSprinkles = new CakeWithSprinkels(selectedCake.get());
                bakeryViewModel.newCake(cakeWithSprinkles);
            }
        });

        var extraLarge = new JButton("Extra Large");
        extraLarge.addActionListener(e -> {
            if (selectedCake.get() != null) {
                Cake extraLargeCake = new ExtraLarge(selectedCake.get());
                bakeryViewModel.newCake(extraLargeCake);
            }
        });

        var panelText = new JPanel(new FlowLayout());
        var cakeWithText = new JButton("Cake With Text");
        var textField = new JTextField();
        textField.setPreferredSize(new Dimension(120, 30));
        panelText.add(textField);
        panelText.add(cakeWithText);

        cakeWithText.addActionListener(e -> {
            if (selectedCake.get() != null) {
                Cake cakeText = new DecorationWithText(textField.getText(), selectedCake.get());
                bakeryViewModel.newCake(cakeText);
            }
        });



        var printButton = new JButton("Print Order");
        printButton.addActionListener(e -> {
            String orderString = bakeryViewModel.printOrder();
            textArea.append(orderString);
        });

        cakePanel.add(vanillaCakeButton);
        cakePanel.add(chocolateCakeButton);
        cakePanel.add(strawBerryCake);
        cakePanel.add(sprinkleButton);
        cakePanel.add(extraLarge);
        cakePanel.add(panelText);
        cakePanel.add(printButton);

        frame.add(cakePanel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
