import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content
     * 
     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input
     * and change it with the newWord
     * 
     */
    public String wordCensor(String sentence, String word, String newWord) {
        sentence.replaceAll(word, newWord);
        return sentence;
    }
    /**
     * In this function You have a firstName and a lastName as Entry and you have to
     * normalize them as a fullName
     * 
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName  is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of
     *         firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName) {
        char A = firstName.charAt(0);
        char B = lastName.charAt(0);
        int temp;
        temp = (int) A;
        if (temp > 97) {
            temp -= 32;
            A = (char) temp;
        }
        temp = (int) B;
        if (temp > 97) {
            temp -= 32;
            B = (char) temp;
        }
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        char C = firstName.charAt(0);
        char D = lastName.charAt(0);
        firstName.replace(C, A);
        lastName.replace(D, B);
        return (firstName + " " + lastName);
    }
    /**
     * Removing repeated letter in a word
     * 
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated
     *         letters should be omitted
     */
    public String doubleChar(String word) {
        String result = "";
        int count = word.length();
        char[] D = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            D[i] = word.charAt(i);
        }
        int G = 0;
        char B = '1';
        for (; G < word.length(); G++) {
            for (int i = G; i < word.length(); i++) {
                char A = word.charAt(i);
                if (A == B) {
                    for (int F = i; F < count; F++) {
                        D[F] = D[F + 1];
                    }
                    count--;
                }
            }
            B = word.charAt(G);
        }
        for (int i = 0; i < count; i++) {
         result=result+D[i];
        }
        return result;
    }
}
