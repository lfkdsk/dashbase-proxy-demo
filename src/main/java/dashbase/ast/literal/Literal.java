package dashbase.ast.literal;


import dashbase.ast.base.AstLeaf;
import dashbase.token.Token;

/**
 * Literal is an AstLeaf.
 * Literal is an wrapper of LiterToken.
 *
 * @author liufengkai
 *         Created by liufengkai on 2017/7/22.
 */
public abstract class Literal extends AstLeaf {

    public Literal(Token token) {
        super(token);
    }

    public String name() {
        return token.getText();
    }

    public abstract Object value();
}
