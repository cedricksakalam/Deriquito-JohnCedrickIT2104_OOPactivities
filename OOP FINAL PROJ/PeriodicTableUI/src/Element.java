public abstract class Element {
    private String name;
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public Element(String name, String symbol, int atomicNumber, double atomicWeight) {
        
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;     
    }

    public abstract String category();

    public String getName() {
        return name;
    }
    public String getSymbol() {
        return symbol;
    }
    public int getAtomicNumber() {
        return atomicNumber;
    }
    public double getAtomicWeight() {
        return atomicWeight;
    }

    public String information() {
        System.out.println("============================================");
        return name + " (" + symbol + ")\nAtomic Number: " + atomicNumber + "\nAtomic Weight: " + atomicWeight;
        
    }
}