/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.services.UnoDslGrammarAccess;
import org.xtext.example.mydsl.unoDsl.CartesSpeciales;
import org.xtext.example.mydsl.unoDsl.DeposeCartes;
import org.xtext.example.mydsl.unoDsl.EnumCartes;
import org.xtext.example.mydsl.unoDsl.EnumReglesDeposeCartes;
import org.xtext.example.mydsl.unoDsl.Model;
import org.xtext.example.mydsl.unoDsl.NombreDePioches;
import org.xtext.example.mydsl.unoDsl.PeutJouer;
import org.xtext.example.mydsl.unoDsl.UnoConfig;
import org.xtext.example.mydsl.unoDsl.UnoDslPackage;
import org.xtext.example.mydsl.unoDsl.Visibilite;

@SuppressWarnings("all")
public class UnoDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UnoDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UnoDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UnoDslPackage.CARTES_SPECIALES:
				sequence_CartesSpeciales(context, (CartesSpeciales) semanticObject); 
				return; 
			case UnoDslPackage.DEPOSE_CARTES:
				sequence_DeposeCartes(context, (DeposeCartes) semanticObject); 
				return; 
			case UnoDslPackage.ENUM_CARTES:
				sequence_EnumCartes(context, (EnumCartes) semanticObject); 
				return; 
			case UnoDslPackage.ENUM_REGLES_DEPOSE_CARTES:
				sequence_EnumReglesDeposeCartes(context, (EnumReglesDeposeCartes) semanticObject); 
				return; 
			case UnoDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case UnoDslPackage.NOMBRE_DE_PIOCHES:
				sequence_NombreDePioches(context, (NombreDePioches) semanticObject); 
				return; 
			case UnoDslPackage.PEUT_JOUER:
				sequence_PeutJouer(context, (PeutJouer) semanticObject); 
				return; 
			case UnoDslPackage.UNO_CONFIG:
				sequence_UnoConfig(context, (UnoConfig) semanticObject); 
				return; 
			case UnoDslPackage.VISIBILITE:
				sequence_Visibilite(context, (Visibilite) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CartesSpeciales returns CartesSpeciales
	 *
	 * Constraint:
	 *     enumCartes+=EnumCartes
	 */
	protected void sequence_CartesSpeciales(ISerializationContext context, CartesSpeciales semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeposeCartes returns DeposeCartes
	 *
	 * Constraint:
	 *     enumReglesDeposeCartes+=EnumReglesDeposeCartes
	 */
	protected void sequence_DeposeCartes(ISerializationContext context, DeposeCartes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumCartes returns EnumCartes
	 *
	 * Constraint:
	 *     (carteUno='carte_uno' | plusQuatreNonContestable='+4_non_contestable' | carteZero='0_special' | carteSept='7_special')+
	 */
	protected void sequence_EnumCartes(ISerializationContext context, EnumCartes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumReglesDeposeCartes returns EnumReglesDeposeCartes
	 *
	 * Constraint:
	 *     (
	 *         cumulPlusDeux='cumul_+2' | 
	 *         cumulPlusQuatre='cumul_+4' | 
	 *         suiteClassique='suite_classique' | 
	 *         suiteRoyale='suite_royale' | 
	 *         interception='interception' | 
	 *         plus4OuRien='+4_ou_rien'
	 *     )+
	 */
	protected void sequence_EnumReglesDeposeCartes(ISerializationContext context, EnumReglesDeposeCartes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     unoRules+=UnoConfig
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NombreDePioches returns NombreDePioches
	 *
	 * Constraint:
	 *     ((uneFois='1' peutJouer=PeutJouer) | troisFois='3')
	 */
	protected void sequence_NombreDePioches(ISerializationContext context, NombreDePioches semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PeutJouer returns PeutJouer
	 *
	 * Constraint:
	 *     (peutJouerEnsuite='peut_jouer_ensuite' | peutPasJouerEnsuite='peut_pas_jouer_ensuite')
	 */
	protected void sequence_PeutJouer(ISerializationContext context, PeutJouer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     UnoConfig returns UnoConfig
	 *
	 * Constraint:
	 *     (
	 *         nbCartesTalon=NbCartesTalon | 
	 *         tempsLimite=TempsLimite | 
	 *         deposeCartes=DeposeCartes | 
	 *         (visibilite=Visibilite nombreDePiles=NombreDePiles) | 
	 *         cartesSpeciales=CartesSpeciales | 
	 *         nombreDePioches=NombreDePioches
	 *     )+
	 */
	protected void sequence_UnoConfig(ISerializationContext context, UnoConfig semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Visibilite returns Visibilite
	 *
	 * Constraint:
	 *     (visible='visible' | invisible='invisible')
	 */
	protected void sequence_Visibilite(ISerializationContext context, Visibilite semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
