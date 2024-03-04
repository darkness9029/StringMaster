public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * 
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        int count = 0;
        String result = "";
        for (int G = 0; G < sentence.length(); G++) {
            if ((sentence.charAt(G) == ' ') && (sentence.charAt(G + 1) != ' ')) {
                count++;
                if (count == number) {
                    for (int i = 0; i < G; i++) {
                        result = result + sentence.charAt(i);
                    }
                    break;
                }
            }

        }
        String eror = " Number = " + number + " is out Of Bound";
        if (count != number) {
            result = eror;
        }
        return result;
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * 
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return
     *         the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int count = 0;
        if (searchForEven) {
            for (int i = 0; i < number.length(); i++) {
                if (((number.charAt(i)) - '0') % 2 == 0) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < number.length(); i++) {
                if (((number.charAt(i)) - '0') % 2 == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        String x= wordA.toLowerCase();
        String y = wordB.toLowerCase();
        for (int i = 0; i < wordA.length(); i++) {
            if (x.charAt(i) - '0' > y.charAt(i)- '0') {
                return wordB;
            } else if (x.charAt(i) - '0' < y.charAt(i)-'0') {
              return wordA;
            }else{
                continue;
            }
        }
        return null;
    }
}
