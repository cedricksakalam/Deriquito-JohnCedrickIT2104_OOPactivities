// File: Element.java

public class Element {
    private String name;
    private String symbol;
    private int atomicNumber;

    public Element(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }
}
