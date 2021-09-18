public class DownVisitor implements Visitor{

    @Override
    public void visit(Foo foo) {
        System.out.println("down visit on " + foo.get());
    }

    @Override
    public void visit(Bar bar) {
        System.out.println("down visit on " + bar.get());
    }

    @Override
    public void visit(Baz baz) {
        System.out.println("down visit on " + baz.get());
    }
}
