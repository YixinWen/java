package OOP.demo8;

public class wen {
    public static void main(String[] args) {
        //匿名内部类
         new Apple().eat();
        User user = new User() {
            @Override
            public void hello() {

            }
        };

    }
static class Apple{
        public void eat(){
            System.out.println("1");
        }
}


    interface User{
        void hello();

    }
}
