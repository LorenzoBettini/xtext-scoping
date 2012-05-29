/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.helloscoping.helloScoping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.helloscoping.helloScoping.HelloScopingFactory
 * @model kind="package"
 * @generated
 */
public interface HelloScopingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "helloScoping";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/helloscoping/HelloScoping";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "helloScoping";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HelloScopingPackage eINSTANCE = org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.helloscoping.helloScoping.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.helloscoping.helloScoping.impl.ModelImpl
   * @see org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.helloscoping.helloScoping.impl.GreetingImpl <em>Greeting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.helloscoping.helloScoping.impl.GreetingImpl
   * @see org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl#getGreeting()
   * @generated
   */
  int GREETING = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING__FIELDS = 2;

  /**
   * The number of structural features of the '<em>Greeting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREETING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.helloscoping.helloScoping.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.helloscoping.helloScoping.impl.FieldImpl
   * @see org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl#getField()
   * @generated
   */
  int FIELD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.helloscoping.helloScoping.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.helloscoping.helloScoping.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.helloscoping.helloScoping.Greeting <em>Greeting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greeting</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Greeting
   * @generated
   */
  EClass getGreeting();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.helloscoping.helloScoping.Greeting#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Greeting#getName()
   * @see #getGreeting()
   * @generated
   */
  EAttribute getGreeting_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.helloscoping.helloScoping.Greeting#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Greeting#getSuperType()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.helloscoping.helloScoping.Greeting#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Greeting#getFields()
   * @see #getGreeting()
   * @generated
   */
  EReference getGreeting_Fields();

  /**
   * Returns the meta object for class '{@link org.xtext.example.helloscoping.helloScoping.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.helloscoping.helloScoping.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.helloscoping.helloScoping.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HelloScopingFactory getHelloScopingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.helloscoping.helloScoping.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.helloscoping.helloScoping.impl.ModelImpl
     * @see org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link org.xtext.example.helloscoping.helloScoping.impl.GreetingImpl <em>Greeting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.helloscoping.helloScoping.impl.GreetingImpl
     * @see org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl#getGreeting()
     * @generated
     */
    EClass GREETING = eINSTANCE.getGreeting();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GREETING__NAME = eINSTANCE.getGreeting_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREETING__SUPER_TYPE = eINSTANCE.getGreeting_SuperType();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREETING__FIELDS = eINSTANCE.getGreeting_Fields();

    /**
     * The meta object literal for the '{@link org.xtext.example.helloscoping.helloScoping.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.helloscoping.helloScoping.impl.FieldImpl
     * @see org.xtext.example.helloscoping.helloScoping.impl.HelloScopingPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

  }

} //HelloScopingPackage
