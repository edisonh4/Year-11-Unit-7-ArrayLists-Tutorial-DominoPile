//Default Constructor - Sets the pile to an empty arraylist of dominos.
//        newStack6() - puts in a complete set of dominoes from 0,0 to 6,6. Keep in mind that there are no repeated tiles (if there is already a 0,1, there can't be a 1,0). You must use a nested for-loop to solve this.
//        shuffle() - puts the dominos in a random order within the stack.
//        Option #1 - take all the values out of the original pile in a random order and add them to a new pile. Make the original pile equal to the new pile.
//        Option #2 - loop a large number of times simply grabbing 2 random tiles at a time and swapping their places.

import java.util.ArrayList;
import java.util.*;
public class DominoPile {
    private ArrayList<Domino>pile;
    public DominoPile(){
        pile = new ArrayList();
    }
    public ArrayList<Domino> getPile(){
        return pile;
    }
    public void newStack6(){
        int a = 0;
        int p = 0;
        for(int i = 0; i <= 6; i++){
            for(a = p; a < 6; a++){
                pile.add(new Domino(i,a));
            }
            p++;
            pile.add(new Domino(i,a));
        }
    }
    public void shuffleOptionOne(){
        ArrayList<Domino> pileTwo = new ArrayList();
        Collections.shuffle(pile);
        for(int i = 0; i <= 6; i++){
            pileTwo.add(i,pile.get(i));
        }
    }
//    public void suffleOptionTwo(){
//        Random random = new Random();
//        for(int a = 0; a < 100; a++) {
//            int i = random.nextInt(28);
//            int j = random.nextInt(28);
//            Collections.swap(pile,i,j);
//
//        }
//    }
}
