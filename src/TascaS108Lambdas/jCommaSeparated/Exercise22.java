package TascaS108Lambdas.jCommaSeparated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise22 {

        public static void main(String[] args) {
            List<Integer> predefinedNumbers = new ArrayList<>(Arrays.asList(10, 3, 15, 8, 18, 9, 137, 666, 21,  93, 96, 99, 102, 105, 108, 111, 114, 117, 120, 123, 126, 129, 132, 135, 138, 141, 339, 342, 345, 348, 351, 354, 357, 360, 363, 366, 369, 372, 375, 378, 381, 384, 387, 390, 393, 396, 399, 402, 405, 408, 411, 414, 417, 420, 423, 426, 429, 432, 435, 438, 483, 486, 489, 492, 495));

            List<String> newNumbers = new ArrayList<>();
            for (int number : predefinedNumbers) {
                if (number % 2 == 0) {
                    newNumbers.add("e" + number);
                } else {
                    newNumbers.add("o" + number);
                }
            }

            System.out.println(newNumbers);
        }
    }