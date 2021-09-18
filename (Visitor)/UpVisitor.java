public class UpVisitor implements Visitor{

    @Override
    public void visit(Foo foo) {
        System.out.println("up visit on " + foo.get());
    }

    @Override
    public void visit(Bar bar) {

        System.out.println("up visit on " + bar.get());
    }

    @Override
    public void visit(Baz baz) {

        System.out.println("up visit on " + baz.get());
    }
}
