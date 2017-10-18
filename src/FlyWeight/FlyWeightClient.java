package FlyWeight;

import FlyWeight.factory.LetterFactory;
import FlyWeight.out.Letter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by SG on 2017/10/18.
 */
public class FlyWeightClient {

    public static void main(String[] argv){

        Letter j1 = LetterFactory.getLetter("J", "Black");
        Letter a2 = LetterFactory.getLetter("A", "White");
        Letter v3 = LetterFactory.getLetter("V", "Green");
        Letter a4 = LetterFactory.getLetter("A", "Yellow");

        List<Letter> word = Arrays.asList(j1, a2, v3, a4);

        System.out.println(word);

    }
}
