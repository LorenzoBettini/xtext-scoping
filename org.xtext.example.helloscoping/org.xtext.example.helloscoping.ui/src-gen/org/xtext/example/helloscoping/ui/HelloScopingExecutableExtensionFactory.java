/*
 * generated by Xtext
 */
package org.xtext.example.helloscoping.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.helloscoping.ui.internal.HelloScopingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class HelloScopingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return HelloScopingActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return HelloScopingActivator.getInstance().getInjector(HelloScopingActivator.ORG_XTEXT_EXAMPLE_HELLOSCOPING_HELLOSCOPING);
	}
	
}
