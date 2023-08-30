import java.util.ArrayList;

public class Box<T extends Fruit>  {
    private ArrayList<T> product = new ArrayList<>();

    public Box(int fruit) {
        super();
    }

    public void add(T  fruit){
        product.add(fruit);

    }
    public int getWeight(){
        int sumFruit = 0;

        for (T e : product){
            sumFruit += e.getWeight();
        }

        return sumFruit;

    }
    public void moveTo(Box<Orange> another){
        for (int i = product.size() - 1; i >= 0 ; i--){
            getProduct().add(product.get(i));
            product.remove(i);
        }

    }
    public ArrayList<T> getProduct(){
        return product;
    }
    // метод позволяет определить сопостависы ли продукты по типу
//    public boolean ifProductsComparable(Box otherBox){
//        return product.get(0).getClass() != otherBox.getProduct().get(0).getClass();
//    }

}
