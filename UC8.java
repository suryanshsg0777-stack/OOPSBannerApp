import java.util.*;

public class UC8 {

    
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        registerPatterns();
        renderBanner("OOPS");
    }

    
    private static void registerPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    
    private static void renderBanner(String word) {

        word = word.toUpperCase();
        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}
