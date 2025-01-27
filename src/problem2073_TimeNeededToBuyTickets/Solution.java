package problem2073_TimeNeededToBuyTickets;

public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int desiredTickets = tickets[k];
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            // Case 1: Person needs fewer tickets than k. Add all their tickets.
            if (tickets[i] < desiredTickets) {
                time += tickets[i];
            }
            // Case 2: Person is behind k. Add (desiredTickets - 1) since they stop after k's last purchase.
            else if (i > k) {
                time += desiredTickets - 1;
            }
            // Case 3: Person is k or in front and needs >= desiredTickets. Add desiredTickets.
            else {
                time += desiredTickets;
            }
        }
        return time;
    }
}
