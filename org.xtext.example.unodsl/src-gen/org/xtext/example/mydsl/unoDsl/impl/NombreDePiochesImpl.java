/**
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.unoDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.unoDsl.NombreDePioches;
import org.xtext.example.mydsl.unoDsl.PeutJouer;
import org.xtext.example.mydsl.unoDsl.UnoDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nombre De Pioches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.NombreDePiochesImpl#getUneFois <em>Une Fois</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.NombreDePiochesImpl#getPeutJouer <em>Peut Jouer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.unoDsl.impl.NombreDePiochesImpl#getTroisFois <em>Trois Fois</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NombreDePiochesImpl extends MinimalEObjectImpl.Container implements NombreDePioches
{
  /**
   * The default value of the '{@link #getUneFois() <em>Une Fois</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUneFois()
   * @generated
   * @ordered
   */
  protected static final String UNE_FOIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUneFois() <em>Une Fois</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUneFois()
   * @generated
   * @ordered
   */
  protected String uneFois = UNE_FOIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getPeutJouer() <em>Peut Jouer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPeutJouer()
   * @generated
   * @ordered
   */
  protected PeutJouer peutJouer;

  /**
   * The default value of the '{@link #getTroisFois() <em>Trois Fois</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTroisFois()
   * @generated
   * @ordered
   */
  protected static final String TROIS_FOIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTroisFois() <em>Trois Fois</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTroisFois()
   * @generated
   * @ordered
   */
  protected String troisFois = TROIS_FOIS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NombreDePiochesImpl()
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
    return UnoDslPackage.Literals.NOMBRE_DE_PIOCHES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUneFois()
  {
    return uneFois;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUneFois(String newUneFois)
  {
    String oldUneFois = uneFois;
    uneFois = newUneFois;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.NOMBRE_DE_PIOCHES__UNE_FOIS, oldUneFois, uneFois));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PeutJouer getPeutJouer()
  {
    return peutJouer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPeutJouer(PeutJouer newPeutJouer, NotificationChain msgs)
  {
    PeutJouer oldPeutJouer = peutJouer;
    peutJouer = newPeutJouer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER, oldPeutJouer, newPeutJouer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPeutJouer(PeutJouer newPeutJouer)
  {
    if (newPeutJouer != peutJouer)
    {
      NotificationChain msgs = null;
      if (peutJouer != null)
        msgs = ((InternalEObject)peutJouer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER, null, msgs);
      if (newPeutJouer != null)
        msgs = ((InternalEObject)newPeutJouer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER, null, msgs);
      msgs = basicSetPeutJouer(newPeutJouer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER, newPeutJouer, newPeutJouer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTroisFois()
  {
    return troisFois;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTroisFois(String newTroisFois)
  {
    String oldTroisFois = troisFois;
    troisFois = newTroisFois;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnoDslPackage.NOMBRE_DE_PIOCHES__TROIS_FOIS, oldTroisFois, troisFois));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER:
        return basicSetPeutJouer(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case UnoDslPackage.NOMBRE_DE_PIOCHES__UNE_FOIS:
        return getUneFois();
      case UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER:
        return getPeutJouer();
      case UnoDslPackage.NOMBRE_DE_PIOCHES__TROIS_FOIS:
        return getTroisFois();
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
      case UnoDslPackage.NOMBRE_DE_PIOCHES__UNE_FOIS:
        setUneFois((String)newValue);
        return;
      case UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER:
        setPeutJouer((PeutJouer)newValue);
        return;
      case UnoDslPackage.NOMBRE_DE_PIOCHES__TROIS_FOIS:
        setTroisFois((String)newValue);
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
      case UnoDslPackage.NOMBRE_DE_PIOCHES__UNE_FOIS:
        setUneFois(UNE_FOIS_EDEFAULT);
        return;
      case UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER:
        setPeutJouer((PeutJouer)null);
        return;
      case UnoDslPackage.NOMBRE_DE_PIOCHES__TROIS_FOIS:
        setTroisFois(TROIS_FOIS_EDEFAULT);
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
      case UnoDslPackage.NOMBRE_DE_PIOCHES__UNE_FOIS:
        return UNE_FOIS_EDEFAULT == null ? uneFois != null : !UNE_FOIS_EDEFAULT.equals(uneFois);
      case UnoDslPackage.NOMBRE_DE_PIOCHES__PEUT_JOUER:
        return peutJouer != null;
      case UnoDslPackage.NOMBRE_DE_PIOCHES__TROIS_FOIS:
        return TROIS_FOIS_EDEFAULT == null ? troisFois != null : !TROIS_FOIS_EDEFAULT.equals(troisFois);
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
    result.append(" (uneFois: ");
    result.append(uneFois);
    result.append(", troisFois: ");
    result.append(troisFois);
    result.append(')');
    return result.toString();
  }

} //NombreDePiochesImpl
