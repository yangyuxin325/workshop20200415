package shardingsphere.workshop.parser.statement.segment;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import shardingsphere.workshop.parser.statement.ASTNode;


@RequiredArgsConstructor
@Getter
public class WhereClauseSegment implements ASTNode {
    private final ColumnNameSegment columnNameSegment;

    private final ColumnValueSegment columnValueSegment;
}
