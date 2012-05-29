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
			Hello foo!
			Hello bar!
		'''.parse.assertNotNull
	}
	
	@Test
	def void testParsingAndLinking() {
		'''
			Hello foo!
			Hello bar!
		'''.parseAndAsserNoError
	}
	
	def void parseAndAsserNoError(CharSequence seq) {
		val model = seq.parse
		model.assertNotNull
		model.assertNoErrors
	}
}