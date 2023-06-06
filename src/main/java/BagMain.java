/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    /**
     * TODO: Implement this method
     * Enhance each of the bags in bags. If double_enhance_handbags is
     * True, then enhance any HandBags a second time.
     *
     * This method should work for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     */
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        // TODO: Implement this.
        if (double_enhance_handbags == true){
            for (int i = 0; i < bags.length; i++){
                if(bags[i] instanceof CrossbodyBag) {
                    CrossbodyBag c = (CrossbodyBag)bags[i];
                    c.enhance();
                } else if (bags[i] instanceof HandBag) {
                    HandBag h1 = (HandBag) bags[i];
                    h1.enhance();
                    h1.enhance();
                }

                }
            }
        else {
            for (int i = 0; i < bags.length; i++){
                bags[i].enhance();
            }
        }
    }



    /**
     * TODO: Implement this method
     * Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        // TODO: Implement this.
        int count = 0;
        for(int i = 0; i < bags.length; i++){
            if (bags[i] instanceof CrossbodyBag){
                count += ((CrossbodyBag) bags[i]).getNumberOfStraps();
            }
        }
        return count;
    }

//    public static void main(String[] args) {
//        Bag[] bags;
//        bags = new Bag[] {new HandBag("Blue", 2),
//                new CrossbodyBag("Red", 3, 2),
//                new HandBag("Yellow", 4),
//                new CrossbodyBag("Orange", 5, 4)};
//
//        int c = bags[0].getCapacity();
//        System.out.println("cap is " + c);
//    }

}