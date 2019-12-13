import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    public class Extension {
        int add(int a, int b) {
            if (Integer.MAX_VALUE - a < b) {
                System.err.printf("%d + %d is bigger than Integer max value\n", a, b);
                return Integer.MAX_VALUE;
            }
            return a + b;
        }

        int maxOfThree(int a, int b, int c) {
            int maxAB = Math.max(a, b);
            return Math.max(c, maxAB);
        }

        int median(List<Integer> pool) {
            if (pool.size() == 0) return 0;
            Collections.sort(pool);
            int middle = pool.size() / 2;
            if (pool.size() % 2 == 1) {
                return pool.get(middle);
            } else return (pool.get(middle - 1) + pool.get(middle)) / 2;
        }

        boolean isVowel(char character) {
            return Arrays.asList('a', 'u', 'o', 'e', 'i', 'A', 'U', 'O', 'E', 'I',
                    'á', 'Á', 'é', 'É', 'Í', 'í', 'ó', 'Ó', 'ö', 'Ő', 'Ö', 'ő', 'ú',
                    'Ú', 'Ü', 'ü', 'ű', 'Ű').contains(character);
        }

        String translate(String toTranslate) throws Exception {
            if (toTranslate == null || toTranslate.isEmpty()) {
                throw new Exception("String not exists");
            }
            int length = toTranslate.length();
            for (int i = 0; i < length; i++) {
                char characters = toTranslate.charAt(i);
                if (isVowel(characters)) {
                    toTranslate = String.join(characters + "v" + characters, toTranslate.split(""+ characters));
                    i+=2;
                }
            }
            return toTranslate;
        }
    }

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed

