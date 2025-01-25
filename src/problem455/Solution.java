package problem455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //Sort the arrays, so we can satisfy the least greedy children first
        Arrays.sort(g);
        Arrays.sort(s);

        //Two pointers: child (g) and cookie (s)
        int cookie = 0;
        int child = 0;
        int counter = 0;

        //Go through the arrays till it reaches the end of one of them
        while(child < g.length && cookie < s.length) {
            //If so means that this cookie contents the child and go to the next one
            if(g[child] <= s[cookie]) {
                counter++;
                child++; //Move to the next child only if the current child is content
            }
            //Always go to the next cookie
            cookie++;
        }
        return counter;
    }
}
