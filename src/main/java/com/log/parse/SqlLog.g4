grammar SqlLog;

sqlLog : dateTime threadId '[' label ']' '[' errorCode ']' '[' subSystem ']' message '[' userName ']' | EOF;
dateTime : DATE 'T' TIME ;
threadId : NUMBER ;
label : 'Warning' | 'Error' | 'Note'  ;
errorCode : 'MY-' ERRORCODERANGE ;
subSystem :  STRING ;
message : (STRING | NUMBER)* ;
userName : STRING ;


ESCAPE : [ \t\n\r]+ -> skip;

DATE : YEAR '-' MONTH '-' DATEVALUE ;
YEAR :  [1][9][7-9][0-9] | [2-9][0-9][0-9][0-9] ;
MONTH : [0][1-9] | [1][0-2] ;
DATEVALUE : [0][1-9] | [1][0-9] | [2][0-9] | [3][01];

NUMBER : [0-9];
ERRORCODERANGE : '00' [0-5] NUMBER NUMBER NUMBER | '006000' | '0' [1-4] NUMBER NUMBER NUMBER NUMBER | '05' [0-1] NUMBER NUMBER NUMBER ;

                        /*  1 to 999         : Global error codes. This error code range is called “global” because it is a shared range that is used by the server as well as by clients.
                            1,000 to 1,999   : Server error codes reserved for messages sent to clients.
                            2,000 to 2,999   : Client error codes reserved for use by the client library.
                            3,000 to 4,999   : Server error codes reserved for messages sent to clients.
                            5,000 to 5,999   : Error codes reserved for use by X Plugin for messages sent to clients.
                            10,000 to 49,999 : Server error codes reserved for messages to be written to the error log (not sent to clients).
                            50,000 to 51,999 : Error codes reserved for use by third parties.
                        */

STRING : [a-zA-Z_*.: /]+;

TIME : HOURS ':' MINUTES ':' SECONDS '.' MILLISECONDS 'Z';
HOURS : [0][0-9] | [1][0-9] | [2][0-4] ;
MINUTES : ZEROTOSIXTY ;
SECONDS :  ZEROTOSIXTY ;
MILLISECONDS : NUMBER+ ;
ZEROTOSIXTY : [0][0-9] | [1-5][0-9] | [6][0] ;





















