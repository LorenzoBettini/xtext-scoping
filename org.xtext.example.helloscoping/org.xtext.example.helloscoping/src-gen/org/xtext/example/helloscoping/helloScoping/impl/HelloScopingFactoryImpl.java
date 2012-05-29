/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.helloscoping.helloScoping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.helloscoping.helloScoping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelloScopingFactoryImpl extends EFactoryImpl implements HelloScopingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static HelloScopingFactory init()
  {
    try
    {
      HelloScopingFactory theHelloScopingFactory = (HelloScopingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/helloscoping/HelloScoping"); 
      if (theHelloScopingFactory != null)
      {
        return theHelloScopingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new HelloScopingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloScopingFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case HelloScopingPackage.MODEL: return createModel();
      case HelloScopingPackage.GREETING: return createGreeting();
      case HelloScopingPackage.FIELD: return createField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HelloScopingPackage getHelloScopingPackage()
  {
    return (HelloScopingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static HelloScopingPackage getPackage()
  {
    return HelloScopingPackage.eINSTANCE;
  }

} //HelloScopingFactoryImpl
