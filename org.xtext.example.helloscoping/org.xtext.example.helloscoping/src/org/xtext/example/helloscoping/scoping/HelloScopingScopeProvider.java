/*
 * generated by Xtext
 */
package org.xtext.example.helloscoping.scoping;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.xtext.example.helloscoping.helloScoping.FieldReference;
import org.xtext.example.helloscoping.helloScoping.Greeting;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
public class HelloScopingScopeProvider extends AbstractDeclarativeScopeProvider {

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof FieldReference) {
			FieldReference fieldReference = (FieldReference) context;
			Greeting greeting = (Greeting) fieldReference.eContainer();
			return getFields(greeting, new LinkedList<Greeting>());
		}

		return super.getScope(context, reference);
	}

	private IScope getFields(Greeting greeting, Collection<Greeting> visited) {
		// deal with possible cycle in the hierarchy
		if (greeting == null || visited.contains(greeting))
			return IScope.NULLSCOPE;
		visited.add(greeting);
		IScope parentScope = getFields(greeting.getSuperType(), visited);
		return Scopes.scopeFor(greeting.getFields(), parentScope);
	}

}
