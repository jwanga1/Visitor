public class Foo implements Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    String get(){
        return " Foo";
    }
}
