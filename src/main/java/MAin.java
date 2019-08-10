import java.util.HashMap;
import java.util.Map;

public class MAin {


    public static int tvRemote(final String word) {

        Map<String, int[]> lettersMap = getlLettersMap();

        int[] positionFirstLetter = lettersMap.get( String.valueOf(word.charAt(0) ) );
        int counter = positionFirstLetter[0] + positionFirstLetter[1] + 1;

        for (int z = 1; z < word.length(); z++) {
            int[] letterPosition1 = lettersMap.get(String.valueOf(word.charAt(z - 1)));
            int[] letterPosition2 = lettersMap.get(String.valueOf(word.charAt(z)));

            counter = counter + Math.abs(letterPosition1[0] - letterPosition2[0]) + Math.abs(letterPosition1[1] - letterPosition2[1]) + 1;
        }
        return counter;
    }

    private static Map<String, int[]> getlLettersMap() {
        Map<String, int[]> lettersMap = new HashMap<String, int[]>();
        String[][] lettersTable = {
                {"a", "b", "c", "d", "e", "1", "2", "3"},
                {"f", "g", "h", "i", "j", "4", "5", "6"},
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
