import java.util.Arrays;

public class GreenEggsAndHam {
    public static void main(String[] args) {
        String drSeuss = new String("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String[] arrSplit = drSeuss.split(" ");
        for (int i=0; i < arrSplit.length; i++);
        {
          //  System.out.println(arrSplit[i]);
        }
    }
}

// String[] drSeussBroken = new String[] { "I", "would", "not", ",", "could", "not", ",", "in", "a", "box", "\\.", "I", "would", "not", ",", "could", "not", ",", "with", "a", "fox", "\\.", "I", "will", "not", "eat", "them", "in", "a", "house", "\\.", "I", "will", "not", "eat", "them", "with", "a", "mouse", "\\."};