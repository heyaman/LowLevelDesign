package pattern.builderPattern;

public class Test {
    public static void main(String[] args) {
       User user= new User.Builder("aman", 20).setSex("M").build();
        System.out.printf(user.getSex());

    }
}
