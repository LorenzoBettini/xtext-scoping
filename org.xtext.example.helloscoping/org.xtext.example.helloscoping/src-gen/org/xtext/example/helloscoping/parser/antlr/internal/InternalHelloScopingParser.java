package org.xtext.example.helloscoping.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.helloscoping.services.HelloScopingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloScopingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'extends'", "'{'", "'}'", "'field'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalHelloScopingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHelloScopingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHelloScopingParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g"; }



     	private HelloScopingGrammarAccess grammarAccess;
     	
        public InternalHelloScopingParser(TokenStream input, HelloScopingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected HelloScopingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:76:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:79:28: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:80:1: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:81:1: (lv_greetings_0_0= ruleGreeting )
            	    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:82:3: lv_greetings_0_0= ruleGreeting
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGreeting_in_ruleModel130);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"greetings",
            	            		lv_greetings_0_0, 
            	            		"Greeting");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:106:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:107:2: (iv_ruleGreeting= ruleGreeting EOF )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:108:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting166);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:115:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_fields_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:118:28: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:119:1: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}' )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:119:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_fields_5_0= ruleField ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGreeting213); 

                	newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
                
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGreetingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:141:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:141:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGreeting248); 

                        	newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:146:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:147:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getGreetingRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGreeting268); 

                    		newLeafNode(otherlv_3, grammarAccess.getGreetingAccess().getSuperTypeGreetingCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGreeting282); 

                	newLeafNode(otherlv_4, grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:162:1: ( (lv_fields_5_0= ruleField ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:163:1: (lv_fields_5_0= ruleField )
            	    {
            	    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:163:1: (lv_fields_5_0= ruleField )
            	    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:164:3: lv_fields_5_0= ruleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGreetingAccess().getFieldsFieldParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleField_in_ruleGreeting303);
            	    lv_fields_5_0=ruleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGreetingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_5_0, 
            	            		"Field");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleGreeting316); 

                	newLeafNode(otherlv_6, grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleField"
    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:192:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:193:2: (iv_ruleField= ruleField EOF )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:194:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField352);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField362); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:201:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:204:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:205:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:205:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:205:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleField399); 

                	newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
                
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:209:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:210:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:210:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.helloscoping/src-gen/org/xtext/example/helloscoping/parser/antlr/internal/InternalHelloScoping.g:211:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField416); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGreeting213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting230 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleGreeting248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGreeting268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGreeting282 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleField_in_ruleGreeting303 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleGreeting316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleField399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField416 = new BitSet(new long[]{0x0000000000000002L});

}