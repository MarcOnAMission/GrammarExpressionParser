public class Token {
    private Double value;
    private String operator;
    private Type type;
    private String keyword;
    Token(Double value,String operator,Type type, String keyword){
        this.value=value;
        this.operator=operator;
        this.type=type;
        this.keyword=keyword;
    }
    public static Token numberToken(Double value){
        return new Token(value,null,Type.NUMBER,null);
    }
    public static Token operatorToken(String operator){
        return switch(operator){
            case "+" -> new Token(null,"+",Type.ADDITION,null);
            case "/" -> new Token(null,"/",Type.DIVISION,null);
            case "*" -> new Token(null,"*",Type.MULTIPLICATION,null);
            case "-" -> new Token(null,"-",Type.SUBTRACTION,null);
            default -> throw new RuntimeException("Operator not found in list");
        };
    }
    public static Token identifierToken(String keyword){
        return new Token(null,null,Type.IDENTIFIER,keyword);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Token(");

        sb.append("type=").append(type);

        if (value != null) {
            sb.append(", value=").append(value);
        }
        if (operator != null) {
            sb.append(", operator='").append(operator).append("'");
        }
        if (keyword != null) {
            sb.append(", keyword='").append(keyword).append("'");
        }

        sb.append(")");
        return sb.toString();
    }
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
