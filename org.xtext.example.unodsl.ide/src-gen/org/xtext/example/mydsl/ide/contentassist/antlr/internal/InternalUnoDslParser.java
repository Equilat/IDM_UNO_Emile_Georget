package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.UnoDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUnoDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'0'", "'1'", "'3'", "'4'", "'<UnoConfig>'", "'</UnoConfig>'", "'<TalonJeu'", "'nbCartes'", "'='", "'/>'", "'<Main'", "'visibilite'", "'nombreDePiles'", "'<Pioche>'", "'</Pioche>'", "'<DureeTour'", "'duree'", "'<ReglesSpeciales>'", "'</ReglesSpeciales>'", "'<Regle>'", "'</Regle>'", "'<CartesSpeciales>'", "'</CartesSpeciales>'", "'<Carte>'", "'</Carte>'", "'cumul_+2'", "'cumul_+4'", "'suite_classique'", "'suite_royale'", "'interception'", "'+4_ou_rien'", "'visible'", "'invisible'", "'carte_uno'", "'+4_non_contestable'", "'0_special'", "'7_special'", "'peut_jouer_ensuite'", "'peut_pas_jouer_ensuite'"
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

    	public void setGrammarAccess(UnoDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUnoDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUnoDsl.g:54:1: ( ruleModel EOF )
            // InternalUnoDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUnoDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalUnoDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalUnoDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalUnoDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalUnoDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalUnoDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUnoConfig"
    // InternalUnoDsl.g:78:1: entryRuleUnoConfig : ruleUnoConfig EOF ;
    public final void entryRuleUnoConfig() throws RecognitionException {
        try {
            // InternalUnoDsl.g:79:1: ( ruleUnoConfig EOF )
            // InternalUnoDsl.g:80:1: ruleUnoConfig EOF
            {
             before(grammarAccess.getUnoConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleUnoConfig();

            state._fsp--;

             after(grammarAccess.getUnoConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnoConfig"


    // $ANTLR start "ruleUnoConfig"
    // InternalUnoDsl.g:87:1: ruleUnoConfig : ( ( rule__UnoConfig__UnorderedGroup ) ) ;
    public final void ruleUnoConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:91:2: ( ( ( rule__UnoConfig__UnorderedGroup ) ) )
            // InternalUnoDsl.g:92:2: ( ( rule__UnoConfig__UnorderedGroup ) )
            {
            // InternalUnoDsl.g:92:2: ( ( rule__UnoConfig__UnorderedGroup ) )
            // InternalUnoDsl.g:93:3: ( rule__UnoConfig__UnorderedGroup )
            {
             before(grammarAccess.getUnoConfigAccess().getUnorderedGroup()); 
            // InternalUnoDsl.g:94:3: ( rule__UnoConfig__UnorderedGroup )
            // InternalUnoDsl.g:94:4: rule__UnoConfig__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getUnoConfigAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnoConfig"


    // $ANTLR start "entryRuleTempsLimite"
    // InternalUnoDsl.g:103:1: entryRuleTempsLimite : ruleTempsLimite EOF ;
    public final void entryRuleTempsLimite() throws RecognitionException {
        try {
            // InternalUnoDsl.g:104:1: ( ruleTempsLimite EOF )
            // InternalUnoDsl.g:105:1: ruleTempsLimite EOF
            {
             before(grammarAccess.getTempsLimiteRule()); 
            pushFollow(FOLLOW_1);
            ruleTempsLimite();

            state._fsp--;

             after(grammarAccess.getTempsLimiteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTempsLimite"


    // $ANTLR start "ruleTempsLimite"
    // InternalUnoDsl.g:112:1: ruleTempsLimite : ( ( rule__TempsLimite__Group__0 ) ) ;
    public final void ruleTempsLimite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:116:2: ( ( ( rule__TempsLimite__Group__0 ) ) )
            // InternalUnoDsl.g:117:2: ( ( rule__TempsLimite__Group__0 ) )
            {
            // InternalUnoDsl.g:117:2: ( ( rule__TempsLimite__Group__0 ) )
            // InternalUnoDsl.g:118:3: ( rule__TempsLimite__Group__0 )
            {
             before(grammarAccess.getTempsLimiteAccess().getGroup()); 
            // InternalUnoDsl.g:119:3: ( rule__TempsLimite__Group__0 )
            // InternalUnoDsl.g:119:4: rule__TempsLimite__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TempsLimite__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTempsLimiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTempsLimite"


    // $ANTLR start "entryRuleDeposeCartes"
    // InternalUnoDsl.g:128:1: entryRuleDeposeCartes : ruleDeposeCartes EOF ;
    public final void entryRuleDeposeCartes() throws RecognitionException {
        try {
            // InternalUnoDsl.g:129:1: ( ruleDeposeCartes EOF )
            // InternalUnoDsl.g:130:1: ruleDeposeCartes EOF
            {
             before(grammarAccess.getDeposeCartesRule()); 
            pushFollow(FOLLOW_1);
            ruleDeposeCartes();

            state._fsp--;

             after(grammarAccess.getDeposeCartesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeposeCartes"


    // $ANTLR start "ruleDeposeCartes"
    // InternalUnoDsl.g:137:1: ruleDeposeCartes : ( ( rule__DeposeCartes__Group__0 ) ) ;
    public final void ruleDeposeCartes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:141:2: ( ( ( rule__DeposeCartes__Group__0 ) ) )
            // InternalUnoDsl.g:142:2: ( ( rule__DeposeCartes__Group__0 ) )
            {
            // InternalUnoDsl.g:142:2: ( ( rule__DeposeCartes__Group__0 ) )
            // InternalUnoDsl.g:143:3: ( rule__DeposeCartes__Group__0 )
            {
             before(grammarAccess.getDeposeCartesAccess().getGroup()); 
            // InternalUnoDsl.g:144:3: ( rule__DeposeCartes__Group__0 )
            // InternalUnoDsl.g:144:4: rule__DeposeCartes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeposeCartes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeposeCartesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeposeCartes"


    // $ANTLR start "entryRuleEnumReglesDeposeCartes"
    // InternalUnoDsl.g:153:1: entryRuleEnumReglesDeposeCartes : ruleEnumReglesDeposeCartes EOF ;
    public final void entryRuleEnumReglesDeposeCartes() throws RecognitionException {
        try {
            // InternalUnoDsl.g:154:1: ( ruleEnumReglesDeposeCartes EOF )
            // InternalUnoDsl.g:155:1: ruleEnumReglesDeposeCartes EOF
            {
             before(grammarAccess.getEnumReglesDeposeCartesRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumReglesDeposeCartes();

            state._fsp--;

             after(grammarAccess.getEnumReglesDeposeCartesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumReglesDeposeCartes"


    // $ANTLR start "ruleEnumReglesDeposeCartes"
    // InternalUnoDsl.g:162:1: ruleEnumReglesDeposeCartes : ( ( rule__EnumReglesDeposeCartes__UnorderedGroup ) ) ;
    public final void ruleEnumReglesDeposeCartes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:166:2: ( ( ( rule__EnumReglesDeposeCartes__UnorderedGroup ) ) )
            // InternalUnoDsl.g:167:2: ( ( rule__EnumReglesDeposeCartes__UnorderedGroup ) )
            {
            // InternalUnoDsl.g:167:2: ( ( rule__EnumReglesDeposeCartes__UnorderedGroup ) )
            // InternalUnoDsl.g:168:3: ( rule__EnumReglesDeposeCartes__UnorderedGroup )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup()); 
            // InternalUnoDsl.g:169:3: ( rule__EnumReglesDeposeCartes__UnorderedGroup )
            // InternalUnoDsl.g:169:4: rule__EnumReglesDeposeCartes__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumReglesDeposeCartes"


    // $ANTLR start "entryRuleVisibilite"
    // InternalUnoDsl.g:178:1: entryRuleVisibilite : ruleVisibilite EOF ;
    public final void entryRuleVisibilite() throws RecognitionException {
        try {
            // InternalUnoDsl.g:179:1: ( ruleVisibilite EOF )
            // InternalUnoDsl.g:180:1: ruleVisibilite EOF
            {
             before(grammarAccess.getVisibiliteRule()); 
            pushFollow(FOLLOW_1);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getVisibiliteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisibilite"


    // $ANTLR start "ruleVisibilite"
    // InternalUnoDsl.g:187:1: ruleVisibilite : ( ( rule__Visibilite__Alternatives ) ) ;
    public final void ruleVisibilite() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:191:2: ( ( ( rule__Visibilite__Alternatives ) ) )
            // InternalUnoDsl.g:192:2: ( ( rule__Visibilite__Alternatives ) )
            {
            // InternalUnoDsl.g:192:2: ( ( rule__Visibilite__Alternatives ) )
            // InternalUnoDsl.g:193:3: ( rule__Visibilite__Alternatives )
            {
             before(grammarAccess.getVisibiliteAccess().getAlternatives()); 
            // InternalUnoDsl.g:194:3: ( rule__Visibilite__Alternatives )
            // InternalUnoDsl.g:194:4: rule__Visibilite__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibilite__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibiliteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilite"


    // $ANTLR start "entryRuleNombreDePiles"
    // InternalUnoDsl.g:203:1: entryRuleNombreDePiles : ruleNombreDePiles EOF ;
    public final void entryRuleNombreDePiles() throws RecognitionException {
        try {
            // InternalUnoDsl.g:204:1: ( ruleNombreDePiles EOF )
            // InternalUnoDsl.g:205:1: ruleNombreDePiles EOF
            {
             before(grammarAccess.getNombreDePilesRule()); 
            pushFollow(FOLLOW_1);
            ruleNombreDePiles();

            state._fsp--;

             after(grammarAccess.getNombreDePilesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNombreDePiles"


    // $ANTLR start "ruleNombreDePiles"
    // InternalUnoDsl.g:212:1: ruleNombreDePiles : ( ( rule__NombreDePiles__Alternatives ) ) ;
    public final void ruleNombreDePiles() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:216:2: ( ( ( rule__NombreDePiles__Alternatives ) ) )
            // InternalUnoDsl.g:217:2: ( ( rule__NombreDePiles__Alternatives ) )
            {
            // InternalUnoDsl.g:217:2: ( ( rule__NombreDePiles__Alternatives ) )
            // InternalUnoDsl.g:218:3: ( rule__NombreDePiles__Alternatives )
            {
             before(grammarAccess.getNombreDePilesAccess().getAlternatives()); 
            // InternalUnoDsl.g:219:3: ( rule__NombreDePiles__Alternatives )
            // InternalUnoDsl.g:219:4: rule__NombreDePiles__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NombreDePiles__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombreDePilesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNombreDePiles"


    // $ANTLR start "entryRuleCartesSpeciales"
    // InternalUnoDsl.g:228:1: entryRuleCartesSpeciales : ruleCartesSpeciales EOF ;
    public final void entryRuleCartesSpeciales() throws RecognitionException {
        try {
            // InternalUnoDsl.g:229:1: ( ruleCartesSpeciales EOF )
            // InternalUnoDsl.g:230:1: ruleCartesSpeciales EOF
            {
             before(grammarAccess.getCartesSpecialesRule()); 
            pushFollow(FOLLOW_1);
            ruleCartesSpeciales();

            state._fsp--;

             after(grammarAccess.getCartesSpecialesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCartesSpeciales"


    // $ANTLR start "ruleCartesSpeciales"
    // InternalUnoDsl.g:237:1: ruleCartesSpeciales : ( ( rule__CartesSpeciales__Group__0 ) ) ;
    public final void ruleCartesSpeciales() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:241:2: ( ( ( rule__CartesSpeciales__Group__0 ) ) )
            // InternalUnoDsl.g:242:2: ( ( rule__CartesSpeciales__Group__0 ) )
            {
            // InternalUnoDsl.g:242:2: ( ( rule__CartesSpeciales__Group__0 ) )
            // InternalUnoDsl.g:243:3: ( rule__CartesSpeciales__Group__0 )
            {
             before(grammarAccess.getCartesSpecialesAccess().getGroup()); 
            // InternalUnoDsl.g:244:3: ( rule__CartesSpeciales__Group__0 )
            // InternalUnoDsl.g:244:4: rule__CartesSpeciales__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CartesSpeciales__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCartesSpecialesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCartesSpeciales"


    // $ANTLR start "entryRuleEnumCartes"
    // InternalUnoDsl.g:253:1: entryRuleEnumCartes : ruleEnumCartes EOF ;
    public final void entryRuleEnumCartes() throws RecognitionException {
        try {
            // InternalUnoDsl.g:254:1: ( ruleEnumCartes EOF )
            // InternalUnoDsl.g:255:1: ruleEnumCartes EOF
            {
             before(grammarAccess.getEnumCartesRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumCartes();

            state._fsp--;

             after(grammarAccess.getEnumCartesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumCartes"


    // $ANTLR start "ruleEnumCartes"
    // InternalUnoDsl.g:262:1: ruleEnumCartes : ( ( rule__EnumCartes__UnorderedGroup ) ) ;
    public final void ruleEnumCartes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:266:2: ( ( ( rule__EnumCartes__UnorderedGroup ) ) )
            // InternalUnoDsl.g:267:2: ( ( rule__EnumCartes__UnorderedGroup ) )
            {
            // InternalUnoDsl.g:267:2: ( ( rule__EnumCartes__UnorderedGroup ) )
            // InternalUnoDsl.g:268:3: ( rule__EnumCartes__UnorderedGroup )
            {
             before(grammarAccess.getEnumCartesAccess().getUnorderedGroup()); 
            // InternalUnoDsl.g:269:3: ( rule__EnumCartes__UnorderedGroup )
            // InternalUnoDsl.g:269:4: rule__EnumCartes__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getEnumCartesAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumCartes"


    // $ANTLR start "entryRuleNombreDePioches"
    // InternalUnoDsl.g:278:1: entryRuleNombreDePioches : ruleNombreDePioches EOF ;
    public final void entryRuleNombreDePioches() throws RecognitionException {
        try {
            // InternalUnoDsl.g:279:1: ( ruleNombreDePioches EOF )
            // InternalUnoDsl.g:280:1: ruleNombreDePioches EOF
            {
             before(grammarAccess.getNombreDePiochesRule()); 
            pushFollow(FOLLOW_1);
            ruleNombreDePioches();

            state._fsp--;

             after(grammarAccess.getNombreDePiochesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNombreDePioches"


    // $ANTLR start "ruleNombreDePioches"
    // InternalUnoDsl.g:287:1: ruleNombreDePioches : ( ( rule__NombreDePioches__Alternatives ) ) ;
    public final void ruleNombreDePioches() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:291:2: ( ( ( rule__NombreDePioches__Alternatives ) ) )
            // InternalUnoDsl.g:292:2: ( ( rule__NombreDePioches__Alternatives ) )
            {
            // InternalUnoDsl.g:292:2: ( ( rule__NombreDePioches__Alternatives ) )
            // InternalUnoDsl.g:293:3: ( rule__NombreDePioches__Alternatives )
            {
             before(grammarAccess.getNombreDePiochesAccess().getAlternatives()); 
            // InternalUnoDsl.g:294:3: ( rule__NombreDePioches__Alternatives )
            // InternalUnoDsl.g:294:4: rule__NombreDePioches__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NombreDePioches__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombreDePiochesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNombreDePioches"


    // $ANTLR start "entryRulePeutJouer"
    // InternalUnoDsl.g:303:1: entryRulePeutJouer : rulePeutJouer EOF ;
    public final void entryRulePeutJouer() throws RecognitionException {
        try {
            // InternalUnoDsl.g:304:1: ( rulePeutJouer EOF )
            // InternalUnoDsl.g:305:1: rulePeutJouer EOF
            {
             before(grammarAccess.getPeutJouerRule()); 
            pushFollow(FOLLOW_1);
            rulePeutJouer();

            state._fsp--;

             after(grammarAccess.getPeutJouerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePeutJouer"


    // $ANTLR start "rulePeutJouer"
    // InternalUnoDsl.g:312:1: rulePeutJouer : ( ( rule__PeutJouer__Alternatives ) ) ;
    public final void rulePeutJouer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:316:2: ( ( ( rule__PeutJouer__Alternatives ) ) )
            // InternalUnoDsl.g:317:2: ( ( rule__PeutJouer__Alternatives ) )
            {
            // InternalUnoDsl.g:317:2: ( ( rule__PeutJouer__Alternatives ) )
            // InternalUnoDsl.g:318:3: ( rule__PeutJouer__Alternatives )
            {
             before(grammarAccess.getPeutJouerAccess().getAlternatives()); 
            // InternalUnoDsl.g:319:3: ( rule__PeutJouer__Alternatives )
            // InternalUnoDsl.g:319:4: rule__PeutJouer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PeutJouer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPeutJouerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePeutJouer"


    // $ANTLR start "ruleNbCartesTalon"
    // InternalUnoDsl.g:328:1: ruleNbCartesTalon : ( ( rule__NbCartesTalon__Alternatives ) ) ;
    public final void ruleNbCartesTalon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:332:1: ( ( ( rule__NbCartesTalon__Alternatives ) ) )
            // InternalUnoDsl.g:333:2: ( ( rule__NbCartesTalon__Alternatives ) )
            {
            // InternalUnoDsl.g:333:2: ( ( rule__NbCartesTalon__Alternatives ) )
            // InternalUnoDsl.g:334:3: ( rule__NbCartesTalon__Alternatives )
            {
             before(grammarAccess.getNbCartesTalonAccess().getAlternatives()); 
            // InternalUnoDsl.g:335:3: ( rule__NbCartesTalon__Alternatives )
            // InternalUnoDsl.g:335:4: rule__NbCartesTalon__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NbCartesTalon__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNbCartesTalonAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNbCartesTalon"


    // $ANTLR start "rule__TempsLimite__Alternatives_3"
    // InternalUnoDsl.g:343:1: rule__TempsLimite__Alternatives_3 : ( ( RULE_INT ) | ( '0' ) | ( '1' ) );
    public final void rule__TempsLimite__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:347:1: ( ( RULE_INT ) | ( '0' ) | ( '1' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case 12:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalUnoDsl.g:348:2: ( RULE_INT )
                    {
                    // InternalUnoDsl.g:348:2: ( RULE_INT )
                    // InternalUnoDsl.g:349:3: RULE_INT
                    {
                     before(grammarAccess.getTempsLimiteAccess().getINTTerminalRuleCall_3_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getTempsLimiteAccess().getINTTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:354:2: ( '0' )
                    {
                    // InternalUnoDsl.g:354:2: ( '0' )
                    // InternalUnoDsl.g:355:3: '0'
                    {
                     before(grammarAccess.getTempsLimiteAccess().getDigitZeroKeyword_3_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTempsLimiteAccess().getDigitZeroKeyword_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:360:2: ( '1' )
                    {
                    // InternalUnoDsl.g:360:2: ( '1' )
                    // InternalUnoDsl.g:361:3: '1'
                    {
                     before(grammarAccess.getTempsLimiteAccess().getDigitOneKeyword_3_2()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTempsLimiteAccess().getDigitOneKeyword_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Alternatives_3"


    // $ANTLR start "rule__Visibilite__Alternatives"
    // InternalUnoDsl.g:370:1: rule__Visibilite__Alternatives : ( ( ( rule__Visibilite__VisibleAssignment_0 ) ) | ( ( rule__Visibilite__InvisibleAssignment_1 ) ) );
    public final void rule__Visibilite__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:374:1: ( ( ( rule__Visibilite__VisibleAssignment_0 ) ) | ( ( rule__Visibilite__InvisibleAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            else if ( (LA2_0==43) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUnoDsl.g:375:2: ( ( rule__Visibilite__VisibleAssignment_0 ) )
                    {
                    // InternalUnoDsl.g:375:2: ( ( rule__Visibilite__VisibleAssignment_0 ) )
                    // InternalUnoDsl.g:376:3: ( rule__Visibilite__VisibleAssignment_0 )
                    {
                     before(grammarAccess.getVisibiliteAccess().getVisibleAssignment_0()); 
                    // InternalUnoDsl.g:377:3: ( rule__Visibilite__VisibleAssignment_0 )
                    // InternalUnoDsl.g:377:4: rule__Visibilite__VisibleAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visibilite__VisibleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVisibiliteAccess().getVisibleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:381:2: ( ( rule__Visibilite__InvisibleAssignment_1 ) )
                    {
                    // InternalUnoDsl.g:381:2: ( ( rule__Visibilite__InvisibleAssignment_1 ) )
                    // InternalUnoDsl.g:382:3: ( rule__Visibilite__InvisibleAssignment_1 )
                    {
                     before(grammarAccess.getVisibiliteAccess().getInvisibleAssignment_1()); 
                    // InternalUnoDsl.g:383:3: ( rule__Visibilite__InvisibleAssignment_1 )
                    // InternalUnoDsl.g:383:4: rule__Visibilite__InvisibleAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Visibilite__InvisibleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getVisibiliteAccess().getInvisibleAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibilite__Alternatives"


    // $ANTLR start "rule__NombreDePiles__Alternatives"
    // InternalUnoDsl.g:391:1: rule__NombreDePiles__Alternatives : ( ( '1' ) | ( '3' ) );
    public final void rule__NombreDePiles__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:395:1: ( ( '1' ) | ( '3' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUnoDsl.g:396:2: ( '1' )
                    {
                    // InternalUnoDsl.g:396:2: ( '1' )
                    // InternalUnoDsl.g:397:3: '1'
                    {
                     before(grammarAccess.getNombreDePilesAccess().getDigitOneKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getNombreDePilesAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:402:2: ( '3' )
                    {
                    // InternalUnoDsl.g:402:2: ( '3' )
                    // InternalUnoDsl.g:403:3: '3'
                    {
                     before(grammarAccess.getNombreDePilesAccess().getDigitThreeKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getNombreDePilesAccess().getDigitThreeKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePiles__Alternatives"


    // $ANTLR start "rule__NombreDePioches__Alternatives"
    // InternalUnoDsl.g:412:1: rule__NombreDePioches__Alternatives : ( ( ( rule__NombreDePioches__Group_0__0 ) ) | ( ( rule__NombreDePioches__TroisFoisAssignment_1 ) ) );
    public final void rule__NombreDePioches__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:416:1: ( ( ( rule__NombreDePioches__Group_0__0 ) ) | ( ( rule__NombreDePioches__TroisFoisAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUnoDsl.g:417:2: ( ( rule__NombreDePioches__Group_0__0 ) )
                    {
                    // InternalUnoDsl.g:417:2: ( ( rule__NombreDePioches__Group_0__0 ) )
                    // InternalUnoDsl.g:418:3: ( rule__NombreDePioches__Group_0__0 )
                    {
                     before(grammarAccess.getNombreDePiochesAccess().getGroup_0()); 
                    // InternalUnoDsl.g:419:3: ( rule__NombreDePioches__Group_0__0 )
                    // InternalUnoDsl.g:419:4: rule__NombreDePioches__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NombreDePioches__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNombreDePiochesAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:423:2: ( ( rule__NombreDePioches__TroisFoisAssignment_1 ) )
                    {
                    // InternalUnoDsl.g:423:2: ( ( rule__NombreDePioches__TroisFoisAssignment_1 ) )
                    // InternalUnoDsl.g:424:3: ( rule__NombreDePioches__TroisFoisAssignment_1 )
                    {
                     before(grammarAccess.getNombreDePiochesAccess().getTroisFoisAssignment_1()); 
                    // InternalUnoDsl.g:425:3: ( rule__NombreDePioches__TroisFoisAssignment_1 )
                    // InternalUnoDsl.g:425:4: rule__NombreDePioches__TroisFoisAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NombreDePioches__TroisFoisAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNombreDePiochesAccess().getTroisFoisAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__Alternatives"


    // $ANTLR start "rule__PeutJouer__Alternatives"
    // InternalUnoDsl.g:433:1: rule__PeutJouer__Alternatives : ( ( ( rule__PeutJouer__PeutJouerEnsuiteAssignment_0 ) ) | ( ( rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 ) ) );
    public final void rule__PeutJouer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:437:1: ( ( ( rule__PeutJouer__PeutJouerEnsuiteAssignment_0 ) ) | ( ( rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalUnoDsl.g:438:2: ( ( rule__PeutJouer__PeutJouerEnsuiteAssignment_0 ) )
                    {
                    // InternalUnoDsl.g:438:2: ( ( rule__PeutJouer__PeutJouerEnsuiteAssignment_0 ) )
                    // InternalUnoDsl.g:439:3: ( rule__PeutJouer__PeutJouerEnsuiteAssignment_0 )
                    {
                     before(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuiteAssignment_0()); 
                    // InternalUnoDsl.g:440:3: ( rule__PeutJouer__PeutJouerEnsuiteAssignment_0 )
                    // InternalUnoDsl.g:440:4: rule__PeutJouer__PeutJouerEnsuiteAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PeutJouer__PeutJouerEnsuiteAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuiteAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:444:2: ( ( rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 ) )
                    {
                    // InternalUnoDsl.g:444:2: ( ( rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 ) )
                    // InternalUnoDsl.g:445:3: ( rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 )
                    {
                     before(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuiteAssignment_1()); 
                    // InternalUnoDsl.g:446:3: ( rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 )
                    // InternalUnoDsl.g:446:4: rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuiteAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeutJouer__Alternatives"


    // $ANTLR start "rule__NbCartesTalon__Alternatives"
    // InternalUnoDsl.g:454:1: rule__NbCartesTalon__Alternatives : ( ( ( '1' ) ) | ( ( '4' ) ) );
    public final void rule__NbCartesTalon__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:458:1: ( ( ( '1' ) ) | ( ( '4' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUnoDsl.g:459:2: ( ( '1' ) )
                    {
                    // InternalUnoDsl.g:459:2: ( ( '1' ) )
                    // InternalUnoDsl.g:460:3: ( '1' )
                    {
                     before(grammarAccess.getNbCartesTalonAccess().getUneCarteTalonEnumLiteralDeclaration_0()); 
                    // InternalUnoDsl.g:461:3: ( '1' )
                    // InternalUnoDsl.g:461:4: '1'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getNbCartesTalonAccess().getUneCarteTalonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:465:2: ( ( '4' ) )
                    {
                    // InternalUnoDsl.g:465:2: ( ( '4' ) )
                    // InternalUnoDsl.g:466:3: ( '4' )
                    {
                     before(grammarAccess.getNbCartesTalonAccess().getQuatreCartesTalonEnumLiteralDeclaration_1()); 
                    // InternalUnoDsl.g:467:3: ( '4' )
                    // InternalUnoDsl.g:467:4: '4'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNbCartesTalonAccess().getQuatreCartesTalonEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NbCartesTalon__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalUnoDsl.g:475:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:479:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalUnoDsl.g:480:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalUnoDsl.g:487:1: rule__Model__Group__0__Impl : ( '<UnoConfig>' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:491:1: ( ( '<UnoConfig>' ) )
            // InternalUnoDsl.g:492:1: ( '<UnoConfig>' )
            {
            // InternalUnoDsl.g:492:1: ( '<UnoConfig>' )
            // InternalUnoDsl.g:493:2: '<UnoConfig>'
            {
             before(grammarAccess.getModelAccess().getUnoConfigKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getUnoConfigKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalUnoDsl.g:502:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:506:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalUnoDsl.g:507:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalUnoDsl.g:514:1: rule__Model__Group__1__Impl : ( ( rule__Model__UnoRulesAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:518:1: ( ( ( rule__Model__UnoRulesAssignment_1 ) ) )
            // InternalUnoDsl.g:519:1: ( ( rule__Model__UnoRulesAssignment_1 ) )
            {
            // InternalUnoDsl.g:519:1: ( ( rule__Model__UnoRulesAssignment_1 ) )
            // InternalUnoDsl.g:520:2: ( rule__Model__UnoRulesAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getUnoRulesAssignment_1()); 
            // InternalUnoDsl.g:521:2: ( rule__Model__UnoRulesAssignment_1 )
            // InternalUnoDsl.g:521:3: rule__Model__UnoRulesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__UnoRulesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getUnoRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalUnoDsl.g:529:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:533:1: ( rule__Model__Group__2__Impl )
            // InternalUnoDsl.g:534:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalUnoDsl.g:540:1: rule__Model__Group__2__Impl : ( '</UnoConfig>' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:544:1: ( ( '</UnoConfig>' ) )
            // InternalUnoDsl.g:545:1: ( '</UnoConfig>' )
            {
            // InternalUnoDsl.g:545:1: ( '</UnoConfig>' )
            // InternalUnoDsl.g:546:2: '</UnoConfig>'
            {
             before(grammarAccess.getModelAccess().getUnoConfigKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getUnoConfigKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__UnoConfig__Group_0__0"
    // InternalUnoDsl.g:556:1: rule__UnoConfig__Group_0__0 : rule__UnoConfig__Group_0__0__Impl rule__UnoConfig__Group_0__1 ;
    public final void rule__UnoConfig__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:560:1: ( rule__UnoConfig__Group_0__0__Impl rule__UnoConfig__Group_0__1 )
            // InternalUnoDsl.g:561:2: rule__UnoConfig__Group_0__0__Impl rule__UnoConfig__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__UnoConfig__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__0"


    // $ANTLR start "rule__UnoConfig__Group_0__0__Impl"
    // InternalUnoDsl.g:568:1: rule__UnoConfig__Group_0__0__Impl : ( '<TalonJeu' ) ;
    public final void rule__UnoConfig__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:572:1: ( ( '<TalonJeu' ) )
            // InternalUnoDsl.g:573:1: ( '<TalonJeu' )
            {
            // InternalUnoDsl.g:573:1: ( '<TalonJeu' )
            // InternalUnoDsl.g:574:2: '<TalonJeu'
            {
             before(grammarAccess.getUnoConfigAccess().getTalonJeuKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getTalonJeuKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__0__Impl"


    // $ANTLR start "rule__UnoConfig__Group_0__1"
    // InternalUnoDsl.g:583:1: rule__UnoConfig__Group_0__1 : rule__UnoConfig__Group_0__1__Impl rule__UnoConfig__Group_0__2 ;
    public final void rule__UnoConfig__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:587:1: ( rule__UnoConfig__Group_0__1__Impl rule__UnoConfig__Group_0__2 )
            // InternalUnoDsl.g:588:2: rule__UnoConfig__Group_0__1__Impl rule__UnoConfig__Group_0__2
            {
            pushFollow(FOLLOW_6);
            rule__UnoConfig__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__1"


    // $ANTLR start "rule__UnoConfig__Group_0__1__Impl"
    // InternalUnoDsl.g:595:1: rule__UnoConfig__Group_0__1__Impl : ( 'nbCartes' ) ;
    public final void rule__UnoConfig__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:599:1: ( ( 'nbCartes' ) )
            // InternalUnoDsl.g:600:1: ( 'nbCartes' )
            {
            // InternalUnoDsl.g:600:1: ( 'nbCartes' )
            // InternalUnoDsl.g:601:2: 'nbCartes'
            {
             before(grammarAccess.getUnoConfigAccess().getNbCartesKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getNbCartesKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__1__Impl"


    // $ANTLR start "rule__UnoConfig__Group_0__2"
    // InternalUnoDsl.g:610:1: rule__UnoConfig__Group_0__2 : rule__UnoConfig__Group_0__2__Impl rule__UnoConfig__Group_0__3 ;
    public final void rule__UnoConfig__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:614:1: ( rule__UnoConfig__Group_0__2__Impl rule__UnoConfig__Group_0__3 )
            // InternalUnoDsl.g:615:2: rule__UnoConfig__Group_0__2__Impl rule__UnoConfig__Group_0__3
            {
            pushFollow(FOLLOW_7);
            rule__UnoConfig__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__2"


    // $ANTLR start "rule__UnoConfig__Group_0__2__Impl"
    // InternalUnoDsl.g:622:1: rule__UnoConfig__Group_0__2__Impl : ( '=' ) ;
    public final void rule__UnoConfig__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:626:1: ( ( '=' ) )
            // InternalUnoDsl.g:627:1: ( '=' )
            {
            // InternalUnoDsl.g:627:1: ( '=' )
            // InternalUnoDsl.g:628:2: '='
            {
             before(grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_0_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__2__Impl"


    // $ANTLR start "rule__UnoConfig__Group_0__3"
    // InternalUnoDsl.g:637:1: rule__UnoConfig__Group_0__3 : rule__UnoConfig__Group_0__3__Impl rule__UnoConfig__Group_0__4 ;
    public final void rule__UnoConfig__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:641:1: ( rule__UnoConfig__Group_0__3__Impl rule__UnoConfig__Group_0__4 )
            // InternalUnoDsl.g:642:2: rule__UnoConfig__Group_0__3__Impl rule__UnoConfig__Group_0__4
            {
            pushFollow(FOLLOW_8);
            rule__UnoConfig__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__3"


    // $ANTLR start "rule__UnoConfig__Group_0__3__Impl"
    // InternalUnoDsl.g:649:1: rule__UnoConfig__Group_0__3__Impl : ( ( rule__UnoConfig__NbCartesTalonAssignment_0_3 ) ) ;
    public final void rule__UnoConfig__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:653:1: ( ( ( rule__UnoConfig__NbCartesTalonAssignment_0_3 ) ) )
            // InternalUnoDsl.g:654:1: ( ( rule__UnoConfig__NbCartesTalonAssignment_0_3 ) )
            {
            // InternalUnoDsl.g:654:1: ( ( rule__UnoConfig__NbCartesTalonAssignment_0_3 ) )
            // InternalUnoDsl.g:655:2: ( rule__UnoConfig__NbCartesTalonAssignment_0_3 )
            {
             before(grammarAccess.getUnoConfigAccess().getNbCartesTalonAssignment_0_3()); 
            // InternalUnoDsl.g:656:2: ( rule__UnoConfig__NbCartesTalonAssignment_0_3 )
            // InternalUnoDsl.g:656:3: rule__UnoConfig__NbCartesTalonAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__NbCartesTalonAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getUnoConfigAccess().getNbCartesTalonAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__3__Impl"


    // $ANTLR start "rule__UnoConfig__Group_0__4"
    // InternalUnoDsl.g:664:1: rule__UnoConfig__Group_0__4 : rule__UnoConfig__Group_0__4__Impl ;
    public final void rule__UnoConfig__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:668:1: ( rule__UnoConfig__Group_0__4__Impl )
            // InternalUnoDsl.g:669:2: rule__UnoConfig__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__4"


    // $ANTLR start "rule__UnoConfig__Group_0__4__Impl"
    // InternalUnoDsl.g:675:1: rule__UnoConfig__Group_0__4__Impl : ( '/>' ) ;
    public final void rule__UnoConfig__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:679:1: ( ( '/>' ) )
            // InternalUnoDsl.g:680:1: ( '/>' )
            {
            // InternalUnoDsl.g:680:1: ( '/>' )
            // InternalUnoDsl.g:681:2: '/>'
            {
             before(grammarAccess.getUnoConfigAccess().getSolidusGreaterThanSignKeyword_0_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getSolidusGreaterThanSignKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_0__4__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__0"
    // InternalUnoDsl.g:691:1: rule__UnoConfig__Group_3__0 : rule__UnoConfig__Group_3__0__Impl rule__UnoConfig__Group_3__1 ;
    public final void rule__UnoConfig__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:695:1: ( rule__UnoConfig__Group_3__0__Impl rule__UnoConfig__Group_3__1 )
            // InternalUnoDsl.g:696:2: rule__UnoConfig__Group_3__0__Impl rule__UnoConfig__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__UnoConfig__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__0"


    // $ANTLR start "rule__UnoConfig__Group_3__0__Impl"
    // InternalUnoDsl.g:703:1: rule__UnoConfig__Group_3__0__Impl : ( '<Main' ) ;
    public final void rule__UnoConfig__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:707:1: ( ( '<Main' ) )
            // InternalUnoDsl.g:708:1: ( '<Main' )
            {
            // InternalUnoDsl.g:708:1: ( '<Main' )
            // InternalUnoDsl.g:709:2: '<Main'
            {
             before(grammarAccess.getUnoConfigAccess().getMainKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getMainKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__0__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__1"
    // InternalUnoDsl.g:718:1: rule__UnoConfig__Group_3__1 : rule__UnoConfig__Group_3__1__Impl rule__UnoConfig__Group_3__2 ;
    public final void rule__UnoConfig__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:722:1: ( rule__UnoConfig__Group_3__1__Impl rule__UnoConfig__Group_3__2 )
            // InternalUnoDsl.g:723:2: rule__UnoConfig__Group_3__1__Impl rule__UnoConfig__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__UnoConfig__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__1"


    // $ANTLR start "rule__UnoConfig__Group_3__1__Impl"
    // InternalUnoDsl.g:730:1: rule__UnoConfig__Group_3__1__Impl : ( 'visibilite' ) ;
    public final void rule__UnoConfig__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:734:1: ( ( 'visibilite' ) )
            // InternalUnoDsl.g:735:1: ( 'visibilite' )
            {
            // InternalUnoDsl.g:735:1: ( 'visibilite' )
            // InternalUnoDsl.g:736:2: 'visibilite'
            {
             before(grammarAccess.getUnoConfigAccess().getVisibiliteKeyword_3_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getVisibiliteKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__1__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__2"
    // InternalUnoDsl.g:745:1: rule__UnoConfig__Group_3__2 : rule__UnoConfig__Group_3__2__Impl rule__UnoConfig__Group_3__3 ;
    public final void rule__UnoConfig__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:749:1: ( rule__UnoConfig__Group_3__2__Impl rule__UnoConfig__Group_3__3 )
            // InternalUnoDsl.g:750:2: rule__UnoConfig__Group_3__2__Impl rule__UnoConfig__Group_3__3
            {
            pushFollow(FOLLOW_10);
            rule__UnoConfig__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__2"


    // $ANTLR start "rule__UnoConfig__Group_3__2__Impl"
    // InternalUnoDsl.g:757:1: rule__UnoConfig__Group_3__2__Impl : ( '=' ) ;
    public final void rule__UnoConfig__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:761:1: ( ( '=' ) )
            // InternalUnoDsl.g:762:1: ( '=' )
            {
            // InternalUnoDsl.g:762:1: ( '=' )
            // InternalUnoDsl.g:763:2: '='
            {
             before(grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_3_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__2__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__3"
    // InternalUnoDsl.g:772:1: rule__UnoConfig__Group_3__3 : rule__UnoConfig__Group_3__3__Impl rule__UnoConfig__Group_3__4 ;
    public final void rule__UnoConfig__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:776:1: ( rule__UnoConfig__Group_3__3__Impl rule__UnoConfig__Group_3__4 )
            // InternalUnoDsl.g:777:2: rule__UnoConfig__Group_3__3__Impl rule__UnoConfig__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__UnoConfig__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__3"


    // $ANTLR start "rule__UnoConfig__Group_3__3__Impl"
    // InternalUnoDsl.g:784:1: rule__UnoConfig__Group_3__3__Impl : ( ( rule__UnoConfig__VisibiliteAssignment_3_3 ) ) ;
    public final void rule__UnoConfig__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:788:1: ( ( ( rule__UnoConfig__VisibiliteAssignment_3_3 ) ) )
            // InternalUnoDsl.g:789:1: ( ( rule__UnoConfig__VisibiliteAssignment_3_3 ) )
            {
            // InternalUnoDsl.g:789:1: ( ( rule__UnoConfig__VisibiliteAssignment_3_3 ) )
            // InternalUnoDsl.g:790:2: ( rule__UnoConfig__VisibiliteAssignment_3_3 )
            {
             before(grammarAccess.getUnoConfigAccess().getVisibiliteAssignment_3_3()); 
            // InternalUnoDsl.g:791:2: ( rule__UnoConfig__VisibiliteAssignment_3_3 )
            // InternalUnoDsl.g:791:3: rule__UnoConfig__VisibiliteAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__VisibiliteAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getUnoConfigAccess().getVisibiliteAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__3__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__4"
    // InternalUnoDsl.g:799:1: rule__UnoConfig__Group_3__4 : rule__UnoConfig__Group_3__4__Impl rule__UnoConfig__Group_3__5 ;
    public final void rule__UnoConfig__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:803:1: ( rule__UnoConfig__Group_3__4__Impl rule__UnoConfig__Group_3__5 )
            // InternalUnoDsl.g:804:2: rule__UnoConfig__Group_3__4__Impl rule__UnoConfig__Group_3__5
            {
            pushFollow(FOLLOW_6);
            rule__UnoConfig__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__4"


    // $ANTLR start "rule__UnoConfig__Group_3__4__Impl"
    // InternalUnoDsl.g:811:1: rule__UnoConfig__Group_3__4__Impl : ( 'nombreDePiles' ) ;
    public final void rule__UnoConfig__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:815:1: ( ( 'nombreDePiles' ) )
            // InternalUnoDsl.g:816:1: ( 'nombreDePiles' )
            {
            // InternalUnoDsl.g:816:1: ( 'nombreDePiles' )
            // InternalUnoDsl.g:817:2: 'nombreDePiles'
            {
             before(grammarAccess.getUnoConfigAccess().getNombreDePilesKeyword_3_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getNombreDePilesKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__4__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__5"
    // InternalUnoDsl.g:826:1: rule__UnoConfig__Group_3__5 : rule__UnoConfig__Group_3__5__Impl rule__UnoConfig__Group_3__6 ;
    public final void rule__UnoConfig__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:830:1: ( rule__UnoConfig__Group_3__5__Impl rule__UnoConfig__Group_3__6 )
            // InternalUnoDsl.g:831:2: rule__UnoConfig__Group_3__5__Impl rule__UnoConfig__Group_3__6
            {
            pushFollow(FOLLOW_12);
            rule__UnoConfig__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__5"


    // $ANTLR start "rule__UnoConfig__Group_3__5__Impl"
    // InternalUnoDsl.g:838:1: rule__UnoConfig__Group_3__5__Impl : ( '=' ) ;
    public final void rule__UnoConfig__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:842:1: ( ( '=' ) )
            // InternalUnoDsl.g:843:1: ( '=' )
            {
            // InternalUnoDsl.g:843:1: ( '=' )
            // InternalUnoDsl.g:844:2: '='
            {
             before(grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_3_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getEqualsSignKeyword_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__5__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__6"
    // InternalUnoDsl.g:853:1: rule__UnoConfig__Group_3__6 : rule__UnoConfig__Group_3__6__Impl rule__UnoConfig__Group_3__7 ;
    public final void rule__UnoConfig__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:857:1: ( rule__UnoConfig__Group_3__6__Impl rule__UnoConfig__Group_3__7 )
            // InternalUnoDsl.g:858:2: rule__UnoConfig__Group_3__6__Impl rule__UnoConfig__Group_3__7
            {
            pushFollow(FOLLOW_8);
            rule__UnoConfig__Group_3__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__6"


    // $ANTLR start "rule__UnoConfig__Group_3__6__Impl"
    // InternalUnoDsl.g:865:1: rule__UnoConfig__Group_3__6__Impl : ( ( rule__UnoConfig__NombreDePilesAssignment_3_6 ) ) ;
    public final void rule__UnoConfig__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:869:1: ( ( ( rule__UnoConfig__NombreDePilesAssignment_3_6 ) ) )
            // InternalUnoDsl.g:870:1: ( ( rule__UnoConfig__NombreDePilesAssignment_3_6 ) )
            {
            // InternalUnoDsl.g:870:1: ( ( rule__UnoConfig__NombreDePilesAssignment_3_6 ) )
            // InternalUnoDsl.g:871:2: ( rule__UnoConfig__NombreDePilesAssignment_3_6 )
            {
             before(grammarAccess.getUnoConfigAccess().getNombreDePilesAssignment_3_6()); 
            // InternalUnoDsl.g:872:2: ( rule__UnoConfig__NombreDePilesAssignment_3_6 )
            // InternalUnoDsl.g:872:3: rule__UnoConfig__NombreDePilesAssignment_3_6
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__NombreDePilesAssignment_3_6();

            state._fsp--;


            }

             after(grammarAccess.getUnoConfigAccess().getNombreDePilesAssignment_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__6__Impl"


    // $ANTLR start "rule__UnoConfig__Group_3__7"
    // InternalUnoDsl.g:880:1: rule__UnoConfig__Group_3__7 : rule__UnoConfig__Group_3__7__Impl ;
    public final void rule__UnoConfig__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:884:1: ( rule__UnoConfig__Group_3__7__Impl )
            // InternalUnoDsl.g:885:2: rule__UnoConfig__Group_3__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_3__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__7"


    // $ANTLR start "rule__UnoConfig__Group_3__7__Impl"
    // InternalUnoDsl.g:891:1: rule__UnoConfig__Group_3__7__Impl : ( '/>' ) ;
    public final void rule__UnoConfig__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:895:1: ( ( '/>' ) )
            // InternalUnoDsl.g:896:1: ( '/>' )
            {
            // InternalUnoDsl.g:896:1: ( '/>' )
            // InternalUnoDsl.g:897:2: '/>'
            {
             before(grammarAccess.getUnoConfigAccess().getSolidusGreaterThanSignKeyword_3_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getSolidusGreaterThanSignKeyword_3_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_3__7__Impl"


    // $ANTLR start "rule__UnoConfig__Group_5__0"
    // InternalUnoDsl.g:907:1: rule__UnoConfig__Group_5__0 : rule__UnoConfig__Group_5__0__Impl rule__UnoConfig__Group_5__1 ;
    public final void rule__UnoConfig__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:911:1: ( rule__UnoConfig__Group_5__0__Impl rule__UnoConfig__Group_5__1 )
            // InternalUnoDsl.g:912:2: rule__UnoConfig__Group_5__0__Impl rule__UnoConfig__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__UnoConfig__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_5__0"


    // $ANTLR start "rule__UnoConfig__Group_5__0__Impl"
    // InternalUnoDsl.g:919:1: rule__UnoConfig__Group_5__0__Impl : ( '<Pioche>' ) ;
    public final void rule__UnoConfig__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:923:1: ( ( '<Pioche>' ) )
            // InternalUnoDsl.g:924:1: ( '<Pioche>' )
            {
            // InternalUnoDsl.g:924:1: ( '<Pioche>' )
            // InternalUnoDsl.g:925:2: '<Pioche>'
            {
             before(grammarAccess.getUnoConfigAccess().getPiocheKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getPiocheKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_5__0__Impl"


    // $ANTLR start "rule__UnoConfig__Group_5__1"
    // InternalUnoDsl.g:934:1: rule__UnoConfig__Group_5__1 : rule__UnoConfig__Group_5__1__Impl rule__UnoConfig__Group_5__2 ;
    public final void rule__UnoConfig__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:938:1: ( rule__UnoConfig__Group_5__1__Impl rule__UnoConfig__Group_5__2 )
            // InternalUnoDsl.g:939:2: rule__UnoConfig__Group_5__1__Impl rule__UnoConfig__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__UnoConfig__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_5__1"


    // $ANTLR start "rule__UnoConfig__Group_5__1__Impl"
    // InternalUnoDsl.g:946:1: rule__UnoConfig__Group_5__1__Impl : ( ( rule__UnoConfig__NombreDePiochesAssignment_5_1 ) ) ;
    public final void rule__UnoConfig__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:950:1: ( ( ( rule__UnoConfig__NombreDePiochesAssignment_5_1 ) ) )
            // InternalUnoDsl.g:951:1: ( ( rule__UnoConfig__NombreDePiochesAssignment_5_1 ) )
            {
            // InternalUnoDsl.g:951:1: ( ( rule__UnoConfig__NombreDePiochesAssignment_5_1 ) )
            // InternalUnoDsl.g:952:2: ( rule__UnoConfig__NombreDePiochesAssignment_5_1 )
            {
             before(grammarAccess.getUnoConfigAccess().getNombreDePiochesAssignment_5_1()); 
            // InternalUnoDsl.g:953:2: ( rule__UnoConfig__NombreDePiochesAssignment_5_1 )
            // InternalUnoDsl.g:953:3: rule__UnoConfig__NombreDePiochesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__NombreDePiochesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUnoConfigAccess().getNombreDePiochesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_5__1__Impl"


    // $ANTLR start "rule__UnoConfig__Group_5__2"
    // InternalUnoDsl.g:961:1: rule__UnoConfig__Group_5__2 : rule__UnoConfig__Group_5__2__Impl ;
    public final void rule__UnoConfig__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:965:1: ( rule__UnoConfig__Group_5__2__Impl )
            // InternalUnoDsl.g:966:2: rule__UnoConfig__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_5__2"


    // $ANTLR start "rule__UnoConfig__Group_5__2__Impl"
    // InternalUnoDsl.g:972:1: rule__UnoConfig__Group_5__2__Impl : ( '</Pioche>' ) ;
    public final void rule__UnoConfig__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:976:1: ( ( '</Pioche>' ) )
            // InternalUnoDsl.g:977:1: ( '</Pioche>' )
            {
            // InternalUnoDsl.g:977:1: ( '</Pioche>' )
            // InternalUnoDsl.g:978:2: '</Pioche>'
            {
             before(grammarAccess.getUnoConfigAccess().getPiocheKeyword_5_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUnoConfigAccess().getPiocheKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__Group_5__2__Impl"


    // $ANTLR start "rule__TempsLimite__Group__0"
    // InternalUnoDsl.g:988:1: rule__TempsLimite__Group__0 : rule__TempsLimite__Group__0__Impl rule__TempsLimite__Group__1 ;
    public final void rule__TempsLimite__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:992:1: ( rule__TempsLimite__Group__0__Impl rule__TempsLimite__Group__1 )
            // InternalUnoDsl.g:993:2: rule__TempsLimite__Group__0__Impl rule__TempsLimite__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TempsLimite__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempsLimite__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__0"


    // $ANTLR start "rule__TempsLimite__Group__0__Impl"
    // InternalUnoDsl.g:1000:1: rule__TempsLimite__Group__0__Impl : ( '<DureeTour' ) ;
    public final void rule__TempsLimite__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1004:1: ( ( '<DureeTour' ) )
            // InternalUnoDsl.g:1005:1: ( '<DureeTour' )
            {
            // InternalUnoDsl.g:1005:1: ( '<DureeTour' )
            // InternalUnoDsl.g:1006:2: '<DureeTour'
            {
             before(grammarAccess.getTempsLimiteAccess().getDureeTourKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTempsLimiteAccess().getDureeTourKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__0__Impl"


    // $ANTLR start "rule__TempsLimite__Group__1"
    // InternalUnoDsl.g:1015:1: rule__TempsLimite__Group__1 : rule__TempsLimite__Group__1__Impl rule__TempsLimite__Group__2 ;
    public final void rule__TempsLimite__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1019:1: ( rule__TempsLimite__Group__1__Impl rule__TempsLimite__Group__2 )
            // InternalUnoDsl.g:1020:2: rule__TempsLimite__Group__1__Impl rule__TempsLimite__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TempsLimite__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempsLimite__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__1"


    // $ANTLR start "rule__TempsLimite__Group__1__Impl"
    // InternalUnoDsl.g:1027:1: rule__TempsLimite__Group__1__Impl : ( 'duree' ) ;
    public final void rule__TempsLimite__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1031:1: ( ( 'duree' ) )
            // InternalUnoDsl.g:1032:1: ( 'duree' )
            {
            // InternalUnoDsl.g:1032:1: ( 'duree' )
            // InternalUnoDsl.g:1033:2: 'duree'
            {
             before(grammarAccess.getTempsLimiteAccess().getDureeKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTempsLimiteAccess().getDureeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__1__Impl"


    // $ANTLR start "rule__TempsLimite__Group__2"
    // InternalUnoDsl.g:1042:1: rule__TempsLimite__Group__2 : rule__TempsLimite__Group__2__Impl rule__TempsLimite__Group__3 ;
    public final void rule__TempsLimite__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1046:1: ( rule__TempsLimite__Group__2__Impl rule__TempsLimite__Group__3 )
            // InternalUnoDsl.g:1047:2: rule__TempsLimite__Group__2__Impl rule__TempsLimite__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TempsLimite__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempsLimite__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__2"


    // $ANTLR start "rule__TempsLimite__Group__2__Impl"
    // InternalUnoDsl.g:1054:1: rule__TempsLimite__Group__2__Impl : ( '=' ) ;
    public final void rule__TempsLimite__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1058:1: ( ( '=' ) )
            // InternalUnoDsl.g:1059:1: ( '=' )
            {
            // InternalUnoDsl.g:1059:1: ( '=' )
            // InternalUnoDsl.g:1060:2: '='
            {
             before(grammarAccess.getTempsLimiteAccess().getEqualsSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTempsLimiteAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__2__Impl"


    // $ANTLR start "rule__TempsLimite__Group__3"
    // InternalUnoDsl.g:1069:1: rule__TempsLimite__Group__3 : rule__TempsLimite__Group__3__Impl rule__TempsLimite__Group__4 ;
    public final void rule__TempsLimite__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1073:1: ( rule__TempsLimite__Group__3__Impl rule__TempsLimite__Group__4 )
            // InternalUnoDsl.g:1074:2: rule__TempsLimite__Group__3__Impl rule__TempsLimite__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__TempsLimite__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TempsLimite__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__3"


    // $ANTLR start "rule__TempsLimite__Group__3__Impl"
    // InternalUnoDsl.g:1081:1: rule__TempsLimite__Group__3__Impl : ( ( rule__TempsLimite__Alternatives_3 ) ) ;
    public final void rule__TempsLimite__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1085:1: ( ( ( rule__TempsLimite__Alternatives_3 ) ) )
            // InternalUnoDsl.g:1086:1: ( ( rule__TempsLimite__Alternatives_3 ) )
            {
            // InternalUnoDsl.g:1086:1: ( ( rule__TempsLimite__Alternatives_3 ) )
            // InternalUnoDsl.g:1087:2: ( rule__TempsLimite__Alternatives_3 )
            {
             before(grammarAccess.getTempsLimiteAccess().getAlternatives_3()); 
            // InternalUnoDsl.g:1088:2: ( rule__TempsLimite__Alternatives_3 )
            // InternalUnoDsl.g:1088:3: rule__TempsLimite__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__TempsLimite__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getTempsLimiteAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__3__Impl"


    // $ANTLR start "rule__TempsLimite__Group__4"
    // InternalUnoDsl.g:1096:1: rule__TempsLimite__Group__4 : rule__TempsLimite__Group__4__Impl ;
    public final void rule__TempsLimite__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1100:1: ( rule__TempsLimite__Group__4__Impl )
            // InternalUnoDsl.g:1101:2: rule__TempsLimite__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TempsLimite__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__4"


    // $ANTLR start "rule__TempsLimite__Group__4__Impl"
    // InternalUnoDsl.g:1107:1: rule__TempsLimite__Group__4__Impl : ( '/>' ) ;
    public final void rule__TempsLimite__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1111:1: ( ( '/>' ) )
            // InternalUnoDsl.g:1112:1: ( '/>' )
            {
            // InternalUnoDsl.g:1112:1: ( '/>' )
            // InternalUnoDsl.g:1113:2: '/>'
            {
             before(grammarAccess.getTempsLimiteAccess().getSolidusGreaterThanSignKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTempsLimiteAccess().getSolidusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TempsLimite__Group__4__Impl"


    // $ANTLR start "rule__DeposeCartes__Group__0"
    // InternalUnoDsl.g:1123:1: rule__DeposeCartes__Group__0 : rule__DeposeCartes__Group__0__Impl rule__DeposeCartes__Group__1 ;
    public final void rule__DeposeCartes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1127:1: ( rule__DeposeCartes__Group__0__Impl rule__DeposeCartes__Group__1 )
            // InternalUnoDsl.g:1128:2: rule__DeposeCartes__Group__0__Impl rule__DeposeCartes__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DeposeCartes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeposeCartes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__Group__0"


    // $ANTLR start "rule__DeposeCartes__Group__0__Impl"
    // InternalUnoDsl.g:1135:1: rule__DeposeCartes__Group__0__Impl : ( '<ReglesSpeciales>' ) ;
    public final void rule__DeposeCartes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1139:1: ( ( '<ReglesSpeciales>' ) )
            // InternalUnoDsl.g:1140:1: ( '<ReglesSpeciales>' )
            {
            // InternalUnoDsl.g:1140:1: ( '<ReglesSpeciales>' )
            // InternalUnoDsl.g:1141:2: '<ReglesSpeciales>'
            {
             before(grammarAccess.getDeposeCartesAccess().getReglesSpecialesKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDeposeCartesAccess().getReglesSpecialesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__Group__0__Impl"


    // $ANTLR start "rule__DeposeCartes__Group__1"
    // InternalUnoDsl.g:1150:1: rule__DeposeCartes__Group__1 : rule__DeposeCartes__Group__1__Impl rule__DeposeCartes__Group__2 ;
    public final void rule__DeposeCartes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1154:1: ( rule__DeposeCartes__Group__1__Impl rule__DeposeCartes__Group__2 )
            // InternalUnoDsl.g:1155:2: rule__DeposeCartes__Group__1__Impl rule__DeposeCartes__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__DeposeCartes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeposeCartes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__Group__1"


    // $ANTLR start "rule__DeposeCartes__Group__1__Impl"
    // InternalUnoDsl.g:1162:1: rule__DeposeCartes__Group__1__Impl : ( ( rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 ) ) ;
    public final void rule__DeposeCartes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1166:1: ( ( ( rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 ) ) )
            // InternalUnoDsl.g:1167:1: ( ( rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 ) )
            {
            // InternalUnoDsl.g:1167:1: ( ( rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 ) )
            // InternalUnoDsl.g:1168:2: ( rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 )
            {
             before(grammarAccess.getDeposeCartesAccess().getEnumReglesDeposeCartesAssignment_1()); 
            // InternalUnoDsl.g:1169:2: ( rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 )
            // InternalUnoDsl.g:1169:3: rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeposeCartesAccess().getEnumReglesDeposeCartesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__Group__1__Impl"


    // $ANTLR start "rule__DeposeCartes__Group__2"
    // InternalUnoDsl.g:1177:1: rule__DeposeCartes__Group__2 : rule__DeposeCartes__Group__2__Impl ;
    public final void rule__DeposeCartes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1181:1: ( rule__DeposeCartes__Group__2__Impl )
            // InternalUnoDsl.g:1182:2: rule__DeposeCartes__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeposeCartes__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__Group__2"


    // $ANTLR start "rule__DeposeCartes__Group__2__Impl"
    // InternalUnoDsl.g:1188:1: rule__DeposeCartes__Group__2__Impl : ( '</ReglesSpeciales>' ) ;
    public final void rule__DeposeCartes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1192:1: ( ( '</ReglesSpeciales>' ) )
            // InternalUnoDsl.g:1193:1: ( '</ReglesSpeciales>' )
            {
            // InternalUnoDsl.g:1193:1: ( '</ReglesSpeciales>' )
            // InternalUnoDsl.g:1194:2: '</ReglesSpeciales>'
            {
             before(grammarAccess.getDeposeCartesAccess().getReglesSpecialesKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDeposeCartesAccess().getReglesSpecialesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__Group__2__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_0__0"
    // InternalUnoDsl.g:1204:1: rule__EnumReglesDeposeCartes__Group_0__0 : rule__EnumReglesDeposeCartes__Group_0__0__Impl rule__EnumReglesDeposeCartes__Group_0__1 ;
    public final void rule__EnumReglesDeposeCartes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1208:1: ( rule__EnumReglesDeposeCartes__Group_0__0__Impl rule__EnumReglesDeposeCartes__Group_0__1 )
            // InternalUnoDsl.g:1209:2: rule__EnumReglesDeposeCartes__Group_0__0__Impl rule__EnumReglesDeposeCartes__Group_0__1
            {
            pushFollow(FOLLOW_18);
            rule__EnumReglesDeposeCartes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_0__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_0__0__Impl"
    // InternalUnoDsl.g:1216:1: rule__EnumReglesDeposeCartes__Group_0__0__Impl : ( '<Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1220:1: ( ( '<Regle>' ) )
            // InternalUnoDsl.g:1221:1: ( '<Regle>' )
            {
            // InternalUnoDsl.g:1221:1: ( '<Regle>' )
            // InternalUnoDsl.g:1222:2: '<Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_0__0__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_0__1"
    // InternalUnoDsl.g:1231:1: rule__EnumReglesDeposeCartes__Group_0__1 : rule__EnumReglesDeposeCartes__Group_0__1__Impl rule__EnumReglesDeposeCartes__Group_0__2 ;
    public final void rule__EnumReglesDeposeCartes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1235:1: ( rule__EnumReglesDeposeCartes__Group_0__1__Impl rule__EnumReglesDeposeCartes__Group_0__2 )
            // InternalUnoDsl.g:1236:2: rule__EnumReglesDeposeCartes__Group_0__1__Impl rule__EnumReglesDeposeCartes__Group_0__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumReglesDeposeCartes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_0__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_0__1__Impl"
    // InternalUnoDsl.g:1243:1: rule__EnumReglesDeposeCartes__Group_0__1__Impl : ( ( rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 ) ) ;
    public final void rule__EnumReglesDeposeCartes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1247:1: ( ( ( rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 ) ) )
            // InternalUnoDsl.g:1248:1: ( ( rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 ) )
            {
            // InternalUnoDsl.g:1248:1: ( ( rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 ) )
            // InternalUnoDsl.g:1249:2: ( rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxAssignment_0_1()); 
            // InternalUnoDsl.g:1250:2: ( rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 )
            // InternalUnoDsl.g:1250:3: rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_0__1__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_0__2"
    // InternalUnoDsl.g:1258:1: rule__EnumReglesDeposeCartes__Group_0__2 : rule__EnumReglesDeposeCartes__Group_0__2__Impl ;
    public final void rule__EnumReglesDeposeCartes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1262:1: ( rule__EnumReglesDeposeCartes__Group_0__2__Impl )
            // InternalUnoDsl.g:1263:2: rule__EnumReglesDeposeCartes__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_0__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_0__2__Impl"
    // InternalUnoDsl.g:1269:1: rule__EnumReglesDeposeCartes__Group_0__2__Impl : ( '</Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1273:1: ( ( '</Regle>' ) )
            // InternalUnoDsl.g:1274:1: ( '</Regle>' )
            {
            // InternalUnoDsl.g:1274:1: ( '</Regle>' )
            // InternalUnoDsl.g:1275:2: '</Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_0_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_0__2__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_1__0"
    // InternalUnoDsl.g:1285:1: rule__EnumReglesDeposeCartes__Group_1__0 : rule__EnumReglesDeposeCartes__Group_1__0__Impl rule__EnumReglesDeposeCartes__Group_1__1 ;
    public final void rule__EnumReglesDeposeCartes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1289:1: ( rule__EnumReglesDeposeCartes__Group_1__0__Impl rule__EnumReglesDeposeCartes__Group_1__1 )
            // InternalUnoDsl.g:1290:2: rule__EnumReglesDeposeCartes__Group_1__0__Impl rule__EnumReglesDeposeCartes__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__EnumReglesDeposeCartes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_1__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_1__0__Impl"
    // InternalUnoDsl.g:1297:1: rule__EnumReglesDeposeCartes__Group_1__0__Impl : ( '<Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1301:1: ( ( '<Regle>' ) )
            // InternalUnoDsl.g:1302:1: ( '<Regle>' )
            {
            // InternalUnoDsl.g:1302:1: ( '<Regle>' )
            // InternalUnoDsl.g:1303:2: '<Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_1__0__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_1__1"
    // InternalUnoDsl.g:1312:1: rule__EnumReglesDeposeCartes__Group_1__1 : rule__EnumReglesDeposeCartes__Group_1__1__Impl rule__EnumReglesDeposeCartes__Group_1__2 ;
    public final void rule__EnumReglesDeposeCartes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1316:1: ( rule__EnumReglesDeposeCartes__Group_1__1__Impl rule__EnumReglesDeposeCartes__Group_1__2 )
            // InternalUnoDsl.g:1317:2: rule__EnumReglesDeposeCartes__Group_1__1__Impl rule__EnumReglesDeposeCartes__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumReglesDeposeCartes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_1__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_1__1__Impl"
    // InternalUnoDsl.g:1324:1: rule__EnumReglesDeposeCartes__Group_1__1__Impl : ( ( rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 ) ) ;
    public final void rule__EnumReglesDeposeCartes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1328:1: ( ( ( rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 ) ) )
            // InternalUnoDsl.g:1329:1: ( ( rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 ) )
            {
            // InternalUnoDsl.g:1329:1: ( ( rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 ) )
            // InternalUnoDsl.g:1330:2: ( rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreAssignment_1_1()); 
            // InternalUnoDsl.g:1331:2: ( rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 )
            // InternalUnoDsl.g:1331:3: rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_1__1__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_1__2"
    // InternalUnoDsl.g:1339:1: rule__EnumReglesDeposeCartes__Group_1__2 : rule__EnumReglesDeposeCartes__Group_1__2__Impl ;
    public final void rule__EnumReglesDeposeCartes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1343:1: ( rule__EnumReglesDeposeCartes__Group_1__2__Impl )
            // InternalUnoDsl.g:1344:2: rule__EnumReglesDeposeCartes__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_1__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_1__2__Impl"
    // InternalUnoDsl.g:1350:1: rule__EnumReglesDeposeCartes__Group_1__2__Impl : ( '</Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1354:1: ( ( '</Regle>' ) )
            // InternalUnoDsl.g:1355:1: ( '</Regle>' )
            {
            // InternalUnoDsl.g:1355:1: ( '</Regle>' )
            // InternalUnoDsl.g:1356:2: '</Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_1_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_1__2__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_2__0"
    // InternalUnoDsl.g:1366:1: rule__EnumReglesDeposeCartes__Group_2__0 : rule__EnumReglesDeposeCartes__Group_2__0__Impl rule__EnumReglesDeposeCartes__Group_2__1 ;
    public final void rule__EnumReglesDeposeCartes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1370:1: ( rule__EnumReglesDeposeCartes__Group_2__0__Impl rule__EnumReglesDeposeCartes__Group_2__1 )
            // InternalUnoDsl.g:1371:2: rule__EnumReglesDeposeCartes__Group_2__0__Impl rule__EnumReglesDeposeCartes__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__EnumReglesDeposeCartes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_2__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_2__0__Impl"
    // InternalUnoDsl.g:1378:1: rule__EnumReglesDeposeCartes__Group_2__0__Impl : ( '<Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1382:1: ( ( '<Regle>' ) )
            // InternalUnoDsl.g:1383:1: ( '<Regle>' )
            {
            // InternalUnoDsl.g:1383:1: ( '<Regle>' )
            // InternalUnoDsl.g:1384:2: '<Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_2__0__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_2__1"
    // InternalUnoDsl.g:1393:1: rule__EnumReglesDeposeCartes__Group_2__1 : rule__EnumReglesDeposeCartes__Group_2__1__Impl rule__EnumReglesDeposeCartes__Group_2__2 ;
    public final void rule__EnumReglesDeposeCartes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1397:1: ( rule__EnumReglesDeposeCartes__Group_2__1__Impl rule__EnumReglesDeposeCartes__Group_2__2 )
            // InternalUnoDsl.g:1398:2: rule__EnumReglesDeposeCartes__Group_2__1__Impl rule__EnumReglesDeposeCartes__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumReglesDeposeCartes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_2__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_2__1__Impl"
    // InternalUnoDsl.g:1405:1: rule__EnumReglesDeposeCartes__Group_2__1__Impl : ( ( rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 ) ) ;
    public final void rule__EnumReglesDeposeCartes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1409:1: ( ( ( rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 ) ) )
            // InternalUnoDsl.g:1410:1: ( ( rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 ) )
            {
            // InternalUnoDsl.g:1410:1: ( ( rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 ) )
            // InternalUnoDsl.g:1411:2: ( rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueAssignment_2_1()); 
            // InternalUnoDsl.g:1412:2: ( rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 )
            // InternalUnoDsl.g:1412:3: rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_2__1__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_2__2"
    // InternalUnoDsl.g:1420:1: rule__EnumReglesDeposeCartes__Group_2__2 : rule__EnumReglesDeposeCartes__Group_2__2__Impl ;
    public final void rule__EnumReglesDeposeCartes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1424:1: ( rule__EnumReglesDeposeCartes__Group_2__2__Impl )
            // InternalUnoDsl.g:1425:2: rule__EnumReglesDeposeCartes__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_2__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_2__2__Impl"
    // InternalUnoDsl.g:1431:1: rule__EnumReglesDeposeCartes__Group_2__2__Impl : ( '</Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1435:1: ( ( '</Regle>' ) )
            // InternalUnoDsl.g:1436:1: ( '</Regle>' )
            {
            // InternalUnoDsl.g:1436:1: ( '</Regle>' )
            // InternalUnoDsl.g:1437:2: '</Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_2__2__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_3__0"
    // InternalUnoDsl.g:1447:1: rule__EnumReglesDeposeCartes__Group_3__0 : rule__EnumReglesDeposeCartes__Group_3__0__Impl rule__EnumReglesDeposeCartes__Group_3__1 ;
    public final void rule__EnumReglesDeposeCartes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1451:1: ( rule__EnumReglesDeposeCartes__Group_3__0__Impl rule__EnumReglesDeposeCartes__Group_3__1 )
            // InternalUnoDsl.g:1452:2: rule__EnumReglesDeposeCartes__Group_3__0__Impl rule__EnumReglesDeposeCartes__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__EnumReglesDeposeCartes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_3__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_3__0__Impl"
    // InternalUnoDsl.g:1459:1: rule__EnumReglesDeposeCartes__Group_3__0__Impl : ( '<Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1463:1: ( ( '<Regle>' ) )
            // InternalUnoDsl.g:1464:1: ( '<Regle>' )
            {
            // InternalUnoDsl.g:1464:1: ( '<Regle>' )
            // InternalUnoDsl.g:1465:2: '<Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_3__0__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_3__1"
    // InternalUnoDsl.g:1474:1: rule__EnumReglesDeposeCartes__Group_3__1 : rule__EnumReglesDeposeCartes__Group_3__1__Impl rule__EnumReglesDeposeCartes__Group_3__2 ;
    public final void rule__EnumReglesDeposeCartes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1478:1: ( rule__EnumReglesDeposeCartes__Group_3__1__Impl rule__EnumReglesDeposeCartes__Group_3__2 )
            // InternalUnoDsl.g:1479:2: rule__EnumReglesDeposeCartes__Group_3__1__Impl rule__EnumReglesDeposeCartes__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumReglesDeposeCartes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_3__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_3__1__Impl"
    // InternalUnoDsl.g:1486:1: rule__EnumReglesDeposeCartes__Group_3__1__Impl : ( ( rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 ) ) ;
    public final void rule__EnumReglesDeposeCartes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1490:1: ( ( ( rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 ) ) )
            // InternalUnoDsl.g:1491:1: ( ( rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 ) )
            {
            // InternalUnoDsl.g:1491:1: ( ( rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 ) )
            // InternalUnoDsl.g:1492:2: ( rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleAssignment_3_1()); 
            // InternalUnoDsl.g:1493:2: ( rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 )
            // InternalUnoDsl.g:1493:3: rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_3__1__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_3__2"
    // InternalUnoDsl.g:1501:1: rule__EnumReglesDeposeCartes__Group_3__2 : rule__EnumReglesDeposeCartes__Group_3__2__Impl ;
    public final void rule__EnumReglesDeposeCartes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1505:1: ( rule__EnumReglesDeposeCartes__Group_3__2__Impl )
            // InternalUnoDsl.g:1506:2: rule__EnumReglesDeposeCartes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_3__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_3__2__Impl"
    // InternalUnoDsl.g:1512:1: rule__EnumReglesDeposeCartes__Group_3__2__Impl : ( '</Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1516:1: ( ( '</Regle>' ) )
            // InternalUnoDsl.g:1517:1: ( '</Regle>' )
            {
            // InternalUnoDsl.g:1517:1: ( '</Regle>' )
            // InternalUnoDsl.g:1518:2: '</Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_3_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_3__2__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_4__0"
    // InternalUnoDsl.g:1528:1: rule__EnumReglesDeposeCartes__Group_4__0 : rule__EnumReglesDeposeCartes__Group_4__0__Impl rule__EnumReglesDeposeCartes__Group_4__1 ;
    public final void rule__EnumReglesDeposeCartes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1532:1: ( rule__EnumReglesDeposeCartes__Group_4__0__Impl rule__EnumReglesDeposeCartes__Group_4__1 )
            // InternalUnoDsl.g:1533:2: rule__EnumReglesDeposeCartes__Group_4__0__Impl rule__EnumReglesDeposeCartes__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__EnumReglesDeposeCartes__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_4__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_4__0__Impl"
    // InternalUnoDsl.g:1540:1: rule__EnumReglesDeposeCartes__Group_4__0__Impl : ( '<Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1544:1: ( ( '<Regle>' ) )
            // InternalUnoDsl.g:1545:1: ( '<Regle>' )
            {
            // InternalUnoDsl.g:1545:1: ( '<Regle>' )
            // InternalUnoDsl.g:1546:2: '<Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_4__0__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_4__1"
    // InternalUnoDsl.g:1555:1: rule__EnumReglesDeposeCartes__Group_4__1 : rule__EnumReglesDeposeCartes__Group_4__1__Impl rule__EnumReglesDeposeCartes__Group_4__2 ;
    public final void rule__EnumReglesDeposeCartes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1559:1: ( rule__EnumReglesDeposeCartes__Group_4__1__Impl rule__EnumReglesDeposeCartes__Group_4__2 )
            // InternalUnoDsl.g:1560:2: rule__EnumReglesDeposeCartes__Group_4__1__Impl rule__EnumReglesDeposeCartes__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumReglesDeposeCartes__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_4__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_4__1__Impl"
    // InternalUnoDsl.g:1567:1: rule__EnumReglesDeposeCartes__Group_4__1__Impl : ( ( rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 ) ) ;
    public final void rule__EnumReglesDeposeCartes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1571:1: ( ( ( rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 ) ) )
            // InternalUnoDsl.g:1572:1: ( ( rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 ) )
            {
            // InternalUnoDsl.g:1572:1: ( ( rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 ) )
            // InternalUnoDsl.g:1573:2: ( rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionAssignment_4_1()); 
            // InternalUnoDsl.g:1574:2: ( rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 )
            // InternalUnoDsl.g:1574:3: rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_4__1__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_4__2"
    // InternalUnoDsl.g:1582:1: rule__EnumReglesDeposeCartes__Group_4__2 : rule__EnumReglesDeposeCartes__Group_4__2__Impl ;
    public final void rule__EnumReglesDeposeCartes__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1586:1: ( rule__EnumReglesDeposeCartes__Group_4__2__Impl )
            // InternalUnoDsl.g:1587:2: rule__EnumReglesDeposeCartes__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_4__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_4__2__Impl"
    // InternalUnoDsl.g:1593:1: rule__EnumReglesDeposeCartes__Group_4__2__Impl : ( '</Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1597:1: ( ( '</Regle>' ) )
            // InternalUnoDsl.g:1598:1: ( '</Regle>' )
            {
            // InternalUnoDsl.g:1598:1: ( '</Regle>' )
            // InternalUnoDsl.g:1599:2: '</Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_4_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_4__2__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_5__0"
    // InternalUnoDsl.g:1609:1: rule__EnumReglesDeposeCartes__Group_5__0 : rule__EnumReglesDeposeCartes__Group_5__0__Impl rule__EnumReglesDeposeCartes__Group_5__1 ;
    public final void rule__EnumReglesDeposeCartes__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1613:1: ( rule__EnumReglesDeposeCartes__Group_5__0__Impl rule__EnumReglesDeposeCartes__Group_5__1 )
            // InternalUnoDsl.g:1614:2: rule__EnumReglesDeposeCartes__Group_5__0__Impl rule__EnumReglesDeposeCartes__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__EnumReglesDeposeCartes__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_5__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_5__0__Impl"
    // InternalUnoDsl.g:1621:1: rule__EnumReglesDeposeCartes__Group_5__0__Impl : ( '<Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1625:1: ( ( '<Regle>' ) )
            // InternalUnoDsl.g:1626:1: ( '<Regle>' )
            {
            // InternalUnoDsl.g:1626:1: ( '<Regle>' )
            // InternalUnoDsl.g:1627:2: '<Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_5__0__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_5__1"
    // InternalUnoDsl.g:1636:1: rule__EnumReglesDeposeCartes__Group_5__1 : rule__EnumReglesDeposeCartes__Group_5__1__Impl rule__EnumReglesDeposeCartes__Group_5__2 ;
    public final void rule__EnumReglesDeposeCartes__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1640:1: ( rule__EnumReglesDeposeCartes__Group_5__1__Impl rule__EnumReglesDeposeCartes__Group_5__2 )
            // InternalUnoDsl.g:1641:2: rule__EnumReglesDeposeCartes__Group_5__1__Impl rule__EnumReglesDeposeCartes__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__EnumReglesDeposeCartes__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_5__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_5__1__Impl"
    // InternalUnoDsl.g:1648:1: rule__EnumReglesDeposeCartes__Group_5__1__Impl : ( ( rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 ) ) ;
    public final void rule__EnumReglesDeposeCartes__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1652:1: ( ( ( rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 ) ) )
            // InternalUnoDsl.g:1653:1: ( ( rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 ) )
            {
            // InternalUnoDsl.g:1653:1: ( ( rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 ) )
            // InternalUnoDsl.g:1654:2: ( rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRienAssignment_5_1()); 
            // InternalUnoDsl.g:1655:2: ( rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 )
            // InternalUnoDsl.g:1655:3: rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRienAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_5__1__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_5__2"
    // InternalUnoDsl.g:1663:1: rule__EnumReglesDeposeCartes__Group_5__2 : rule__EnumReglesDeposeCartes__Group_5__2__Impl ;
    public final void rule__EnumReglesDeposeCartes__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1667:1: ( rule__EnumReglesDeposeCartes__Group_5__2__Impl )
            // InternalUnoDsl.g:1668:2: rule__EnumReglesDeposeCartes__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_5__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Group_5__2__Impl"
    // InternalUnoDsl.g:1674:1: rule__EnumReglesDeposeCartes__Group_5__2__Impl : ( '</Regle>' ) ;
    public final void rule__EnumReglesDeposeCartes__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1678:1: ( ( '</Regle>' ) )
            // InternalUnoDsl.g:1679:1: ( '</Regle>' )
            {
            // InternalUnoDsl.g:1679:1: ( '</Regle>' )
            // InternalUnoDsl.g:1680:2: '</Regle>'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_5_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getRegleKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Group_5__2__Impl"


    // $ANTLR start "rule__CartesSpeciales__Group__0"
    // InternalUnoDsl.g:1690:1: rule__CartesSpeciales__Group__0 : rule__CartesSpeciales__Group__0__Impl rule__CartesSpeciales__Group__1 ;
    public final void rule__CartesSpeciales__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1694:1: ( rule__CartesSpeciales__Group__0__Impl rule__CartesSpeciales__Group__1 )
            // InternalUnoDsl.g:1695:2: rule__CartesSpeciales__Group__0__Impl rule__CartesSpeciales__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__CartesSpeciales__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CartesSpeciales__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__Group__0"


    // $ANTLR start "rule__CartesSpeciales__Group__0__Impl"
    // InternalUnoDsl.g:1702:1: rule__CartesSpeciales__Group__0__Impl : ( '<CartesSpeciales>' ) ;
    public final void rule__CartesSpeciales__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1706:1: ( ( '<CartesSpeciales>' ) )
            // InternalUnoDsl.g:1707:1: ( '<CartesSpeciales>' )
            {
            // InternalUnoDsl.g:1707:1: ( '<CartesSpeciales>' )
            // InternalUnoDsl.g:1708:2: '<CartesSpeciales>'
            {
             before(grammarAccess.getCartesSpecialesAccess().getCartesSpecialesKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCartesSpecialesAccess().getCartesSpecialesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__Group__0__Impl"


    // $ANTLR start "rule__CartesSpeciales__Group__1"
    // InternalUnoDsl.g:1717:1: rule__CartesSpeciales__Group__1 : rule__CartesSpeciales__Group__1__Impl rule__CartesSpeciales__Group__2 ;
    public final void rule__CartesSpeciales__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1721:1: ( rule__CartesSpeciales__Group__1__Impl rule__CartesSpeciales__Group__2 )
            // InternalUnoDsl.g:1722:2: rule__CartesSpeciales__Group__1__Impl rule__CartesSpeciales__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__CartesSpeciales__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CartesSpeciales__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__Group__1"


    // $ANTLR start "rule__CartesSpeciales__Group__1__Impl"
    // InternalUnoDsl.g:1729:1: rule__CartesSpeciales__Group__1__Impl : ( ( rule__CartesSpeciales__EnumCartesAssignment_1 ) ) ;
    public final void rule__CartesSpeciales__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1733:1: ( ( ( rule__CartesSpeciales__EnumCartesAssignment_1 ) ) )
            // InternalUnoDsl.g:1734:1: ( ( rule__CartesSpeciales__EnumCartesAssignment_1 ) )
            {
            // InternalUnoDsl.g:1734:1: ( ( rule__CartesSpeciales__EnumCartesAssignment_1 ) )
            // InternalUnoDsl.g:1735:2: ( rule__CartesSpeciales__EnumCartesAssignment_1 )
            {
             before(grammarAccess.getCartesSpecialesAccess().getEnumCartesAssignment_1()); 
            // InternalUnoDsl.g:1736:2: ( rule__CartesSpeciales__EnumCartesAssignment_1 )
            // InternalUnoDsl.g:1736:3: rule__CartesSpeciales__EnumCartesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CartesSpeciales__EnumCartesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCartesSpecialesAccess().getEnumCartesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__Group__1__Impl"


    // $ANTLR start "rule__CartesSpeciales__Group__2"
    // InternalUnoDsl.g:1744:1: rule__CartesSpeciales__Group__2 : rule__CartesSpeciales__Group__2__Impl ;
    public final void rule__CartesSpeciales__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1748:1: ( rule__CartesSpeciales__Group__2__Impl )
            // InternalUnoDsl.g:1749:2: rule__CartesSpeciales__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CartesSpeciales__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__Group__2"


    // $ANTLR start "rule__CartesSpeciales__Group__2__Impl"
    // InternalUnoDsl.g:1755:1: rule__CartesSpeciales__Group__2__Impl : ( '</CartesSpeciales>' ) ;
    public final void rule__CartesSpeciales__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1759:1: ( ( '</CartesSpeciales>' ) )
            // InternalUnoDsl.g:1760:1: ( '</CartesSpeciales>' )
            {
            // InternalUnoDsl.g:1760:1: ( '</CartesSpeciales>' )
            // InternalUnoDsl.g:1761:2: '</CartesSpeciales>'
            {
             before(grammarAccess.getCartesSpecialesAccess().getCartesSpecialesKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCartesSpecialesAccess().getCartesSpecialesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__Group__2__Impl"


    // $ANTLR start "rule__EnumCartes__Group_0__0"
    // InternalUnoDsl.g:1771:1: rule__EnumCartes__Group_0__0 : rule__EnumCartes__Group_0__0__Impl rule__EnumCartes__Group_0__1 ;
    public final void rule__EnumCartes__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1775:1: ( rule__EnumCartes__Group_0__0__Impl rule__EnumCartes__Group_0__1 )
            // InternalUnoDsl.g:1776:2: rule__EnumCartes__Group_0__0__Impl rule__EnumCartes__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__EnumCartes__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_0__0"


    // $ANTLR start "rule__EnumCartes__Group_0__0__Impl"
    // InternalUnoDsl.g:1783:1: rule__EnumCartes__Group_0__0__Impl : ( '<Carte>' ) ;
    public final void rule__EnumCartes__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1787:1: ( ( '<Carte>' ) )
            // InternalUnoDsl.g:1788:1: ( '<Carte>' )
            {
            // InternalUnoDsl.g:1788:1: ( '<Carte>' )
            // InternalUnoDsl.g:1789:2: '<Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_0__0__Impl"


    // $ANTLR start "rule__EnumCartes__Group_0__1"
    // InternalUnoDsl.g:1798:1: rule__EnumCartes__Group_0__1 : rule__EnumCartes__Group_0__1__Impl rule__EnumCartes__Group_0__2 ;
    public final void rule__EnumCartes__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1802:1: ( rule__EnumCartes__Group_0__1__Impl rule__EnumCartes__Group_0__2 )
            // InternalUnoDsl.g:1803:2: rule__EnumCartes__Group_0__1__Impl rule__EnumCartes__Group_0__2
            {
            pushFollow(FOLLOW_28);
            rule__EnumCartes__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_0__1"


    // $ANTLR start "rule__EnumCartes__Group_0__1__Impl"
    // InternalUnoDsl.g:1810:1: rule__EnumCartes__Group_0__1__Impl : ( ( rule__EnumCartes__CarteUnoAssignment_0_1 ) ) ;
    public final void rule__EnumCartes__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1814:1: ( ( ( rule__EnumCartes__CarteUnoAssignment_0_1 ) ) )
            // InternalUnoDsl.g:1815:1: ( ( rule__EnumCartes__CarteUnoAssignment_0_1 ) )
            {
            // InternalUnoDsl.g:1815:1: ( ( rule__EnumCartes__CarteUnoAssignment_0_1 ) )
            // InternalUnoDsl.g:1816:2: ( rule__EnumCartes__CarteUnoAssignment_0_1 )
            {
             before(grammarAccess.getEnumCartesAccess().getCarteUnoAssignment_0_1()); 
            // InternalUnoDsl.g:1817:2: ( rule__EnumCartes__CarteUnoAssignment_0_1 )
            // InternalUnoDsl.g:1817:3: rule__EnumCartes__CarteUnoAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__CarteUnoAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumCartesAccess().getCarteUnoAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_0__1__Impl"


    // $ANTLR start "rule__EnumCartes__Group_0__2"
    // InternalUnoDsl.g:1825:1: rule__EnumCartes__Group_0__2 : rule__EnumCartes__Group_0__2__Impl ;
    public final void rule__EnumCartes__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1829:1: ( rule__EnumCartes__Group_0__2__Impl )
            // InternalUnoDsl.g:1830:2: rule__EnumCartes__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_0__2"


    // $ANTLR start "rule__EnumCartes__Group_0__2__Impl"
    // InternalUnoDsl.g:1836:1: rule__EnumCartes__Group_0__2__Impl : ( '</Carte>' ) ;
    public final void rule__EnumCartes__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1840:1: ( ( '</Carte>' ) )
            // InternalUnoDsl.g:1841:1: ( '</Carte>' )
            {
            // InternalUnoDsl.g:1841:1: ( '</Carte>' )
            // InternalUnoDsl.g:1842:2: '</Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_0_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_0__2__Impl"


    // $ANTLR start "rule__EnumCartes__Group_1__0"
    // InternalUnoDsl.g:1852:1: rule__EnumCartes__Group_1__0 : rule__EnumCartes__Group_1__0__Impl rule__EnumCartes__Group_1__1 ;
    public final void rule__EnumCartes__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1856:1: ( rule__EnumCartes__Group_1__0__Impl rule__EnumCartes__Group_1__1 )
            // InternalUnoDsl.g:1857:2: rule__EnumCartes__Group_1__0__Impl rule__EnumCartes__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__EnumCartes__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_1__0"


    // $ANTLR start "rule__EnumCartes__Group_1__0__Impl"
    // InternalUnoDsl.g:1864:1: rule__EnumCartes__Group_1__0__Impl : ( '<Carte>' ) ;
    public final void rule__EnumCartes__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1868:1: ( ( '<Carte>' ) )
            // InternalUnoDsl.g:1869:1: ( '<Carte>' )
            {
            // InternalUnoDsl.g:1869:1: ( '<Carte>' )
            // InternalUnoDsl.g:1870:2: '<Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_1__0__Impl"


    // $ANTLR start "rule__EnumCartes__Group_1__1"
    // InternalUnoDsl.g:1879:1: rule__EnumCartes__Group_1__1 : rule__EnumCartes__Group_1__1__Impl rule__EnumCartes__Group_1__2 ;
    public final void rule__EnumCartes__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1883:1: ( rule__EnumCartes__Group_1__1__Impl rule__EnumCartes__Group_1__2 )
            // InternalUnoDsl.g:1884:2: rule__EnumCartes__Group_1__1__Impl rule__EnumCartes__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__EnumCartes__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_1__1"


    // $ANTLR start "rule__EnumCartes__Group_1__1__Impl"
    // InternalUnoDsl.g:1891:1: rule__EnumCartes__Group_1__1__Impl : ( ( rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 ) ) ;
    public final void rule__EnumCartes__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1895:1: ( ( ( rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 ) ) )
            // InternalUnoDsl.g:1896:1: ( ( rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 ) )
            {
            // InternalUnoDsl.g:1896:1: ( ( rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 ) )
            // InternalUnoDsl.g:1897:2: ( rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 )
            {
             before(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestableAssignment_1_1()); 
            // InternalUnoDsl.g:1898:2: ( rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 )
            // InternalUnoDsl.g:1898:3: rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestableAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_1__1__Impl"


    // $ANTLR start "rule__EnumCartes__Group_1__2"
    // InternalUnoDsl.g:1906:1: rule__EnumCartes__Group_1__2 : rule__EnumCartes__Group_1__2__Impl ;
    public final void rule__EnumCartes__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1910:1: ( rule__EnumCartes__Group_1__2__Impl )
            // InternalUnoDsl.g:1911:2: rule__EnumCartes__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_1__2"


    // $ANTLR start "rule__EnumCartes__Group_1__2__Impl"
    // InternalUnoDsl.g:1917:1: rule__EnumCartes__Group_1__2__Impl : ( '</Carte>' ) ;
    public final void rule__EnumCartes__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1921:1: ( ( '</Carte>' ) )
            // InternalUnoDsl.g:1922:1: ( '</Carte>' )
            {
            // InternalUnoDsl.g:1922:1: ( '</Carte>' )
            // InternalUnoDsl.g:1923:2: '</Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_1__2__Impl"


    // $ANTLR start "rule__EnumCartes__Group_2__0"
    // InternalUnoDsl.g:1933:1: rule__EnumCartes__Group_2__0 : rule__EnumCartes__Group_2__0__Impl rule__EnumCartes__Group_2__1 ;
    public final void rule__EnumCartes__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1937:1: ( rule__EnumCartes__Group_2__0__Impl rule__EnumCartes__Group_2__1 )
            // InternalUnoDsl.g:1938:2: rule__EnumCartes__Group_2__0__Impl rule__EnumCartes__Group_2__1
            {
            pushFollow(FOLLOW_30);
            rule__EnumCartes__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_2__0"


    // $ANTLR start "rule__EnumCartes__Group_2__0__Impl"
    // InternalUnoDsl.g:1945:1: rule__EnumCartes__Group_2__0__Impl : ( '<Carte>' ) ;
    public final void rule__EnumCartes__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1949:1: ( ( '<Carte>' ) )
            // InternalUnoDsl.g:1950:1: ( '<Carte>' )
            {
            // InternalUnoDsl.g:1950:1: ( '<Carte>' )
            // InternalUnoDsl.g:1951:2: '<Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_2__0__Impl"


    // $ANTLR start "rule__EnumCartes__Group_2__1"
    // InternalUnoDsl.g:1960:1: rule__EnumCartes__Group_2__1 : rule__EnumCartes__Group_2__1__Impl rule__EnumCartes__Group_2__2 ;
    public final void rule__EnumCartes__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1964:1: ( rule__EnumCartes__Group_2__1__Impl rule__EnumCartes__Group_2__2 )
            // InternalUnoDsl.g:1965:2: rule__EnumCartes__Group_2__1__Impl rule__EnumCartes__Group_2__2
            {
            pushFollow(FOLLOW_28);
            rule__EnumCartes__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_2__1"


    // $ANTLR start "rule__EnumCartes__Group_2__1__Impl"
    // InternalUnoDsl.g:1972:1: rule__EnumCartes__Group_2__1__Impl : ( ( rule__EnumCartes__CarteZeroAssignment_2_1 ) ) ;
    public final void rule__EnumCartes__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1976:1: ( ( ( rule__EnumCartes__CarteZeroAssignment_2_1 ) ) )
            // InternalUnoDsl.g:1977:1: ( ( rule__EnumCartes__CarteZeroAssignment_2_1 ) )
            {
            // InternalUnoDsl.g:1977:1: ( ( rule__EnumCartes__CarteZeroAssignment_2_1 ) )
            // InternalUnoDsl.g:1978:2: ( rule__EnumCartes__CarteZeroAssignment_2_1 )
            {
             before(grammarAccess.getEnumCartesAccess().getCarteZeroAssignment_2_1()); 
            // InternalUnoDsl.g:1979:2: ( rule__EnumCartes__CarteZeroAssignment_2_1 )
            // InternalUnoDsl.g:1979:3: rule__EnumCartes__CarteZeroAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__CarteZeroAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumCartesAccess().getCarteZeroAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_2__1__Impl"


    // $ANTLR start "rule__EnumCartes__Group_2__2"
    // InternalUnoDsl.g:1987:1: rule__EnumCartes__Group_2__2 : rule__EnumCartes__Group_2__2__Impl ;
    public final void rule__EnumCartes__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:1991:1: ( rule__EnumCartes__Group_2__2__Impl )
            // InternalUnoDsl.g:1992:2: rule__EnumCartes__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_2__2"


    // $ANTLR start "rule__EnumCartes__Group_2__2__Impl"
    // InternalUnoDsl.g:1998:1: rule__EnumCartes__Group_2__2__Impl : ( '</Carte>' ) ;
    public final void rule__EnumCartes__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2002:1: ( ( '</Carte>' ) )
            // InternalUnoDsl.g:2003:1: ( '</Carte>' )
            {
            // InternalUnoDsl.g:2003:1: ( '</Carte>' )
            // InternalUnoDsl.g:2004:2: '</Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_2__2__Impl"


    // $ANTLR start "rule__EnumCartes__Group_3__0"
    // InternalUnoDsl.g:2014:1: rule__EnumCartes__Group_3__0 : rule__EnumCartes__Group_3__0__Impl rule__EnumCartes__Group_3__1 ;
    public final void rule__EnumCartes__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2018:1: ( rule__EnumCartes__Group_3__0__Impl rule__EnumCartes__Group_3__1 )
            // InternalUnoDsl.g:2019:2: rule__EnumCartes__Group_3__0__Impl rule__EnumCartes__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__EnumCartes__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_3__0"


    // $ANTLR start "rule__EnumCartes__Group_3__0__Impl"
    // InternalUnoDsl.g:2026:1: rule__EnumCartes__Group_3__0__Impl : ( '<Carte>' ) ;
    public final void rule__EnumCartes__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2030:1: ( ( '<Carte>' ) )
            // InternalUnoDsl.g:2031:1: ( '<Carte>' )
            {
            // InternalUnoDsl.g:2031:1: ( '<Carte>' )
            // InternalUnoDsl.g:2032:2: '<Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_3__0__Impl"


    // $ANTLR start "rule__EnumCartes__Group_3__1"
    // InternalUnoDsl.g:2041:1: rule__EnumCartes__Group_3__1 : rule__EnumCartes__Group_3__1__Impl rule__EnumCartes__Group_3__2 ;
    public final void rule__EnumCartes__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2045:1: ( rule__EnumCartes__Group_3__1__Impl rule__EnumCartes__Group_3__2 )
            // InternalUnoDsl.g:2046:2: rule__EnumCartes__Group_3__1__Impl rule__EnumCartes__Group_3__2
            {
            pushFollow(FOLLOW_28);
            rule__EnumCartes__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_3__1"


    // $ANTLR start "rule__EnumCartes__Group_3__1__Impl"
    // InternalUnoDsl.g:2053:1: rule__EnumCartes__Group_3__1__Impl : ( ( rule__EnumCartes__CarteSeptAssignment_3_1 ) ) ;
    public final void rule__EnumCartes__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2057:1: ( ( ( rule__EnumCartes__CarteSeptAssignment_3_1 ) ) )
            // InternalUnoDsl.g:2058:1: ( ( rule__EnumCartes__CarteSeptAssignment_3_1 ) )
            {
            // InternalUnoDsl.g:2058:1: ( ( rule__EnumCartes__CarteSeptAssignment_3_1 ) )
            // InternalUnoDsl.g:2059:2: ( rule__EnumCartes__CarteSeptAssignment_3_1 )
            {
             before(grammarAccess.getEnumCartesAccess().getCarteSeptAssignment_3_1()); 
            // InternalUnoDsl.g:2060:2: ( rule__EnumCartes__CarteSeptAssignment_3_1 )
            // InternalUnoDsl.g:2060:3: rule__EnumCartes__CarteSeptAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__CarteSeptAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumCartesAccess().getCarteSeptAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_3__1__Impl"


    // $ANTLR start "rule__EnumCartes__Group_3__2"
    // InternalUnoDsl.g:2068:1: rule__EnumCartes__Group_3__2 : rule__EnumCartes__Group_3__2__Impl ;
    public final void rule__EnumCartes__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2072:1: ( rule__EnumCartes__Group_3__2__Impl )
            // InternalUnoDsl.g:2073:2: rule__EnumCartes__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_3__2"


    // $ANTLR start "rule__EnumCartes__Group_3__2__Impl"
    // InternalUnoDsl.g:2079:1: rule__EnumCartes__Group_3__2__Impl : ( '</Carte>' ) ;
    public final void rule__EnumCartes__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2083:1: ( ( '</Carte>' ) )
            // InternalUnoDsl.g:2084:1: ( '</Carte>' )
            {
            // InternalUnoDsl.g:2084:1: ( '</Carte>' )
            // InternalUnoDsl.g:2085:2: '</Carte>'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteKeyword_3_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__Group_3__2__Impl"


    // $ANTLR start "rule__NombreDePioches__Group_0__0"
    // InternalUnoDsl.g:2095:1: rule__NombreDePioches__Group_0__0 : rule__NombreDePioches__Group_0__0__Impl rule__NombreDePioches__Group_0__1 ;
    public final void rule__NombreDePioches__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2099:1: ( rule__NombreDePioches__Group_0__0__Impl rule__NombreDePioches__Group_0__1 )
            // InternalUnoDsl.g:2100:2: rule__NombreDePioches__Group_0__0__Impl rule__NombreDePioches__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__NombreDePioches__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NombreDePioches__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__Group_0__0"


    // $ANTLR start "rule__NombreDePioches__Group_0__0__Impl"
    // InternalUnoDsl.g:2107:1: rule__NombreDePioches__Group_0__0__Impl : ( ( rule__NombreDePioches__UneFoisAssignment_0_0 ) ) ;
    public final void rule__NombreDePioches__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2111:1: ( ( ( rule__NombreDePioches__UneFoisAssignment_0_0 ) ) )
            // InternalUnoDsl.g:2112:1: ( ( rule__NombreDePioches__UneFoisAssignment_0_0 ) )
            {
            // InternalUnoDsl.g:2112:1: ( ( rule__NombreDePioches__UneFoisAssignment_0_0 ) )
            // InternalUnoDsl.g:2113:2: ( rule__NombreDePioches__UneFoisAssignment_0_0 )
            {
             before(grammarAccess.getNombreDePiochesAccess().getUneFoisAssignment_0_0()); 
            // InternalUnoDsl.g:2114:2: ( rule__NombreDePioches__UneFoisAssignment_0_0 )
            // InternalUnoDsl.g:2114:3: rule__NombreDePioches__UneFoisAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__NombreDePioches__UneFoisAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getNombreDePiochesAccess().getUneFoisAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__Group_0__0__Impl"


    // $ANTLR start "rule__NombreDePioches__Group_0__1"
    // InternalUnoDsl.g:2122:1: rule__NombreDePioches__Group_0__1 : rule__NombreDePioches__Group_0__1__Impl ;
    public final void rule__NombreDePioches__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2126:1: ( rule__NombreDePioches__Group_0__1__Impl )
            // InternalUnoDsl.g:2127:2: rule__NombreDePioches__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NombreDePioches__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__Group_0__1"


    // $ANTLR start "rule__NombreDePioches__Group_0__1__Impl"
    // InternalUnoDsl.g:2133:1: rule__NombreDePioches__Group_0__1__Impl : ( ( rule__NombreDePioches__PeutJouerAssignment_0_1 ) ) ;
    public final void rule__NombreDePioches__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2137:1: ( ( ( rule__NombreDePioches__PeutJouerAssignment_0_1 ) ) )
            // InternalUnoDsl.g:2138:1: ( ( rule__NombreDePioches__PeutJouerAssignment_0_1 ) )
            {
            // InternalUnoDsl.g:2138:1: ( ( rule__NombreDePioches__PeutJouerAssignment_0_1 ) )
            // InternalUnoDsl.g:2139:2: ( rule__NombreDePioches__PeutJouerAssignment_0_1 )
            {
             before(grammarAccess.getNombreDePiochesAccess().getPeutJouerAssignment_0_1()); 
            // InternalUnoDsl.g:2140:2: ( rule__NombreDePioches__PeutJouerAssignment_0_1 )
            // InternalUnoDsl.g:2140:3: rule__NombreDePioches__PeutJouerAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NombreDePioches__PeutJouerAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNombreDePiochesAccess().getPeutJouerAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__Group_0__1__Impl"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup"
    // InternalUnoDsl.g:2149:1: rule__UnoConfig__UnorderedGroup : rule__UnoConfig__UnorderedGroup__0 {...}?;
    public final void rule__UnoConfig__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
        	
        try {
            // InternalUnoDsl.g:2154:1: ( rule__UnoConfig__UnorderedGroup__0 {...}?)
            // InternalUnoDsl.g:2155:2: rule__UnoConfig__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getUnoConfigAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getUnoConfigAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__Impl"
    // InternalUnoDsl.g:2163:1: rule__UnoConfig__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) ) ) ) ;
    public final void rule__UnoConfig__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalUnoDsl.g:2168:1: ( ( ({...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) ) ) ) )
            // InternalUnoDsl.g:2169:3: ( ({...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) ) ) )
            {
            // InternalUnoDsl.g:2169:3: ( ({...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) ) ) | ({...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) ) ) )
            int alt7=6;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                alt7=2;
            }
            else if ( LA7_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                alt7=3;
            }
            else if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                alt7=4;
            }
            else if ( LA7_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                alt7=5;
            }
            else if ( LA7_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                alt7=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUnoDsl.g:2170:3: ({...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2170:3: ({...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) ) )
                    // InternalUnoDsl.g:2171:4: {...}? => ( ( ( rule__UnoConfig__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalUnoDsl.g:2171:103: ( ( ( rule__UnoConfig__Group_0__0 ) ) )
                    // InternalUnoDsl.g:2172:5: ( ( rule__UnoConfig__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2178:5: ( ( rule__UnoConfig__Group_0__0 ) )
                    // InternalUnoDsl.g:2179:6: ( rule__UnoConfig__Group_0__0 )
                    {
                     before(grammarAccess.getUnoConfigAccess().getGroup_0()); 
                    // InternalUnoDsl.g:2180:6: ( rule__UnoConfig__Group_0__0 )
                    // InternalUnoDsl.g:2180:7: rule__UnoConfig__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnoConfigAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:2185:3: ({...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) ) )
                    {
                    // InternalUnoDsl.g:2185:3: ({...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) ) )
                    // InternalUnoDsl.g:2186:4: {...}? => ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalUnoDsl.g:2186:103: ( ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) ) )
                    // InternalUnoDsl.g:2187:5: ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2193:5: ( ( rule__UnoConfig__TempsLimiteAssignment_1 ) )
                    // InternalUnoDsl.g:2194:6: ( rule__UnoConfig__TempsLimiteAssignment_1 )
                    {
                     before(grammarAccess.getUnoConfigAccess().getTempsLimiteAssignment_1()); 
                    // InternalUnoDsl.g:2195:6: ( rule__UnoConfig__TempsLimiteAssignment_1 )
                    // InternalUnoDsl.g:2195:7: rule__UnoConfig__TempsLimiteAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__TempsLimiteAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnoConfigAccess().getTempsLimiteAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:2200:3: ({...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) ) )
                    {
                    // InternalUnoDsl.g:2200:3: ({...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) ) )
                    // InternalUnoDsl.g:2201:4: {...}? => ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalUnoDsl.g:2201:103: ( ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) ) )
                    // InternalUnoDsl.g:2202:5: ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2208:5: ( ( rule__UnoConfig__DeposeCartesAssignment_2 ) )
                    // InternalUnoDsl.g:2209:6: ( rule__UnoConfig__DeposeCartesAssignment_2 )
                    {
                     before(grammarAccess.getUnoConfigAccess().getDeposeCartesAssignment_2()); 
                    // InternalUnoDsl.g:2210:6: ( rule__UnoConfig__DeposeCartesAssignment_2 )
                    // InternalUnoDsl.g:2210:7: rule__UnoConfig__DeposeCartesAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__DeposeCartesAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnoConfigAccess().getDeposeCartesAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:2215:3: ({...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2215:3: ({...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) ) )
                    // InternalUnoDsl.g:2216:4: {...}? => ( ( ( rule__UnoConfig__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalUnoDsl.g:2216:103: ( ( ( rule__UnoConfig__Group_3__0 ) ) )
                    // InternalUnoDsl.g:2217:5: ( ( rule__UnoConfig__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2223:5: ( ( rule__UnoConfig__Group_3__0 ) )
                    // InternalUnoDsl.g:2224:6: ( rule__UnoConfig__Group_3__0 )
                    {
                     before(grammarAccess.getUnoConfigAccess().getGroup_3()); 
                    // InternalUnoDsl.g:2225:6: ( rule__UnoConfig__Group_3__0 )
                    // InternalUnoDsl.g:2225:7: rule__UnoConfig__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnoConfigAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalUnoDsl.g:2230:3: ({...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) ) )
                    {
                    // InternalUnoDsl.g:2230:3: ({...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) ) )
                    // InternalUnoDsl.g:2231:4: {...}? => ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalUnoDsl.g:2231:103: ( ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) ) )
                    // InternalUnoDsl.g:2232:5: ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2238:5: ( ( rule__UnoConfig__CartesSpecialesAssignment_4 ) )
                    // InternalUnoDsl.g:2239:6: ( rule__UnoConfig__CartesSpecialesAssignment_4 )
                    {
                     before(grammarAccess.getUnoConfigAccess().getCartesSpecialesAssignment_4()); 
                    // InternalUnoDsl.g:2240:6: ( rule__UnoConfig__CartesSpecialesAssignment_4 )
                    // InternalUnoDsl.g:2240:7: rule__UnoConfig__CartesSpecialesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__CartesSpecialesAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnoConfigAccess().getCartesSpecialesAssignment_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalUnoDsl.g:2245:3: ({...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2245:3: ({...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) ) )
                    // InternalUnoDsl.g:2246:4: {...}? => ( ( ( rule__UnoConfig__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__UnoConfig__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalUnoDsl.g:2246:103: ( ( ( rule__UnoConfig__Group_5__0 ) ) )
                    // InternalUnoDsl.g:2247:5: ( ( rule__UnoConfig__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2253:5: ( ( rule__UnoConfig__Group_5__0 ) )
                    // InternalUnoDsl.g:2254:6: ( rule__UnoConfig__Group_5__0 )
                    {
                     before(grammarAccess.getUnoConfigAccess().getGroup_5()); 
                    // InternalUnoDsl.g:2255:6: ( rule__UnoConfig__Group_5__0 )
                    // InternalUnoDsl.g:2255:7: rule__UnoConfig__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnoConfigAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnoConfigAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__Impl"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__0"
    // InternalUnoDsl.g:2268:1: rule__UnoConfig__UnorderedGroup__0 : rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__1 )? ;
    public final void rule__UnoConfig__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2272:1: ( rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__1 )? )
            // InternalUnoDsl.g:2273:2: rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_33);
            rule__UnoConfig__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2274:2: ( rule__UnoConfig__UnorderedGroup__1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( LA8_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                alt8=1;
            }
            else if ( LA8_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                alt8=1;
            }
            else if ( LA8_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                alt8=1;
            }
            else if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                alt8=1;
            }
            else if ( LA8_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                alt8=1;
            }
            else if ( LA8_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUnoDsl.g:2274:2: rule__UnoConfig__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__0"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__1"
    // InternalUnoDsl.g:2280:1: rule__UnoConfig__UnorderedGroup__1 : rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__2 )? ;
    public final void rule__UnoConfig__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2284:1: ( rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__2 )? )
            // InternalUnoDsl.g:2285:2: rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_33);
            rule__UnoConfig__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2286:2: ( rule__UnoConfig__UnorderedGroup__2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( LA9_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                alt9=1;
            }
            else if ( LA9_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                alt9=1;
            }
            else if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                alt9=1;
            }
            else if ( LA9_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                alt9=1;
            }
            else if ( LA9_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUnoDsl.g:2286:2: rule__UnoConfig__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__1"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__2"
    // InternalUnoDsl.g:2292:1: rule__UnoConfig__UnorderedGroup__2 : rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__3 )? ;
    public final void rule__UnoConfig__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2296:1: ( rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__3 )? )
            // InternalUnoDsl.g:2297:2: rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_33);
            rule__UnoConfig__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2298:2: ( rule__UnoConfig__UnorderedGroup__3 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                alt10=1;
            }
            else if ( LA10_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                alt10=1;
            }
            else if ( LA10_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                alt10=1;
            }
            else if ( LA10_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUnoDsl.g:2298:2: rule__UnoConfig__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__2"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__3"
    // InternalUnoDsl.g:2304:1: rule__UnoConfig__UnorderedGroup__3 : rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__4 )? ;
    public final void rule__UnoConfig__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2308:1: ( rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__4 )? )
            // InternalUnoDsl.g:2309:2: rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_33);
            rule__UnoConfig__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2310:2: ( rule__UnoConfig__UnorderedGroup__4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                alt11=1;
            }
            else if ( LA11_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                alt11=1;
            }
            else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                alt11=1;
            }
            else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUnoDsl.g:2310:2: rule__UnoConfig__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__3"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__4"
    // InternalUnoDsl.g:2316:1: rule__UnoConfig__UnorderedGroup__4 : rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__5 )? ;
    public final void rule__UnoConfig__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2320:1: ( rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__5 )? )
            // InternalUnoDsl.g:2321:2: rule__UnoConfig__UnorderedGroup__Impl ( rule__UnoConfig__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_33);
            rule__UnoConfig__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2322:2: ( rule__UnoConfig__UnorderedGroup__5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 3) ) {
                alt12=1;
            }
            else if ( LA12_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 4) ) {
                alt12=1;
            }
            else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getUnoConfigAccess().getUnorderedGroup(), 5) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUnoDsl.g:2322:2: rule__UnoConfig__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnoConfig__UnorderedGroup__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__4"


    // $ANTLR start "rule__UnoConfig__UnorderedGroup__5"
    // InternalUnoDsl.g:2328:1: rule__UnoConfig__UnorderedGroup__5 : rule__UnoConfig__UnorderedGroup__Impl ;
    public final void rule__UnoConfig__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2332:1: ( rule__UnoConfig__UnorderedGroup__Impl )
            // InternalUnoDsl.g:2333:2: rule__UnoConfig__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnoConfig__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__UnorderedGroup__5"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup"
    // InternalUnoDsl.g:2340:1: rule__EnumReglesDeposeCartes__UnorderedGroup : ( rule__EnumReglesDeposeCartes__UnorderedGroup__0 )? ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
        	
        try {
            // InternalUnoDsl.g:2345:1: ( ( rule__EnumReglesDeposeCartes__UnorderedGroup__0 )? )
            // InternalUnoDsl.g:2346:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__0 )?
            {
            // InternalUnoDsl.g:2346:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUnoDsl.g:2346:2: rule__EnumReglesDeposeCartes__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl"
    // InternalUnoDsl.g:2354:1: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) ) ) ) ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalUnoDsl.g:2359:1: ( ( ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) ) ) ) )
            // InternalUnoDsl.g:2360:3: ( ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) ) ) )
            {
            // InternalUnoDsl.g:2360:3: ( ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) ) ) )
            int alt14=6;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                int LA14_1 = input.LA(2);

                if ( LA14_1 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_1 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_1 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_1 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) {
                    alt14=6;
                }
                else if ( LA14_1 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_1 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalUnoDsl.g:2361:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2361:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) ) )
                    // InternalUnoDsl.g:2362:4: {...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalUnoDsl.g:2362:116: ( ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) ) )
                    // InternalUnoDsl.g:2363:5: ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2369:5: ( ( rule__EnumReglesDeposeCartes__Group_0__0 ) )
                    // InternalUnoDsl.g:2370:6: ( rule__EnumReglesDeposeCartes__Group_0__0 )
                    {
                     before(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_0()); 
                    // InternalUnoDsl.g:2371:6: ( rule__EnumReglesDeposeCartes__Group_0__0 )
                    // InternalUnoDsl.g:2371:7: rule__EnumReglesDeposeCartes__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:2376:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2376:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) ) )
                    // InternalUnoDsl.g:2377:4: {...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalUnoDsl.g:2377:116: ( ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) ) )
                    // InternalUnoDsl.g:2378:5: ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2384:5: ( ( rule__EnumReglesDeposeCartes__Group_1__0 ) )
                    // InternalUnoDsl.g:2385:6: ( rule__EnumReglesDeposeCartes__Group_1__0 )
                    {
                     before(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_1()); 
                    // InternalUnoDsl.g:2386:6: ( rule__EnumReglesDeposeCartes__Group_1__0 )
                    // InternalUnoDsl.g:2386:7: rule__EnumReglesDeposeCartes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:2391:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2391:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) ) )
                    // InternalUnoDsl.g:2392:4: {...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalUnoDsl.g:2392:116: ( ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) ) )
                    // InternalUnoDsl.g:2393:5: ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2399:5: ( ( rule__EnumReglesDeposeCartes__Group_2__0 ) )
                    // InternalUnoDsl.g:2400:6: ( rule__EnumReglesDeposeCartes__Group_2__0 )
                    {
                     before(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_2()); 
                    // InternalUnoDsl.g:2401:6: ( rule__EnumReglesDeposeCartes__Group_2__0 )
                    // InternalUnoDsl.g:2401:7: rule__EnumReglesDeposeCartes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:2406:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2406:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) ) )
                    // InternalUnoDsl.g:2407:4: {...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalUnoDsl.g:2407:116: ( ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) ) )
                    // InternalUnoDsl.g:2408:5: ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2414:5: ( ( rule__EnumReglesDeposeCartes__Group_3__0 ) )
                    // InternalUnoDsl.g:2415:6: ( rule__EnumReglesDeposeCartes__Group_3__0 )
                    {
                     before(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_3()); 
                    // InternalUnoDsl.g:2416:6: ( rule__EnumReglesDeposeCartes__Group_3__0 )
                    // InternalUnoDsl.g:2416:7: rule__EnumReglesDeposeCartes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalUnoDsl.g:2421:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2421:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) ) )
                    // InternalUnoDsl.g:2422:4: {...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4)");
                    }
                    // InternalUnoDsl.g:2422:116: ( ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) ) )
                    // InternalUnoDsl.g:2423:5: ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2429:5: ( ( rule__EnumReglesDeposeCartes__Group_4__0 ) )
                    // InternalUnoDsl.g:2430:6: ( rule__EnumReglesDeposeCartes__Group_4__0 )
                    {
                     before(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_4()); 
                    // InternalUnoDsl.g:2431:6: ( rule__EnumReglesDeposeCartes__Group_4__0 )
                    // InternalUnoDsl.g:2431:7: rule__EnumReglesDeposeCartes__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalUnoDsl.g:2436:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2436:3: ({...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) ) )
                    // InternalUnoDsl.g:2437:4: {...}? => ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5)");
                    }
                    // InternalUnoDsl.g:2437:116: ( ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) ) )
                    // InternalUnoDsl.g:2438:5: ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2444:5: ( ( rule__EnumReglesDeposeCartes__Group_5__0 ) )
                    // InternalUnoDsl.g:2445:6: ( rule__EnumReglesDeposeCartes__Group_5__0 )
                    {
                     before(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_5()); 
                    // InternalUnoDsl.g:2446:6: ( rule__EnumReglesDeposeCartes__Group_5__0 )
                    // InternalUnoDsl.g:2446:7: rule__EnumReglesDeposeCartes__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumReglesDeposeCartesAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__Impl"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__0"
    // InternalUnoDsl.g:2459:1: rule__EnumReglesDeposeCartes__UnorderedGroup__0 : rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__1 )? ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2463:1: ( rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__1 )? )
            // InternalUnoDsl.g:2464:2: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_34);
            rule__EnumReglesDeposeCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2465:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUnoDsl.g:2465:2: rule__EnumReglesDeposeCartes__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__0"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__1"
    // InternalUnoDsl.g:2471:1: rule__EnumReglesDeposeCartes__UnorderedGroup__1 : rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__2 )? ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2475:1: ( rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__2 )? )
            // InternalUnoDsl.g:2476:2: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_34);
            rule__EnumReglesDeposeCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2477:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUnoDsl.g:2477:2: rule__EnumReglesDeposeCartes__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__2"
    // InternalUnoDsl.g:2483:1: rule__EnumReglesDeposeCartes__UnorderedGroup__2 : rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__3 )? ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2487:1: ( rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__3 )? )
            // InternalUnoDsl.g:2488:2: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_34);
            rule__EnumReglesDeposeCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2489:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUnoDsl.g:2489:2: rule__EnumReglesDeposeCartes__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__2"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__3"
    // InternalUnoDsl.g:2495:1: rule__EnumReglesDeposeCartes__UnorderedGroup__3 : rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__4 )? ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2499:1: ( rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__4 )? )
            // InternalUnoDsl.g:2500:2: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_34);
            rule__EnumReglesDeposeCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2501:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__4 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUnoDsl.g:2501:2: rule__EnumReglesDeposeCartes__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__UnorderedGroup__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__3"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__4"
    // InternalUnoDsl.g:2507:1: rule__EnumReglesDeposeCartes__UnorderedGroup__4 : rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__5 )? ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2511:1: ( rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__5 )? )
            // InternalUnoDsl.g:2512:2: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ( rule__EnumReglesDeposeCartes__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_34);
            rule__EnumReglesDeposeCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2513:2: ( rule__EnumReglesDeposeCartes__UnorderedGroup__5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 30 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumReglesDeposeCartesAccess().getUnorderedGroup(), 5) ) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUnoDsl.g:2513:2: rule__EnumReglesDeposeCartes__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumReglesDeposeCartes__UnorderedGroup__5();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__4"


    // $ANTLR start "rule__EnumReglesDeposeCartes__UnorderedGroup__5"
    // InternalUnoDsl.g:2519:1: rule__EnumReglesDeposeCartes__UnorderedGroup__5 : rule__EnumReglesDeposeCartes__UnorderedGroup__Impl ;
    public final void rule__EnumReglesDeposeCartes__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2523:1: ( rule__EnumReglesDeposeCartes__UnorderedGroup__Impl )
            // InternalUnoDsl.g:2524:2: rule__EnumReglesDeposeCartes__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumReglesDeposeCartes__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__UnorderedGroup__5"


    // $ANTLR start "rule__EnumCartes__UnorderedGroup"
    // InternalUnoDsl.g:2531:1: rule__EnumCartes__UnorderedGroup : ( rule__EnumCartes__UnorderedGroup__0 )? ;
    public final void rule__EnumCartes__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
        	
        try {
            // InternalUnoDsl.g:2536:1: ( ( rule__EnumCartes__UnorderedGroup__0 )? )
            // InternalUnoDsl.g:2537:2: ( rule__EnumCartes__UnorderedGroup__0 )?
            {
            // InternalUnoDsl.g:2537:2: ( rule__EnumCartes__UnorderedGroup__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUnoDsl.g:2537:2: rule__EnumCartes__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__UnorderedGroup"


    // $ANTLR start "rule__EnumCartes__UnorderedGroup__Impl"
    // InternalUnoDsl.g:2545:1: rule__EnumCartes__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) ) ) ) ;
    public final void rule__EnumCartes__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalUnoDsl.g:2550:1: ( ( ({...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) ) ) ) )
            // InternalUnoDsl.g:2551:3: ( ({...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) ) ) )
            {
            // InternalUnoDsl.g:2551:3: ( ({...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) ) ) )
            int alt21=4;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) ) {
                int LA21_1 = input.LA(2);

                if ( LA21_1 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) {
                    alt21=4;
                }
                else if ( LA21_1 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_1 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_1 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUnoDsl.g:2552:3: ({...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2552:3: ({...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) ) )
                    // InternalUnoDsl.g:2553:4: {...}? => ( ( ( rule__EnumCartes__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EnumCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalUnoDsl.g:2553:104: ( ( ( rule__EnumCartes__Group_0__0 ) ) )
                    // InternalUnoDsl.g:2554:5: ( ( rule__EnumCartes__Group_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2560:5: ( ( rule__EnumCartes__Group_0__0 ) )
                    // InternalUnoDsl.g:2561:6: ( rule__EnumCartes__Group_0__0 )
                    {
                     before(grammarAccess.getEnumCartesAccess().getGroup_0()); 
                    // InternalUnoDsl.g:2562:6: ( rule__EnumCartes__Group_0__0 )
                    // InternalUnoDsl.g:2562:7: rule__EnumCartes__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumCartesAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUnoDsl.g:2567:3: ({...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2567:3: ({...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) ) )
                    // InternalUnoDsl.g:2568:4: {...}? => ( ( ( rule__EnumCartes__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EnumCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalUnoDsl.g:2568:104: ( ( ( rule__EnumCartes__Group_1__0 ) ) )
                    // InternalUnoDsl.g:2569:5: ( ( rule__EnumCartes__Group_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2575:5: ( ( rule__EnumCartes__Group_1__0 ) )
                    // InternalUnoDsl.g:2576:6: ( rule__EnumCartes__Group_1__0 )
                    {
                     before(grammarAccess.getEnumCartesAccess().getGroup_1()); 
                    // InternalUnoDsl.g:2577:6: ( rule__EnumCartes__Group_1__0 )
                    // InternalUnoDsl.g:2577:7: rule__EnumCartes__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumCartesAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUnoDsl.g:2582:3: ({...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2582:3: ({...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) ) )
                    // InternalUnoDsl.g:2583:4: {...}? => ( ( ( rule__EnumCartes__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EnumCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalUnoDsl.g:2583:104: ( ( ( rule__EnumCartes__Group_2__0 ) ) )
                    // InternalUnoDsl.g:2584:5: ( ( rule__EnumCartes__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2590:5: ( ( rule__EnumCartes__Group_2__0 ) )
                    // InternalUnoDsl.g:2591:6: ( rule__EnumCartes__Group_2__0 )
                    {
                     before(grammarAccess.getEnumCartesAccess().getGroup_2()); 
                    // InternalUnoDsl.g:2592:6: ( rule__EnumCartes__Group_2__0 )
                    // InternalUnoDsl.g:2592:7: rule__EnumCartes__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumCartesAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUnoDsl.g:2597:3: ({...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) ) )
                    {
                    // InternalUnoDsl.g:2597:3: ({...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) ) )
                    // InternalUnoDsl.g:2598:4: {...}? => ( ( ( rule__EnumCartes__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__EnumCartes__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalUnoDsl.g:2598:104: ( ( ( rule__EnumCartes__Group_3__0 ) ) )
                    // InternalUnoDsl.g:2599:5: ( ( rule__EnumCartes__Group_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalUnoDsl.g:2605:5: ( ( rule__EnumCartes__Group_3__0 ) )
                    // InternalUnoDsl.g:2606:6: ( rule__EnumCartes__Group_3__0 )
                    {
                     before(grammarAccess.getEnumCartesAccess().getGroup_3()); 
                    // InternalUnoDsl.g:2607:6: ( rule__EnumCartes__Group_3__0 )
                    // InternalUnoDsl.g:2607:7: rule__EnumCartes__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnumCartesAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnumCartesAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__UnorderedGroup__Impl"


    // $ANTLR start "rule__EnumCartes__UnorderedGroup__0"
    // InternalUnoDsl.g:2620:1: rule__EnumCartes__UnorderedGroup__0 : rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__1 )? ;
    public final void rule__EnumCartes__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2624:1: ( rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__1 )? )
            // InternalUnoDsl.g:2625:2: rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_35);
            rule__EnumCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2626:2: ( rule__EnumCartes__UnorderedGroup__1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUnoDsl.g:2626:2: rule__EnumCartes__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__UnorderedGroup__0"


    // $ANTLR start "rule__EnumCartes__UnorderedGroup__1"
    // InternalUnoDsl.g:2632:1: rule__EnumCartes__UnorderedGroup__1 : rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__2 )? ;
    public final void rule__EnumCartes__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2636:1: ( rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__2 )? )
            // InternalUnoDsl.g:2637:2: rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_35);
            rule__EnumCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2638:2: ( rule__EnumCartes__UnorderedGroup__2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUnoDsl.g:2638:2: rule__EnumCartes__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__UnorderedGroup__1"


    // $ANTLR start "rule__EnumCartes__UnorderedGroup__2"
    // InternalUnoDsl.g:2644:1: rule__EnumCartes__UnorderedGroup__2 : rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__3 )? ;
    public final void rule__EnumCartes__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2648:1: ( rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__3 )? )
            // InternalUnoDsl.g:2649:2: rule__EnumCartes__UnorderedGroup__Impl ( rule__EnumCartes__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_35);
            rule__EnumCartes__UnorderedGroup__Impl();

            state._fsp--;

            // InternalUnoDsl.g:2650:2: ( rule__EnumCartes__UnorderedGroup__3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getEnumCartesAccess().getUnorderedGroup(), 3) ) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUnoDsl.g:2650:2: rule__EnumCartes__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumCartes__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__UnorderedGroup__2"


    // $ANTLR start "rule__EnumCartes__UnorderedGroup__3"
    // InternalUnoDsl.g:2656:1: rule__EnumCartes__UnorderedGroup__3 : rule__EnumCartes__UnorderedGroup__Impl ;
    public final void rule__EnumCartes__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2660:1: ( rule__EnumCartes__UnorderedGroup__Impl )
            // InternalUnoDsl.g:2661:2: rule__EnumCartes__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumCartes__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__UnorderedGroup__3"


    // $ANTLR start "rule__Model__UnoRulesAssignment_1"
    // InternalUnoDsl.g:2668:1: rule__Model__UnoRulesAssignment_1 : ( ruleUnoConfig ) ;
    public final void rule__Model__UnoRulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2672:1: ( ( ruleUnoConfig ) )
            // InternalUnoDsl.g:2673:2: ( ruleUnoConfig )
            {
            // InternalUnoDsl.g:2673:2: ( ruleUnoConfig )
            // InternalUnoDsl.g:2674:3: ruleUnoConfig
            {
             before(grammarAccess.getModelAccess().getUnoRulesUnoConfigParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnoConfig();

            state._fsp--;

             after(grammarAccess.getModelAccess().getUnoRulesUnoConfigParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__UnoRulesAssignment_1"


    // $ANTLR start "rule__UnoConfig__NbCartesTalonAssignment_0_3"
    // InternalUnoDsl.g:2683:1: rule__UnoConfig__NbCartesTalonAssignment_0_3 : ( ruleNbCartesTalon ) ;
    public final void rule__UnoConfig__NbCartesTalonAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2687:1: ( ( ruleNbCartesTalon ) )
            // InternalUnoDsl.g:2688:2: ( ruleNbCartesTalon )
            {
            // InternalUnoDsl.g:2688:2: ( ruleNbCartesTalon )
            // InternalUnoDsl.g:2689:3: ruleNbCartesTalon
            {
             before(grammarAccess.getUnoConfigAccess().getNbCartesTalonNbCartesTalonEnumRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNbCartesTalon();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getNbCartesTalonNbCartesTalonEnumRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__NbCartesTalonAssignment_0_3"


    // $ANTLR start "rule__UnoConfig__TempsLimiteAssignment_1"
    // InternalUnoDsl.g:2698:1: rule__UnoConfig__TempsLimiteAssignment_1 : ( ruleTempsLimite ) ;
    public final void rule__UnoConfig__TempsLimiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2702:1: ( ( ruleTempsLimite ) )
            // InternalUnoDsl.g:2703:2: ( ruleTempsLimite )
            {
            // InternalUnoDsl.g:2703:2: ( ruleTempsLimite )
            // InternalUnoDsl.g:2704:3: ruleTempsLimite
            {
             before(grammarAccess.getUnoConfigAccess().getTempsLimiteTempsLimiteParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTempsLimite();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getTempsLimiteTempsLimiteParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__TempsLimiteAssignment_1"


    // $ANTLR start "rule__UnoConfig__DeposeCartesAssignment_2"
    // InternalUnoDsl.g:2713:1: rule__UnoConfig__DeposeCartesAssignment_2 : ( ruleDeposeCartes ) ;
    public final void rule__UnoConfig__DeposeCartesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2717:1: ( ( ruleDeposeCartes ) )
            // InternalUnoDsl.g:2718:2: ( ruleDeposeCartes )
            {
            // InternalUnoDsl.g:2718:2: ( ruleDeposeCartes )
            // InternalUnoDsl.g:2719:3: ruleDeposeCartes
            {
             before(grammarAccess.getUnoConfigAccess().getDeposeCartesDeposeCartesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDeposeCartes();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getDeposeCartesDeposeCartesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__DeposeCartesAssignment_2"


    // $ANTLR start "rule__UnoConfig__VisibiliteAssignment_3_3"
    // InternalUnoDsl.g:2728:1: rule__UnoConfig__VisibiliteAssignment_3_3 : ( ruleVisibilite ) ;
    public final void rule__UnoConfig__VisibiliteAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2732:1: ( ( ruleVisibilite ) )
            // InternalUnoDsl.g:2733:2: ( ruleVisibilite )
            {
            // InternalUnoDsl.g:2733:2: ( ruleVisibilite )
            // InternalUnoDsl.g:2734:3: ruleVisibilite
            {
             before(grammarAccess.getUnoConfigAccess().getVisibiliteVisibiliteParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilite();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getVisibiliteVisibiliteParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__VisibiliteAssignment_3_3"


    // $ANTLR start "rule__UnoConfig__NombreDePilesAssignment_3_6"
    // InternalUnoDsl.g:2743:1: rule__UnoConfig__NombreDePilesAssignment_3_6 : ( ruleNombreDePiles ) ;
    public final void rule__UnoConfig__NombreDePilesAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2747:1: ( ( ruleNombreDePiles ) )
            // InternalUnoDsl.g:2748:2: ( ruleNombreDePiles )
            {
            // InternalUnoDsl.g:2748:2: ( ruleNombreDePiles )
            // InternalUnoDsl.g:2749:3: ruleNombreDePiles
            {
             before(grammarAccess.getUnoConfigAccess().getNombreDePilesNombreDePilesParserRuleCall_3_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNombreDePiles();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getNombreDePilesNombreDePilesParserRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__NombreDePilesAssignment_3_6"


    // $ANTLR start "rule__UnoConfig__CartesSpecialesAssignment_4"
    // InternalUnoDsl.g:2758:1: rule__UnoConfig__CartesSpecialesAssignment_4 : ( ruleCartesSpeciales ) ;
    public final void rule__UnoConfig__CartesSpecialesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2762:1: ( ( ruleCartesSpeciales ) )
            // InternalUnoDsl.g:2763:2: ( ruleCartesSpeciales )
            {
            // InternalUnoDsl.g:2763:2: ( ruleCartesSpeciales )
            // InternalUnoDsl.g:2764:3: ruleCartesSpeciales
            {
             before(grammarAccess.getUnoConfigAccess().getCartesSpecialesCartesSpecialesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCartesSpeciales();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getCartesSpecialesCartesSpecialesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__CartesSpecialesAssignment_4"


    // $ANTLR start "rule__UnoConfig__NombreDePiochesAssignment_5_1"
    // InternalUnoDsl.g:2773:1: rule__UnoConfig__NombreDePiochesAssignment_5_1 : ( ruleNombreDePioches ) ;
    public final void rule__UnoConfig__NombreDePiochesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2777:1: ( ( ruleNombreDePioches ) )
            // InternalUnoDsl.g:2778:2: ( ruleNombreDePioches )
            {
            // InternalUnoDsl.g:2778:2: ( ruleNombreDePioches )
            // InternalUnoDsl.g:2779:3: ruleNombreDePioches
            {
             before(grammarAccess.getUnoConfigAccess().getNombreDePiochesNombreDePiochesParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNombreDePioches();

            state._fsp--;

             after(grammarAccess.getUnoConfigAccess().getNombreDePiochesNombreDePiochesParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnoConfig__NombreDePiochesAssignment_5_1"


    // $ANTLR start "rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1"
    // InternalUnoDsl.g:2788:1: rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1 : ( ruleEnumReglesDeposeCartes ) ;
    public final void rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2792:1: ( ( ruleEnumReglesDeposeCartes ) )
            // InternalUnoDsl.g:2793:2: ( ruleEnumReglesDeposeCartes )
            {
            // InternalUnoDsl.g:2793:2: ( ruleEnumReglesDeposeCartes )
            // InternalUnoDsl.g:2794:3: ruleEnumReglesDeposeCartes
            {
             before(grammarAccess.getDeposeCartesAccess().getEnumReglesDeposeCartesEnumReglesDeposeCartesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumReglesDeposeCartes();

            state._fsp--;

             after(grammarAccess.getDeposeCartesAccess().getEnumReglesDeposeCartesEnumReglesDeposeCartesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeposeCartes__EnumReglesDeposeCartesAssignment_1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1"
    // InternalUnoDsl.g:2803:1: rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1 : ( ( 'cumul_+2' ) ) ;
    public final void rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2807:1: ( ( ( 'cumul_+2' ) ) )
            // InternalUnoDsl.g:2808:2: ( ( 'cumul_+2' ) )
            {
            // InternalUnoDsl.g:2808:2: ( ( 'cumul_+2' ) )
            // InternalUnoDsl.g:2809:3: ( 'cumul_+2' )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxCumul_2Keyword_0_1_0()); 
            // InternalUnoDsl.g:2810:3: ( 'cumul_+2' )
            // InternalUnoDsl.g:2811:4: 'cumul_+2'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxCumul_2Keyword_0_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxCumul_2Keyword_0_1_0()); 

            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusDeuxCumul_2Keyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__CumulPlusDeuxAssignment_0_1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1"
    // InternalUnoDsl.g:2822:1: rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1 : ( ( 'cumul_+4' ) ) ;
    public final void rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2826:1: ( ( ( 'cumul_+4' ) ) )
            // InternalUnoDsl.g:2827:2: ( ( 'cumul_+4' ) )
            {
            // InternalUnoDsl.g:2827:2: ( ( 'cumul_+4' ) )
            // InternalUnoDsl.g:2828:3: ( 'cumul_+4' )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreCumul_4Keyword_1_1_0()); 
            // InternalUnoDsl.g:2829:3: ( 'cumul_+4' )
            // InternalUnoDsl.g:2830:4: 'cumul_+4'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreCumul_4Keyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreCumul_4Keyword_1_1_0()); 

            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getCumulPlusQuatreCumul_4Keyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__CumulPlusQuatreAssignment_1_1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1"
    // InternalUnoDsl.g:2841:1: rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1 : ( ( 'suite_classique' ) ) ;
    public final void rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2845:1: ( ( ( 'suite_classique' ) ) )
            // InternalUnoDsl.g:2846:2: ( ( 'suite_classique' ) )
            {
            // InternalUnoDsl.g:2846:2: ( ( 'suite_classique' ) )
            // InternalUnoDsl.g:2847:3: ( 'suite_classique' )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueSuite_classiqueKeyword_2_1_0()); 
            // InternalUnoDsl.g:2848:3: ( 'suite_classique' )
            // InternalUnoDsl.g:2849:4: 'suite_classique'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueSuite_classiqueKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueSuite_classiqueKeyword_2_1_0()); 

            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteClassiqueSuite_classiqueKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__SuiteClassiqueAssignment_2_1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1"
    // InternalUnoDsl.g:2860:1: rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1 : ( ( 'suite_royale' ) ) ;
    public final void rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2864:1: ( ( ( 'suite_royale' ) ) )
            // InternalUnoDsl.g:2865:2: ( ( 'suite_royale' ) )
            {
            // InternalUnoDsl.g:2865:2: ( ( 'suite_royale' ) )
            // InternalUnoDsl.g:2866:3: ( 'suite_royale' )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleSuite_royaleKeyword_3_1_0()); 
            // InternalUnoDsl.g:2867:3: ( 'suite_royale' )
            // InternalUnoDsl.g:2868:4: 'suite_royale'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleSuite_royaleKeyword_3_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleSuite_royaleKeyword_3_1_0()); 

            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getSuiteRoyaleSuite_royaleKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__SuiteRoyaleAssignment_3_1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1"
    // InternalUnoDsl.g:2879:1: rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1 : ( ( 'interception' ) ) ;
    public final void rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2883:1: ( ( ( 'interception' ) ) )
            // InternalUnoDsl.g:2884:2: ( ( 'interception' ) )
            {
            // InternalUnoDsl.g:2884:2: ( ( 'interception' ) )
            // InternalUnoDsl.g:2885:3: ( 'interception' )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionInterceptionKeyword_4_1_0()); 
            // InternalUnoDsl.g:2886:3: ( 'interception' )
            // InternalUnoDsl.g:2887:4: 'interception'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionInterceptionKeyword_4_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionInterceptionKeyword_4_1_0()); 

            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getInterceptionInterceptionKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__InterceptionAssignment_4_1"


    // $ANTLR start "rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1"
    // InternalUnoDsl.g:2898:1: rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1 : ( ( '+4_ou_rien' ) ) ;
    public final void rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2902:1: ( ( ( '+4_ou_rien' ) ) )
            // InternalUnoDsl.g:2903:2: ( ( '+4_ou_rien' ) )
            {
            // InternalUnoDsl.g:2903:2: ( ( '+4_ou_rien' ) )
            // InternalUnoDsl.g:2904:3: ( '+4_ou_rien' )
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRien4_ou_rienKeyword_5_1_0()); 
            // InternalUnoDsl.g:2905:3: ( '+4_ou_rien' )
            // InternalUnoDsl.g:2906:4: '+4_ou_rien'
            {
             before(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRien4_ou_rienKeyword_5_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRien4_ou_rienKeyword_5_1_0()); 

            }

             after(grammarAccess.getEnumReglesDeposeCartesAccess().getPlus4OuRien4_ou_rienKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumReglesDeposeCartes__Plus4OuRienAssignment_5_1"


    // $ANTLR start "rule__Visibilite__VisibleAssignment_0"
    // InternalUnoDsl.g:2917:1: rule__Visibilite__VisibleAssignment_0 : ( ( 'visible' ) ) ;
    public final void rule__Visibilite__VisibleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2921:1: ( ( ( 'visible' ) ) )
            // InternalUnoDsl.g:2922:2: ( ( 'visible' ) )
            {
            // InternalUnoDsl.g:2922:2: ( ( 'visible' ) )
            // InternalUnoDsl.g:2923:3: ( 'visible' )
            {
             before(grammarAccess.getVisibiliteAccess().getVisibleVisibleKeyword_0_0()); 
            // InternalUnoDsl.g:2924:3: ( 'visible' )
            // InternalUnoDsl.g:2925:4: 'visible'
            {
             before(grammarAccess.getVisibiliteAccess().getVisibleVisibleKeyword_0_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getVisibiliteAccess().getVisibleVisibleKeyword_0_0()); 

            }

             after(grammarAccess.getVisibiliteAccess().getVisibleVisibleKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibilite__VisibleAssignment_0"


    // $ANTLR start "rule__Visibilite__InvisibleAssignment_1"
    // InternalUnoDsl.g:2936:1: rule__Visibilite__InvisibleAssignment_1 : ( ( 'invisible' ) ) ;
    public final void rule__Visibilite__InvisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2940:1: ( ( ( 'invisible' ) ) )
            // InternalUnoDsl.g:2941:2: ( ( 'invisible' ) )
            {
            // InternalUnoDsl.g:2941:2: ( ( 'invisible' ) )
            // InternalUnoDsl.g:2942:3: ( 'invisible' )
            {
             before(grammarAccess.getVisibiliteAccess().getInvisibleInvisibleKeyword_1_0()); 
            // InternalUnoDsl.g:2943:3: ( 'invisible' )
            // InternalUnoDsl.g:2944:4: 'invisible'
            {
             before(grammarAccess.getVisibiliteAccess().getInvisibleInvisibleKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVisibiliteAccess().getInvisibleInvisibleKeyword_1_0()); 

            }

             after(grammarAccess.getVisibiliteAccess().getInvisibleInvisibleKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibilite__InvisibleAssignment_1"


    // $ANTLR start "rule__CartesSpeciales__EnumCartesAssignment_1"
    // InternalUnoDsl.g:2955:1: rule__CartesSpeciales__EnumCartesAssignment_1 : ( ruleEnumCartes ) ;
    public final void rule__CartesSpeciales__EnumCartesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2959:1: ( ( ruleEnumCartes ) )
            // InternalUnoDsl.g:2960:2: ( ruleEnumCartes )
            {
            // InternalUnoDsl.g:2960:2: ( ruleEnumCartes )
            // InternalUnoDsl.g:2961:3: ruleEnumCartes
            {
             before(grammarAccess.getCartesSpecialesAccess().getEnumCartesEnumCartesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumCartes();

            state._fsp--;

             after(grammarAccess.getCartesSpecialesAccess().getEnumCartesEnumCartesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CartesSpeciales__EnumCartesAssignment_1"


    // $ANTLR start "rule__EnumCartes__CarteUnoAssignment_0_1"
    // InternalUnoDsl.g:2970:1: rule__EnumCartes__CarteUnoAssignment_0_1 : ( ( 'carte_uno' ) ) ;
    public final void rule__EnumCartes__CarteUnoAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2974:1: ( ( ( 'carte_uno' ) ) )
            // InternalUnoDsl.g:2975:2: ( ( 'carte_uno' ) )
            {
            // InternalUnoDsl.g:2975:2: ( ( 'carte_uno' ) )
            // InternalUnoDsl.g:2976:3: ( 'carte_uno' )
            {
             before(grammarAccess.getEnumCartesAccess().getCarteUnoCarte_unoKeyword_0_1_0()); 
            // InternalUnoDsl.g:2977:3: ( 'carte_uno' )
            // InternalUnoDsl.g:2978:4: 'carte_uno'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteUnoCarte_unoKeyword_0_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteUnoCarte_unoKeyword_0_1_0()); 

            }

             after(grammarAccess.getEnumCartesAccess().getCarteUnoCarte_unoKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__CarteUnoAssignment_0_1"


    // $ANTLR start "rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1"
    // InternalUnoDsl.g:2989:1: rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1 : ( ( '+4_non_contestable' ) ) ;
    public final void rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:2993:1: ( ( ( '+4_non_contestable' ) ) )
            // InternalUnoDsl.g:2994:2: ( ( '+4_non_contestable' ) )
            {
            // InternalUnoDsl.g:2994:2: ( ( '+4_non_contestable' ) )
            // InternalUnoDsl.g:2995:3: ( '+4_non_contestable' )
            {
             before(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestable4_non_contestableKeyword_1_1_0()); 
            // InternalUnoDsl.g:2996:3: ( '+4_non_contestable' )
            // InternalUnoDsl.g:2997:4: '+4_non_contestable'
            {
             before(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestable4_non_contestableKeyword_1_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestable4_non_contestableKeyword_1_1_0()); 

            }

             after(grammarAccess.getEnumCartesAccess().getPlusQuatreNonContestable4_non_contestableKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__PlusQuatreNonContestableAssignment_1_1"


    // $ANTLR start "rule__EnumCartes__CarteZeroAssignment_2_1"
    // InternalUnoDsl.g:3008:1: rule__EnumCartes__CarteZeroAssignment_2_1 : ( ( '0_special' ) ) ;
    public final void rule__EnumCartes__CarteZeroAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3012:1: ( ( ( '0_special' ) ) )
            // InternalUnoDsl.g:3013:2: ( ( '0_special' ) )
            {
            // InternalUnoDsl.g:3013:2: ( ( '0_special' ) )
            // InternalUnoDsl.g:3014:3: ( '0_special' )
            {
             before(grammarAccess.getEnumCartesAccess().getCarteZero0_specialKeyword_2_1_0()); 
            // InternalUnoDsl.g:3015:3: ( '0_special' )
            // InternalUnoDsl.g:3016:4: '0_special'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteZero0_specialKeyword_2_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteZero0_specialKeyword_2_1_0()); 

            }

             after(grammarAccess.getEnumCartesAccess().getCarteZero0_specialKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__CarteZeroAssignment_2_1"


    // $ANTLR start "rule__EnumCartes__CarteSeptAssignment_3_1"
    // InternalUnoDsl.g:3027:1: rule__EnumCartes__CarteSeptAssignment_3_1 : ( ( '7_special' ) ) ;
    public final void rule__EnumCartes__CarteSeptAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3031:1: ( ( ( '7_special' ) ) )
            // InternalUnoDsl.g:3032:2: ( ( '7_special' ) )
            {
            // InternalUnoDsl.g:3032:2: ( ( '7_special' ) )
            // InternalUnoDsl.g:3033:3: ( '7_special' )
            {
             before(grammarAccess.getEnumCartesAccess().getCarteSept7_specialKeyword_3_1_0()); 
            // InternalUnoDsl.g:3034:3: ( '7_special' )
            // InternalUnoDsl.g:3035:4: '7_special'
            {
             before(grammarAccess.getEnumCartesAccess().getCarteSept7_specialKeyword_3_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getEnumCartesAccess().getCarteSept7_specialKeyword_3_1_0()); 

            }

             after(grammarAccess.getEnumCartesAccess().getCarteSept7_specialKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumCartes__CarteSeptAssignment_3_1"


    // $ANTLR start "rule__NombreDePioches__UneFoisAssignment_0_0"
    // InternalUnoDsl.g:3046:1: rule__NombreDePioches__UneFoisAssignment_0_0 : ( ( '1' ) ) ;
    public final void rule__NombreDePioches__UneFoisAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3050:1: ( ( ( '1' ) ) )
            // InternalUnoDsl.g:3051:2: ( ( '1' ) )
            {
            // InternalUnoDsl.g:3051:2: ( ( '1' ) )
            // InternalUnoDsl.g:3052:3: ( '1' )
            {
             before(grammarAccess.getNombreDePiochesAccess().getUneFois1Keyword_0_0_0()); 
            // InternalUnoDsl.g:3053:3: ( '1' )
            // InternalUnoDsl.g:3054:4: '1'
            {
             before(grammarAccess.getNombreDePiochesAccess().getUneFois1Keyword_0_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNombreDePiochesAccess().getUneFois1Keyword_0_0_0()); 

            }

             after(grammarAccess.getNombreDePiochesAccess().getUneFois1Keyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__UneFoisAssignment_0_0"


    // $ANTLR start "rule__NombreDePioches__PeutJouerAssignment_0_1"
    // InternalUnoDsl.g:3065:1: rule__NombreDePioches__PeutJouerAssignment_0_1 : ( rulePeutJouer ) ;
    public final void rule__NombreDePioches__PeutJouerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3069:1: ( ( rulePeutJouer ) )
            // InternalUnoDsl.g:3070:2: ( rulePeutJouer )
            {
            // InternalUnoDsl.g:3070:2: ( rulePeutJouer )
            // InternalUnoDsl.g:3071:3: rulePeutJouer
            {
             before(grammarAccess.getNombreDePiochesAccess().getPeutJouerPeutJouerParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            rulePeutJouer();

            state._fsp--;

             after(grammarAccess.getNombreDePiochesAccess().getPeutJouerPeutJouerParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__PeutJouerAssignment_0_1"


    // $ANTLR start "rule__NombreDePioches__TroisFoisAssignment_1"
    // InternalUnoDsl.g:3080:1: rule__NombreDePioches__TroisFoisAssignment_1 : ( ( '3' ) ) ;
    public final void rule__NombreDePioches__TroisFoisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3084:1: ( ( ( '3' ) ) )
            // InternalUnoDsl.g:3085:2: ( ( '3' ) )
            {
            // InternalUnoDsl.g:3085:2: ( ( '3' ) )
            // InternalUnoDsl.g:3086:3: ( '3' )
            {
             before(grammarAccess.getNombreDePiochesAccess().getTroisFois3Keyword_1_0()); 
            // InternalUnoDsl.g:3087:3: ( '3' )
            // InternalUnoDsl.g:3088:4: '3'
            {
             before(grammarAccess.getNombreDePiochesAccess().getTroisFois3Keyword_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNombreDePiochesAccess().getTroisFois3Keyword_1_0()); 

            }

             after(grammarAccess.getNombreDePiochesAccess().getTroisFois3Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NombreDePioches__TroisFoisAssignment_1"


    // $ANTLR start "rule__PeutJouer__PeutJouerEnsuiteAssignment_0"
    // InternalUnoDsl.g:3099:1: rule__PeutJouer__PeutJouerEnsuiteAssignment_0 : ( ( 'peut_jouer_ensuite' ) ) ;
    public final void rule__PeutJouer__PeutJouerEnsuiteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3103:1: ( ( ( 'peut_jouer_ensuite' ) ) )
            // InternalUnoDsl.g:3104:2: ( ( 'peut_jouer_ensuite' ) )
            {
            // InternalUnoDsl.g:3104:2: ( ( 'peut_jouer_ensuite' ) )
            // InternalUnoDsl.g:3105:3: ( 'peut_jouer_ensuite' )
            {
             before(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuitePeut_jouer_ensuiteKeyword_0_0()); 
            // InternalUnoDsl.g:3106:3: ( 'peut_jouer_ensuite' )
            // InternalUnoDsl.g:3107:4: 'peut_jouer_ensuite'
            {
             before(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuitePeut_jouer_ensuiteKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuitePeut_jouer_ensuiteKeyword_0_0()); 

            }

             after(grammarAccess.getPeutJouerAccess().getPeutJouerEnsuitePeut_jouer_ensuiteKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeutJouer__PeutJouerEnsuiteAssignment_0"


    // $ANTLR start "rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1"
    // InternalUnoDsl.g:3118:1: rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1 : ( ( 'peut_pas_jouer_ensuite' ) ) ;
    public final void rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUnoDsl.g:3122:1: ( ( ( 'peut_pas_jouer_ensuite' ) ) )
            // InternalUnoDsl.g:3123:2: ( ( 'peut_pas_jouer_ensuite' ) )
            {
            // InternalUnoDsl.g:3123:2: ( ( 'peut_pas_jouer_ensuite' ) )
            // InternalUnoDsl.g:3124:3: ( 'peut_pas_jouer_ensuite' )
            {
             before(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuitePeut_pas_jouer_ensuiteKeyword_1_0()); 
            // InternalUnoDsl.g:3125:3: ( 'peut_pas_jouer_ensuite' )
            // InternalUnoDsl.g:3126:4: 'peut_pas_jouer_ensuite'
            {
             before(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuitePeut_pas_jouer_ensuiteKeyword_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuitePeut_pas_jouer_ensuiteKeyword_1_0()); 

            }

             after(grammarAccess.getPeutJouerAccess().getPeutPasJouerEnsuitePeut_pas_jouer_ensuiteKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeutJouer__PeutPasJouerEnsuiteAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000115220000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000115220002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000002L});

}
