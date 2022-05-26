import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static final String START_TEXT = "Segnibus et ignavis nihil non difficile " +
            "industriis atque impigris nihil non facile est";
    public static final Function<String[], List<String>> DICTIONARY = Main::convertTextToDictionary;

    public static void main(String[] args) {
        DICTIONARY.apply(START_TEXT.split(" "));
    }

    public static List<String> convertTextToDictionary(String[] arrayWords) {
        return Arrays.stream(arrayWords)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
