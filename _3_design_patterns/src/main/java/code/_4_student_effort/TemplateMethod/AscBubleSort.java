package TemplateMethod;

public class AscBubleSort extends TemplateMethodBubleSort {
    @Override
    public boolean numbersInCorrectOrder (Integer i1, Integer i2) {
        if (i1 < i2) {
            return true;
        }
        return false;
    }
}
