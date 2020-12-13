/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.unoDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.unoDsl.UnoDslPackage
 * @generated
 */
public interface UnoDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UnoDslFactory eINSTANCE = org.xtext.example.mydsl.unoDsl.impl.UnoDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Uno Config</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uno Config</em>'.
   * @generated
   */
  UnoConfig createUnoConfig();

  /**
   * Returns a new object of class '<em>Depose Cartes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Depose Cartes</em>'.
   * @generated
   */
  DeposeCartes createDeposeCartes();

  /**
   * Returns a new object of class '<em>Enum Regles Depose Cartes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Regles Depose Cartes</em>'.
   * @generated
   */
  EnumReglesDeposeCartes createEnumReglesDeposeCartes();

  /**
   * Returns a new object of class '<em>Visibilite</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Visibilite</em>'.
   * @generated
   */
  Visibilite createVisibilite();

  /**
   * Returns a new object of class '<em>Cartes Speciales</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cartes Speciales</em>'.
   * @generated
   */
  CartesSpeciales createCartesSpeciales();

  /**
   * Returns a new object of class '<em>Enum Cartes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Cartes</em>'.
   * @generated
   */
  EnumCartes createEnumCartes();

  /**
   * Returns a new object of class '<em>Nombre De Pioches</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nombre De Pioches</em>'.
   * @generated
   */
  NombreDePioches createNombreDePioches();

  /**
   * Returns a new object of class '<em>Peut Jouer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Peut Jouer</em>'.
   * @generated
   */
  PeutJouer createPeutJouer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  UnoDslPackage getUnoDslPackage();

} //UnoDslFactory