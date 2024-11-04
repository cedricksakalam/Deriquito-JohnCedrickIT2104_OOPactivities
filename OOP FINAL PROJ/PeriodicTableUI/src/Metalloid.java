public class Metalloid extends Element {
    public Metalloid (String name, String symbol,  int atomicNumber, double atomicWeight)  {
        super(name, symbol, atomicNumber, atomicWeight);
    }
    @Override
    public String category() {
        return "Metalloid";
    }
    @Override
    public String information() {
        return super.information() + " - Category: Metalloid" + "\n\n\tLet's get elemental!\nScience just got a whole lot more exciting!\n============================================";
    }
    
}
