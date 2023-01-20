package compilator.model.control;

import compilator.model.expression.Expression;

public class ControlFor {
    /**
     * Identifikator iterace
     */
    private final String identifier;

    /**
     * Vyraz z hodnoty
     */
    private Expression expression;

    /**
     * Hodnota vyrazu
     */
    private Expression to;

    public ControlFor(String identifier, Expression expression, Expression to) {

        this.identifier = identifier;
        this.expression = expression;
        this.to = to;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Expression getFrom() {
        return expression;
    }

    public Expression getTo() {
        return to;
    }
}
