package firstproject;

public class CensorProg_01 {

    public static void main(String[] args) {

        String result = censor("A kutya nagyon aranyos kutya", "kutya ", "macska");
        System.out.println("Próba: " + result);

    }


    static String censor(String text, String toChange, String newWord) {
        if (text.contains(toChange)) {
            text = text.replaceAll(toChange, newWord);
        }
        return text;
    }

}
