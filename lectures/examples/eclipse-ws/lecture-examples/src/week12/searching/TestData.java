package week12.searching;

public class TestData {

    public static void main(String[] args) {
        Data xs = new Data(1000);
        xs.add(42);
        xs.show();
        xs.add(new int[]{43, 44, 45, 46});
        xs.show();
        xs.randomize(42, 100);
        xs.show();
        System.out.println("find1: " + xs.find1(42));
        System.out.println("find2: " + xs.find2(42));
        System.out.println("find3: " + xs.find3(42));
        System.out.println("find4: " + xs.find4(42));
    }

}
