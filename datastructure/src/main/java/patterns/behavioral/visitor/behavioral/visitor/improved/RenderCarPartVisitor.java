package patterns.behavioral.visitor.behavioral.visitor.improved;



public class RenderCarPartVisitor implements CarPartVisitor{

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Render "+carPart);
    }

}
