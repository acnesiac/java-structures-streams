package patterns.behavioral.visitor.behavioral.visitor.improved;



public class PrintCarPartVisitor implements CarPartVisitor{

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Print "+carPart);
    }

}
