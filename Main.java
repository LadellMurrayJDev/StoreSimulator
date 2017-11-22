import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //this is simply to test whether or not the program performs the functions as planned
        StoreHouse store = new StoreHouse();
        store.addProduct("coffee", 5, 10);
        store.addProduct("milk", 3, 20);
        store.addProduct("milkbutter", 2, 55);
        store.addProduct("bread", 7, 8);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Ladell");


    }
}
