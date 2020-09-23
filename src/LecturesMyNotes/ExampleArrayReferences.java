package LecturesMyNotes;
// 👌🏻
public class ExampleArrayReferences {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct( "Ice cream" );
        cart.addProduct( "Bananas" );
        cart.addProduct( "Lemon Juice" );
        cart.addProduct( "Bengt" );
        cart.addProduct( "Ice cream" );
        cart.addProduct( "Bananas" );
        cart.addProduct( "Lemon Juice" );
        cart.addProduct( "Bengt" );

        cart.removeObject(5);

        String[] allProducts = cart.getProductNames();
        for (int i = 0; i < allProducts.length; i++) {
            System.out.println( allProducts[i] );
        }



        System.out.println(cart.containsProduct("Bengr"));

    }
}
