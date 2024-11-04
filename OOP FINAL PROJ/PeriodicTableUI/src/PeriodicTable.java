import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;


public class PeriodicTable {
    private static Map<Integer, Element> getNumber = new HashMap<>();
    private static Map<String, Element> getSymbol = new HashMap<>();

    private static void fromFile (String fileName) {
        new File(fileName);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String csvSplitBy =",";
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);

                if (values.length == 5) {
                    String name = values[0].trim();
                    String symbol = values[1].trim();
                    int atomicNumber = Integer.parseInt(values[2].trim());
                    double atomicWeight = Double.parseDouble(values[3].trim());
                    String category = values[4].trim();

                    Element element = null;
                    switch (category) {
                        case "Metal":
                            element = new Metal(name, symbol, atomicNumber, atomicWeight);
                            break;
                        case "Non-Metal":
                            element = new NonMetal(name, symbol, atomicNumber, atomicWeight);
                            break;
                        case "Metalloid":
                            element = new Metalloid(name, symbol, atomicNumber, atomicWeight);
                            break;
                        default:
                            continue;
                    }
                    addElement(element);
                    System.out.println("Loaded element: " + element.information());
                }   
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
        }
    }
    
    static {
        fromFile("src/Elements.csv");
    }

    private static void addElement(Element element) {
        getNumber.put(element.getAtomicNumber(), element);
        getSymbol.put(element.getSymbol(), element);

    }

    public static void clearScreen() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder pb;
            if (os.contains("win")) {
                pb = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                pb = new ProcessBuilder("clear");
            }
            pb.inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Welcome to Element Explorer - Periodic Table!");
        System.out.println("============================================");
        System.out.println("Enter '1' to search by Atomic Number");
        System.out.println("Enter '2' to search by the Symbol");
        System.out.println("============================================");
        System.out.print("Enter Choice: ");
        int choice = input.nextInt();
        clearScreen();

        Element element = null;

        if (choice == 1) {
            System.out.println("============================================");
            System.out.println("Do you know? There are 118 unique elements!");
            System.out.println("============================================");
            System.out.print("Enter the Atomic Number: ");
            int atomicNumber = input.nextInt();
            element = getNumber.get(atomicNumber);
            clearScreen();
        } else if (choice == 2) {
            System.out.println("============================================");
            System.out.println("Do you know? There are 118 unique elements!");
            System.out.println("============================================");
            System.out.print("Enter the Element Symbol: ");
            String symbol = input.next().toUpperCase();
            clearScreen();
            element = getSymbol.get(symbol);
        } else {
            System.out.println("Invalid choice!");
        }

        if (element != null) {
            System.out.println(element.information());
        } else {
            System.out.println("Element not found.");
        }
        input.close();
    }
}
