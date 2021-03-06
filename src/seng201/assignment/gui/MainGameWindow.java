package seng201.assignment.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import seng201.assignment.Food;
import seng201.assignment.Game;
import seng201.assignment.Pet;
import seng201.assignment.PetType;
import seng201.assignment.Player;
import seng201.assignment.Toy;

import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class MainGameWindow extends JFrame {
    /**
     * Launch the application.
     */
    public static void main(final String[] args) {
        Pet[] pets = new Pet[3];
        pets[0] = PetType.Dog.create("TestDog");
        pets[1] = PetType.Cat.create("TestCat");
        pets[2] = PetType.Rabbit.create("TestRabbit");
        Player[] players = new Player[1];
        players[0] = new Player("TestPlayer", pets);
        players[0].purchase(Food.CARROT);
        players[0].purchase(Food.BLOODWORM);
        players[0].purchase(Food.BLOODWORM);
        players[0].purchase(Toy.CARDBOARDBOX);
        players[0].purchase(Food.LETTUCE);
        final Game game = new Game(10, players);

        EventQueue.invokeLater(() -> {
            try {
                MainGameWindow window = new MainGameWindow(game);
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public MainGameWindow(final Game game) {
        setResizable(false);
        setBounds(100, 100, 760, 468);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

        final MainGamePanel main = new MainGamePanel(this, game);
        final StorePanel store = new StorePanel(this, game);
        final HelpPanel help = new HelpPanel();

        tabbedPane.addTab("Pet", main);
        tabbedPane.addTab("Store", store);
        tabbedPane.addTab("Help", help);
        tabbedPane.addChangeListener(e -> {
            main.redraw();
            store.redraw();
            help.onTabChanged();
        });
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

}
