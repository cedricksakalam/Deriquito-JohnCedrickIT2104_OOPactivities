import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PeriodicTableGame game = new PeriodicTableGame();
            game.setVisible(true);
        });
    }
}