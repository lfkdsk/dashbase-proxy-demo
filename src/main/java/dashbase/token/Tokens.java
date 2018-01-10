package dashbase.token;

import com.lfkdsk.justel.ast.base.AstNode;
import com.lfkdsk.justel.parser.BnfCom;
import dashbase.ast.inner.MatchLabel;
import dashbase.ast.inner.QueryLabel;

public class Tokens {
    public static final int AST_PRIMARY_LABEL = 3000;
    public static final int AST_VALUE_LABEL = 3001;
    public static final int AST_OBJECT_LABEL = 3002;
    public static final int AST_ARRAY_LABEL = 3003;

    public static final int AST_PRIMARY = 3004;
    public static final int PRIMARY_LIST = 3005;
    public static final int OBJECT_LIST = 3006;

    public static final int QUERY_PROBLEM = 3007;
    public static final int INNER_LABEL = 3008;
    public static final int QUERY = 3009;
    public static final int MATCH = 3010;


    public static final BnfCom.Operators labels = new BnfCom.Operators();

    public static void addLabels(String name, int type, Class<? extends AstNode> clazz) {
        labels.add(name, type, false, clazz);
    }

    static {
        addLabels("query", QUERY, QueryLabel.class);
        addLabels("match", MATCH, MatchLabel.class);
    }
}
