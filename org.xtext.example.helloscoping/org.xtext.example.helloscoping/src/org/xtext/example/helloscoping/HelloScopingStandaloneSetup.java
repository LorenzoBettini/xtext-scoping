
package org.xtext.example.helloscoping;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HelloScopingStandaloneSetup extends HelloScopingStandaloneSetupGenerated{

	public static void doSetup() {
		new HelloScopingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

