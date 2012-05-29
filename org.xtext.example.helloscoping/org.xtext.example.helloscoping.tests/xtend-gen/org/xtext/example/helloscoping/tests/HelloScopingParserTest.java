package org.xtext.example.helloscoping.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
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
import org.xtext.example.helloscoping.helloScoping.Field;
import org.xtext.example.helloscoping.helloScoping.FieldReference;
import org.xtext.example.helloscoping.helloScoping.Greeting;
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello bar extends foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field bar");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.parseAndAsserNoError(_builder);
  }
  
  @Test
  public void testParsingAndLinking() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foo");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello bar extends foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field bar");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foobar");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref bar");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref foobar");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.parseAndAsserNoError(_builder);
  }
  
  @Test
  public void testInheritedField() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello bar extends foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.parseAndAsserNoError(_builder);
  }
  
  @Test
  public void testCyclicHierarchy() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello foo extends foo3 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello foo2 extends foo {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello foo3 extends foo2 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.parseAndAsserNoError(_builder);
  }
  
  @Test
  public void testCorrectLinking() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Hello base {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello derived1 extends base {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("field foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Hello derived2 extends derived1 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ref foo");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final Model model = this.parseAndAsserNoError(_builder);
    EList<Greeting> _greetings = model.getGreetings();
    Greeting _get = _greetings.get(2);
    EList<FieldReference> _references = _get.getReferences();
    FieldReference _get_1 = _references.get(0);
    Field _reference = _get_1.getReference();
    EList<Greeting> _greetings_1 = model.getGreetings();
    Greeting _get_2 = _greetings_1.get(1);
    EList<Field> _fields = _get_2.getFields();
    Field _get_3 = _fields.get(0);
    Assert.assertSame(_reference, _get_3);
  }
  
  public Model parseAndAsserNoError(final CharSequence seq) {
    try {
      Model _xblockexpression = null;
      {
        final Model model = this._parseHelper.parse(seq);
        Assert.assertNotNull(model);
        this._validationTestHelper.assertNoErrors(model);
        _xblockexpression = (model);
      }
      return _xblockexpression;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
