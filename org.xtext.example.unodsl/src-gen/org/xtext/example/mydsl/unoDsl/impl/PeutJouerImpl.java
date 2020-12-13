/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.unoDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.unoDsl.PeutJouer;
import org.xtext.example.mydsl.unoDsl.UnoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Peut Jouer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.PeutJouerImpl#getPeutJouerEnsuite <em>Peut Jouer Ensuite</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.PeutJouerImpl#getPeutPasJouerEnsuite <em>Peut Pas Jouer Ensuite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeutJouerImpl extends MinimalEObjectImpl.Container implements PeutJouer
{
  /**
   * The default value of the '{@link #getPeutJouerEnsuite() <em>Peut Jouer Ensuite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeutJouerEnsuite()
   * @generated
   * @ordered
   */
  protected static final String PEUT_JOUER_ENSUITE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPeutJouerEnsuite() <em>Peut Jouer Ensuite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeutJouerEnsuite()
   * @generated
   * @ordered
   */
  protected String peutJouerEnsuite = PEUT_JOUER_ENSUITE_EDEFAULT;

  /**
   * The default value of the '{@link #getPeutPasJouerEnsuite() <em>Peut Pas Jouer Ensuite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeutPasJouerEnsuite()
   * @generated
   * @ordered
   */
  protected static final String PEUT_PAS_JOUER_ENSUITE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPeutPasJouerEnsuite() <em>Peut Pas Jouer Ensuite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeutPasJouerEnsuite()
   * @generated
   * @ordered
   */
  protected String peutPasJouerEnsuite = PEUT_PAS_JOUER_ENSUITE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PeutJouerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnoDslPackage.Literals.PEUT_JOUER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPeutJouerEnsuite()
  {
    return peutJouerEnsuite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeutJouerEnsuite(String newPeutJouerEnsuite)
  {
    String oldPeutJouerEnsuite = peutJouerEnsuite;
    peutJouerEnsuite = newPeutJouerEnsuite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.PEUT_JOUER__PEUT_JOUER_ENSUITE, oldPeutJouerEnsuite, peutJouerEnsuite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPeutPasJouerEnsuite()
  {
    return peutPasJouerEnsuite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeutPasJouerEnsuite(String newPeutPasJouerEnsuite)
  {
    String oldPeutPasJouerEnsuite = peutPasJouerEnsuite;
    peutPasJouerEnsuite = newPeutPasJouerEnsuite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.PEUT_JOUER__PEUT_PAS_JOUER_ENSUITE, oldPeutPasJouerEnsuite, peutPasJouerEnsuite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnoDslPackage.PEUT_JOUER__PEUT_JOUER_ENSUITE:
        return getPeutJouerEnsuite();
      case UnoDslPackage.PEUT_JOUER__PEUT_PAS_JOUER_ENSUITE:
        return getPeutPasJouerEnsuite();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnoDslPackage.PEUT_JOUER__PEUT_JOUER_ENSUITE:
        setPeutJouerEnsuite((String)newValue);
        return;
      case UnoDslPackage.PEUT_JOUER__PEUT_PAS_JOUER_ENSUITE:
        setPeutPasJouerEnsuite((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnoDslPackage.PEUT_JOUER__PEUT_JOUER_ENSUITE:
        setPeutJouerEnsuite(PEUT_JOUER_ENSUITE_EDEFAULT);
        return;
      case UnoDslPackage.PEUT_JOUER__PEUT_PAS_JOUER_ENSUITE:
        setPeutPasJouerEnsuite(PEUT_PAS_JOUER_ENSUITE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnoDslPackage.PEUT_JOUER__PEUT_JOUER_ENSUITE:
        return PEUT_JOUER_ENSUITE_EDEFAULT == null ? peutJouerEnsuite != null : !PEUT_JOUER_ENSUITE_EDEFAULT.equals(peutJouerEnsuite);
      case UnoDslPackage.PEUT_JOUER__PEUT_PAS_JOUER_ENSUITE:
        return PEUT_PAS_JOUER_ENSUITE_EDEFAULT == null ? peutPasJouerEnsuite != null : !PEUT_PAS_JOUER_ENSUITE_EDEFAULT.equals(peutPasJouerEnsuite);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (peutJouerEnsuite: ");
    result.append(peutJouerEnsuite);
    result.append(", peutPasJouerEnsuite: ");
    result.append(peutPasJouerEnsuite);
    result.append(')');
    return result.toString();
  }

} //PeutJouerImpl
