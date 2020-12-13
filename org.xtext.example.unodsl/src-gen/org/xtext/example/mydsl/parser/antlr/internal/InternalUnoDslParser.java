package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.UnoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnoDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<UnoConfig>'", "'</UnoConfig>'", "'<TalonJeu'", "'nbCartes'", "'='", "'/>'", "'<Main'", "'visibilite'", "'nombreDePiles'", "'<Pioche>'", "'</Pioche>'", "'<DureeTour'", "'duree'", "'0'", "'1'", "'<ReglesSpeciales>'", "'</ReglesSpeciales>'", "'<Regle>'", "'cumul_+2'", "'</Regle>'", "'cumul_+4'", "'suite_classique'", "'suite_royale'", "'interception'", "'+4_ou_rien'", "'visible'", "'invisible'", "'3'", "'<CartesSpeciales>'", "'</CartesSpeciales>'", "'<Carte>'", "'carte_uno'", "'</Carte>'", "'+4_non_contestable'", "'0_special'", "'7_special'", "'peut_jouer_ensuite'", "'peut_pas_jouer_ensuite'", "'4'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUnoDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUnoDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUnoDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUnoDsl.g"; }



     	private UnoDslGrammarAccess grammarAccess;

        public InternalUnoDslParser(TokenStream input, UnoDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UnoDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUnoDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUnoDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalUnoDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUnoDsl.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= '<UnoConfig>' ( (lv_unoRules_1_0= ruleUnoConfig ) ) otherlv_2= '</UnoConfig>' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_unoRules_1_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:78:2: ( (otherlv_0= '<UnoConfig>' ( (lv_unoRules_1_0= ruleUnoConfig ) ) otherlv_2= '</UnoConfig>' ) )
            // InternalUnoDsl.g:79:2: (otherlv_0= '<UnoConfig>' ( (lv_unoRules_1_0= ruleUnoConfig ) ) otherlv_2= '</UnoConfig>' )
            {
            // InternalUnoDsl.g:79:2: (otherlv_0= '<UnoConfig>' ( (lv_unoRules_1_0= ruleUnoConfig ) ) otherlv_2= '</UnoConfig>' )
            // InternalUnoDsl.g:80:3: otherlv_0= '<UnoConfig>' ( (lv_unoRules_1_0= ruleUnoConfig ) ) otherlv_2= '</UnoConfig>'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getUnoConfigKeyword_0());
            		
            // InternalUnoDsl.g:84:3: ( (lv_unoRules_1_0= ruleUnoConfig ) )
            // InternalUnoDsl.g:85:4: (lv_unoRules_1_0= ruleUnoConfig )
            {
            // InternalUnoDsl.g:85:4: (lv_unoRules_1_0= ruleUnoConfig )
            // InternalUnoDsl.g:86:5: lv_unoRules_1_0= ruleUnoConfig
            {

            					newCompositeNode(grammarAccess.getModelAccess().getUnoRulesUnoConfigParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_unoRules_1_0=ruleUnoConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"unoRules",
            						lv_unoRules_1_0,
            						"org.xtext.example.mydsl.UnoDsl.UnoConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getUnoConfigKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUnoConfig"
    // InternalUnoDsl.g:111:1: entryRuleUnoConfig returns [EObject current=null] : iv_ruleUnoConfig= ruleUnoConfig EOF ;
    public final EObject entryRuleUnoConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnoConfig = null;


        try {
            // InternalUnoDsl.g:111:50: (iv_ruleUnoConfig= ruleUnoConfig EOF )
            // InternalUnoDsl.g:112:2: iv_ruleUnoConfig= ruleUnoConfig EOF
            {
             newCompositeNode(grammarAccess.getUnoConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnoConfig=ruleUnoConfig();

            state._fsp--;

             current =iv_ruleUnoConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnoConfig"


    // $ANTLR start "ruleUnoConfig"
    // InternalUnoDsl.g:118:1: ruleUnoConfig returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleUnoConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Enumerator lv_nbCartesTalon_4_0 = null;

        AntlrDatatypeRuleToken lv_tempsLimite_6_0 = null;

        EObject lv_deposeCartes_7_0 = null;

        EObject lv_visibilite_11_0 = null;

        AntlrDatatypeRuleToken lv_nombreDePiles_14_0 = null;

        EObject lv_cartesSpeciales_16_0 = null;

        EObject lv_nombreDePioches_18_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:124:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?) ) ) )
            // InternalUnoDsl.g:125:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?) ) )
            {
            // InternalUnoDsl.g:125:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?) ) )
            // InternalUnoDsl.g:126:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?) )
            {
            // InternalUnoDsl.g:126:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?) )
            // InternalUnoDsl.g:127:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            			
            // InternalUnoDsl.g:130:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?)
            // InternalUnoDsl.g:131:5: ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+ {...}?
            {
            // InternalUnoDsl.g:131:5: ( ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                    alt1=5;
                }
                else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                    alt1=6;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUnoDsl.g:132:3: ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:132:3: ({...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) ) )
            	    // InternalUnoDsl.g:133:4: {...}? => ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalUnoDsl.g:133:103: ( ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) ) )
            	    // InternalUnoDsl.g:134:5: ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalUnoDsl.g:137:8: ({...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' ) )
            	    // InternalUnoDsl.g:137:9: {...}? => (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "true");
            	    }
            	    // InternalUnoDsl.g:137:18: (otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>' )
            	    // InternalUnoDsl.g:137:19: otherlv_1= '<TalonJeu' otherlv_2= 'nbCartes' otherlv_3= '=' ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) ) otherlv_5= '/>'
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_5); 

            	    								newLeafNode(otherlv_1, grammarAccess.getUnoConfigAccess().getTalonJeuKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,14,FOLLOW_6); 

            	    								newLeafNode(otherlv_2, grammarAccess.getUnoConfigAccess().getNbCartesKeyword_0_1());
            	    							
            	    otherlv_3=(Token)match(input,15,FOLLOW_7); 

            	    								newLeafNode(otherlv_3, grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_0_2());
            	    							
            	    // InternalUnoDsl.g:149:8: ( (lv_nbCartesTalon_4_0= ruleNbCartesTalon ) )
            	    // InternalUnoDsl.g:150:9: (lv_nbCartesTalon_4_0= ruleNbCartesTalon )
            	    {
            	    // InternalUnoDsl.g:150:9: (lv_nbCartesTalon_4_0= ruleNbCartesTalon )
            	    // InternalUnoDsl.g:151:10: lv_nbCartesTalon_4_0= ruleNbCartesTalon
            	    {

            	    										newCompositeNode(grammarAccess.getUnoConfigAccess().getNbCartesTalonNbCartesTalonEnumRuleCall_0_3_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_nbCartesTalon_4_0=ruleNbCartesTalon();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nbCartesTalon",
            	    											lv_nbCartesTalon_4_0,
            	    											"org.xtext.example.mydsl.UnoDsl.NbCartesTalon");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_9); 

            	    								newLeafNode(otherlv_5, grammarAccess.getUnoConfigAccess().getSolidusGreaterThanSignKeyword_0_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnoDsl.g:178:3: ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) )
            	    {
            	    // InternalUnoDsl.g:178:3: ({...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) ) )
            	    // InternalUnoDsl.g:179:4: {...}? => ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalUnoDsl.g:179:103: ( ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) ) )
            	    // InternalUnoDsl.g:180:5: ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalUnoDsl.g:183:8: ({...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) ) )
            	    // InternalUnoDsl.g:183:9: {...}? => ( (lv_tempsLimite_6_0= ruleTempsLimite ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "true");
            	    }
            	    // InternalUnoDsl.g:183:18: ( (lv_tempsLimite_6_0= ruleTempsLimite ) )
            	    // InternalUnoDsl.g:183:19: (lv_tempsLimite_6_0= ruleTempsLimite )
            	    {
            	    // InternalUnoDsl.g:183:19: (lv_tempsLimite_6_0= ruleTempsLimite )
            	    // InternalUnoDsl.g:184:9: lv_tempsLimite_6_0= ruleTempsLimite
            	    {

            	    									newCompositeNode(grammarAccess.getUnoConfigAccess().getTempsLimiteTempsLimiteParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_9);
            	    lv_tempsLimite_6_0=ruleTempsLimite();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    									}
            	    									set(
            	    										current,
            	    										"tempsLimite",
            	    										lv_tempsLimite_6_0,
            	    										"org.xtext.example.mydsl.UnoDsl.TempsLimite");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnoDsl.g:206:3: ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) )
            	    {
            	    // InternalUnoDsl.g:206:3: ({...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) ) )
            	    // InternalUnoDsl.g:207:4: {...}? => ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalUnoDsl.g:207:103: ( ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) ) )
            	    // InternalUnoDsl.g:208:5: ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalUnoDsl.g:211:8: ({...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) ) )
            	    // InternalUnoDsl.g:211:9: {...}? => ( (lv_deposeCartes_7_0= ruleDeposeCartes ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "true");
            	    }
            	    // InternalUnoDsl.g:211:18: ( (lv_deposeCartes_7_0= ruleDeposeCartes ) )
            	    // InternalUnoDsl.g:211:19: (lv_deposeCartes_7_0= ruleDeposeCartes )
            	    {
            	    // InternalUnoDsl.g:211:19: (lv_deposeCartes_7_0= ruleDeposeCartes )
            	    // InternalUnoDsl.g:212:9: lv_deposeCartes_7_0= ruleDeposeCartes
            	    {

            	    									newCompositeNode(grammarAccess.getUnoConfigAccess().getDeposeCartesDeposeCartesParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_9);
            	    lv_deposeCartes_7_0=ruleDeposeCartes();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    									}
            	    									set(
            	    										current,
            	    										"deposeCartes",
            	    										lv_deposeCartes_7_0,
            	    										"org.xtext.example.mydsl.UnoDsl.DeposeCartes");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnoDsl.g:234:3: ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:234:3: ({...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) ) )
            	    // InternalUnoDsl.g:235:4: {...}? => ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalUnoDsl.g:235:103: ( ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) ) )
            	    // InternalUnoDsl.g:236:5: ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalUnoDsl.g:239:8: ({...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' ) )
            	    // InternalUnoDsl.g:239:9: {...}? => (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "true");
            	    }
            	    // InternalUnoDsl.g:239:18: (otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>' )
            	    // InternalUnoDsl.g:239:19: otherlv_8= '<Main' otherlv_9= 'visibilite' otherlv_10= '=' ( (lv_visibilite_11_0= ruleVisibilite ) ) otherlv_12= 'nombreDePiles' otherlv_13= '=' ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) ) otherlv_15= '/>'
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_10); 

            	    								newLeafNode(otherlv_8, grammarAccess.getUnoConfigAccess().getMainKeyword_3_0());
            	    							
            	    otherlv_9=(Token)match(input,18,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getUnoConfigAccess().getVisibiliteKeyword_3_1());
            	    							
            	    otherlv_10=(Token)match(input,15,FOLLOW_11); 

            	    								newLeafNode(otherlv_10, grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_3_2());
            	    							
            	    // InternalUnoDsl.g:251:8: ( (lv_visibilite_11_0= ruleVisibilite ) )
            	    // InternalUnoDsl.g:252:9: (lv_visibilite_11_0= ruleVisibilite )
            	    {
            	    // InternalUnoDsl.g:252:9: (lv_visibilite_11_0= ruleVisibilite )
            	    // InternalUnoDsl.g:253:10: lv_visibilite_11_0= ruleVisibilite
            	    {

            	    										newCompositeNode(grammarAccess.getUnoConfigAccess().getVisibiliteVisibiliteParserRuleCall_3_3_0());
            	    									
            	    pushFollow(FOLLOW_12);
            	    lv_visibilite_11_0=ruleVisibilite();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"visibilite",
            	    											lv_visibilite_11_0,
            	    											"org.xtext.example.mydsl.UnoDsl.Visibilite");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,19,FOLLOW_6); 

            	    								newLeafNode(otherlv_12, grammarAccess.getUnoConfigAccess().getNombreDePilesKeyword_3_4());
            	    							
            	    otherlv_13=(Token)match(input,15,FOLLOW_13); 

            	    								newLeafNode(otherlv_13, grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_3_5());
            	    							
            	    // InternalUnoDsl.g:278:8: ( (lv_nombreDePiles_14_0= ruleNombreDePiles ) )
            	    // InternalUnoDsl.g:279:9: (lv_nombreDePiles_14_0= ruleNombreDePiles )
            	    {
            	    // InternalUnoDsl.g:279:9: (lv_nombreDePiles_14_0= ruleNombreDePiles )
            	    // InternalUnoDsl.g:280:10: lv_nombreDePiles_14_0= ruleNombreDePiles
            	    {

            	    										newCompositeNode(grammarAccess.getUnoConfigAccess().getNombreDePilesNombreDePilesParserRuleCall_3_6_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_nombreDePiles_14_0=ruleNombreDePiles();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nombreDePiles",
            	    											lv_nombreDePiles_14_0,
            	    											"org.xtext.example.mydsl.UnoDsl.NombreDePiles");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_15=(Token)match(input,16,FOLLOW_9); 

            	    								newLeafNode(otherlv_15, grammarAccess.getUnoConfigAccess().getSolidusGreaterThanSignKeyword_3_7());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalUnoDsl.g:307:3: ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) )
            	    {
            	    // InternalUnoDsl.g:307:3: ({...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) ) )
            	    // InternalUnoDsl.g:308:4: {...}? => ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalUnoDsl.g:308:103: ( ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) ) )
            	    // InternalUnoDsl.g:309:5: ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalUnoDsl.g:312:8: ({...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) ) )
            	    // InternalUnoDsl.g:312:9: {...}? => ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "true");
            	    }
            	    // InternalUnoDsl.g:312:18: ( (lv_cartesSpeciales_16_0= ruleCartesSpeciales ) )
            	    // InternalUnoDsl.g:312:19: (lv_cartesSpeciales_16_0= ruleCartesSpeciales )
            	    {
            	    // InternalUnoDsl.g:312:19: (lv_cartesSpeciales_16_0= ruleCartesSpeciales )
            	    // InternalUnoDsl.g:313:9: lv_cartesSpeciales_16_0= ruleCartesSpeciales
            	    {

            	    									newCompositeNode(grammarAccess.getUnoConfigAccess().getCartesSpecialesCartesSpecialesParserRuleCall_4_0());
            	    								
            	    pushFollow(FOLLOW_9);
            	    lv_cartesSpeciales_16_0=ruleCartesSpeciales();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    									}
            	    									set(
            	    										current,
            	    										"cartesSpeciales",
            	    										lv_cartesSpeciales_16_0,
            	    										"org.xtext.example.mydsl.UnoDsl.CartesSpeciales");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalUnoDsl.g:335:3: ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:335:3: ({...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) ) )
            	    // InternalUnoDsl.g:336:4: {...}? => ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalUnoDsl.g:336:103: ( ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) ) )
            	    // InternalUnoDsl.g:337:5: ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalUnoDsl.g:340:8: ({...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' ) )
            	    // InternalUnoDsl.g:340:9: {...}? => (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleUnoConfig", "true");
            	    }
            	    // InternalUnoDsl.g:340:18: (otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>' )
            	    // InternalUnoDsl.g:340:19: otherlv_17= '<Pioche>' ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) ) otherlv_19= '</Pioche>'
            	    {
            	    otherlv_17=(Token)match(input,20,FOLLOW_13); 

            	    								newLeafNode(otherlv_17, grammarAccess.getUnoConfigAccess().getPiocheKeyword_5_0());
            	    							
            	    // InternalUnoDsl.g:344:8: ( (lv_nombreDePioches_18_0= ruleNombreDePioches ) )
            	    // InternalUnoDsl.g:345:9: (lv_nombreDePioches_18_0= ruleNombreDePioches )
            	    {
            	    // InternalUnoDsl.g:345:9: (lv_nombreDePioches_18_0= ruleNombreDePioches )
            	    // InternalUnoDsl.g:346:10: lv_nombreDePioches_18_0= ruleNombreDePioches
            	    {

            	    										newCompositeNode(grammarAccess.getUnoConfigAccess().getNombreDePiochesNombreDePiochesParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_nombreDePioches_18_0=ruleNombreDePioches();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getUnoConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nombreDePioches",
            	    											lv_nombreDePioches_18_0,
            	    											"org.xtext.example.mydsl.UnoDsl.NombreDePioches");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_19=(Token)match(input,21,FOLLOW_9); 

            	    								newLeafNode(otherlv_19, grammarAccess.getUnoConfigAccess().getPiocheKeyword_5_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnoConfigAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleUnoConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnoConfigAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnoConfig"


    // $ANTLR start "entryRuleTempsLimite"
    // InternalUnoDsl.g:384:1: entryRuleTempsLimite returns [String current=null] : iv_ruleTempsLimite= ruleTempsLimite EOF ;
    public final String entryRuleTempsLimite() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTempsLimite = null;


        try {
            // InternalUnoDsl.g:384:51: (iv_ruleTempsLimite= ruleTempsLimite EOF )
            // InternalUnoDsl.g:385:2: iv_ruleTempsLimite= ruleTempsLimite EOF
            {
             newCompositeNode(grammarAccess.getTempsLimiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempsLimite=ruleTempsLimite();

            state._fsp--;

             current =iv_ruleTempsLimite.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTempsLimite"


    // $ANTLR start "ruleTempsLimite"
    // InternalUnoDsl.g:391:1: ruleTempsLimite returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<DureeTour' kw= 'duree' kw= '=' (this_INT_3= RULE_INT | kw= '0' | kw= '1' ) kw= '/>' ) ;
    public final AntlrDatatypeRuleToken ruleTempsLimite() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:397:2: ( (kw= '<DureeTour' kw= 'duree' kw= '=' (this_INT_3= RULE_INT | kw= '0' | kw= '1' ) kw= '/>' ) )
            // InternalUnoDsl.g:398:2: (kw= '<DureeTour' kw= 'duree' kw= '=' (this_INT_3= RULE_INT | kw= '0' | kw= '1' ) kw= '/>' )
            {
            // InternalUnoDsl.g:398:2: (kw= '<DureeTour' kw= 'duree' kw= '=' (this_INT_3= RULE_INT | kw= '0' | kw= '1' ) kw= '/>' )
            // InternalUnoDsl.g:399:3: kw= '<DureeTour' kw= 'duree' kw= '=' (this_INT_3= RULE_INT | kw= '0' | kw= '1' ) kw= '/>'
            {
            kw=(Token)match(input,22,FOLLOW_15); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTempsLimiteAccess().getDureeTourKeyword_0());
            		
            kw=(Token)match(input,23,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTempsLimiteAccess().getDureeKeyword_1());
            		
            kw=(Token)match(input,15,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTempsLimiteAccess().getEqualsSignKeyword_2());
            		
            // InternalUnoDsl.g:414:3: (this_INT_3= RULE_INT | kw= '0' | kw= '1' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalUnoDsl.g:415:4: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_8); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getTempsLimiteAccess().getINTTerminalRuleCall_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:423:4: kw= '0'
                    {
                    kw=(Token)match(input,24,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTempsLimiteAccess().getDigitZeroKeyword_3_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:429:4: kw= '1'
                    {
                    kw=(Token)match(input,25,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getTempsLimiteAccess().getDigitOneKeyword_3_2());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,16,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTempsLimiteAccess().getSolidusGreaterThanSignKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTempsLimite"


    // $ANTLR start "entryRuleDeposeCartes"
    // InternalUnoDsl.g:444:1: entryRuleDeposeCartes returns [EObject current=null] : iv_ruleDeposeCartes= ruleDeposeCartes EOF ;
    public final EObject entryRuleDeposeCartes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeposeCartes = null;


        try {
            // InternalUnoDsl.g:444:53: (iv_ruleDeposeCartes= ruleDeposeCartes EOF )
            // InternalUnoDsl.g:445:2: iv_ruleDeposeCartes= ruleDeposeCartes EOF
            {
             newCompositeNode(grammarAccess.getDeposeCartesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeposeCartes=ruleDeposeCartes();

            state._fsp--;

             current =iv_ruleDeposeCartes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeposeCartes"


    // $ANTLR start "ruleDeposeCartes"
    // InternalUnoDsl.g:451:1: ruleDeposeCartes returns [EObject current=null] : (otherlv_0= '<ReglesSpeciales>' ( (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes ) ) otherlv_2= '</ReglesSpeciales>' ) ;
    public final EObject ruleDeposeCartes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_enumReglesDeposeCartes_1_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:457:2: ( (otherlv_0= '<ReglesSpeciales>' ( (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes ) ) otherlv_2= '</ReglesSpeciales>' ) )
            // InternalUnoDsl.g:458:2: (otherlv_0= '<ReglesSpeciales>' ( (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes ) ) otherlv_2= '</ReglesSpeciales>' )
            {
            // InternalUnoDsl.g:458:2: (otherlv_0= '<ReglesSpeciales>' ( (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes ) ) otherlv_2= '</ReglesSpeciales>' )
            // InternalUnoDsl.g:459:3: otherlv_0= '<ReglesSpeciales>' ( (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes ) ) otherlv_2= '</ReglesSpeciales>'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getDeposeCartesAccess().getReglesSpecialesKeyword_0());
            		
            // InternalUnoDsl.g:463:3: ( (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes ) )
            // InternalUnoDsl.g:464:4: (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes )
            {
            // InternalUnoDsl.g:464:4: (lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes )
            // InternalUnoDsl.g:465:5: lv_enumReglesDeposeCartes_1_0= ruleEnumReglesDeposeCartes
            {

            					newCompositeNode(grammarAccess.getDeposeCartesAccess().getEnumReglesDeposeCartesEnumReglesDeposeCartesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_enumReglesDeposeCartes_1_0=ruleEnumReglesDeposeCartes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeposeCartesRule());
            					}
            					add(
            						current,
            						"enumReglesDeposeCartes",
            						lv_enumReglesDeposeCartes_1_0,
            						"org.xtext.example.mydsl.UnoDsl.EnumReglesDeposeCartes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDeposeCartesAccess().getReglesSpecialesKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeposeCartes"


    // $ANTLR start "entryRuleEnumReglesDeposeCartes"
    // InternalUnoDsl.g:490:1: entryRuleEnumReglesDeposeCartes returns [EObject current=null] : iv_ruleEnumReglesDeposeCartes= ruleEnumReglesDeposeCartes EOF ;
    public final EObject entryRuleEnumReglesDeposeCartes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReglesDeposeCartes = null;


        try {
            // InternalUnoDsl.g:490:63: (iv_ruleEnumReglesDeposeCartes= ruleEnumReglesDeposeCartes EOF )
            // InternalUnoDsl.g:491:2: iv_ruleEnumReglesDeposeCartes= ruleEnumReglesDeposeCartes EOF
            {
             newCompositeNode(grammarAccess.getEnumReglesDeposeCartesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumReglesDeposeCartes=ruleEnumReglesDeposeCartes();

            state._fsp--;

             current =iv_ruleEnumReglesDeposeCartes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumReglesDeposeCartes"


    // $ANTLR start "ruleEnumReglesDeposeCartes"
    // InternalUnoDsl.g:497:1: ruleEnumReglesDeposeCartes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* ) ) ) ;
    public final EObject ruleEnumReglesDeposeCartes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_cumulPlusDeux_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_cumulPlusQuatre_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_suiteClassique_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_suiteRoyale_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_interception_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_plus4OuRien_17_0=null;
        Token otherlv_18=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:503:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* ) ) ) )
            // InternalUnoDsl.g:504:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* ) ) )
            {
            // InternalUnoDsl.g:504:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* ) ) )
            // InternalUnoDsl.g:505:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* ) )
            {
            // InternalUnoDsl.g:505:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* ) )
            // InternalUnoDsl.g:506:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            			
            // InternalUnoDsl.g:509:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )* )
            // InternalUnoDsl.g:510:5: ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )*
            {
            // InternalUnoDsl.g:510:5: ( ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) ) )*
            loop3:
            do {
                int alt3=7;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 28 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                    int LA3_2 = input.LA(2);

                    if ( LA3_2 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) ) {
                        alt3=1;
                    }
                    else if ( LA3_2 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) {
                        alt3=6;
                    }
                    else if ( LA3_2 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) ) {
                        alt3=5;
                    }
                    else if ( LA3_2 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) ) {
                        alt3=4;
                    }
                    else if ( LA3_2 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) ) {
                        alt3=3;
                    }
                    else if ( LA3_2 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) ) {
                        alt3=2;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalUnoDsl.g:511:3: ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:511:3: ({...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) ) )
            	    // InternalUnoDsl.g:512:4: {...}? => ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalUnoDsl.g:512:116: ( ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) ) )
            	    // InternalUnoDsl.g:513:5: ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalUnoDsl.g:516:8: ({...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' ) )
            	    // InternalUnoDsl.g:516:9: {...}? => (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "true");
            	    }
            	    // InternalUnoDsl.g:516:18: (otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>' )
            	    // InternalUnoDsl.g:516:19: otherlv_1= '<Regle>' ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) ) otherlv_3= '</Regle>'
            	    {
            	    otherlv_1=(Token)match(input,28,FOLLOW_19); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_0_0());
            	    							
            	    // InternalUnoDsl.g:520:8: ( (lv_cumulPlusDeux_2_0= 'cumul_+2' ) )
            	    // InternalUnoDsl.g:521:9: (lv_cumulPlusDeux_2_0= 'cumul_+2' )
            	    {
            	    // InternalUnoDsl.g:521:9: (lv_cumulPlusDeux_2_0= 'cumul_+2' )
            	    // InternalUnoDsl.g:522:10: lv_cumulPlusDeux_2_0= 'cumul_+2'
            	    {
            	    lv_cumulPlusDeux_2_0=(Token)match(input,29,FOLLOW_20); 

            	    										newLeafNode(lv_cumulPlusDeux_2_0, grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxCumul_2Keyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumReglesDeposeCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "cumulPlusDeux", lv_cumulPlusDeux_2_0, "cumul_+2");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,30,FOLLOW_21); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnoDsl.g:544:3: ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:544:3: ({...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) ) )
            	    // InternalUnoDsl.g:545:4: {...}? => ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalUnoDsl.g:545:116: ( ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) ) )
            	    // InternalUnoDsl.g:546:5: ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalUnoDsl.g:549:8: ({...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' ) )
            	    // InternalUnoDsl.g:549:9: {...}? => (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "true");
            	    }
            	    // InternalUnoDsl.g:549:18: (otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>' )
            	    // InternalUnoDsl.g:549:19: otherlv_4= '<Regle>' ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) ) otherlv_6= '</Regle>'
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_22); 

            	    								newLeafNode(otherlv_4, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_1_0());
            	    							
            	    // InternalUnoDsl.g:553:8: ( (lv_cumulPlusQuatre_5_0= 'cumul_+4' ) )
            	    // InternalUnoDsl.g:554:9: (lv_cumulPlusQuatre_5_0= 'cumul_+4' )
            	    {
            	    // InternalUnoDsl.g:554:9: (lv_cumulPlusQuatre_5_0= 'cumul_+4' )
            	    // InternalUnoDsl.g:555:10: lv_cumulPlusQuatre_5_0= 'cumul_+4'
            	    {
            	    lv_cumulPlusQuatre_5_0=(Token)match(input,31,FOLLOW_20); 

            	    										newLeafNode(lv_cumulPlusQuatre_5_0, grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreCumul_4Keyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumReglesDeposeCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "cumulPlusQuatre", lv_cumulPlusQuatre_5_0, "cumul_+4");
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,30,FOLLOW_21); 

            	    								newLeafNode(otherlv_6, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnoDsl.g:577:3: ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:577:3: ({...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) ) )
            	    // InternalUnoDsl.g:578:4: {...}? => ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalUnoDsl.g:578:116: ( ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) ) )
            	    // InternalUnoDsl.g:579:5: ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalUnoDsl.g:582:8: ({...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' ) )
            	    // InternalUnoDsl.g:582:9: {...}? => (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "true");
            	    }
            	    // InternalUnoDsl.g:582:18: (otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>' )
            	    // InternalUnoDsl.g:582:19: otherlv_7= '<Regle>' ( (lv_suiteClassique_8_0= 'suite_classique' ) ) otherlv_9= '</Regle>'
            	    {
            	    otherlv_7=(Token)match(input,28,FOLLOW_23); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_2_0());
            	    							
            	    // InternalUnoDsl.g:586:8: ( (lv_suiteClassique_8_0= 'suite_classique' ) )
            	    // InternalUnoDsl.g:587:9: (lv_suiteClassique_8_0= 'suite_classique' )
            	    {
            	    // InternalUnoDsl.g:587:9: (lv_suiteClassique_8_0= 'suite_classique' )
            	    // InternalUnoDsl.g:588:10: lv_suiteClassique_8_0= 'suite_classique'
            	    {
            	    lv_suiteClassique_8_0=(Token)match(input,32,FOLLOW_20); 

            	    										newLeafNode(lv_suiteClassique_8_0, grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueSuite_classiqueKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumReglesDeposeCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "suiteClassique", lv_suiteClassique_8_0, "suite_classique");
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,30,FOLLOW_21); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnoDsl.g:610:3: ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:610:3: ({...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) ) )
            	    // InternalUnoDsl.g:611:4: {...}? => ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalUnoDsl.g:611:116: ( ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) ) )
            	    // InternalUnoDsl.g:612:5: ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalUnoDsl.g:615:8: ({...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' ) )
            	    // InternalUnoDsl.g:615:9: {...}? => (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "true");
            	    }
            	    // InternalUnoDsl.g:615:18: (otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>' )
            	    // InternalUnoDsl.g:615:19: otherlv_10= '<Regle>' ( (lv_suiteRoyale_11_0= 'suite_royale' ) ) otherlv_12= '</Regle>'
            	    {
            	    otherlv_10=(Token)match(input,28,FOLLOW_24); 

            	    								newLeafNode(otherlv_10, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_3_0());
            	    							
            	    // InternalUnoDsl.g:619:8: ( (lv_suiteRoyale_11_0= 'suite_royale' ) )
            	    // InternalUnoDsl.g:620:9: (lv_suiteRoyale_11_0= 'suite_royale' )
            	    {
            	    // InternalUnoDsl.g:620:9: (lv_suiteRoyale_11_0= 'suite_royale' )
            	    // InternalUnoDsl.g:621:10: lv_suiteRoyale_11_0= 'suite_royale'
            	    {
            	    lv_suiteRoyale_11_0=(Token)match(input,33,FOLLOW_20); 

            	    										newLeafNode(lv_suiteRoyale_11_0, grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleSuite_royaleKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumReglesDeposeCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "suiteRoyale", lv_suiteRoyale_11_0, "suite_royale");
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,30,FOLLOW_21); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_3_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalUnoDsl.g:643:3: ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:643:3: ({...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) ) )
            	    // InternalUnoDsl.g:644:4: {...}? => ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalUnoDsl.g:644:116: ( ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) ) )
            	    // InternalUnoDsl.g:645:5: ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalUnoDsl.g:648:8: ({...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' ) )
            	    // InternalUnoDsl.g:648:9: {...}? => (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "true");
            	    }
            	    // InternalUnoDsl.g:648:18: (otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>' )
            	    // InternalUnoDsl.g:648:19: otherlv_13= '<Regle>' ( (lv_interception_14_0= 'interception' ) ) otherlv_15= '</Regle>'
            	    {
            	    otherlv_13=(Token)match(input,28,FOLLOW_25); 

            	    								newLeafNode(otherlv_13, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_4_0());
            	    							
            	    // InternalUnoDsl.g:652:8: ( (lv_interception_14_0= 'interception' ) )
            	    // InternalUnoDsl.g:653:9: (lv_interception_14_0= 'interception' )
            	    {
            	    // InternalUnoDsl.g:653:9: (lv_interception_14_0= 'interception' )
            	    // InternalUnoDsl.g:654:10: lv_interception_14_0= 'interception'
            	    {
            	    lv_interception_14_0=(Token)match(input,34,FOLLOW_20); 

            	    										newLeafNode(lv_interception_14_0, grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionInterceptionKeyword_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumReglesDeposeCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "interception", lv_interception_14_0, "interception");
            	    									

            	    }


            	    }

            	    otherlv_15=(Token)match(input,30,FOLLOW_21); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_4_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalUnoDsl.g:676:3: ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:676:3: ({...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) ) )
            	    // InternalUnoDsl.g:677:4: {...}? => ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalUnoDsl.g:677:116: ( ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) ) )
            	    // InternalUnoDsl.g:678:5: ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalUnoDsl.g:681:8: ({...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' ) )
            	    // InternalUnoDsl.g:681:9: {...}? => (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumReglesDeposeCartes", "true");
            	    }
            	    // InternalUnoDsl.g:681:18: (otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>' )
            	    // InternalUnoDsl.g:681:19: otherlv_16= '<Regle>' ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) ) otherlv_18= '</Regle>'
            	    {
            	    otherlv_16=(Token)match(input,28,FOLLOW_26); 

            	    								newLeafNode(otherlv_16, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_5_0());
            	    							
            	    // InternalUnoDsl.g:685:8: ( (lv_plus4OuRien_17_0= '+4_ou_rien' ) )
            	    // InternalUnoDsl.g:686:9: (lv_plus4OuRien_17_0= '+4_ou_rien' )
            	    {
            	    // InternalUnoDsl.g:686:9: (lv_plus4OuRien_17_0= '+4_ou_rien' )
            	    // InternalUnoDsl.g:687:10: lv_plus4OuRien_17_0= '+4_ou_rien'
            	    {
            	    lv_plus4OuRien_17_0=(Token)match(input,35,FOLLOW_20); 

            	    										newLeafNode(lv_plus4OuRien_17_0, grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRien4_ou_rienKeyword_5_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumReglesDeposeCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "plus4OuRien", lv_plus4OuRien_17_0, "+4_ou_rien");
            	    									

            	    }


            	    }

            	    otherlv_18=(Token)match(input,30,FOLLOW_21); 

            	    								newLeafNode(otherlv_18, grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_5_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumReglesDeposeCartes"


    // $ANTLR start "entryRuleVisibilite"
    // InternalUnoDsl.g:719:1: entryRuleVisibilite returns [EObject current=null] : iv_ruleVisibilite= ruleVisibilite EOF ;
    public final EObject entryRuleVisibilite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilite = null;


        try {
            // InternalUnoDsl.g:719:51: (iv_ruleVisibilite= ruleVisibilite EOF )
            // InternalUnoDsl.g:720:2: iv_ruleVisibilite= ruleVisibilite EOF
            {
             newCompositeNode(grammarAccess.getVisibiliteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibilite=ruleVisibilite();

            state._fsp--;

             current =iv_ruleVisibilite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilite"


    // $ANTLR start "ruleVisibilite"
    // InternalUnoDsl.g:726:1: ruleVisibilite returns [EObject current=null] : ( ( (lv_visible_0_0= 'visible' ) ) | ( (lv_invisible_1_0= 'invisible' ) ) ) ;
    public final EObject ruleVisibilite() throws RecognitionException {
        EObject current = null;

        Token lv_visible_0_0=null;
        Token lv_invisible_1_0=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:732:2: ( ( ( (lv_visible_0_0= 'visible' ) ) | ( (lv_invisible_1_0= 'invisible' ) ) ) )
            // InternalUnoDsl.g:733:2: ( ( (lv_visible_0_0= 'visible' ) ) | ( (lv_invisible_1_0= 'invisible' ) ) )
            {
            // InternalUnoDsl.g:733:2: ( ( (lv_visible_0_0= 'visible' ) ) | ( (lv_invisible_1_0= 'invisible' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUnoDsl.g:734:3: ( (lv_visible_0_0= 'visible' ) )
                    {
                    // InternalUnoDsl.g:734:3: ( (lv_visible_0_0= 'visible' ) )
                    // InternalUnoDsl.g:735:4: (lv_visible_0_0= 'visible' )
                    {
                    // InternalUnoDsl.g:735:4: (lv_visible_0_0= 'visible' )
                    // InternalUnoDsl.g:736:5: lv_visible_0_0= 'visible'
                    {
                    lv_visible_0_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_visible_0_0, grammarAccess.getVisibiliteAccess().getVisibleVisibleKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVisibiliteRule());
                    					}
                    					setWithLastConsumed(current, "visible", lv_visible_0_0, "visible");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:749:3: ( (lv_invisible_1_0= 'invisible' ) )
                    {
                    // InternalUnoDsl.g:749:3: ( (lv_invisible_1_0= 'invisible' ) )
                    // InternalUnoDsl.g:750:4: (lv_invisible_1_0= 'invisible' )
                    {
                    // InternalUnoDsl.g:750:4: (lv_invisible_1_0= 'invisible' )
                    // InternalUnoDsl.g:751:5: lv_invisible_1_0= 'invisible'
                    {
                    lv_invisible_1_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_invisible_1_0, grammarAccess.getVisibiliteAccess().getInvisibleInvisibleKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVisibiliteRule());
                    					}
                    					setWithLastConsumed(current, "invisible", lv_invisible_1_0, "invisible");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilite"


    // $ANTLR start "entryRuleNombreDePiles"
    // InternalUnoDsl.g:767:1: entryRuleNombreDePiles returns [String current=null] : iv_ruleNombreDePiles= ruleNombreDePiles EOF ;
    public final String entryRuleNombreDePiles() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNombreDePiles = null;


        try {
            // InternalUnoDsl.g:767:53: (iv_ruleNombreDePiles= ruleNombreDePiles EOF )
            // InternalUnoDsl.g:768:2: iv_ruleNombreDePiles= ruleNombreDePiles EOF
            {
             newCompositeNode(grammarAccess.getNombreDePilesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombreDePiles=ruleNombreDePiles();

            state._fsp--;

             current =iv_ruleNombreDePiles.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombreDePiles"


    // $ANTLR start "ruleNombreDePiles"
    // InternalUnoDsl.g:774:1: ruleNombreDePiles returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '3' ) ;
    public final AntlrDatatypeRuleToken ruleNombreDePiles() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:780:2: ( (kw= '1' | kw= '3' ) )
            // InternalUnoDsl.g:781:2: (kw= '1' | kw= '3' )
            {
            // InternalUnoDsl.g:781:2: (kw= '1' | kw= '3' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnoDsl.g:782:3: kw= '1'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNombreDePilesAccess().getDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:788:3: kw= '3'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNombreDePilesAccess().getDigitThreeKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombreDePiles"


    // $ANTLR start "entryRuleCartesSpeciales"
    // InternalUnoDsl.g:797:1: entryRuleCartesSpeciales returns [EObject current=null] : iv_ruleCartesSpeciales= ruleCartesSpeciales EOF ;
    public final EObject entryRuleCartesSpeciales() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartesSpeciales = null;


        try {
            // InternalUnoDsl.g:797:56: (iv_ruleCartesSpeciales= ruleCartesSpeciales EOF )
            // InternalUnoDsl.g:798:2: iv_ruleCartesSpeciales= ruleCartesSpeciales EOF
            {
             newCompositeNode(grammarAccess.getCartesSpecialesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCartesSpeciales=ruleCartesSpeciales();

            state._fsp--;

             current =iv_ruleCartesSpeciales; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCartesSpeciales"


    // $ANTLR start "ruleCartesSpeciales"
    // InternalUnoDsl.g:804:1: ruleCartesSpeciales returns [EObject current=null] : (otherlv_0= '<CartesSpeciales>' ( (lv_enumCartes_1_0= ruleEnumCartes ) ) otherlv_2= '</CartesSpeciales>' ) ;
    public final EObject ruleCartesSpeciales() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_enumCartes_1_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:810:2: ( (otherlv_0= '<CartesSpeciales>' ( (lv_enumCartes_1_0= ruleEnumCartes ) ) otherlv_2= '</CartesSpeciales>' ) )
            // InternalUnoDsl.g:811:2: (otherlv_0= '<CartesSpeciales>' ( (lv_enumCartes_1_0= ruleEnumCartes ) ) otherlv_2= '</CartesSpeciales>' )
            {
            // InternalUnoDsl.g:811:2: (otherlv_0= '<CartesSpeciales>' ( (lv_enumCartes_1_0= ruleEnumCartes ) ) otherlv_2= '</CartesSpeciales>' )
            // InternalUnoDsl.g:812:3: otherlv_0= '<CartesSpeciales>' ( (lv_enumCartes_1_0= ruleEnumCartes ) ) otherlv_2= '</CartesSpeciales>'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getCartesSpecialesAccess().getCartesSpecialesKeyword_0());
            		
            // InternalUnoDsl.g:816:3: ( (lv_enumCartes_1_0= ruleEnumCartes ) )
            // InternalUnoDsl.g:817:4: (lv_enumCartes_1_0= ruleEnumCartes )
            {
            // InternalUnoDsl.g:817:4: (lv_enumCartes_1_0= ruleEnumCartes )
            // InternalUnoDsl.g:818:5: lv_enumCartes_1_0= ruleEnumCartes
            {

            					newCompositeNode(grammarAccess.getCartesSpecialesAccess().getEnumCartesEnumCartesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_enumCartes_1_0=ruleEnumCartes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCartesSpecialesRule());
            					}
            					add(
            						current,
            						"enumCartes",
            						lv_enumCartes_1_0,
            						"org.xtext.example.mydsl.UnoDsl.EnumCartes");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCartesSpecialesAccess().getCartesSpecialesKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCartesSpeciales"


    // $ANTLR start "entryRuleEnumCartes"
    // InternalUnoDsl.g:843:1: entryRuleEnumCartes returns [EObject current=null] : iv_ruleEnumCartes= ruleEnumCartes EOF ;
    public final EObject entryRuleEnumCartes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumCartes = null;


        try {
            // InternalUnoDsl.g:843:51: (iv_ruleEnumCartes= ruleEnumCartes EOF )
            // InternalUnoDsl.g:844:2: iv_ruleEnumCartes= ruleEnumCartes EOF
            {
             newCompositeNode(grammarAccess.getEnumCartesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumCartes=ruleEnumCartes();

            state._fsp--;

             current =iv_ruleEnumCartes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumCartes"


    // $ANTLR start "ruleEnumCartes"
    // InternalUnoDsl.g:850:1: ruleEnumCartes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* ) ) ) ;
    public final EObject ruleEnumCartes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_carteUno_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_plusQuatreNonContestable_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_carteZero_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_carteSept_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:856:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* ) ) ) )
            // InternalUnoDsl.g:857:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* ) ) )
            {
            // InternalUnoDsl.g:857:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* ) ) )
            // InternalUnoDsl.g:858:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* ) )
            {
            // InternalUnoDsl.g:858:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* ) )
            // InternalUnoDsl.g:859:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            			
            // InternalUnoDsl.g:862:4: ( ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )* )
            // InternalUnoDsl.g:863:5: ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )*
            {
            // InternalUnoDsl.g:863:5: ( ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) ) )*
            loop6:
            do {
                int alt6=5;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 41 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) ) {
                    int LA6_2 = input.LA(2);

                    if ( LA6_2 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) ) {
                        alt6=2;
                    }
                    else if ( LA6_2 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) ) {
                        alt6=1;
                    }
                    else if ( LA6_2 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) {
                        alt6=4;
                    }
                    else if ( LA6_2 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) ) {
                        alt6=3;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalUnoDsl.g:864:3: ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:864:3: ({...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) ) )
            	    // InternalUnoDsl.g:865:4: {...}? => ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalUnoDsl.g:865:104: ( ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) ) )
            	    // InternalUnoDsl.g:866:5: ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalUnoDsl.g:869:8: ({...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' ) )
            	    // InternalUnoDsl.g:869:9: {...}? => (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "true");
            	    }
            	    // InternalUnoDsl.g:869:18: (otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>' )
            	    // InternalUnoDsl.g:869:19: otherlv_1= '<Carte>' ( (lv_carteUno_2_0= 'carte_uno' ) ) otherlv_3= '</Carte>'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_29); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEnumCartesAccess().getCarteKeyword_0_0());
            	    							
            	    // InternalUnoDsl.g:873:8: ( (lv_carteUno_2_0= 'carte_uno' ) )
            	    // InternalUnoDsl.g:874:9: (lv_carteUno_2_0= 'carte_uno' )
            	    {
            	    // InternalUnoDsl.g:874:9: (lv_carteUno_2_0= 'carte_uno' )
            	    // InternalUnoDsl.g:875:10: lv_carteUno_2_0= 'carte_uno'
            	    {
            	    lv_carteUno_2_0=(Token)match(input,42,FOLLOW_30); 

            	    										newLeafNode(lv_carteUno_2_0, grammarAccess.getEnumCartesAccess().getCarteUnoCarte_unoKeyword_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "carteUno", lv_carteUno_2_0, "carte_uno");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,43,FOLLOW_31); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEnumCartesAccess().getCarteKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalUnoDsl.g:897:3: ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:897:3: ({...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) ) )
            	    // InternalUnoDsl.g:898:4: {...}? => ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalUnoDsl.g:898:104: ( ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) ) )
            	    // InternalUnoDsl.g:899:5: ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalUnoDsl.g:902:8: ({...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' ) )
            	    // InternalUnoDsl.g:902:9: {...}? => (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "true");
            	    }
            	    // InternalUnoDsl.g:902:18: (otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>' )
            	    // InternalUnoDsl.g:902:19: otherlv_4= '<Carte>' ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) ) otherlv_6= '</Carte>'
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_32); 

            	    								newLeafNode(otherlv_4, grammarAccess.getEnumCartesAccess().getCarteKeyword_1_0());
            	    							
            	    // InternalUnoDsl.g:906:8: ( (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' ) )
            	    // InternalUnoDsl.g:907:9: (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' )
            	    {
            	    // InternalUnoDsl.g:907:9: (lv_plusQuatreNonContestable_5_0= '+4_non_contestable' )
            	    // InternalUnoDsl.g:908:10: lv_plusQuatreNonContestable_5_0= '+4_non_contestable'
            	    {
            	    lv_plusQuatreNonContestable_5_0=(Token)match(input,44,FOLLOW_30); 

            	    										newLeafNode(lv_plusQuatreNonContestable_5_0, grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestable4_non_contestableKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "plusQuatreNonContestable", lv_plusQuatreNonContestable_5_0, "+4_non_contestable");
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,43,FOLLOW_31); 

            	    								newLeafNode(otherlv_6, grammarAccess.getEnumCartesAccess().getCarteKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalUnoDsl.g:930:3: ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:930:3: ({...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) ) )
            	    // InternalUnoDsl.g:931:4: {...}? => ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalUnoDsl.g:931:104: ( ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) ) )
            	    // InternalUnoDsl.g:932:5: ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalUnoDsl.g:935:8: ({...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' ) )
            	    // InternalUnoDsl.g:935:9: {...}? => (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "true");
            	    }
            	    // InternalUnoDsl.g:935:18: (otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>' )
            	    // InternalUnoDsl.g:935:19: otherlv_7= '<Carte>' ( (lv_carteZero_8_0= '0_special' ) ) otherlv_9= '</Carte>'
            	    {
            	    otherlv_7=(Token)match(input,41,FOLLOW_33); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEnumCartesAccess().getCarteKeyword_2_0());
            	    							
            	    // InternalUnoDsl.g:939:8: ( (lv_carteZero_8_0= '0_special' ) )
            	    // InternalUnoDsl.g:940:9: (lv_carteZero_8_0= '0_special' )
            	    {
            	    // InternalUnoDsl.g:940:9: (lv_carteZero_8_0= '0_special' )
            	    // InternalUnoDsl.g:941:10: lv_carteZero_8_0= '0_special'
            	    {
            	    lv_carteZero_8_0=(Token)match(input,45,FOLLOW_30); 

            	    										newLeafNode(lv_carteZero_8_0, grammarAccess.getEnumCartesAccess().getCarteZero0_specialKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "carteZero", lv_carteZero_8_0, "0_special");
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,43,FOLLOW_31); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEnumCartesAccess().getCarteKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalUnoDsl.g:963:3: ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) )
            	    {
            	    // InternalUnoDsl.g:963:3: ({...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) ) )
            	    // InternalUnoDsl.g:964:4: {...}? => ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalUnoDsl.g:964:104: ( ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) ) )
            	    // InternalUnoDsl.g:965:5: ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalUnoDsl.g:968:8: ({...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' ) )
            	    // InternalUnoDsl.g:968:9: {...}? => (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnumCartes", "true");
            	    }
            	    // InternalUnoDsl.g:968:18: (otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>' )
            	    // InternalUnoDsl.g:968:19: otherlv_10= '<Carte>' ( (lv_carteSept_11_0= '7_special' ) ) otherlv_12= '</Carte>'
            	    {
            	    otherlv_10=(Token)match(input,41,FOLLOW_34); 

            	    								newLeafNode(otherlv_10, grammarAccess.getEnumCartesAccess().getCarteKeyword_3_0());
            	    							
            	    // InternalUnoDsl.g:972:8: ( (lv_carteSept_11_0= '7_special' ) )
            	    // InternalUnoDsl.g:973:9: (lv_carteSept_11_0= '7_special' )
            	    {
            	    // InternalUnoDsl.g:973:9: (lv_carteSept_11_0= '7_special' )
            	    // InternalUnoDsl.g:974:10: lv_carteSept_11_0= '7_special'
            	    {
            	    lv_carteSept_11_0=(Token)match(input,46,FOLLOW_30); 

            	    										newLeafNode(lv_carteSept_11_0, grammarAccess.getEnumCartesAccess().getCarteSept7_specialKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEnumCartesRule());
            	    										}
            	    										setWithLastConsumed(current, "carteSept", lv_carteSept_11_0, "7_special");
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,43,FOLLOW_31); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEnumCartesAccess().getCarteKeyword_3_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumCartes"


    // $ANTLR start "entryRuleNombreDePioches"
    // InternalUnoDsl.g:1006:1: entryRuleNombreDePioches returns [EObject current=null] : iv_ruleNombreDePioches= ruleNombreDePioches EOF ;
    public final EObject entryRuleNombreDePioches() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNombreDePioches = null;


        try {
            // InternalUnoDsl.g:1006:56: (iv_ruleNombreDePioches= ruleNombreDePioches EOF )
            // InternalUnoDsl.g:1007:2: iv_ruleNombreDePioches= ruleNombreDePioches EOF
            {
             newCompositeNode(grammarAccess.getNombreDePiochesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNombreDePioches=ruleNombreDePioches();

            state._fsp--;

             current =iv_ruleNombreDePioches; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNombreDePioches"


    // $ANTLR start "ruleNombreDePioches"
    // InternalUnoDsl.g:1013:1: ruleNombreDePioches returns [EObject current=null] : ( ( ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) ) ) | ( (lv_troisFois_2_0= '3' ) ) ) ;
    public final EObject ruleNombreDePioches() throws RecognitionException {
        EObject current = null;

        Token lv_uneFois_0_0=null;
        Token lv_troisFois_2_0=null;
        EObject lv_peutJouer_1_0 = null;



        	enterRule();

        try {
            // InternalUnoDsl.g:1019:2: ( ( ( ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) ) ) | ( (lv_troisFois_2_0= '3' ) ) ) )
            // InternalUnoDsl.g:1020:2: ( ( ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) ) ) | ( (lv_troisFois_2_0= '3' ) ) )
            {
            // InternalUnoDsl.g:1020:2: ( ( ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) ) ) | ( (lv_troisFois_2_0= '3' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUnoDsl.g:1021:3: ( ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) ) )
                    {
                    // InternalUnoDsl.g:1021:3: ( ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) ) )
                    // InternalUnoDsl.g:1022:4: ( (lv_uneFois_0_0= '1' ) ) ( (lv_peutJouer_1_0= rulePeutJouer ) )
                    {
                    // InternalUnoDsl.g:1022:4: ( (lv_uneFois_0_0= '1' ) )
                    // InternalUnoDsl.g:1023:5: (lv_uneFois_0_0= '1' )
                    {
                    // InternalUnoDsl.g:1023:5: (lv_uneFois_0_0= '1' )
                    // InternalUnoDsl.g:1024:6: lv_uneFois_0_0= '1'
                    {
                    lv_uneFois_0_0=(Token)match(input,25,FOLLOW_35); 

                    						newLeafNode(lv_uneFois_0_0, grammarAccess.getNombreDePiochesAccess().getUneFois1Keyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNombreDePiochesRule());
                    						}
                    						setWithLastConsumed(current, "uneFois", lv_uneFois_0_0, "1");
                    					

                    }


                    }

                    // InternalUnoDsl.g:1036:4: ( (lv_peutJouer_1_0= rulePeutJouer ) )
                    // InternalUnoDsl.g:1037:5: (lv_peutJouer_1_0= rulePeutJouer )
                    {
                    // InternalUnoDsl.g:1037:5: (lv_peutJouer_1_0= rulePeutJouer )
                    // InternalUnoDsl.g:1038:6: lv_peutJouer_1_0= rulePeutJouer
                    {

                    						newCompositeNode(grammarAccess.getNombreDePiochesAccess().getPeutJouerPeutJouerParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_peutJouer_1_0=rulePeutJouer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNombreDePiochesRule());
                    						}
                    						set(
                    							current,
                    							"peutJouer",
                    							lv_peutJouer_1_0,
                    							"org.xtext.example.mydsl.UnoDsl.PeutJouer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:1057:3: ( (lv_troisFois_2_0= '3' ) )
                    {
                    // InternalUnoDsl.g:1057:3: ( (lv_troisFois_2_0= '3' ) )
                    // InternalUnoDsl.g:1058:4: (lv_troisFois_2_0= '3' )
                    {
                    // InternalUnoDsl.g:1058:4: (lv_troisFois_2_0= '3' )
                    // InternalUnoDsl.g:1059:5: lv_troisFois_2_0= '3'
                    {
                    lv_troisFois_2_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_troisFois_2_0, grammarAccess.getNombreDePiochesAccess().getTroisFois3Keyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNombreDePiochesRule());
                    					}
                    					setWithLastConsumed(current, "troisFois", lv_troisFois_2_0, "3");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNombreDePioches"


    // $ANTLR start "entryRulePeutJouer"
    // InternalUnoDsl.g:1075:1: entryRulePeutJouer returns [EObject current=null] : iv_rulePeutJouer= rulePeutJouer EOF ;
    public final EObject entryRulePeutJouer() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeutJouer = null;


        try {
            // InternalUnoDsl.g:1075:50: (iv_rulePeutJouer= rulePeutJouer EOF )
            // InternalUnoDsl.g:1076:2: iv_rulePeutJouer= rulePeutJouer EOF
            {
             newCompositeNode(grammarAccess.getPeutJouerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeutJouer=rulePeutJouer();

            state._fsp--;

             current =iv_rulePeutJouer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePeutJouer"


    // $ANTLR start "rulePeutJouer"
    // InternalUnoDsl.g:1082:1: rulePeutJouer returns [EObject current=null] : ( ( (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' ) ) | ( (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' ) ) ) ;
    public final EObject rulePeutJouer() throws RecognitionException {
        EObject current = null;

        Token lv_peutJouerEnsuite_0_0=null;
        Token lv_peutPasJouerEnsuite_1_0=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:1088:2: ( ( ( (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' ) ) | ( (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' ) ) ) )
            // InternalUnoDsl.g:1089:2: ( ( (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' ) ) | ( (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' ) ) )
            {
            // InternalUnoDsl.g:1089:2: ( ( (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' ) ) | ( (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==47) ) {
                alt8=1;
            }
            else if ( (LA8_0==48) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUnoDsl.g:1090:3: ( (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' ) )
                    {
                    // InternalUnoDsl.g:1090:3: ( (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' ) )
                    // InternalUnoDsl.g:1091:4: (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' )
                    {
                    // InternalUnoDsl.g:1091:4: (lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite' )
                    // InternalUnoDsl.g:1092:5: lv_peutJouerEnsuite_0_0= 'peut_jouer_ensuite'
                    {
                    lv_peutJouerEnsuite_0_0=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_peutJouerEnsuite_0_0, grammarAccess.getPeutJouerAccess().getPeutJouerEnsuitePeut_jouer_ensuiteKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPeutJouerRule());
                    					}
                    					setWithLastConsumed(current, "peutJouerEnsuite", lv_peutJouerEnsuite_0_0, "peut_jouer_ensuite");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:1105:3: ( (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' ) )
                    {
                    // InternalUnoDsl.g:1105:3: ( (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' ) )
                    // InternalUnoDsl.g:1106:4: (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' )
                    {
                    // InternalUnoDsl.g:1106:4: (lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite' )
                    // InternalUnoDsl.g:1107:5: lv_peutPasJouerEnsuite_1_0= 'peut_pas_jouer_ensuite'
                    {
                    lv_peutPasJouerEnsuite_1_0=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_peutPasJouerEnsuite_1_0, grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuitePeut_pas_jouer_ensuiteKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPeutJouerRule());
                    					}
                    					setWithLastConsumed(current, "peutPasJouerEnsuite", lv_peutPasJouerEnsuite_1_0, "peut_pas_jouer_ensuite");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePeutJouer"


    // $ANTLR start "ruleNbCartesTalon"
    // InternalUnoDsl.g:1123:1: ruleNbCartesTalon returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '4' ) ) ;
    public final Enumerator ruleNbCartesTalon() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalUnoDsl.g:1129:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '4' ) ) )
            // InternalUnoDsl.g:1130:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '4' ) )
            {
            // InternalUnoDsl.g:1130:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '4' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==49) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUnoDsl.g:1131:3: (enumLiteral_0= '1' )
                    {
                    // InternalUnoDsl.g:1131:3: (enumLiteral_0= '1' )
                    // InternalUnoDsl.g:1132:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getNbCartesTalonAccess().getUneCarteTalonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNbCartesTalonAccess().getUneCarteTalonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:1139:3: (enumLiteral_1= '4' )
                    {
                    // InternalUnoDsl.g:1139:3: (enumLiteral_1= '4' )
                    // InternalUnoDsl.g:1140:4: enumLiteral_1= '4'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getNbCartesTalonAccess().getQuatreCartesTalonEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNbCartesTalonAccess().getQuatreCartesTalonEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNbCartesTalon"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008004522000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000008004522002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001800000000000L});

}
