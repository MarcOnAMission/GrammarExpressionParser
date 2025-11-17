import java.util.ArrayList;
import java.util.List;

public class Tokenizer {
    public static List<Token> tokenizeInput(String inputString) {
        List<Token> resultTokens = new ArrayList<>();
        int i = 0;
        while (i < inputString.length()) {
            char c = inputString.charAt(i);
            if (Character.isWhitespace(c)) {
                i++;
                continue;
            }
            if (Character.isDigit(c)) {
                double value = 0;
                value += c - '0';
                i++;
                while (i < inputString.length() && Character.isDigit(inputString.charAt(i))) {
                    c = inputString.charAt(i);
                    value = value * 10 + (c - '0');
                    i++;
                }
                resultTokens.add(Token.numberToken(value));
                continue;
            }
            if (Character.isLetter(c)) {
                StringBuilder word = new StringBuilder();
                while (i < inputString.length() && Character.isLetter(c)) {
                    word.append(c);
                    i++;
                    c = inputString.charAt(i);
                }
                String resultWord = word.toString();
                if (resultWord.equals("let")) {
                    resultTokens.add(Token.identifierToken("let"));
                } else if (resultWord.equals("print")) {
                    resultTokens.add(Token.identifierToken("print"));
                } else {
                    resultTokens.add(Token.identifierToken(resultWord));
                    continue;
                }
            }
            String C = Character.toString(c);
            switch(C){
                case "+","/","-","*" -> resultTokens.add(Token.operatorToken(C));
                case "=" -> resultTokens.add(Token.identifierToken("="));
                default -> throw new RuntimeException("Unexpected character: " + c);
            }
            i++;
        }
        return resultTokens;
    }
}
