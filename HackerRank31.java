//https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true
package hackerrank;
import java.util.*;

public class HackerRank31 {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int lenGame = game.length;
        boolean answer = false;
        int position = 0;
        boolean option = true;
        boolean alreadyE = false;
        ArrayList<Integer> leapPositions = new ArrayList<>();
        if (leap > lenGame)
            return true;
        /* Ends script if we can just jump the full distance*/
        while (option) {
            if ((position + leap) >= lenGame) {
                answer = true;
                break;
            }
            /* if we can jump beyond the game field from the current possition*/
            /* mobility logic */
            if (game[position + 1] == 0) {
                position++;
            } else if (position != 0 && game[position - 1] == 0) {
                game[position] = 1;
                position--;
            } else {
                if (game[position + leap] == 0) {
                    game[position] = 1;
                    leapPositions.add(position);
                    position += leap;
                    continue;
                    /* We jump leap to available next point*/
                } else {
                    option = false;
                }
            }
        }
        return answer;
    }
    /* this solution fails some test cases like
    * 51 11
      0 1 1 1 1 1 0 1 0 0 1 1 0 0 1 0 0 1 1 0 1 0 1 0 1 0 1 0 0 0 1 0 0 0 1 1 1 1 0 0 0 1 1 0 0 0 0 0 1 0 0
    * that i think i correct
    * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
