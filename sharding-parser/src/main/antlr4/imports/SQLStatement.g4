
grammar SQLStatement;

import Symbol, Keyword, Literals;

use
    : USE schemaName
    ;
    
schemaName
    : identifier
    ;
    
insert
    : INSERT INTO? tableName columnNames? VALUE assignmentValues
    ;

select
    : SELECT selectColumnNames fromClause? whereClause?
    ;

selectColumnNames
    : columnName (COMMA_ columnName)*
    ;

fromClause
    : FROM tableName
    ;

whereClause
    : WHERE columnName EQ_ columnValue
    ;

columnValue
    : identifier
    ;
  
assignmentValues
    : LP_ assignmentValue (COMMA_ assignmentValue)* RP_
    ;

assignmentValue
    : identifier
    ;
    
columnNames
    : LP_ columnName (COMMA_ columnName)* RP_
    ;

columnName
    : identifier
    ;
   
tableName
    : identifier
    ;
    
identifier
    : IDENTIFIER_ | STRING_ | NUMBER_
    ;
    