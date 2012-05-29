package org.xtext.example.helloscoping.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.helloscoping.HelloScopingInjectorProvider;
import org.xtext.example.helloscoping.helloScoping.Model;

@RunWith(value = XtextRunner.class)
@InjectWith(value = HelloScopingInjectorProvider.class)
@SuppressWarnings("all")
public class HelloScopingParserTest {
  @Inject
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testParsing() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello foo!");
      _builder.newLine();
      _builder.append("Hello bar!");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      Assert.assertNotNull(_parse);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParsingAndLinking() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo!");
    _builder.newLine();
    _builder.append("Hello bar!");
    _builder.newLine();
    this.parseAndAsserNoError(_builder);
  }
  
  public void parseAndAsserNoError(final CharSequence seq) {
    try {
      final Model model = this._parseHelper.parse(seq);
      Assert.assertNotNull(model);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
