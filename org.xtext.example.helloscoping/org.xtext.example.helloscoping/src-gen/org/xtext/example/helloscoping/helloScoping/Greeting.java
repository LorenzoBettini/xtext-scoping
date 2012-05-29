/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.helloscoping.helloScoping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.helloscoping.helloScoping.Greeting#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.helloscoping.helloScoping.Greeting#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.helloscoping.helloScoping.Greeting#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.helloscoping.helloScoping.HelloScopingPackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.helloscoping.helloScoping.HelloScopingPackage#getGreeting_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.helloscoping.helloScoping.Greeting#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Greeting)
   * @see org.xtext.example.helloscoping.helloScoping.HelloScopingPackage#getGreeting_SuperType()
   * @model
   * @generated
   */
  Greeting getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.example.helloscoping.helloScoping.Greeting#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Greeting value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.helloscoping.helloScoping.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.xtext.example.helloscoping.helloScoping.HelloScopingPackage#getGreeting_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Greeting
