public class Client {
    public static void main(String[] args) {
        Element[] list = {new Foo(), new Bar(), new Baz()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (Element element : list) {
            element.accept(up);
        }
        for (Element element : list) {
            element.accept(down);
        }
    }

}

