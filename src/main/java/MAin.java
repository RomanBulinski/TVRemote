import java.util.HashMap;
import java.util.Map;

public class MAin {


    public static int tvRemote(final String word) {

        Map<String, int[]> lettersMap = getlLettersMap();
        int counter = 0;

        int[] positionFirstLetter = lettersMap.get( String.valueOf(word.charAt(0) ) );
        counter = counter + positionFirstLetter[0] + positionFirstLetter[1];

        counter++;

        for (int z = 1; z < word.length(); z++) {
            int[] letterPosition1 = lettersMap.get(String.valueOf(word.charAt(z - 1)));
            int[] letterPosition2 = lettersMap.get(String.valueOf(word.charAt(z)));

            if (letterPosition1[0] > letterPosition2[0]) {
                counter = counter + (letterPosition1[0] - letterPosition2[0]);
            } else if (letterPosition1[0] < letterPosition2[0]) {
                counter = counter + (letterPosition2[0] - letterPosition1[0]);
            }

            if (letterPosition1[1] > letterPosition2[1]) {
                counter = counter + (letterPosition1[1] - letterPosition2[1]);
            } else if (letterPosition1[1] < letterPosition2[1]) {
                counter = counter + (letterPosition2[1] - letterPosition1[1]);
            }
            counter++;
        }
        return counter;
    }


    private static Map<String, int[]> getlLettersMap() {
        Map<String, int[]> lettersMap = new HashMap<String, int[]>();
        String[][] lettersTable = {
                {"a", "b", "c", "d", "e", "1", "2", "3"},
                {"f", "g", "h", "i", "j", "7", "8", "9"},
                {"k", "l", "m", "n", "o", "7", "8", "9"},
                {"p", "q", "r", "s", "t", ".", "@", "0"},
                {"u", "v", "w", "x", "y", "z", "_", "/"}
        };

        for (int i = 0; i < lettersTable.length; i++) {
            for (int j = 0; j < lettersTable[0].length; j++) {
                int[] tempArr = new int[2];
                tempArr[0] = i;
                tempArr[1] = j;
                lettersMap.put(lettersTable[i][j], tempArr);
            }
        }
        return lettersMap;
    }


}
