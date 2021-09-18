public class Bar implements Element{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    String get(){
        return " Bar";
    }
}
