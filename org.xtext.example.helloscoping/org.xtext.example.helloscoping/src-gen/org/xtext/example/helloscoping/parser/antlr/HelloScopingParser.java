/*
* generated by Xtext
*/
package org.xtext.example.helloscoping.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.helloscoping.services.HelloScopingGrammarAccess;

public class HelloScopingParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private HelloScopingGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.example.helloscoping.parser.antlr.internal.InternalHelloScopingParser createParser(XtextTokenStream stream) {
		return new org.xtext.example.helloscoping.parser.antlr.internal.InternalHelloScopingParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public HelloScopingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HelloScopingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
