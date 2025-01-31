package problem0605_CanPlaceFlowers;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        //Stop iterating once n reaches 0
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            //Check if the current plot is empty
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) && //Check if the previous plot is empty or if it is the first plot
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) { //Check if it is the last plot or if the next plot is empty

                //If the left and right plots are empty, it can be planted at this position, so marks it as planted
                flowerbed[i] = 1;
                //Removes 1 from the flowers to be planted
                n--;
            }
        }
        return n <= 0;
    }
}
