grammar Par;

@header {
        import java.util.HashMap;
}

@members {
        Integer getSymbol (String name) {
                for (int lv=$r2.size()-1; lv >=0; lv--) {
                        if ($r2[lv]::hm.containsKey(name))
                                return $r2[lv]::hm.get(name);
                }
/*              Obsluga wyjatkow prezentowana byla w poprzednim odcinku
                throw new NotFoundException(name);   */
                return -1;
        }

        Integer putSymbol (String name, Integer value) {
                for (int lv=$r2.size()-1; lv >=0; lv--) {
                        if ($r2[lv]::hm.containsKey(name)) {
                                $r2[lv]::hm.put(name, value);
                                return value;
                        }
                }
//              throw new NotFoundException(name);   
                return -1;
        }

        void declareSymbol (String name) {
                if(!$r2::hm.containsKey(name))
                        $r2::hm.put(name, -1);
/*              else
                        throw new RedeclaredException(name);   */
        }
}

r1      :
        r2*;

r2
scope { HashMap<String, Integer> hm; }
@init { $r2::hm=new HashMap<String, Integer>(); }
        :
        '[' { System.out.println("Entering new scope..."); }  
        r3+ 
        ']' { System.out.println("Leaving scope..."); };

r3      :
        r2
        | SLOWO {
                System.out.println(getSymbol($SLOWO.text));
        }
        | DEC SLOWO { declareSymbol($SLOWO.text);}
        | PUT SLOWO {putSymbol($SLOWO.text, $r2::hm.size());};


DEC     :       'Dec';
PUT     :       '>';
SLOWO   :       ('a'..'z')+;
NL      :       '\r'? '\n' { $channel=HIDDEN; };
WS      :       (' ' | '\t' ) { $channel=HIDDEN; };
//WS    :       (' ' | '\t' ) { skip(); };

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

