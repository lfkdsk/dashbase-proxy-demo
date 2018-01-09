package dashbase.ast;

import com.lfkdsk.justel.ast.base.AstNode;
import dashbase.token.Tokens;

import java.util.List;

public class AstInnerLabelExpr extends QueryAstList{
    public AstInnerLabelExpr(List<AstNode> children) {
        super(children, Tokens.INNER_LABEL);
    }
}
