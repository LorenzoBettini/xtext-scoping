package org.xtext.example.helloscoping.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.helloscoping.helloScoping.Field;
import org.xtext.example.helloscoping.helloScoping.Greeting;
import org.xtext.example.helloscoping.helloScoping.HelloScopingPackage;
import org.xtext.example.helloscoping.helloScoping.Model;
import org.xtext.example.helloscoping.services.HelloScopingGrammarAccess;

@SuppressWarnings("all")
public class HelloScopingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private HelloScopingGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == HelloScopingPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case HelloScopingPackage.FIELD:
				if(context == grammarAccess.getFieldRule()) {
					sequence_Field(context, (Field) semanticObject); 
					return; 
				}
				else break;
			case HelloScopingPackage.GREETING:
				if(context == grammarAccess.getGreetingRule()) {
					sequence_Greeting(context, (Greeting) semanticObject); 
					return; 
				}
				else break;
			case HelloScopingPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, HelloScopingPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, HelloScopingPackage.Literals.FIELD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Greeting|ID]? fields+=Field*)
	 */
	protected void sequence_Greeting(EObject context, Greeting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     greetings+=Greeting*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
