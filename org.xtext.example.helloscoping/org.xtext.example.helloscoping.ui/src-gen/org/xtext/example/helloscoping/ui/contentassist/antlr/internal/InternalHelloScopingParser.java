package org.xtext.example.helloscoping.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.helloscoping.services.HelloScopingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHelloScopingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'{'", "'}'", "'extends'", "'field'", "'ref'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
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
    public String getGrammarFileName() { return "../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g"; }


     
     	private HelloScopingGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(HelloScopingGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:61:1: ( ruleModel EOF )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:69:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:73:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:74:1: ( ( rule__Model__GreetingsAssignment )* )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:75:1: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:76:1: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:76:2: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:88:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:89:1: ( ruleGreeting EOF )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:90:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_ruleGreeting_in_entryRuleGreeting122);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreeting129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:97:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:101:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:102:1: ( ( rule__Greeting__Group__0 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:102:1: ( ( rule__Greeting__Group__0 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:103:1: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:104:1: ( rule__Greeting__Group__0 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:104:2: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleField"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:116:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:117:1: ( ruleField EOF )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:118:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField182);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:125:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:129:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:130:1: ( ( rule__Field__Group__0 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:130:1: ( ( rule__Field__Group__0 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:131:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:132:1: ( rule__Field__Group__0 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:132:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField215);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldReference"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:144:1: entryRuleFieldReference : ruleFieldReference EOF ;
    public final void entryRuleFieldReference() throws RecognitionException {
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:145:1: ( ruleFieldReference EOF )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:146:1: ruleFieldReference EOF
            {
             before(grammarAccess.getFieldReferenceRule()); 
            pushFollow(FOLLOW_ruleFieldReference_in_entryRuleFieldReference242);
            ruleFieldReference();

            state._fsp--;

             after(grammarAccess.getFieldReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldReference249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFieldReference"


    // $ANTLR start "ruleFieldReference"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:153:1: ruleFieldReference : ( ( rule__FieldReference__Group__0 ) ) ;
    public final void ruleFieldReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:157:2: ( ( ( rule__FieldReference__Group__0 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:158:1: ( ( rule__FieldReference__Group__0 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:158:1: ( ( rule__FieldReference__Group__0 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:159:1: ( rule__FieldReference__Group__0 )
            {
             before(grammarAccess.getFieldReferenceAccess().getGroup()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:160:1: ( rule__FieldReference__Group__0 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:160:2: rule__FieldReference__Group__0
            {
            pushFollow(FOLLOW_rule__FieldReference__Group__0_in_ruleFieldReference275);
            rule__FieldReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFieldReference"


    // $ANTLR start "rule__Greeting__Group__0"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:174:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:178:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:179:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0309);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0312);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:186:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:190:1: ( ( 'Hello' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:191:1: ( 'Hello' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:191:1: ( 'Hello' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:192:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl340); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:205:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:209:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:210:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1371);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1374);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:217:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:221:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:222:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:222:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:223:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:224:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:224:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl401);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:234:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:238:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:239:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2431);
            rule__Greeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__2434);
            rule__Greeting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:246:1: rule__Greeting__Group__2__Impl : ( ( rule__Greeting__Group_2__0 )? ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:250:1: ( ( ( rule__Greeting__Group_2__0 )? ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:251:1: ( ( rule__Greeting__Group_2__0 )? )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:251:1: ( ( rule__Greeting__Group_2__0 )? )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:252:1: ( rule__Greeting__Group_2__0 )?
            {
             before(grammarAccess.getGreetingAccess().getGroup_2()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:253:1: ( rule__Greeting__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:253:2: rule__Greeting__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Greeting__Group_2__0_in_rule__Greeting__Group__2__Impl461);
                    rule__Greeting__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGreetingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Greeting__Group__3"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:263:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl rule__Greeting__Group__4 ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:267:1: ( rule__Greeting__Group__3__Impl rule__Greeting__Group__4 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:268:2: rule__Greeting__Group__3__Impl rule__Greeting__Group__4
            {
            pushFollow(FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3492);
            rule__Greeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3495);
            rule__Greeting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__3"


    // $ANTLR start "rule__Greeting__Group__3__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:275:1: rule__Greeting__Group__3__Impl : ( '{' ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:279:1: ( ( '{' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:280:1: ( '{' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:280:1: ( '{' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:281:1: '{'
            {
             before(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__3__Impl523); 
             after(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__3__Impl"


    // $ANTLR start "rule__Greeting__Group__4"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:294:1: rule__Greeting__Group__4 : rule__Greeting__Group__4__Impl rule__Greeting__Group__5 ;
    public final void rule__Greeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:298:1: ( rule__Greeting__Group__4__Impl rule__Greeting__Group__5 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:299:2: rule__Greeting__Group__4__Impl rule__Greeting__Group__5
            {
            pushFollow(FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4554);
            rule__Greeting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__4557);
            rule__Greeting__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__4"


    // $ANTLR start "rule__Greeting__Group__4__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:306:1: rule__Greeting__Group__4__Impl : ( ( rule__Greeting__FieldsAssignment_4 )* ) ;
    public final void rule__Greeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:310:1: ( ( ( rule__Greeting__FieldsAssignment_4 )* ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:311:1: ( ( rule__Greeting__FieldsAssignment_4 )* )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:311:1: ( ( rule__Greeting__FieldsAssignment_4 )* )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:312:1: ( rule__Greeting__FieldsAssignment_4 )*
            {
             before(grammarAccess.getGreetingAccess().getFieldsAssignment_4()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:313:1: ( rule__Greeting__FieldsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:313:2: rule__Greeting__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Greeting__FieldsAssignment_4_in_rule__Greeting__Group__4__Impl584);
            	    rule__Greeting__FieldsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getGreetingAccess().getFieldsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__4__Impl"


    // $ANTLR start "rule__Greeting__Group__5"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:323:1: rule__Greeting__Group__5 : rule__Greeting__Group__5__Impl rule__Greeting__Group__6 ;
    public final void rule__Greeting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:327:1: ( rule__Greeting__Group__5__Impl rule__Greeting__Group__6 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:328:2: rule__Greeting__Group__5__Impl rule__Greeting__Group__6
            {
            pushFollow(FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__5615);
            rule__Greeting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__6_in_rule__Greeting__Group__5618);
            rule__Greeting__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__5"


    // $ANTLR start "rule__Greeting__Group__5__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:335:1: rule__Greeting__Group__5__Impl : ( ( rule__Greeting__ReferencesAssignment_5 )* ) ;
    public final void rule__Greeting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:339:1: ( ( ( rule__Greeting__ReferencesAssignment_5 )* ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:340:1: ( ( rule__Greeting__ReferencesAssignment_5 )* )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:340:1: ( ( rule__Greeting__ReferencesAssignment_5 )* )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:341:1: ( rule__Greeting__ReferencesAssignment_5 )*
            {
             before(grammarAccess.getGreetingAccess().getReferencesAssignment_5()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:342:1: ( rule__Greeting__ReferencesAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:342:2: rule__Greeting__ReferencesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Greeting__ReferencesAssignment_5_in_rule__Greeting__Group__5__Impl645);
            	    rule__Greeting__ReferencesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGreetingAccess().getReferencesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__5__Impl"


    // $ANTLR start "rule__Greeting__Group__6"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:352:1: rule__Greeting__Group__6 : rule__Greeting__Group__6__Impl ;
    public final void rule__Greeting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:356:1: ( rule__Greeting__Group__6__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:357:2: rule__Greeting__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__6__Impl_in_rule__Greeting__Group__6676);
            rule__Greeting__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__6"


    // $ANTLR start "rule__Greeting__Group__6__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:363:1: rule__Greeting__Group__6__Impl : ( '}' ) ;
    public final void rule__Greeting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:367:1: ( ( '}' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:368:1: ( '}' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:368:1: ( '}' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:369:1: '}'
            {
             before(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Greeting__Group__6__Impl704); 
             after(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__6__Impl"


    // $ANTLR start "rule__Greeting__Group_2__0"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:396:1: rule__Greeting__Group_2__0 : rule__Greeting__Group_2__0__Impl rule__Greeting__Group_2__1 ;
    public final void rule__Greeting__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:400:1: ( rule__Greeting__Group_2__0__Impl rule__Greeting__Group_2__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:401:2: rule__Greeting__Group_2__0__Impl rule__Greeting__Group_2__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_2__0__Impl_in_rule__Greeting__Group_2__0749);
            rule__Greeting__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_2__1_in_rule__Greeting__Group_2__0752);
            rule__Greeting__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_2__0"


    // $ANTLR start "rule__Greeting__Group_2__0__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:408:1: rule__Greeting__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Greeting__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:412:1: ( ( 'extends' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:413:1: ( 'extends' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:413:1: ( 'extends' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:414:1: 'extends'
            {
             before(grammarAccess.getGreetingAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Greeting__Group_2__0__Impl780); 
             after(grammarAccess.getGreetingAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_2__0__Impl"


    // $ANTLR start "rule__Greeting__Group_2__1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:427:1: rule__Greeting__Group_2__1 : rule__Greeting__Group_2__1__Impl ;
    public final void rule__Greeting__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:431:1: ( rule__Greeting__Group_2__1__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:432:2: rule__Greeting__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_2__1__Impl_in_rule__Greeting__Group_2__1811);
            rule__Greeting__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_2__1"


    // $ANTLR start "rule__Greeting__Group_2__1__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:438:1: rule__Greeting__Group_2__1__Impl : ( ( rule__Greeting__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Greeting__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:442:1: ( ( ( rule__Greeting__SuperTypeAssignment_2_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:443:1: ( ( rule__Greeting__SuperTypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:443:1: ( ( rule__Greeting__SuperTypeAssignment_2_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:444:1: ( rule__Greeting__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getGreetingAccess().getSuperTypeAssignment_2_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:445:1: ( rule__Greeting__SuperTypeAssignment_2_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:445:2: rule__Greeting__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Greeting__SuperTypeAssignment_2_1_in_rule__Greeting__Group_2__1__Impl838);
            rule__Greeting__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group_2__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:459:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:463:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:464:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0872);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0875);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:471:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:475:1: ( ( 'field' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:476:1: ( 'field' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:476:1: ( 'field' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:477:1: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group__0__Impl903); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:490:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:494:1: ( rule__Field__Group__1__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:495:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__1934);
            rule__Field__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:501:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:505:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:506:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:506:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:507:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:508:1: ( rule__Field__NameAssignment_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:508:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl961);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__FieldReference__Group__0"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:522:1: rule__FieldReference__Group__0 : rule__FieldReference__Group__0__Impl rule__FieldReference__Group__1 ;
    public final void rule__FieldReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:526:1: ( rule__FieldReference__Group__0__Impl rule__FieldReference__Group__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:527:2: rule__FieldReference__Group__0__Impl rule__FieldReference__Group__1
            {
            pushFollow(FOLLOW_rule__FieldReference__Group__0__Impl_in_rule__FieldReference__Group__0995);
            rule__FieldReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FieldReference__Group__1_in_rule__FieldReference__Group__0998);
            rule__FieldReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldReference__Group__0"


    // $ANTLR start "rule__FieldReference__Group__0__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:534:1: rule__FieldReference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__FieldReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:538:1: ( ( 'ref' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:539:1: ( 'ref' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:539:1: ( 'ref' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:540:1: 'ref'
            {
             before(grammarAccess.getFieldReferenceAccess().getRefKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__FieldReference__Group__0__Impl1026); 
             after(grammarAccess.getFieldReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldReference__Group__0__Impl"


    // $ANTLR start "rule__FieldReference__Group__1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:553:1: rule__FieldReference__Group__1 : rule__FieldReference__Group__1__Impl ;
    public final void rule__FieldReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:557:1: ( rule__FieldReference__Group__1__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:558:2: rule__FieldReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FieldReference__Group__1__Impl_in_rule__FieldReference__Group__11057);
            rule__FieldReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldReference__Group__1"


    // $ANTLR start "rule__FieldReference__Group__1__Impl"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:564:1: rule__FieldReference__Group__1__Impl : ( ( rule__FieldReference__ReferenceAssignment_1 ) ) ;
    public final void rule__FieldReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:568:1: ( ( ( rule__FieldReference__ReferenceAssignment_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:569:1: ( ( rule__FieldReference__ReferenceAssignment_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:569:1: ( ( rule__FieldReference__ReferenceAssignment_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:570:1: ( rule__FieldReference__ReferenceAssignment_1 )
            {
             before(grammarAccess.getFieldReferenceAccess().getReferenceAssignment_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:571:1: ( rule__FieldReference__ReferenceAssignment_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:571:2: rule__FieldReference__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__FieldReference__ReferenceAssignment_1_in_rule__FieldReference__Group__1__Impl1084);
            rule__FieldReference__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldReferenceAccess().getReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldReference__Group__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:586:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:590:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:591:1: ( ruleGreeting )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:591:1: ( ruleGreeting )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:592:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment1123);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:601:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:605:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:606:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:606:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:607:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11154); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__Greeting__SuperTypeAssignment_2_1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:616:1: rule__Greeting__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:620:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:621:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:621:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:622:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getSuperTypeGreetingCrossReference_2_1_0()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:623:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:624:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getSuperTypeGreetingIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__SuperTypeAssignment_2_11189); 
             after(grammarAccess.getGreetingAccess().getSuperTypeGreetingIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGreetingAccess().getSuperTypeGreetingCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Greeting__FieldsAssignment_4"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:635:1: rule__Greeting__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Greeting__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:639:1: ( ( ruleField ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:640:1: ( ruleField )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:640:1: ( ruleField )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:641:1: ruleField
            {
             before(grammarAccess.getGreetingAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Greeting__FieldsAssignment_41224);
            ruleField();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getFieldsFieldParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__FieldsAssignment_4"


    // $ANTLR start "rule__Greeting__ReferencesAssignment_5"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:650:1: rule__Greeting__ReferencesAssignment_5 : ( ruleFieldReference ) ;
    public final void rule__Greeting__ReferencesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:654:1: ( ( ruleFieldReference ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:655:1: ( ruleFieldReference )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:655:1: ( ruleFieldReference )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:656:1: ruleFieldReference
            {
             before(grammarAccess.getGreetingAccess().getReferencesFieldReferenceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleFieldReference_in_rule__Greeting__ReferencesAssignment_51255);
            ruleFieldReference();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getReferencesFieldReferenceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__ReferencesAssignment_5"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:665:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:669:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:670:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:670:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:671:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_11286); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"


    // $ANTLR start "rule__FieldReference__ReferenceAssignment_1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:680:1: rule__FieldReference__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__FieldReference__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:684:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:685:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:685:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:686:1: ( RULE_ID )
            {
             before(grammarAccess.getFieldReferenceAccess().getReferenceFieldCrossReference_1_0()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:687:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:688:1: RULE_ID
            {
             before(grammarAccess.getFieldReferenceAccess().getReferenceFieldIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FieldReference__ReferenceAssignment_11321); 
             after(grammarAccess.getFieldReferenceAccess().getReferenceFieldIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFieldReferenceAccess().getReferenceFieldCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FieldReference__ReferenceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GreetingsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleGreeting_in_entryRuleGreeting122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreeting129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0_in_ruleGreeting155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0_in_ruleField215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldReference_in_entryRuleFieldReference242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldReference249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldReference__Group__0_in_ruleFieldReference275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1371 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2431 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__0_in_rule__Greeting__Group__2__Impl461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3492 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__3__Impl523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4554 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__FieldsAssignment_4_in_rule__Greeting__Group__4__Impl584 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__5615 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__6_in_rule__Greeting__Group__5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__ReferencesAssignment_5_in_rule__Greeting__Group__5__Impl645 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__6__Impl_in_rule__Greeting__Group__6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greeting__Group__6__Impl704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__0__Impl_in_rule__Greeting__Group_2__0749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__1_in_rule__Greeting__Group_2__0752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greeting__Group_2__0__Impl780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__1__Impl_in_rule__Greeting__Group_2__1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__SuperTypeAssignment_2_1_in_rule__Greeting__Group_2__1__Impl838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group__0__Impl903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldReference__Group__0__Impl_in_rule__FieldReference__Group__0995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FieldReference__Group__1_in_rule__FieldReference__Group__0998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__FieldReference__Group__0__Impl1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldReference__Group__1__Impl_in_rule__FieldReference__Group__11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FieldReference__ReferenceAssignment_1_in_rule__FieldReference__Group__1__Impl1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_11154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__SuperTypeAssignment_2_11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Greeting__FieldsAssignment_41224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldReference_in_rule__Greeting__ReferencesAssignment_51255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_11286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FieldReference__ReferenceAssignment_11321 = new BitSet(new long[]{0x0000000000000002L});

}