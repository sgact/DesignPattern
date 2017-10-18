package FlyWeight.factory;

import FlyWeight.out.Letter;

/**
 * Created by SG on 2017/10/18.
 */
public class LetterFactory {

    public static Letter getLetter(String whichLetter, String color){
        Letter letter = null;
        try {
            switch (whichLetter){
                case "J":
                    letter = (Letter) Class.forName(LetterConfig.J).newInstance();
                    break;
                case "A":
                    letter = (Letter) Class.forName(LetterConfig.A).newInstance();
                    break;
                case "V":
                    letter = (Letter) Class.forName(LetterConfig.V).newInstance();
                    break;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        letter.setColor(color);
        return letter;
    }

}
