/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalUnoDslParser;
import org.xtext.example.mydsl.services.UnoDslGrammarAccess;

public class UnoDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(UnoDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, UnoDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTempsLimiteAccess().getAlternatives_3(), "rule__TempsLimite__Alternatives_3");
			builder.put(grammarAccess.getVisibiliteAccess().getAlternatives(), "rule__Visibilite__Alternatives");
			builder.put(grammarAccess.getNombreDePilesAccess().getAlternatives(), "rule__NombreDePiles__Alternatives");
			builder.put(grammarAccess.getNombreDePiochesAccess().getAlternatives(), "rule__NombreDePioches__Alternatives");
			builder.put(grammarAccess.getPeutJouerAccess().getAlternatives(), "rule__PeutJouer__Alternatives");
			builder.put(grammarAccess.getNbCartesTalonAccess().getAlternatives(), "rule__NbCartesTalon__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getUnoConfigAccess().getGroup_0(), "rule__UnoConfig__Group_0__0");
			builder.put(grammarAccess.getUnoConfigAccess().getGroup_3(), "rule__UnoConfig__Group_3__0");
			builder.put(grammarAccess.getUnoConfigAccess().getGroup_5(), "rule__UnoConfig__Group_5__0");
			builder.put(grammarAccess.getTempsLimiteAccess().getGroup(), "rule__TempsLimite__Group__0");
			builder.put(grammarAccess.getDeposeCartesAccess().getGroup(), "rule__DeposeCartes__Group__0");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_0(), "rule__EnumReglesDeposeCartes__Group_0__0");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_1(), "rule__EnumReglesDeposeCartes__Group_1__0");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_2(), "rule__EnumReglesDeposeCartes__Group_2__0");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_3(), "rule__EnumReglesDeposeCartes__Group_3__0");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_4(), "rule__EnumReglesDeposeCartes__Group_4__0");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_5(), "rule__EnumReglesDeposeCartes__Group_5__0");
			builder.put(grammarAccess.getCartesSpecialesAccess().getGroup(), "rule__CartesSpeciales__Group__0");
			builder.put(grammarAccess.getEnumCartesAccess().getGroup_0(), "rule__EnumCartes__Group_0__0");
			builder.put(grammarAccess.getEnumCartesAccess().getGroup_1(), "rule__EnumCartes__Group_1__0");
			builder.put(grammarAccess.getEnumCartesAccess().getGroup_2(), "rule__EnumCartes__Group_2__0");
			builder.put(grammarAccess.getEnumCartesAccess().getGroup_3(), "rule__EnumCartes__Group_3__0");
			builder.put(grammarAccess.getNombreDePiochesAccess().getGroup_0(), "rule__NombreDePioches__Group_0__0");
			builder.put(grammarAccess.getModelAccess().getUnoRulesAssignment_1(), "rule__Model__UnoRulesAssignment_1");
			builder.put(grammarAccess.getUnoConfigAccess().getNbCartesTalonAssignment_0_3(), "rule__UnoConfig__NbCartesTalonAssignment_0_3");
			builder.put(grammarAccess.getUnoConfigAccess().getTempsLimiteAssignment_1(), "rule__UnoConfig__TempsLimiteAssignment_1");
			builder.put(grammarAccess.getUnoConfigAccess().getDeposeCartesAssignment_2(), "rule__UnoConfig__DeposeCartesAssignment_2");
			builder.put(grammarAccess.getUnoConfigAccess().getVisibiliteAssignment_3_3(), "rule__UnoConfig__VisibiliteAssignment_3_3");
			builder.put(grammarAccess.getUnoConfigAccess().getNombreDePilesAssignment_3_6(), "rule__UnoConfig__NombreDePilesAssignment_3_6");
			builder.put(grammarAccess.getUnoConfigAccess().getCartesSpecialesAssignment_4(), "rule__UnoConfig__CartesSpecialesAssignment_4");
			builder.put(grammarAccess.getUnoConfigAccess().getNombreDePiochesAssignment_5_1(), "rule__UnoConfig__NombreDePiochesAssignment_5_1");
			builder.put(grammarAccess.getDeposeCartesAccess().getEnumReglesDeposeCartesAssignment_1(), "rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxAssignment_0_1(), "rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreAssignment_1_1(), "rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueAssignment_2_1(), "rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleAssignment_3_1(), "rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionAssignment_4_1(), "rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRienAssignment_5_1(), "rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1");
			builder.put(grammarAccess.getVisibiliteAccess().getVisibleAssignment_0(), "rule__Visibilite__VisibleAssignment_0");
			builder.put(grammarAccess.getVisibiliteAccess().getInvisibleAssignment_1(), "rule__Visibilite__InvisibleAssignment_1");
			builder.put(grammarAccess.getCartesSpecialesAccess().getEnumCartesAssignment_1(), "rule__CartesSpeciales__EnumCartesAssignment_1");
			builder.put(grammarAccess.getEnumCartesAccess().getCarteUnoAssignment_0_1(), "rule__EnumCartes__CarteUnoAssignment_0_1");
			builder.put(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestableAssignment_1_1(), "rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1");
			builder.put(grammarAccess.getEnumCartesAccess().getCarteZeroAssignment_2_1(), "rule__EnumCartes__CarteZeroAssignment_2_1");
			builder.put(grammarAccess.getEnumCartesAccess().getCarteSeptAssignment_3_1(), "rule__EnumCartes__CarteSeptAssignment_3_1");
			builder.put(grammarAccess.getNombreDePiochesAccess().getUneFoisAssignment_0_0(), "rule__NombreDePioches__UneFoisAssignment_0_0");
			builder.put(grammarAccess.getNombreDePiochesAccess().getPeutJouerAssignment_0_1(), "rule__NombreDePioches__PeutJouerAssignment_0_1");
			builder.put(grammarAccess.getNombreDePiochesAccess().getTroisFoisAssignment_1(), "rule__NombreDePioches__TroisFoisAssignment_1");
			builder.put(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuiteAssignment_0(), "rule__PeutJouer__PeutJouerEnsuiteAssignment_0");
			builder.put(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuiteAssignment_1(), "rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1");
			builder.put(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), "rule__UnoConfig__UnorderedGroup");
			builder.put(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), "rule__EnumReglesDeposeCartes__UnorderedGroup");
			builder.put(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), "rule__EnumCartes__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private UnoDslGrammarAccess grammarAccess;

	@Override
	protected InternalUnoDslParser createParser() {
		InternalUnoDslParser result = new InternalUnoDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UnoDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UnoDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
