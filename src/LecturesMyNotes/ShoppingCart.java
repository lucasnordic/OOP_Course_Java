package LecturesMyNotes;

public class ShoppingCart {

    // attribute
    private static final int INITIAL_LENGTH = 9;
    private String[] productNames;
    private int nextPosition;

    //default constructor
    // Singleton???? What is this?
    public ShoppingCart() {
        this.productNames = new String[ INITIAL_LENGTH ];// initialize here

        initialieArray(this.productNames);
        nextPosition = 0;
    }

    private void initialieArray( String[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = "";
        }
    }

    // When I try to add a product and it does not fit.
    // If it
    public void addProduct( String productName) {

        // ( a * b ) + ( a * c ) == a * ( b + c )
        // dynamic array
        if( nextPosition >= this.productNames.length) {

            // what do we do if an array is full
            String[] biggerCart = new String[ this.productNames.length + 2 ]; // 1. Increase the array
            // initialieArray( biggerCart );

            for (int i = 0; i < this.productNames.length; i++) {
                biggerCart[i] = productNames[i];    // 2. copy the content from old to new.
            }
            this.productNames = biggerCart; // 3. This becomes the new Cart
        }
        productNames[nextPosition] = productName;
        nextPosition++; // this is the key to identifying when the array does not fit
    }

    private void increaseArray() {

    }

    public String[] getProductNames() {
        return this.productNames;
    }

    private boolean isArrayFull() {
        return nextPosition >= this.productNames.length;
    }

    /*
    public void printProducts() {
        for (int i = 0; i < productNames.length; i++) {
            System.out.println(productNames[i]);
        }

        int counter = 0;
        while(counter < productNames.length && currentObject != null) {
            System.out.println("Här är null");
        }
    }
   */

    // traverse the array to find elements
    // input: search key, array to search for.
    // steps: go through the array and compare each element. stop when u find it.
    // Output: boolean (yes/no it contains). Is it the element itself?

    public boolean containsProduct( String desiredProduct ) {

        // Homework 1: transform this for loop inte a while loop
        for (int i = 0; i < productNames.length; i++) {
            String currentName = productNames[i];

            if( currentName == null) {
                return false;
            } else if ( currentName.equals( currentName )) {
                return true;
            }
        }
        return false;
    }

    // Cohesive class. Expert?
    public void removeObject(int indexToRemove) {
        productNames[indexToRemove] = "";
        //Homework 2: change this to reorganize the array.
    }

}
