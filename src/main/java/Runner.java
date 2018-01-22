import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parser parser = new Parser();
        String request = "Я купил хлеб";
        List<String> keys;

        keys = parser.parse(request);

        for (String e : keys){
            System.out.println(e);
        }
    }
}
