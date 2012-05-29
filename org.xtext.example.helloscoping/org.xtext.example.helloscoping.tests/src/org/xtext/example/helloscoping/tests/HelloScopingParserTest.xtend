package org.xtext.example.helloscoping.tests

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.helloscoping.HelloScopingInjectorProvider
import org.xtext.example.helloscoping.helloScoping.Model
import static extension org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(HelloScopingInjectorProvider))
class HelloScopingParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper

	@Test
	def void testParsing() {
		'''
			Hello foo {
				field foo
			}
			Hello bar extends foo {
				field bar
			}
		'''.parseAndAsserNoError
	}
	
	@Test
	def void testParsingAndLinking() {
		'''
			Hello foo {
				field foo
				ref foo
			}
			Hello bar extends foo {
				field bar
				field foobar
				ref bar
				ref foobar
			}
		'''.parseAndAsserNoError
	}
	
	@Test
	def void testInheritedField() {
		'''
			Hello foo {
				field foo
			}
			Hello bar extends foo {
				ref foo
			}
		'''.parseAndAsserNoError
	}

	@Test
	def void testCyclicHierarchy() {
		'''
			Hello foo extends foo3 {
				field foo
			}
			Hello foo2 extends foo {
				ref foo
			}
			Hello foo3 extends foo2 {
				ref foo
			}
		'''.parseAndAsserNoError
	}

	@Test
	def void testCorrectLinking() {
		val model = '''
			Hello base {
				field foo
			}
			Hello derived1 extends base {
				field foo
			}
			Hello derived2 extends derived1 {
				ref foo
			}
		'''.parseAndAsserNoError
		// foo in derived2 must refer to derived1.foo
		// NOT base.foo
		model.greetings.get(2).references.get(0).reference.
			assertSame(model.greetings.get(1).fields.get(0))
	}
	
	def parseAndAsserNoError(CharSequence seq) {
		val model = seq.parse
		model.assertNotNull
		model.assertNoErrors
		model
	}
}