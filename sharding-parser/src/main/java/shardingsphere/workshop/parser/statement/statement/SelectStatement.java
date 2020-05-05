package shardingsphere.workshop.parser.statement.statement;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import shardingsphere.workshop.parser.statement.ASTNode;
import shardingsphere.workshop.parser.statement.segment.FromClauseSegment;
import shardingsphere.workshop.parser.statement.segment.SelectColumnNamesSegment;
import shardingsphere.workshop.parser.statement.segment.WhereClauseSegment;

@RequiredArgsConstructor
@Getter
public class SelectStatement implements ASTNode {

    private final SelectColumnNamesSegment columnNames;

    private final FromClauseSegment fromClause;

    private final WhereClauseSegment whereClause;
}
