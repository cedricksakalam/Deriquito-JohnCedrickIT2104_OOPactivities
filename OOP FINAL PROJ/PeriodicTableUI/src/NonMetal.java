public class NonMetal extends Element{
    public NonMetal (String name, String symbol,  int atomicNumber, double atomicWeight)  {
        super(name, symbol, atomicNumber, atomicWeight);
    }
    @Override
    public String category() {
        return "Non-Metal";
    }
    @Override
    public String information() {
        return super.information() + " - Category: Non-Metal" + "\n\n\tLet's get elemental! \nScience just got a whole lot more exciting!\n============================================";
    }
}
