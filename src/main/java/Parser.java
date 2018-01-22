import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List parse(String text){
        text += " ";
        List<String> listKeys = new ArrayList();

        for (int startWord = 0; startWord < text.length(); startWord++){
            Integer endWord = text.indexOf(" ", startWord);
            listKeys.add(text.substring(startWord, endWord));
            startWord = endWord;
        }

        return listKeys;
    }
}
