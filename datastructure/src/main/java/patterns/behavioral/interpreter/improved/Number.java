package patterns.behavioral.interpreter.improved;


import java.util.Map;

class Number implements Expression {
    private final int number;
    public Number(int number)       { this.number = number; }
    public int interpret(Map<String,Expression> variables)  { return number; }
}
