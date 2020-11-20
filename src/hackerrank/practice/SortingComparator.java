package hackerrank.practice;

import java.util.Comparator;

public class SortingComparator {

    class Player {
        String name;
        int score;
    }

    class Checker implements Comparator<Player> {
        // complete this method
        public int compare(Player a, Player b) {
            int diff = a.score - b.score;

            if (diff != 0) {
                return diff * -1;
            }
            else {
                return a.name.compareTo(b.name);
            }

        }
    }


}
