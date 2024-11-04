public class Metal extends Element {
    public Metal (String name, String symbol,  int atomicNumber, double atomicWeight)  {
        super(name, symbol, atomicNumber, atomicWeight);
    }

    @Override
    public String category() {
        return "Metal";
    }
    @Override
    public String information() {
        return super.information() + " - Category: Metal" + "\n\n\tLet's get elemental!\nScience just got a whole lot more exciting!\n============================================";
    }
    
}
