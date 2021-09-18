public class Baz implements Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    String get(){
        return " Baz";
    }
}
