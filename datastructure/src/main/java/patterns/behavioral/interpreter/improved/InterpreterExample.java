package patterns.behavioral.interpreter.improved;

import java.util.Map;
import java.util.HashMap;

public class InterpreterExample {
    public static void main(String[] args) {
        String expression = "w x z - +";
        Evaluator sentence = new Evaluator(expression);
        Map<String,Expression> variables = new HashMap<String,Expression>();
//        variables.put("w", 5);
//        variables.put("x", 10);
//        variables.put("z", 42);
        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
