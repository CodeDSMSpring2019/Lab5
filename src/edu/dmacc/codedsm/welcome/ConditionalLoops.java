package edu.dmacc.codedsm.welcome;

public class ConditionalLoops {

    public static final String firstClass = "One";
    public static final String secondClass = "Two";

    public static void main(String[] args) {
        String firstMethod = "catarina";
        String secondMethod = "banana";

        while (!firstMethod.isEmpty() || !secondMethod.isEmpty()) {
            System.out.println("combined = " + conditionalCombiner(firstMethod, secondMethod));
            if (!firstMethod.isEmpty()) {
                firstMethod = firstMethod.substring(0, firstMethod.length() - 1);
            }
            if (!secondMethod.isEmpty()) {
                secondMethod = secondMethod.substring(0, secondMethod.length() - 1);
            }
        }

//        do {
//            System.out.println("combined = " + combine(mOne, mTwo));
//            if (!mOne.isEmpty()) {
//                mOne = mOne.substring(0, mOne.length() - 1);
//            }
//            if (!mTwo.isEmpty()) {
//                mTwo = mTwo.substring(0, mTwo.length() - 1);
//            }
//        } while (!mOne.isEmpty() || !mTwo.isEmpty());
    }

    public static String conditionalCombiner(String one, String two) {
        if (one.isEmpty() && two.isEmpty()) {
            return firstClass + " " + secondClass;
        } else if (one.isEmpty()) {
            return secondClass + " " + two;
        } else if (two.isEmpty()) {
            return firstClass + " " + one;
        } else {
            return one + " " + two;
        }
    }
}
