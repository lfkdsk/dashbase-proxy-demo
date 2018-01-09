package dashbase.ast;

import com.lfkdsk.justel.ast.base.AstNode;
import dashbase.token.Tokens;

import java.util.List;

public class AstValueLabel extends QueryAstList{

    public AstValueLabel(List<AstNode> children) {
        super(children, Tokens.AST_VALUE_LABEL);
    }
}
