public class Main {
    public static void main(String[] args) {
//        Box<String> stringBox = new Box(1); // недопустимо
        Box<Orange> orangeBox = new Box<>(1);
        Box<Apple> appleBox = new Box<>(1);
        Box<GoldApple> goldenAppleBox = new Box<>(1);

        orangeBox.add(new Orange(1));
//        orangeBox.add(new Apple(1));  // недопустимо
//        orangeBox.add(new GoldApple(1));  // недопустимо
        System.out.println(orangeBox.getWeight()); // 1

        appleBox.add(new Apple(1));
        appleBox.add(new GoldApple(1));
        System.out.println(appleBox.getWeight()); // 2
//
////        goldenAppleBox.add(new Apple(1)); // недопустимо
        goldenAppleBox.add(new GoldApple(1));
//
        Box<Orange> anotherOrangeBox = new Box(1);
        orangeBox.moveTo(anotherOrangeBox);
////        orangeBox.moveTo(appleBox); // недопустимо
        System.out.println(anotherOrangeBox.getWeight()); // 1
        System.out.println(orangeBox.getWeight()); // 0
//
////        appleBox.moveTo(goldenAppleBox); // недопустимо
        goldenAppleBox.moveTo(anotherOrangeBox);
        System.out.println(goldenAppleBox.getWeight()); // 0
        System.out.println(appleBox.getWeight()); // 3
    }
}