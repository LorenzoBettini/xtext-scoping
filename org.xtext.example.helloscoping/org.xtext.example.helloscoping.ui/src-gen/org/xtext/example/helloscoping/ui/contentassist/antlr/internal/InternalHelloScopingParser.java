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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'{'", "'}'", "'extends'", "'field'"
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


    // $ANTLR start "rule__Greeting__Group__0"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:146:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:150:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:151:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0249);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0252);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:158:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:162:1: ( ( 'Hello' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:163:1: ( 'Hello' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:163:1: ( 'Hello' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:164:1: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Greeting__Group__0__Impl280); 
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:177:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:181:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:182:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1311);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1314);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:189:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:193:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:194:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:194:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:195:1: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:196:1: ( rule__Greeting__NameAssignment_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:196:2: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl341);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:206:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl rule__Greeting__Group__3 ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:210:1: ( rule__Greeting__Group__2__Impl rule__Greeting__Group__3 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:211:2: rule__Greeting__Group__2__Impl rule__Greeting__Group__3
            {
            pushFollow(FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2371);
            rule__Greeting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__2374);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:218:1: rule__Greeting__Group__2__Impl : ( ( rule__Greeting__Group_2__0 )? ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:222:1: ( ( ( rule__Greeting__Group_2__0 )? ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:223:1: ( ( rule__Greeting__Group_2__0 )? )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:223:1: ( ( rule__Greeting__Group_2__0 )? )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:224:1: ( rule__Greeting__Group_2__0 )?
            {
             before(grammarAccess.getGreetingAccess().getGroup_2()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:225:1: ( rule__Greeting__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:225:2: rule__Greeting__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Greeting__Group_2__0_in_rule__Greeting__Group__2__Impl401);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:235:1: rule__Greeting__Group__3 : rule__Greeting__Group__3__Impl rule__Greeting__Group__4 ;
    public final void rule__Greeting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:239:1: ( rule__Greeting__Group__3__Impl rule__Greeting__Group__4 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:240:2: rule__Greeting__Group__3__Impl rule__Greeting__Group__4
            {
            pushFollow(FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3432);
            rule__Greeting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3435);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:247:1: rule__Greeting__Group__3__Impl : ( '{' ) ;
    public final void rule__Greeting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:251:1: ( ( '{' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:252:1: ( '{' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:252:1: ( '{' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:253:1: '{'
            {
             before(grammarAccess.getGreetingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Greeting__Group__3__Impl463); 
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:266:1: rule__Greeting__Group__4 : rule__Greeting__Group__4__Impl rule__Greeting__Group__5 ;
    public final void rule__Greeting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:270:1: ( rule__Greeting__Group__4__Impl rule__Greeting__Group__5 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:271:2: rule__Greeting__Group__4__Impl rule__Greeting__Group__5
            {
            pushFollow(FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4494);
            rule__Greeting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__4497);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:278:1: rule__Greeting__Group__4__Impl : ( ( rule__Greeting__FieldsAssignment_4 )* ) ;
    public final void rule__Greeting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:282:1: ( ( ( rule__Greeting__FieldsAssignment_4 )* ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:283:1: ( ( rule__Greeting__FieldsAssignment_4 )* )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:283:1: ( ( rule__Greeting__FieldsAssignment_4 )* )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:284:1: ( rule__Greeting__FieldsAssignment_4 )*
            {
             before(grammarAccess.getGreetingAccess().getFieldsAssignment_4()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:285:1: ( rule__Greeting__FieldsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:285:2: rule__Greeting__FieldsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Greeting__FieldsAssignment_4_in_rule__Greeting__Group__4__Impl524);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:295:1: rule__Greeting__Group__5 : rule__Greeting__Group__5__Impl ;
    public final void rule__Greeting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:299:1: ( rule__Greeting__Group__5__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:300:2: rule__Greeting__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__5555);
            rule__Greeting__Group__5__Impl();

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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:306:1: rule__Greeting__Group__5__Impl : ( '}' ) ;
    public final void rule__Greeting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:310:1: ( ( '}' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:311:1: ( '}' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:311:1: ( '}' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:312:1: '}'
            {
             before(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Greeting__Group__5__Impl583); 
             after(grammarAccess.getGreetingAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Greeting__Group_2__0"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:337:1: rule__Greeting__Group_2__0 : rule__Greeting__Group_2__0__Impl rule__Greeting__Group_2__1 ;
    public final void rule__Greeting__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:341:1: ( rule__Greeting__Group_2__0__Impl rule__Greeting__Group_2__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:342:2: rule__Greeting__Group_2__0__Impl rule__Greeting__Group_2__1
            {
            pushFollow(FOLLOW_rule__Greeting__Group_2__0__Impl_in_rule__Greeting__Group_2__0626);
            rule__Greeting__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Greeting__Group_2__1_in_rule__Greeting__Group_2__0629);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:349:1: rule__Greeting__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Greeting__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:353:1: ( ( 'extends' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:354:1: ( 'extends' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:354:1: ( 'extends' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:355:1: 'extends'
            {
             before(grammarAccess.getGreetingAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__Greeting__Group_2__0__Impl657); 
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:368:1: rule__Greeting__Group_2__1 : rule__Greeting__Group_2__1__Impl ;
    public final void rule__Greeting__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:372:1: ( rule__Greeting__Group_2__1__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:373:2: rule__Greeting__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Greeting__Group_2__1__Impl_in_rule__Greeting__Group_2__1688);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:379:1: rule__Greeting__Group_2__1__Impl : ( ( rule__Greeting__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Greeting__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:383:1: ( ( ( rule__Greeting__SuperTypeAssignment_2_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:384:1: ( ( rule__Greeting__SuperTypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:384:1: ( ( rule__Greeting__SuperTypeAssignment_2_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:385:1: ( rule__Greeting__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getGreetingAccess().getSuperTypeAssignment_2_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:386:1: ( rule__Greeting__SuperTypeAssignment_2_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:386:2: rule__Greeting__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Greeting__SuperTypeAssignment_2_1_in_rule__Greeting__Group_2__1__Impl715);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:400:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:404:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:405:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0749);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0752);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:412:1: rule__Field__Group__0__Impl : ( 'field' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:416:1: ( ( 'field' ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:417:1: ( 'field' )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:417:1: ( 'field' )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:418:1: 'field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Field__Group__0__Impl780); 
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:431:1: rule__Field__Group__1 : rule__Field__Group__1__Impl ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:435:1: ( rule__Field__Group__1__Impl )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:436:2: rule__Field__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__1811);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:442:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:446:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:447:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:447:1: ( ( rule__Field__NameAssignment_1 ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:448:1: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:449:1: ( rule__Field__NameAssignment_1 )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:449:2: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl838);
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


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:464:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:468:1: ( ( ruleGreeting ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:469:1: ( ruleGreeting )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:469:1: ( ruleGreeting )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:470:1: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment877);
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:479:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:483:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:484:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:484:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:485:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1908); 
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:494:1: rule__Greeting__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Greeting__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:498:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:499:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:499:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:500:1: ( RULE_ID )
            {
             before(grammarAccess.getGreetingAccess().getSuperTypeGreetingCrossReference_2_1_0()); 
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:501:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:502:1: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getSuperTypeGreetingIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Greeting__SuperTypeAssignment_2_1943); 
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
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:513:1: rule__Greeting__FieldsAssignment_4 : ( ruleField ) ;
    public final void rule__Greeting__FieldsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:517:1: ( ( ruleField ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:518:1: ( ruleField )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:518:1: ( ruleField )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:519:1: ruleField
            {
             before(grammarAccess.getGreetingAccess().getFieldsFieldParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleField_in_rule__Greeting__FieldsAssignment_4978);
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


    // $ANTLR start "rule__Field__NameAssignment_1"
    // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:528:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:532:1: ( ( RULE_ID ) )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:533:1: ( RULE_ID )
            {
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:533:1: ( RULE_ID )
            // ../org.xtext.example.helloscoping.ui/src-gen/org/xtext/example/helloscoping/ui/contentassist/antlr/internal/InternalHelloScoping.g:534:1: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Field__NameAssignment_11009); 
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
    public static final BitSet FOLLOW_rule__Greeting__Group__0__Impl_in_rule__Greeting__Group__0249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1_in_rule__Greeting__Group__0252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Greeting__Group__0__Impl280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__1__Impl_in_rule__Greeting__Group__1311 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2_in_rule__Greeting__Group__1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__NameAssignment_1_in_rule__Greeting__Group__1__Impl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__2__Impl_in_rule__Greeting__Group__2371 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3_in_rule__Greeting__Group__2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__0_in_rule__Greeting__Group__2__Impl401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__3__Impl_in_rule__Greeting__Group__3432 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4_in_rule__Greeting__Group__3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Greeting__Group__3__Impl463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__4__Impl_in_rule__Greeting__Group__4494 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5_in_rule__Greeting__Group__4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__FieldsAssignment_4_in_rule__Greeting__Group__4__Impl524 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Greeting__Group__5__Impl_in_rule__Greeting__Group__5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Greeting__Group__5__Impl583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__0__Impl_in_rule__Greeting__Group_2__0626 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__1_in_rule__Greeting__Group_2__0629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Greeting__Group_2__0__Impl657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__Group_2__1__Impl_in_rule__Greeting__Group_2__1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Greeting__SuperTypeAssignment_2_1_in_rule__Greeting__Group_2__1__Impl715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__0__Impl_in_rule__Field__Group__0749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Field__Group__1_in_rule__Field__Group__0752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Field__Group__0__Impl780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__Group__1__Impl_in_rule__Field__Group__1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Field__NameAssignment_1_in_rule__Field__Group__1__Impl838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreeting_in_rule__Model__GreetingsAssignment877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__NameAssignment_1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Greeting__SuperTypeAssignment_2_1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_rule__Greeting__FieldsAssignment_4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Field__NameAssignment_11009 = new BitSet(new long[]{0x0000000000000002L});

}