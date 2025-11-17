import java.util.List;

public class InterpertInput {
    public static void interpret(String inputString){
        List<Token> tokenizedInput = Tokenizer.tokenizeInput(inputString);
        for(Token t : tokenizedInput){
            System.out.println(t.toString());
        }
    }
}
