/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package shardingsphere.workshop.parser.engine;

import org.junit.Test;
import shardingsphere.workshop.parser.statement.segment.ColumnNameSegment;
import shardingsphere.workshop.parser.statement.statement.SelectStatement;
import shardingsphere.workshop.parser.statement.statement.UseStatement;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public final class ParseEngineTest {
    
    @Test
    public void testParse() {
//        String sql = "use sharding_db";
//        UseStatement useStatement = (UseStatement) ParseEngine.parse(sql);
//        assertThat(useStatement.getSchemeName().getIdentifier().getValue(), is("sharding_db"));
        String sql = "select id, name, value from test where id = 10";
        SelectStatement selectStatement = (SelectStatement) ParseEngine.parse(sql);
        System.out.println("ColunmNames : ");
        for (ColumnNameSegment columnName : selectStatement.getColumnNames().getColumnNameSegmentList()) {
            System.out.println(columnName.getIdentifier().getValue());
        }
        System.out.println("TableName : ");
        System.out.println(selectStatement.getFromClause().getTableNameSegment().getIdentifier().getValue());
        System.out.println("WhereColumnName : ");
        System.out.println(selectStatement.getWhereClause().getColumnNameSegment().getIdentifier().getValue());
        System.out.println("WhereColumnValue : ");
        System.out.println(selectStatement.getWhereClause().getColumnValueSegment().getIdentifier().getValue());
    }
}
