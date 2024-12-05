import java.awt.*;
import javax.swing.*;

public class Ptable {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Periodic Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout()); 

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4, 10, 10));

        panel.add(new JLabel("Element", SwingConstants.CENTER));
        panel.add(new JLabel("Atomic Number", SwingConstants.CENTER));
        panel.add(new JLabel("Atomic Weight", SwingConstants.CENTER));
        panel.add(new JLabel("Symbol", SwingConstants.CENTER));

        Object[][] elements = {
            {"Hydrogen", 1, 1.008, "H"},
            {"Helium", 2, 4.0026, "He"},
            {"Lithium", 3, 6.94, "Li"},
            {"Beryllium", 4, 9.0122, "Be"},
            {"Boron", 5, 10.81, "B"},
            {"Carbon", 6, 12.011, "C"},
            {"Nitrogen", 7, 14.007, "N"},
            {"Oxygen", 8, 15.999, "O"},
            {"Fluorine", 9, 18.998, "F"},
            {"Neon", 10, 20.180, "Ne"},
            {"Sodium", 11, 22.990, "Na"},
            {"Magnesium", 12, 24.305, "Mg"},
            {"Aluminum", 13, 26.982, "Al"},
            {"Silicon", 14, 28.085, "Si"},
            {"Phosphorus", 15, 30.974, "P"},
            {"Sulfur", 16, 32.06, "S"},
            {"Chlorine", 17, 35.45, "Cl"},
            {"Argon", 18, 39.948, "Ar"},
            {"Potassium", 19, 39.098, "K"},
            {"Calcium", 20, 40.078, "Ca"},
            {"Scandium", 21, 44.956, "Sc"},
            {"Titanium", 22, 47.867, "Ti"},
            {"Vanadium", 23, 50.942, "V"},
            {"Chromium", 24, 52.00, "Cr"},
            {"Manganese", 25, 54.938, "Mn"},
            {"Iron", 26, 55.845, "Fe"},
            {"Cobalt", 27, 58.933, "Co"},
            {"Nickel", 28, 58.693, "Ni"},
            {"Copper", 29, 63.546, "Cu"},
            {"Zinc", 30, 65.38, "Zn"},
            {"Gallium", 31, 69.723, "Ga"},
            {"Germanium", 32, 72.63, "Ge"},
            {"Arsenic", 33, 74.922, "As"},
            {"Selenium", 34, 78.971, "Se"},
            {"Bromine", 35, 79.904, "Br"},
            {"Krypton", 36, 83.798, "Kr"},
            {"Rubidium", 37, 85.468, "Rb"},
            {"Strontium", 38, 87.62, "Sr"},
            {"Yttrium", 39, 88.906, "Y"},
            {"Zirconium", 40, 91.224, "Zr"},
            {"Niobium", 41, 92.906, "Nb"},
            {"Molybdenum", 42, 95.95, "Mo"},
            {"Technetium", 43, 98.00, "Tc"},
            {"Ruthenium", 44, 101.07, "Ru"},
            {"Rhodium", 45, 102.91, "Rh"},
            {"Palladium", 46, 106.42, "Pd"},
            {"Silver", 47, 107.868, "Ag"},
            {"Cadmium", 48, 112.41, "Cd"},
            {"Indium", 49, 114.82, "In"},
            {"Tin", 50, 118.71, "Sn"},
            {"Antimony", 51, 121.76, "Sb"},
            {"Tellurium", 52, 127.60, "Te"},
            {"Iodine", 53, 126.90, "I"},
            {"Xenon", 54, 131.29, "Xe"},
            {"Cesium", 55, 132.91, "Cs"},
            {"Barium", 56, 137.33, "Ba"},
            {"Lanthanum", 57, 138.91, "La"},
            {"Cerium", 58, 140.12, "Ce"},
            {"Praseodymium", 59, 140.91, "Pr"},
            {"Neodymium", 60, 144.24, "Nd"},
            {"Promethium", 61, 145.00, "Pm"},
            {"Samarium", 62, 150.36, "Sm"},
            {"Europium", 63, 151.98, "Eu"},
            {"Gadolinium", 64, 157.25, "Gd"},
            {"Terbium", 65, 158.93, "Tb"},
            {"Dysprosium", 66, 162.50, "Dy"},
            {"Holmium", 67, 164.93, "Ho"},
            {"Erbium", 68, 167.26, "Er"},
            {"Thulium", 69, 168.93, "Tm"},
            {"Ytterbium", 70, 173.04, "Yb"},
            {"Lutetium", 71, 175.00, "Lu"},
            {"Hafnium", 72, 178.49, "Hf"},
            {"Tantalum", 73, 180.95, "Ta"},
            {"Tungsten", 74, 183.84, "W"},
            {"Rhenium", 75, 186.21, "Re"},
            {"Osmium", 76, 190.23, "Os"},
            {"Iridium", 77, 192.22, "Ir"},
            {"Platinum", 78, 195.08, "Pt"},
            {"Gold", 79, 196.97, "Au"},
            {"Mercury", 80, 200.59, "Hg"},
            {"Thallium", 81, 204.38, "Tl"},
            {"Lead", 82, 207.2, "Pb"},
            {"Bismuth", 83, 208.98, "Bi"},
            {"Polonium", 84, 209.98, "Po"},
            {"Astatine", 85, 210.00, "At"},
            {"Radon", 86, 222.00, "Rn"},
            {"Francium", 87, 223.00, "Fr"},
            {"Radium", 88, 226.03, "Ra"},
            {"Actinium", 89, 227.03, "Ac"},
            {"Thorium", 90, 232.04, "Th"},
            {"Protactinium", 91, 231.04, "Pa"},
            {"Uranium", 92, 238.03, "U"},
            {"Neptunium", 93, 237.05, "Np"},
            {"Plutonium", 94, 244.06, "Pu"},
            {"Americium", 95, 243.06, "Am"},
            {"Curium", 96, 247.07, "Cm"},
            {"Berkelium", 97, 247.07, "Bk"},
            {"Californium", 98, 251.08, "Cf"},
            {"Einsteinium", 99, 252.08, "Es"},
            {"Fermium", 100, 257.10, "Fm"},
            {"Mendelevium", 101, 258.10, "Md"},
            {"Nobelium", 102, 259.10, "No"},
            {"Lawrencium", 103, 262.11, "Lr"},
            {"Rutherfordium", 104, 267.12, "Rf"},
            {"Dubnium", 105, 270.13, "Db"},
            {"Seaborgium", 106, 271.13, "Sg"},
            {"Bohrium", 107, 270.13, "Bh"},
            {"Hassium", 108, 277.15, "Hs"},
            {"Meitnerium", 109, 278.15, "Mt"},
            {"Darmstadtium", 110, 281.16, "Ds"},
            {"Roentgenium", 111, 280.16, "Rg"},
            {"Copernicium", 112, 285.17, "Cn"},
            {"Nihonium", 113, 284.18, "Nh"},
            {"Flerovium", 114, 289.19, "Fl"},
            {"Moscovium", 115, 288.19, "Mc"},
            {"Livermorium", 116, 293.20, "Lv"},
            {"Tennessine", 117, 294.20, "Ts"},
            {"Oganesson", 118, 294.21, "Og"}
        };
        
        for (Object[] element : elements) {
            panel.add(new JLabel(element[0].toString(), SwingConstants.CENTER));
            panel.add(new JLabel(element[1].toString(), SwingConstants.CENTER));
            panel.add(new JLabel(element[2].toString(), SwingConstants.CENTER));
            panel.add(new JLabel(element[3].toString(), SwingConstants.CENTER));
        }

        JScrollPane scrollPane = new JScrollPane(panel);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JButton backButton = new JButton("Back");

        backButton.addActionListener(e -> {
            PeriodicTableGame game = new PeriodicTableGame();

            game.setVisible(true);
            frame.dispose();
        });

        mainPanel.add(backButton, BorderLayout.SOUTH);

        frame.add(mainPanel);

        frame.setVisible(true);
    }
}
