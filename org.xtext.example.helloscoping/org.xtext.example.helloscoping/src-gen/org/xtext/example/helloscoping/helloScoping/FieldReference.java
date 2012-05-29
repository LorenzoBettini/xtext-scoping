/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.helloscoping.helloScoping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.helloscoping.helloScoping.FieldReference#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.helloscoping.helloScoping.HelloScopingPackage#getFieldReference()
 * @model
 * @generated
 */
public interface FieldReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(Field)
   * @see org.xtext.example.helloscoping.helloScoping.HelloScopingPackage#getFieldReference_Reference()
   * @model
   * @generated
   */
  Field getReference();

  /**
   * Sets the value of the '{@link org.xtext.example.helloscoping.helloScoping.FieldReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(Field value);

} // FieldReference
