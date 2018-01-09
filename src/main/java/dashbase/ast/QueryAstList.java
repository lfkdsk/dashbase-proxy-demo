package dashbase.ast;

import com.lfkdsk.justel.ast.base.AstList;
import com.lfkdsk.justel.ast.base.AstNode;
import dashbase.visitor.VisitorBinder;

import java.util.List;

public class QueryAstList extends AstList implements VisitorBinder<String> {


    public QueryAstList(List<AstNode> children, int tag) {
        super(children, tag);
    }

    @Override
    public String toString() {
        if (children.isEmpty()) {
            return "(empty)";
        }

        StringBuilder builder = new StringBuilder();

        for (AstNode child : children) {
            builder.append(child.toString());
            builder.append(",");
        }

        return builder.toString();
    }
}
