// $ANTLR 3.4 USE.g 2020-09-22 13:54:32
 
/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2004 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.  
 */

package org.tzi.use.parser.use; 

// ------------------------------------
//  USE parser
// ------------------------------------
import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.statemachines.*;
import org.tzi.use.parser.ocl.*;
import org.tzi.use.parser.soil.ast.*;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class USEParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'Bag'", "'Collection'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", "'attributes'", "'begin'", "'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'psm'", "'redefines'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'while'", "'xor'"
    };

    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int ARROW=4;
    public static final int AT=5;
    public static final int BAR=6;
    public static final int COLON=7;
    public static final int COLON_COLON=8;
    public static final int COLON_EQUAL=9;
    public static final int COMMA=10;
    public static final int DOT=11;
    public static final int DOTDOT=12;
    public static final int EQUAL=13;
    public static final int ESC=14;
    public static final int GREATER=15;
    public static final int GREATER_EQUAL=16;
    public static final int HASH=17;
    public static final int HEX_DIGIT=18;
    public static final int IDENT=19;
    public static final int INT=20;
    public static final int LBRACE=21;
    public static final int LBRACK=22;
    public static final int LESS=23;
    public static final int LESS_EQUAL=24;
    public static final int LPAREN=25;
    public static final int MINUS=26;
    public static final int ML_COMMENT=27;
    public static final int NEWLINE=28;
    public static final int NON_OCL_STRING=29;
    public static final int NOT_EQUAL=30;
    public static final int PLUS=31;
    public static final int RANGE_OR_INT=32;
    public static final int RBRACE=33;
    public static final int RBRACK=34;
    public static final int REAL=35;
    public static final int RPAREN=36;
    public static final int SEMI=37;
    public static final int SLASH=38;
    public static final int SL_COMMENT=39;
    public static final int STAR=40;
    public static final int STRING=41;
    public static final int VOCAB=42;
    public static final int WS=43;

    // delegates
    public BaseParser[] getDelegates() {
        return new BaseParser[] {};
    }

    // delegators


    public USEParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public USEParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return USEParser.tokenNames; }
    public String getGrammarFileName() { return "USE.g"; }



    // $ANTLR start "model"
    // USE.g:128:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;


        try {
            // USE.g:129:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF )
            // USE.g:130:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model70);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,84,FOLLOW_84_in_model76); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model80); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // USE.g:132:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // USE.g:132:9: generalClassifierDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassifierDefinition_in_model92);
            	    generalClassifierDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;
            	case 2 :
            	    // USE.g:133:9: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model105);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:134:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // USE.g:134:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // USE.g:134:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,60,FOLLOW_60_in_model119); if (state.failed) return n;

            	    // USE.g:135:11: (cons= invariant |ppc= prePost )*
            	    loop1:
            	    do {
            	        int alt1=3;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==61) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( (LA1_2==IDENT) ) {
            	                int LA1_3 = input.LA(3);

            	                if ( (LA1_3==COLON_COLON) ) {
            	                    alt1=2;
            	                }
            	                else if ( (LA1_3==EOF||LA1_3==AT||LA1_3==COLON||LA1_3==COMMA||LA1_3==IDENT||LA1_3==51||(LA1_3 >= 54 && LA1_3 <= 55)||(LA1_3 >= 60 && LA1_3 <= 61)||(LA1_3 >= 71 && LA1_3 <= 72)||LA1_3==81) ) {
            	                    alt1=1;
            	                }


            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // USE.g:135:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model137);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // USE.g:136:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model158);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addPrePost(ppc); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // USE.g:139:9: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model198);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model213); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "model"



    // $ANTLR start "enumTypeDefinition"
    // USE.g:148:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // USE.g:149:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // USE.g:150:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition241);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,71,FOLLOW_71_in_enumTypeDefinition247); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition251); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition253); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition257);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition259); if (state.failed) return n;

            // USE.g:151:54: ( SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SEMI) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // USE.g:151:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition263); if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTEnumTypeDefinition(name, idListRes); n.setAnnotations(as); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "enumTypeDefinition"



    // $ANTLR start "generalClassifierDefinition"
    // USE.g:160:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
    public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;

        ASTSignal s =null;


         
          boolean isAbstract = false;

        try {
            // USE.g:164:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
            // USE.g:165:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition301);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // USE.g:166:5: ( 'abstract' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // USE.g:166:7: 'abstract'
                    {
                    match(input,51,FOLLOW_51_in_generalClassifierDefinition309); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // USE.g:167:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                int LA5_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("class"))) ) {
                    alt5=1;
                }
                else if ( ((input.LT(1).getText().equals("signal"))) ) {
                    alt5=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA5_0 >= 54 && LA5_0 <= 55)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // USE.g:168:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition337);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // USE.g:171:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition375);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // USE.g:174:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition420);
                    s=signalDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addSignal(s); s.setAnnotations(as); }

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
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "generalClassifierDefinition"



    // $ANTLR start "classDefinition"
    // USE.g:195:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
    public final ASTClass classDefinition(boolean isAbstract) throws RecognitionException {
        ASTClass n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;

        ASTStateMachine sm =null;


         List idList; 
        try {
            // USE.g:197:5: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // USE.g:198:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            pushFollow(FOLLOW_keyClass_in_classDefinition474);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition478); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }

            // USE.g:199:5: ( LESS idListRes= idList )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==LESS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // USE.g:199:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition488); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition492);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:200:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==56) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // USE.g:200:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,56,FOLLOW_56_in_classDefinition505); if (state.failed) return n;

                    // USE.g:201:7: (a= attributeDefinition )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==AT||LA7_0==IDENT||LA7_0==51||(LA7_0 >= 54 && LA7_0 <= 55)||LA7_0==71||LA7_0==81||LA7_0==84||(LA7_0 >= 97 && LA7_0 <= 98)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // USE.g:201:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition518);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:203:5: ( 'operations' (op= operationDefinition )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==94) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // USE.g:203:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,94,FOLLOW_94_in_classDefinition539); if (state.failed) return n;

                    // USE.g:204:7: (op= operationDefinition )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==AT||LA9_0==IDENT||LA9_0==51||(LA9_0 >= 54 && LA9_0 <= 55)||LA9_0==71||LA9_0==81||LA9_0==84||(LA9_0 >= 97 && LA9_0 <= 98)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // USE.g:204:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition552);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:206:5: ( 'constraints' (inv= invariantClause )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==60) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // USE.g:206:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,60,FOLLOW_60_in_classDefinition573); if (state.failed) return n;

                    // USE.g:207:7: (inv= invariantClause )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==AT||LA11_0==IDENT||LA11_0==51||(LA11_0 >= 54 && LA11_0 <= 55)||(LA11_0 >= 71 && LA11_0 <= 72)||LA11_0==81||LA11_0==84||(LA11_0 >= 97 && LA11_0 <= 98)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // USE.g:208:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition593);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:211:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==103) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // USE.g:211:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,103,FOLLOW_103_in_classDefinition619); if (state.failed) return n;

                    // USE.g:212:7: (sm= stateMachine )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==99) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // USE.g:213:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition639);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,69,FOLLOW_69_in_classDefinition663); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "classDefinition"



    // $ANTLR start "associationClassDefinition"
    // USE.g:234:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
    public final ASTAssociationClass associationClassDefinition(boolean isAbstract) throws RecognitionException {
        ASTAssociationClass n = null;


        Token classKW=null;
        Token name=null;
        List idListRes =null;

        ASTAssociationEnd ae =null;

        ASTAttribute a =null;

        ASTOperation op =null;

        ASTInvariantClause inv =null;

        ASTStateMachine sm =null;


        List idList; Token t = null;
        try {
            // USE.g:236:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // USE.g:237:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);

            if ( (input.LA(1) >= 54 && input.LA(1) <= 55) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { 
                	if ((classKW!=null?classKW.getText():null).equals("associationClass")) {
                           reportWarning("the 'associationClass' keyword is deprecated and will " +
                                         "not be supported in the future, use 'associationclass' instead");
                        }  
                }

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition722); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // USE.g:246:5: ( LESS idListRes= idList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LESS) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // USE.g:246:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition732); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition736);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // USE.g:247:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==58) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // USE.g:247:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,58,FOLLOW_58_in_associationClassDefinition748); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition756);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // USE.g:249:5: (ae= associationEnd )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==IDENT) ) {
                            int LA16_2 = input.LA(2);

                            if ( (LA16_2==LBRACK) ) {
                                alt16=1;
                            }


                        }
                        else if ( (LA16_0==AT) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // USE.g:249:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition768);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }


            // USE.g:251:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // USE.g:251:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,56,FOLLOW_56_in_associationClassDefinition788); if (state.failed) return n;

                    // USE.g:252:7: (a= attributeDefinition )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==IDENT) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==COLON) ) {
                                alt18=1;
                            }


                        }
                        else if ( (LA18_0==AT) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // USE.g:252:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition801);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:254:5: ( 'operations' (op= operationDefinition )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==94) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // USE.g:254:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,94,FOLLOW_94_in_associationClassDefinition822); if (state.failed) return n;

                    // USE.g:255:7: (op= operationDefinition )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==IDENT) ) {
                            int LA20_2 = input.LA(2);

                            if ( (LA20_2==LPAREN) ) {
                                alt20=1;
                            }


                        }
                        else if ( (LA20_0==AT) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // USE.g:255:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition835);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:257:5: ( 'constraints' (inv= invariantClause )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==60) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // USE.g:257:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,60,FOLLOW_60_in_associationClassDefinition856); if (state.failed) return n;

                    // USE.g:258:7: (inv= invariantClause )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==AT||LA22_0==72||LA22_0==81) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // USE.g:259:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition876);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:262:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==103) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // USE.g:262:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,103,FOLLOW_103_in_associationClassDefinition902); if (state.failed) return n;

                    // USE.g:263:7: (sm= stateMachine )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==99) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // USE.g:264:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition922);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:268:5: ( ( keyAggregation | keyComposition ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // USE.g:268:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // USE.g:269:7: ( keyAggregation | keyComposition )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==IDENT) ) {
                        int LA26_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt26=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt26=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // USE.g:269:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition963);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:269:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition967);
                            keyComposition();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { n.setKind(t); }

                    }
                    break;

            }


            match(input,69,FOLLOW_69_in_associationClassDefinition990); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "associationClassDefinition"



    // $ANTLR start "attributeDefinition"
    // USE.g:279:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;

        USEParser.expression_return deriveExpression =null;

        USEParser.expression_return initExpression =null;


        try {
            // USE.g:280:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
            // USE.g:281:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition1018);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition1026); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition1028); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition1032);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:284:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IDENT) ) {
                int LA29_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                    alt29=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt29=2;
                }
            }
            switch (alt29) {
                case 1 :
                    // USE.g:285:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // USE.g:285:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // USE.g:285:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // USE.g:285:10: ( keyDerive | keyDerived )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==IDENT) ) {
                        int LA28_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("derive"))) ) {
                            alt28=1;
                        }
                        else if ( ((input.LT(1).getText().equals("derived"))) ) {
                            alt28=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 28, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // USE.g:285:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition1056);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // USE.g:285:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition1058);
                            keyDerived();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;

                    }


                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_attributeDefinition1071);
                    deriveExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;
                case 2 :
                    // USE.g:287:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    {
                    // USE.g:287:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    // USE.g:287:10: keyInit ( COLON | EQUAL ) initExpression= expression
                    {
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition1091);
                    keyInit();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_attributeDefinition1107);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // USE.g:289:5: ( SEMI )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==SEMI) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // USE.g:289:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition1121); if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { 
                   n = new ASTAttribute(name, t); 
                   n.setAnnotations(as);
                   n.setDeriveExpression((deriveExpression!=null?deriveExpression.n:null));
                   n.setInitExpression((initExpression!=null?initExpression.n:null));
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "attributeDefinition"



    // $ANTLR start "operationDefinition"
    // USE.g:303:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List<ASTVariableDeclaration> pl =null;

        ASTType t =null;

        USEParser.expression_return e =null;

        USEParser.blockStat_return s =null;

        ASTPrePostClause ppc =null;


        try {
            // USE.g:304:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // USE.g:305:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition1152);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition1162); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition1172);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:311:5: ( COLON t= type )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COLON) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // USE.g:311:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition1186); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition1192);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // USE.g:313:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==EQUAL) ) {
                alt32=1;
            }
            else if ( (LA32_0==57) ) {
                alt32=2;
            }
            switch (alt32) {
                case 1 :
                    // USE.g:314:9: ( EQUAL e= expression )
                    {
                    // USE.g:314:9: ( EQUAL e= expression )
                    // USE.g:314:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition1220); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition1226);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:315:9: (s= blockStat )
                    {
                    // USE.g:315:9: (s= blockStat )
                    // USE.g:315:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition1248);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // USE.g:317:5: (ppc= prePostClause )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // USE.g:317:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition1270);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            // USE.g:318:5: ( SEMI )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==SEMI) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // USE.g:318:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition1283); if (state.failed) return n;

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "operationDefinition"



    // $ANTLR start "associationDefinition"
    // USE.g:328:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTAssociationEnd ae =null;


         Token t = null; 
        try {
            // USE.g:330:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // USE.g:331:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition1314);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            // USE.g:333:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT) ) {
                int LA35_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt35=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt35=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt35=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // USE.g:333:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition1328);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // USE.g:333:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition1332);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // USE.g:333:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition1336);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition1346); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }

            match(input,58,FOLLOW_58_in_associationDefinition1354); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition1362);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // USE.g:337:5: (ae= associationEnd )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==AT||LA36_0==IDENT||LA36_0==51||(LA36_0 >= 54 && LA36_0 <= 55)||LA36_0==71||LA36_0==81||LA36_0==84||(LA36_0 >= 97 && LA36_0 <= 98)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // USE.g:337:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition1374);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            match(input,69,FOLLOW_69_in_associationDefinition1385); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "associationDefinition"



    // $ANTLR start "associationEnd"
    // USE.g:346:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;


        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as =null;

        ASTMultiplicity m =null;

        ASTElemVarsDeclaration parameter =null;

        USEParser.expression_return exp =null;

        List<ASTVariableDeclaration> qualifiers =null;


        try {
            // USE.g:347:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // USE.g:348:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd1410);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1418); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd1420); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd1424);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd1426); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // USE.g:350:5: ( keyRole rn= IDENT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==IDENT) ) {
                    int LA37_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt37=1;
                    }
                }
            }
            switch (alt37) {
                case 1 :
                    // USE.g:350:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd1437);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1441); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // USE.g:351:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop40:
            do {
                int alt40=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA40_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt40=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                        alt40=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt40=6;
                    }


                    }
                    break;
                case 96:
                    {
                    alt40=1;
                    }
                    break;
                case 105:
                    {
                    alt40=2;
                    }
                    break;
                case 100:
                    {
                    alt40=4;
                    }
                    break;

                }

                switch (alt40) {
            	case 1 :
            	    // USE.g:352:9: 'ordered'
            	    {
            	    match(input,96,FOLLOW_96_in_associationEnd1462); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // USE.g:353:9: 'subsets' sr= IDENT
            	    {
            	    match(input,105,FOLLOW_105_in_associationEnd1474); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1478); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // USE.g:354:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd1490);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // USE.g:355:9: 'redefines' rd= IDENT
            	    {
            	    match(input,100,FOLLOW_100_in_associationEnd1502); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd1506); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // USE.g:356:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // USE.g:356:9: ( keyDerived | keyDerive )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==IDENT) ) {
            	        int LA38_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt38=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt38=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 38, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // USE.g:356:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd1519);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:356:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd1521);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // USE.g:356:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==LPAREN) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // USE.g:356:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd1526); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd1532);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd1534); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd1538); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd1542);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // USE.g:357:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd1554);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd1560);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            // USE.g:359:5: ( SEMI )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==SEMI) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // USE.g:359:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd1577); if (state.failed) return n;

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "associationEnd"



    // $ANTLR start "multiplicity"
    // USE.g:373:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // USE.g:374:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // USE.g:375:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity1612);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // USE.g:380:5: ( COMMA mr= multiplicityRange )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // USE.g:380:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity1622); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity1626);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "multiplicity"



    // $ANTLR start "multiplicityRange"
    // USE.g:383:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // USE.g:384:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // USE.g:385:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1655);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // USE.g:386:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==DOTDOT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // USE.g:386:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange1665); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange1669);
                    ms2=multiplicitySpec();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setHigh(ms2); }

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "multiplicityRange"



    // $ANTLR start "multiplicitySpec"
    // USE.g:389:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // USE.g:391:7: (i= INT | STAR )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==INT) ) {
                alt44=1;
            }
            else if ( (LA44_0==STAR) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }
            switch (alt44) {
                case 1 :
                    // USE.g:392:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec1703); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // USE.g:393:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec1713); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = -1; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return m;
    }
    // $ANTLR end "multiplicitySpec"



    // $ANTLR start "invariant"
    // USE.g:414:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:415:5: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // USE.g:416:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition(); }

            match(input,61,FOLLOW_61_in_invariant1754); if (state.failed) return n;

            // USE.g:418:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==COLON||LA46_1==COMMA) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // USE.g:418:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant1764); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // USE.g:419:8: ( ',' v= IDENT )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==COMMA) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // USE.g:419:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant1777); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant1781); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant1789); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant1801);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // USE.g:421:5: (inv= invariantClause )*
            loop47:
            do {
                int alt47=2;
                alt47 = dfa47.predict(input);
                switch (alt47) {
            	case 1 :
            	    // USE.g:421:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant1813);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "invariant"



    // $ANTLR start "invariantClause"
    // USE.g:428:1: invariantClause returns [ASTInvariantClause n] : (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:429:2: (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==AT||LA50_0==IDENT||LA50_0==51||(LA50_0 >= 54 && LA50_0 <= 55)||LA50_0==71||LA50_0==81||LA50_0==84||(LA50_0 >= 97 && LA50_0 <= 98)) ) {
                alt50=1;
            }
            else if ( (LA50_0==72) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // USE.g:430:2: as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    pushFollow(FOLLOW_annotationSet_in_invariantClause1843);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,81,FOLLOW_81_in_invariantClause1851); if (state.failed) return n;

                    // USE.g:431:13: (name= IDENT )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==IDENT) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // USE.g:431:15: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause1857); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause1862); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause1866);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // USE.g:433:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,72,FOLLOW_72_in_invariantClause1883); if (state.failed) return n;

                    match(input,81,FOLLOW_81_in_invariantClause1885); if (state.failed) return n;

                    // USE.g:433:27: (name= IDENT )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==IDENT) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // USE.g:433:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause1891); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause1896); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause1900);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTExistentialInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "invariantClause"



    // $ANTLR start "prePost"
    // USE.g:445:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // USE.g:446:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // USE.g:447:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,61,FOLLOW_61_in_prePost1933); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost1937); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost1939); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost1943); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost1947);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // USE.g:447:69: ( COLON rt= type )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COLON) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // USE.g:447:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost1951); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost1955);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // USE.g:449:5: (ppc= prePostClause )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // USE.g:449:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost1974);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "prePost"



    // $ANTLR start "prePostClause"
    // USE.g:456:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        USEParser.expression_return e =null;


         Token t = null; 
        try {
            // USE.g:458:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // USE.g:459:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause2008);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 97 && input.LA(1) <= 98) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // USE.g:461:25: (name= IDENT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==IDENT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // USE.g:461:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause2035); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause2040); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause2044);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTPrePostClause(t, name, (e!=null?e.n:null)); n.setAnnotations(as); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "prePostClause"



    // $ANTLR start "annotationSet"
    // USE.g:465:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // USE.g:467:2: ( (an= annotation )* )
            // USE.g:468:2: (an= annotation )*
            {
            // USE.g:468:2: (an= annotation )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==AT) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // USE.g:468:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet2071);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return annotations;
    }
    // $ANTLR end "annotationSet"



    // $ANTLR start "annotation"
    // USE.g:471:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // USE.g:471:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // USE.g:472:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation2090); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation2094); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation2100); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation2109);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation2114); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "annotationValues"
    // USE.g:478:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        USEParser.annotationValue_return firstVal =null;

        USEParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // USE.g:480:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // USE.g:481:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // USE.g:481:2: (firstVal= annotationValue )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENT) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // USE.g:481:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues2137);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // USE.g:482:2: ( COMMA val= annotationValue )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMA) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // USE.g:482:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues2145); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues2149);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return values;
    }
    // $ANTLR end "annotationValues"


    public static class annotationValue_return extends ParserRuleReturnScope {
        public Token name;
        public Token value;
    };


    // $ANTLR start "annotationValue"
    // USE.g:485:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final USEParser.annotationValue_return annotationValue() throws RecognitionException {
        USEParser.annotationValue_return retval = new USEParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // USE.g:485:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // USE.g:486:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue2168); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue2173); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue2179); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.value = aValue; }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "annotationValue"



    // $ANTLR start "stateMachine"
    // USE.g:491:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // USE.g:492:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // USE.g:493:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // USE.g:493:5: ( 'psm' )
            // USE.g:494:8: 'psm'
            {
            match(input,99,FOLLOW_99_in_stateMachine2209); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine2242); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,104,FOLLOW_104_in_stateMachine2255); if (state.failed) return n;

            // USE.g:501:10: (s= stateDefinition )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==IDENT) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // USE.g:501:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine2271);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            match(input,107,FOLLOW_107_in_stateMachine2281); if (state.failed) return n;

            // USE.g:503:10: (t= transitionDefinition )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==IDENT) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // USE.g:503:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine2297);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);


            match(input,69,FOLLOW_69_in_stateMachine2307); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "stateMachine"



    // $ANTLR start "stateDefinition"
    // USE.g:507:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        USEParser.expression_return stateInv =null;


        try {
            // USE.g:507:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // USE.g:508:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2323); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // USE.g:509:3: ( COLON stateType= IDENT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==COLON) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // USE.g:509:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition2331); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition2335); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // USE.g:510:3: ( LBRACK stateInv= expression RBRACK )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==LBRACK) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // USE.g:510:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition2346); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition2352);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition2354); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setStateInvariant((stateInv!=null?stateInv.n:null)); }

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "stateDefinition"



    // $ANTLR start "transitionDefinition"
    // USE.g:513:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
    public final ASTTransitionDefinition transitionDefinition() throws RecognitionException {
        ASTTransitionDefinition n = null;


        Token source=null;
        Token target=null;
        Token o=null;
        USEParser.expression_return pre =null;

        Token e =null;

        List<ASTVariableDeclaration> args =null;

        USEParser.expression_return post =null;


        try {
            // USE.g:513:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // USE.g:514:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2375); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition2377); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2381); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // USE.g:515:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LBRACE) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // USE.g:515:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition2391); if (state.failed) return n;

                    // USE.g:516:7: ( LBRACK pre= expression RBRACK )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==LBRACK) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // USE.g:516:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2401); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2405);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2409); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:517:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==62) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==IDENT) ) {
                        alt63=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;

                    }
                    switch (alt63) {
                        case 1 :
                            // USE.g:518:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition2433);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // USE.g:519:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition2449); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition2453); if (state.failed) return n;

                            // USE.g:519:50: (args= paramList )?
                            int alt62=2;
                            int LA62_0 = input.LA(1);

                            if ( (LA62_0==LPAREN) ) {
                                alt62=1;
                            }
                            switch (alt62) {
                                case 1 :
                                    // USE.g:519:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition2458);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition2465); if (state.failed) return n;

                            }
                            break;

                    }


                    // USE.g:521:7: ( LBRACK post= expression RBRACK )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==LBRACK) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // USE.g:521:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition2482); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition2486);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition2490); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition2498); if (state.failed) return n;

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "transitionDefinition"



    // $ANTLR start "event"
    // USE.g:525:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // USE.g:525:24: (tcr= 'create' )
            // USE.g:526:5: tcr= 'create'
            {
            tcr=(Token)match(input,62,FOLLOW_62_in_event2520); if (state.failed) return t;

            if ( state.backtracking==0 ) {t = tcr;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "event"



    // $ANTLR start "signalDefinition"
    // USE.g:529:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // USE.g:529:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // USE.g:530:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition2540);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition2544); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // USE.g:532:5: ( LESS idListRes= idList )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==LESS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // USE.g:532:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition2559); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition2563);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // USE.g:533:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==56) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // USE.g:533:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,56,FOLLOW_56_in_signalDefinition2576); if (state.failed) return n;

                    // USE.g:534:7: (a= attributeDefinition )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==AT||LA67_0==IDENT||LA67_0==51||(LA67_0 >= 54 && LA67_0 <= 55)||LA67_0==71||LA67_0==81||LA67_0==84||(LA67_0 >= 97 && LA67_0 <= 98)) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // USE.g:534:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition2589);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }


            // USE.g:536:5: ( 'constraints' (inv= invariantClause )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==60) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // USE.g:536:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,60,FOLLOW_60_in_signalDefinition2610); if (state.failed) return n;

                    // USE.g:537:7: (inv= invariantClause )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==AT||LA69_0==IDENT||LA69_0==51||(LA69_0 >= 54 && LA69_0 <= 55)||(LA69_0 >= 71 && LA69_0 <= 72)||LA69_0==81||LA69_0==84||(LA69_0 >= 97 && LA69_0 <= 98)) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // USE.g:538:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition2630);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,69,FOLLOW_69_in_signalDefinition2654); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "signalDefinition"



    // $ANTLR start "keyUnion"
    // USE.g:544:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // USE.g:544:9: ({...}? IDENT )
            // USE.g:545:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion2672); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyUnion"



    // $ANTLR start "keyAssociation"
    // USE.g:547:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // USE.g:547:15: ({...}? IDENT )
            // USE.g:548:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation2686); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyAssociation"



    // $ANTLR start "keyRole"
    // USE.g:550:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // USE.g:550:8: ({...}? IDENT )
            // USE.g:551:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole2700); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyRole"



    // $ANTLR start "keyComposition"
    // USE.g:553:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // USE.g:553:15: ({...}? IDENT )
            // USE.g:554:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition2712); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyComposition"



    // $ANTLR start "keyAggregation"
    // USE.g:556:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // USE.g:556:15: ({...}? IDENT )
            // USE.g:557:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation2724); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyAggregation"



    // $ANTLR start "keyClass"
    // USE.g:559:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // USE.g:559:9: ({...}? IDENT )
            // USE.g:560:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass2738); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyClass"



    // $ANTLR start "keySignal"
    // USE.g:562:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // USE.g:562:10: ({...}? IDENT )
            // USE.g:563:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal2750); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keySignal"



    // $ANTLR start "keyDerived"
    // USE.g:565:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // USE.g:565:11: ({...}? IDENT )
            // USE.g:566:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived2764); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyDerived"



    // $ANTLR start "keyDerive"
    // USE.g:568:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // USE.g:568:10: ({...}? IDENT )
            // USE.g:569:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive2778); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyDerive"



    // $ANTLR start "keyInit"
    // USE.g:571:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // USE.g:571:8: ({...}? IDENT )
            // USE.g:572:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit2790); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyInit"



    // $ANTLR start "keyQualifier"
    // USE.g:574:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // USE.g:574:13: ({...}? IDENT )
            // USE.g:575:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier2806); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "keyQualifier"



    // $ANTLR start "expressionOnly"
    // USE.g:603:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return nExp =null;


        try {
            // USE.g:604:5: (nExp= expression EOF )
            // USE.g:605:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly2833);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly2835); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = (nExp!=null?nExp.n:null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "expressionOnly"


    public static class expression_return extends ParserRuleReturnScope {
        public ASTExpression n;
    };


    // $ANTLR start "expression"
    // USE.g:612:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final USEParser.expression_return expression() throws RecognitionException {
        USEParser.expression_return retval = new USEParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // USE.g:618:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // USE.g:619:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // USE.g:620:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==83) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // USE.g:621:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,83,FOLLOW_83_in_expression2883); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2894); if (state.failed) return retval;

            	    // USE.g:622:18: ( COLON t= type )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==COLON) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // USE.g:622:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression2898); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression2902);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2907); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression2911);
            	    e1=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	             if ( firstLet == null ) 
            	                 firstLet = nextLet;
            	             if ( prevLet != null ) 
            	                 prevLet.setInExpr(nextLet);
            	             prevLet = nextLet;
            	          }

            	    // USE.g:632:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==COMMA) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // USE.g:633:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression2949); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression2961); if (state.failed) return retval;

            	    	    // USE.g:634:20: ( COLON t= type )?
            	    	    int alt72=2;
            	    	    int LA72_0 = input.LA(1);

            	    	    if ( (LA72_0==COLON) ) {
            	    	        alt72=1;
            	    	    }
            	    	    switch (alt72) {
            	    	        case 1 :
            	    	            // USE.g:634:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression2965); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression2969);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression2974); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression2978);
            	    	    e1=expression();

            	    	    state._fsp--;
            	    	    if (state.failed) return retval;

            	    	    if ( state.backtracking==0 ) { ASTLetExpression nextLet = new ASTLetExpression(name, t, (e1!=null?e1.n:null));
            	    	               if ( firstLet == null ) 
            	    	                   firstLet = nextLet;
            	    	               if ( prevLet != null ) 
            	    	                   prevLet.setInExpr(nextLet);
            	    	               prevLet = nextLet;
            	    	            }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop73;
            	        }
            	    } while (true);


            	    match(input,78,FOLLOW_78_in_expression3019); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression3035);
            nCndImplies=conditionalImpliesExpression();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { if ( nCndImplies != null ) {
                	 retval.n = nCndImplies;
                     retval.n.setStartToken(tok);
                  }
                  
                  if ( prevLet != null ) { 
                     prevLet.setInExpr(retval.n);
                     retval.n = firstLet;
                     retval.n.setStartToken(tok);
                  }
                }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"



    // $ANTLR start "paramList"
    // USE.g:666:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // USE.g:668:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // USE.g:669:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList3068); if (state.failed) return paramList;

            // USE.g:670:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==IDENT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // USE.g:671:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList3085);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // USE.g:672:7: ( COMMA v= variableDeclaration )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==COMMA) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // USE.g:672:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList3097); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList3101);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList3121); if (state.failed) return paramList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return paramList;
    }
    // $ANTLR end "paramList"



    // $ANTLR start "idList"
    // USE.g:680:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // USE.g:682:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // USE.g:683:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3150); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // USE.g:684:5: ( COMMA idn= IDENT )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==COMMA) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // USE.g:684:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList3160); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList3164); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return idList;
    }
    // $ANTLR end "idList"



    // $ANTLR start "variableDeclaration"
    // USE.g:692:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:693:5: (name= IDENT COLON t= type )
            // USE.g:694:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration3195); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration3197); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration3201);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableDeclaration(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableDeclaration"



    // $ANTLR start "conditionalImpliesExpression"
    // USE.g:702:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:703:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // USE.g:704:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3237);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // USE.g:705:5: (op= 'implies' n1= conditionalOrExpression )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==77) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // USE.g:705:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,77,FOLLOW_77_in_conditionalImpliesExpression3250); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3254);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalImpliesExpression"



    // $ANTLR start "conditionalOrExpression"
    // USE.g:714:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:715:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // USE.g:716:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3299);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // USE.g:717:5: (op= 'or' n1= conditionalXOrExpression )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==95) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // USE.g:717:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,95,FOLLOW_95_in_conditionalOrExpression3312); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3316);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalOrExpression"



    // $ANTLR start "conditionalXOrExpression"
    // USE.g:726:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:727:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // USE.g:728:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3360);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // USE.g:729:5: (op= 'xor' n1= conditionalAndExpression )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==110) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // USE.g:729:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,110,FOLLOW_110_in_conditionalXOrExpression3373); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3377);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalXOrExpression"



    // $ANTLR start "conditionalAndExpression"
    // USE.g:738:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // USE.g:739:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // USE.g:740:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3421);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // USE.g:741:5: (op= 'and' n1= equalityExpression )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==53) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // USE.g:741:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,53,FOLLOW_53_in_conditionalAndExpression3434); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression3438);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "conditionalAndExpression"



    // $ANTLR start "equalityExpression"
    // USE.g:750:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:752:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // USE.g:753:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression3486);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // USE.g:754:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==EQUAL||LA82_0==NOT_EQUAL) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // USE.g:754:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==EQUAL||input.LA(1)==NOT_EQUAL ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression3515);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "relationalExpression"
    // USE.g:764:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:766:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // USE.g:767:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression3564);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // USE.g:768:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( ((LA83_0 >= GREATER && LA83_0 <= GREATER_EQUAL)||(LA83_0 >= LESS && LA83_0 <= LESS_EQUAL)) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // USE.g:768:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( (input.LA(1) >= GREATER && input.LA(1) <= GREATER_EQUAL)||(input.LA(1) >= LESS && input.LA(1) <= LESS_EQUAL) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression3600);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "relationalExpression"



    // $ANTLR start "additiveExpression"
    // USE.g:778:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:780:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // USE.g:781:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3650);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // USE.g:782:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==MINUS||LA84_0==PLUS) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // USE.g:782:7: ( PLUS | MINUS ) n1= multiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression3678);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "multiplicativeExpression"
    // USE.g:793:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // USE.g:795:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // USE.g:796:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3728);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // USE.g:797:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==SLASH||LA85_0==STAR||LA85_0==66) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // USE.g:797:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==66 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression3760);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "unaryExpression"
    // USE.g:809:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // USE.g:811:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==MINUS||LA86_0==PLUS||LA86_0==86) ) {
                alt86=1;
            }
            else if ( (LA86_0==AT||LA86_0==HASH||(LA86_0 >= IDENT && LA86_0 <= INT)||LA86_0==LPAREN||LA86_0==REAL||(LA86_0 >= STAR && LA86_0 <= STRING)||(LA86_0 >= 44 && LA86_0 <= 50)||LA86_0==73||LA86_0==76||LA86_0==82||(LA86_0 >= 87 && LA86_0 <= 93)||(LA86_0 >= 101 && LA86_0 <= 102)||LA86_0==108) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;

            }
            switch (alt86) {
                case 1 :
                    // USE.g:812:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // USE.g:812:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // USE.g:812:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==86 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression3846);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // USE.g:816:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression3866);
                    nPosExp=postfixExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPosExp; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "unaryExpression"



    // $ANTLR start "postfixExpression"
    // USE.g:824:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // USE.g:826:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // USE.g:827:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression3899);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // USE.g:828:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==DOT) ) {
                    int LA88_2 = input.LA(2);

                    if ( (LA88_2==IDENT) ) {
                        int LA88_4 = input.LA(3);

                        if ( (LA88_4==EOF||(LA88_4 >= ARROW && LA88_4 <= BAR)||(LA88_4 >= COMMA && LA88_4 <= EQUAL)||(LA88_4 >= GREATER && LA88_4 <= GREATER_EQUAL)||LA88_4==IDENT||(LA88_4 >= LBRACE && LA88_4 <= MINUS)||(LA88_4 >= NOT_EQUAL && LA88_4 <= PLUS)||(LA88_4 >= RBRACE && LA88_4 <= RBRACK)||(LA88_4 >= RPAREN && LA88_4 <= SLASH)||LA88_4==STAR||LA88_4==51||(LA88_4 >= 53 && LA88_4 <= 56)||(LA88_4 >= 60 && LA88_4 <= 61)||(LA88_4 >= 66 && LA88_4 <= 72)||(LA88_4 >= 77 && LA88_4 <= 78)||LA88_4==81||(LA88_4 >= 94 && LA88_4 <= 98)||LA88_4==100||LA88_4==103||(LA88_4 >= 105 && LA88_4 <= 106)||LA88_4==110) ) {
                            alt88=1;
                        }


                    }
                    else if ( (LA88_2==82||LA88_2==88||(LA88_2 >= 90 && LA88_2 <= 92)||(LA88_2 >= 101 && LA88_2 <= 102)) ) {
                        alt88=1;
                    }


                }
                else if ( (LA88_0==ARROW) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // USE.g:829:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // USE.g:829:6: ( ARROW | DOT )
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==ARROW) ) {
            	        alt87=1;
            	    }
            	    else if ( (LA87_0==DOT) ) {
            	        alt87=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 87, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // USE.g:829:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression3917); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // USE.g:829:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression3923); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression3934);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "postfixExpression"



    // $ANTLR start "primaryExpression"
    // USE.g:845:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        Token id2=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        USEParser.expression_return nExp =null;

        ASTExpression nIfExp =null;

        USEParser.expression_return idExp =null;


        try {
            // USE.g:846:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt92=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 73:
            case 87:
            case 89:
            case 93:
            case 108:
                {
                alt92=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt92=1;
                    }
                    break;
                case EOF:
                case ARROW:
                case AT:
                case BAR:
                case COMMA:
                case DOTDOT:
                case EQUAL:
                case GREATER:
                case GREATER_EQUAL:
                case IDENT:
                case LBRACE:
                case LBRACK:
                case LESS:
                case LESS_EQUAL:
                case LPAREN:
                case MINUS:
                case NOT_EQUAL:
                case PLUS:
                case RBRACE:
                case RBRACK:
                case RPAREN:
                case SEMI:
                case SLASH:
                case STAR:
                case 51:
                case 53:
                case 54:
                case 55:
                case 56:
                case 60:
                case 61:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 77:
                case 78:
                case 81:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 100:
                case 103:
                case 105:
                case 106:
                case 110:
                    {
                    alt92=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 52:
                        {
                        alt92=6;
                        }
                        break;
                    case 59:
                        {
                        alt92=7;
                        }
                        break;
                    case IDENT:
                    case 82:
                    case 88:
                    case 90:
                    case 91:
                    case 92:
                    case 101:
                    case 102:
                        {
                        alt92=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt92=2;
                }
                break;
            case 82:
            case 88:
            case 90:
            case 91:
            case 92:
            case 101:
            case 102:
                {
                alt92=3;
                }
                break;
            case LPAREN:
                {
                alt92=4;
                }
                break;
            case 76:
                {
                alt92=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;

            }

            switch (alt92) {
                case 1 :
                    // USE.g:847:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3974);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // USE.g:848:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression3988);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // USE.g:849:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression4000);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // USE.g:850:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4011); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression4015);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4017); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:851:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression4029);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // USE.g:852:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4041); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4043); if (state.failed) return n;

                    match(input,52,FOLLOW_52_in_primaryExpression4045); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // USE.g:854:9: ( AT 'pre' )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==AT) ) {
                        int LA89_1 = input.LA(2);

                        if ( (LA89_1==98) ) {
                            alt89=1;
                        }
                    }
                    switch (alt89) {
                        case 1 :
                            // USE.g:854:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4068); if (state.failed) return n;

                            match(input,98,FOLLOW_98_in_primaryExpression4070); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // USE.g:855:9: ( LPAREN RPAREN )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==LPAREN) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // USE.g:855:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4088); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4090); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // USE.g:856:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4103); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression4105); if (state.failed) return n;

                    match(input,59,FOLLOW_59_in_primaryExpression4107); if (state.failed) return n;

                    // USE.g:856:31: ( LPAREN idExp= expression RPAREN )
                    // USE.g:856:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression4111); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression4115);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression4117); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // USE.g:858:7: ( AT 'pre' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==AT) ) {
                        int LA91_1 = input.LA(2);

                        if ( (LA91_1==98) ) {
                            alt91=1;
                        }
                    }
                    switch (alt91) {
                        case 1 :
                            // USE.g:858:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression4137); if (state.failed) return n;

                            match(input,98,FOLLOW_98_in_primaryExpression4139); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "primaryExpression"



    // $ANTLR start "objectReference"
    // USE.g:862:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // USE.g:863:3: ( AT objectName= IDENT )
            // USE.g:864:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference4165); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference4173); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTObjectReferenceExpression(objectName); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "objectReference"



    // $ANTLR start "propertyCall"
    // USE.g:878:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        USEParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // USE.g:879:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt93=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA93_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt93=1;
                }
                else if ( (true) ) {
                    alt93=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 93, 1, input);

                    throw nvae;

                }
                }
                break;
            case 82:
                {
                alt93=2;
                }
                break;
            case 88:
            case 91:
            case 92:
            case 101:
            case 102:
                {
                alt93=4;
                }
                break;
            case 90:
                {
                alt93=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;

            }

            switch (alt93) {
                case 1 :
                    // USE.g:883:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall4238);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // USE.g:886:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall4251);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // USE.g:887:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall4264);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // USE.g:888:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall4277);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // USE.g:889:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall4290);
                    nExpInState=inStateExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpInState; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "propertyCall"



    // $ANTLR start "queryExpression"
    // USE.g:898:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        USEParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // USE.g:899:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // USE.g:900:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression4325); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression4332); if (state.failed) return n;

            // USE.g:902:5: (decls= elemVarsDeclaration BAR )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==IDENT) ) {
                int LA94_1 = input.LA(2);

                if ( ((LA94_1 >= BAR && LA94_1 <= COLON)||LA94_1==COMMA) ) {
                    alt94=1;
                }
            }
            switch (alt94) {
                case 1 :
                    // USE.g:902:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression4343);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression4347); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression4358);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression4364); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTQueryExpression(op, range, decl, (nExp!=null?nExp.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "queryExpression"



    // $ANTLR start "iterateExpression"
    // USE.g:916:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        USEParser.expression_return nExp =null;


        try {
            // USE.g:916:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // USE.g:917:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,82,FOLLOW_82_in_iterateExpression4396); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression4402); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression4410);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression4412); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression4420);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression4422); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression4430);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression4436); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIterateExpression(i, range, decls, init, (nExp!=null?nExp.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "iterateExpression"


    public static class operationExpression_return extends ParserRuleReturnScope {
        public ASTOperationExpression n;
    };


    // $ANTLR start "operationExpression"
    // USE.g:938:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final USEParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        USEParser.operationExpression_return retval = new USEParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        USEParser.expression_return rolename =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:940:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // USE.g:941:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression4480); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // USE.g:947:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==LBRACK) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // USE.g:947:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4502); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression4515);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // USE.g:949:9: ( COMMA rolename= expression )*
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==COMMA) ) {
                            alt95=1;
                        }


                        switch (alt95) {
                    	case 1 :
                    	    // USE.g:949:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4528); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression4532);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop95;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4544); if (state.failed) return retval;

                    // USE.g:952:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==LBRACK) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // USE.g:952:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression4561); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression4576);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // USE.g:954:11: ( COMMA rolename= expression )*
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( (LA96_0==COMMA) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // USE.g:954:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4591); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4595);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop96;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression4609); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // USE.g:959:5: ( AT 'pre' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==AT) ) {
                int LA99_1 = input.LA(2);

                if ( (LA99_1==98) ) {
                    alt99=1;
                }
            }
            switch (alt99) {
                case 1 :
                    // USE.g:959:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression4634); if (state.failed) return retval;

                    match(input,98,FOLLOW_98_in_operationExpression4636); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // USE.g:961:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==LPAREN) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // USE.g:962:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression4661); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // USE.g:963:7: (e= expression ( COMMA e= expression )* )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==AT||LA101_0==HASH||(LA101_0 >= IDENT && LA101_0 <= INT)||(LA101_0 >= LPAREN && LA101_0 <= MINUS)||LA101_0==PLUS||LA101_0==REAL||(LA101_0 >= STAR && LA101_0 <= STRING)||(LA101_0 >= 44 && LA101_0 <= 50)||LA101_0==73||LA101_0==76||(LA101_0 >= 82 && LA101_0 <= 83)||(LA101_0 >= 86 && LA101_0 <= 93)||(LA101_0 >= 101 && LA101_0 <= 102)||LA101_0==108) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // USE.g:964:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression4682);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // USE.g:965:7: ( COMMA e= expression )*
                            loop100:
                            do {
                                int alt100=2;
                                int LA100_0 = input.LA(1);

                                if ( (LA100_0==COMMA) ) {
                                    alt100=1;
                                }


                                switch (alt100) {
                            	case 1 :
                            	    // USE.g:965:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression4694); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression4698);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop100;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression4718); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { retval.n.setStartToken(((Token)retval.start)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operationExpression"



    // $ANTLR start "inStateExpression"
    // USE.g:972:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // USE.g:973:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // USE.g:974:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,90,FOLLOW_90_in_inStateExpression4755); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression4760); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression4769); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression4774); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTInStateExpression(opToken, source, s, followsArrow); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "inStateExpression"



    // $ANTLR start "typeExpression"
    // USE.g:986:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // USE.g:989:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // USE.g:990:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==88||(input.LA(1) >= 91 && input.LA(1) <= 92)||(input.LA(1) >= 101 && input.LA(1) <= 102) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression4834); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression4838);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression4840); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTypeArgExpression(opToken, source, t, followsArrow); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeExpression"



    // $ANTLR start "elemVarsDeclaration"
    // USE.g:1001:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // USE.g:1002:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // USE.g:1003:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration4878); if (state.failed) return n;

            // USE.g:1004:17: ( COLON t= type )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==COLON) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // USE.g:1004:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration4881); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration4885);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // USE.g:1005:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==COMMA) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // USE.g:1005:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration4895); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration4901); if (state.failed) return n;

            	    // USE.g:1005:24: ( COLON tN= type )?
            	    int alt104=2;
            	    int LA104_0 = input.LA(1);

            	    if ( (LA104_0==COLON) ) {
            	        alt104=1;
            	    }
            	    switch (alt104) {
            	        case 1 :
            	            // USE.g:1005:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration4904); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration4910);
            	            tN=type();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {n.addDeclaration(varN, tN); }

            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "elemVarsDeclaration"



    // $ANTLR start "variableInitialization"
    // USE.g:1013:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1014:5: (name= IDENT COLON t= type EQUAL e= expression )
            // USE.g:1015:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization4938); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization4940); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization4944);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization4946); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization4950);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTVariableInitialization(name, t, (e!=null?e.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "variableInitialization"



    // $ANTLR start "ifExpression"
    // USE.g:1024:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        USEParser.expression_return cond =null;

        USEParser.expression_return t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1025:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // USE.g:1026:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,76,FOLLOW_76_in_ifExpression4982); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4986);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,106,FOLLOW_106_in_ifExpression4988); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4992);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,68,FOLLOW_68_in_ifExpression4994); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression4998);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,70,FOLLOW_70_in_ifExpression5000); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTIfExpression(i, (cond!=null?cond.n:null), (t!=null?t.n:null), (e!=null?e.n:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "ifExpression"



    // $ANTLR start "literal"
    // USE.g:1045:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
    public final ASTExpression literal() throws RecognitionException {
        ASTExpression n = null;


        Token t=null;
        Token f=null;
        Token i=null;
        Token r=null;
        Token s=null;
        Token enumLit=null;
        Token enumName=null;
        Token un=null;
        ASTCollectionLiteral nColIt =null;

        ASTEmptyCollectionLiteral nEColIt =null;

        ASTUndefinedLiteral nUndLit =null;

        ASTTupleLiteral nTupleLit =null;


        try {
            // USE.g:1046:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt106=12;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt106=1;
                }
                break;
            case 73:
                {
                alt106=2;
                }
                break;
            case INT:
                {
                alt106=3;
                }
                break;
            case REAL:
                {
                alt106=4;
                }
                break;
            case STRING:
                {
                alt106=5;
                }
                break;
            case HASH:
                {
                alt106=6;
                }
                break;
            case IDENT:
                {
                alt106=7;
                }
                break;
            case 44:
            case 46:
            case 47:
            case 48:
                {
                int LA106_8 = input.LA(2);

                if ( (LA106_8==LPAREN) ) {
                    alt106=9;
                }
                else if ( (LA106_8==LBRACE) ) {
                    alt106=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 8, input);

                    throw nvae;

                }
                }
                break;
            case 45:
            case 89:
                {
                alt106=9;
                }
                break;
            case 50:
            case 87:
            case 93:
                {
                alt106=10;
                }
                break;
            case 49:
                {
                alt106=11;
                }
                break;
            case STAR:
                {
                alt106=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;

            }

            switch (alt106) {
                case 1 :
                    // USE.g:1047:7: t= 'true'
                    {
                    t=(Token)match(input,108,FOLLOW_108_in_literal5039); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // USE.g:1048:7: f= 'false'
                    {
                    f=(Token)match(input,73,FOLLOW_73_in_literal5053); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // USE.g:1049:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal5066); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // USE.g:1050:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal5081); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // USE.g:1051:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal5095); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // USE.g:1052:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal5105); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5109); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // USE.g:1053:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5121); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal5123); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal5127); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // USE.g:1054:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal5139);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // USE.g:1055:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal5151);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // USE.g:1056:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal5163);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // USE.g:1057:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal5175);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // USE.g:1058:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal5187); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnlimitedNaturalLiteral(un); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "literal"



    // $ANTLR start "collectionLiteral"
    // USE.g:1066:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // USE.g:1068:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // USE.g:1069:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==44||(input.LA(1) >= 46 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) { n = new ASTCollectionLiteral(op); }

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral5254); if (state.failed) return n;

            // USE.g:1073:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==AT||LA108_0==HASH||(LA108_0 >= IDENT && LA108_0 <= INT)||(LA108_0 >= LPAREN && LA108_0 <= MINUS)||LA108_0==PLUS||LA108_0==REAL||(LA108_0 >= STAR && LA108_0 <= STRING)||(LA108_0 >= 44 && LA108_0 <= 50)||LA108_0==73||LA108_0==76||(LA108_0 >= 82 && LA108_0 <= 83)||(LA108_0 >= 86 && LA108_0 <= 93)||(LA108_0 >= 101 && LA108_0 <= 102)||LA108_0==108) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // USE.g:1074:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5271);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // USE.g:1075:7: ( COMMA ci= collectionItem )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==COMMA) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // USE.g:1075:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral5284); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral5288);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral5307); if (state.failed) return n;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionLiteral"



    // $ANTLR start "collectionItem"
    // USE.g:1084:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        USEParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // USE.g:1086:5: (e= expression ( DOTDOT e= expression )? )
            // USE.g:1087:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem5336);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // USE.g:1088:5: ( DOTDOT e= expression )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==DOTDOT) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // USE.g:1088:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem5347); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem5351);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setSecond((e!=null?e.n:null)); }

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionItem"



    // $ANTLR start "emptyCollectionLiteral"
    // USE.g:1098:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // USE.g:1099:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==89) ) {
                alt110=1;
            }
            else if ( ((LA110_0 >= 44 && LA110_0 <= 48)) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }
            switch (alt110) {
                case 1 :
                    // USE.g:1100:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,89,FOLLOW_89_in_emptyCollectionLiteral5380); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral5382); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5386);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral5388); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1103:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral5404);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral5406); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral5408); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyCollectionLiteral"



    // $ANTLR start "undefinedLiteral"
    // USE.g:1114:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // USE.g:1115:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt111=4;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt111=1;
                }
                break;
            case 50:
                {
                alt111=2;
                }
                break;
            case 87:
                {
                int LA111_3 = input.LA(2);

                if ( (LA111_3==LPAREN) ) {
                    alt111=3;
                }
                else if ( (LA111_3==EOF||(LA111_3 >= ARROW && LA111_3 <= BAR)||(LA111_3 >= COMMA && LA111_3 <= EQUAL)||(LA111_3 >= GREATER && LA111_3 <= GREATER_EQUAL)||LA111_3==IDENT||LA111_3==LBRACE||(LA111_3 >= LESS && LA111_3 <= LESS_EQUAL)||LA111_3==MINUS||(LA111_3 >= NOT_EQUAL && LA111_3 <= PLUS)||(LA111_3 >= RBRACE && LA111_3 <= RBRACK)||(LA111_3 >= RPAREN && LA111_3 <= SLASH)||LA111_3==STAR||LA111_3==51||(LA111_3 >= 53 && LA111_3 <= 56)||(LA111_3 >= 60 && LA111_3 <= 61)||(LA111_3 >= 66 && LA111_3 <= 72)||(LA111_3 >= 77 && LA111_3 <= 78)||LA111_3==81||(LA111_3 >= 94 && LA111_3 <= 98)||LA111_3==100||LA111_3==103||(LA111_3 >= 105 && LA111_3 <= 106)||LA111_3==110) ) {
                    alt111=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;

            }

            switch (alt111) {
                case 1 :
                    // USE.g:1116:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,93,FOLLOW_93_in_undefinedLiteral5438); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5440); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5444);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5446); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // USE.g:1119:5: 'Undefined'
                    {
                    match(input,50,FOLLOW_50_in_undefinedLiteral5460); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // USE.g:1122:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,87,FOLLOW_87_in_undefinedLiteral5474); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral5476); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral5480);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral5482); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // USE.g:1125:5: 'null'
                    {
                    match(input,87,FOLLOW_87_in_undefinedLiteral5496); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "undefinedLiteral"



    // $ANTLR start "tupleLiteral"
    // USE.g:1135:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // USE.g:1137:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // USE.g:1138:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,49,FOLLOW_49_in_tupleLiteral5535); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral5541); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral5549);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // USE.g:1141:5: ( COMMA ti= tupleItem )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // USE.g:1141:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral5560); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral5564);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral5575); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleLiteral(tiList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleLiteral"



    // $ANTLR start "tupleItem"
    // USE.g:1149:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        USEParser.expression_return e =null;


        try {
            // USE.g:1150:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // USE.g:1151:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem5606); if (state.failed) return n;

            // USE.g:1152:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==COLON) ) {
                int LA113_1 = input.LA(2);

                if ( (synpred1_USE()) ) {
                    alt113=1;
                }
                else if ( (true) ) {
                    alt113=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 113, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA113_0==EQUAL) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;

            }
            switch (alt113) {
                case 1 :
                    // USE.g:1155:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem5645); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem5649);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem5651); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem5655);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // USE.g:1158:7: ( COLON | EQUAL ) e= expression
                    {
                    if ( input.LA(1)==COLON||input.LA(1)==EQUAL ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_expression_in_tupleItem5687);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, (e!=null?e.n:null)); }

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleItem"



    // $ANTLR start "type"
    // USE.g:1169:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // USE.g:1171:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // USE.g:1172:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // USE.g:1173:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt114=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt114=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt114=2;
                }
                break;
            case 49:
                {
                alt114=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;

            }

            switch (alt114) {
                case 1 :
                    // USE.g:1174:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type5753);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // USE.g:1175:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type5765);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // USE.g:1176:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type5777);
                    nTTuple=tupleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTTuple; if (n != null) n.setStartToken(tok); }

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "type"



    // $ANTLR start "typeOnly"
    // USE.g:1181:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // USE.g:1182:5: (nT= type EOF )
            // USE.g:1183:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly5809);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly5811); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nT; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "typeOnly"



    // $ANTLR start "simpleType"
    // USE.g:1193:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // USE.g:1194:5: (name= IDENT )
            // USE.g:1195:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType5839); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSimpleType(name); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "simpleType"



    // $ANTLR start "collectionType"
    // USE.g:1203:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // USE.g:1205:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // USE.g:1206:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( (input.LA(1) >= 44 && input.LA(1) <= 48) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType5904); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType5908);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType5910); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTCollectionType(op, elemType); n.setStartToken(op);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "collectionType"



    // $ANTLR start "tupleType"
    // USE.g:1216:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // USE.g:1218:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // USE.g:1219:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,49,FOLLOW_49_in_tupleType5944); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType5946); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType5955);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // USE.g:1221:5: ( COMMA tp= tuplePart )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==COMMA) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // USE.g:1221:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType5966); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType5970);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType5982); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTupleType(tpList); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tupleType"



    // $ANTLR start "tuplePart"
    // USE.g:1230:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // USE.g:1231:5: (name= IDENT COLON t= type )
            // USE.g:1232:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart6014); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart6016); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart6020);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTuplePart(name, t); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "tuplePart"



    // $ANTLR start "statOnly"
    // USE.g:1271:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s =null;


        try {
            // USE.g:1272:3: (s= stat EOF )
            // USE.g:1273:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly6069);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly6073); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = (s!=null?s.n:null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statOnly"


    public static class stat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "stat"
    // USE.g:1283:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final USEParser.stat_return stat() throws RecognitionException {
        USEParser.stat_return retval = new USEParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // USE.g:1287:3: (s= singleStat ( SEMI s2= singleStat )* )
            // USE.g:1288:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat6108);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // USE.g:1289:3: ( SEMI s2= singleStat )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==SEMI) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // USE.g:1290:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat6120); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat6130);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);


            if ( state.backtracking==0 ) { 
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"



    // $ANTLR start "singleStat"
    // USE.g:1302:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        USEParser.statStartingWithExpr_return sse =null;

        ASTStatement vas =null;

        USEParser.objCreateStat_return ocs =null;

        USEParser.objDestroyStat_return ods =null;

        USEParser.lnkInsStat_return lis =null;

        USEParser.lnkDelStat_return lds =null;

        USEParser.condExStat_return ces =null;

        USEParser.iterStat_return its =null;

        USEParser.whileStat_return whs =null;

        USEParser.blockStat_return blk =null;


        try {
            // USE.g:1303:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt117=11;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==EOF||LA117_0==SEMI||(LA117_0 >= 68 && LA117_0 <= 69)) ) {
                alt117=1;
            }
            else if ( (LA117_0==83) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==MINUS||LA117_0==PLUS||LA117_0==86) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==108) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==73) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==INT) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==REAL) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==STRING) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==HASH) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==IDENT) ) {
                int LA117_13 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt117=2;
                }
                else if ( (true) ) {
                    alt117=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA117_0==44||(LA117_0 >= 46 && LA117_0 <= 48)) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==89) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==45) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==93) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==50) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==87) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==49) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==STAR) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==AT) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==82) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==88||(LA117_0 >= 91 && LA117_0 <= 92)||(LA117_0 >= 101 && LA117_0 <= 102)) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==90) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==LPAREN) && (synpred2_USE())) {
                alt117=2;
            }
            else if ( (LA117_0==76) ) {
                int LA117_27 = input.LA(2);

                if ( (synpred2_USE()) ) {
                    alt117=2;
                }
                else if ( (true) ) {
                    alt117=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA117_0==85) ) {
                alt117=4;
            }
            else if ( (LA117_0==65) ) {
                alt117=5;
            }
            else if ( (LA117_0==79) ) {
                alt117=6;
            }
            else if ( (LA117_0==64) ) {
                alt117=7;
            }
            else if ( (LA117_0==74) ) {
                alt117=9;
            }
            else if ( (LA117_0==109) ) {
                alt117=10;
            }
            else if ( (LA117_0==57) ) {
                alt117=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }
            switch (alt117) {
                case 1 :
                    // USE.g:1304:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat6170);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // USE.g:1306:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat6196);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // USE.g:1307:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat6208);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // USE.g:1308:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat6222);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // USE.g:1309:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat6236);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // USE.g:1310:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat6249);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // USE.g:1311:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat6266);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // USE.g:1312:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat6283);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // USE.g:1313:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat6300);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // USE.g:1315:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat6322);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // USE.g:1316:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat6340);
                    blk=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (blk!=null?blk.n:null); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "singleStat"



    // $ANTLR start "emptyStat"
    // USE.g:1323:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // USE.g:1324:3: ( nothing )
            // USE.g:1325:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat6367);
            nothing();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTEmptyStatement(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "emptyStat"


    public static class statStartingWithExpr_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "statStartingWithExpr"
    // USE.g:1330:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final USEParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        USEParser.statStartingWithExpr_return retval = new USEParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // USE.g:1331:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // USE.g:1332:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr6393);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1333:3: (aas= attAssignStat[$expr.n] )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==DOT) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // USE.g:1334:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr6407);
                    aas=attAssignStat(expr);

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n = aas; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (aas == null) {
                  retval.n = new ASTOperationCallStatement(((Token)retval.start), expr); 
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statStartingWithExpr"



    // $ANTLR start "varAssignStat"
    // USE.g:1346:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // USE.g:1347:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // USE.g:1348:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat6445); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat6449); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat6457);
            rVal=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {
                n = new ASTVariableAssignmentStatement(varName, (varName!=null?varName.getText():null), rVal);
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "varAssignStat"



    // $ANTLR start "attAssignStat"
    // USE.g:1360:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // USE.g:1361:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // USE.g:1362:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat6481); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat6490); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat6494); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat6502);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAttributeAssignmentStatement(attName, exp, (attName!=null?attName.getText():null), r); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "attAssignStat"


    public static class objCreateStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "objCreateStat"
    // USE.g:1374:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final USEParser.objCreateStat_return objCreateStat() throws RecognitionException {
        USEParser.objCreateStat_return retval = new USEParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1375:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // USE.g:1376:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,85,FOLLOW_85_in_objCreateStat6528); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat6536);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1378:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==LPAREN) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // USE.g:1379:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6546); if (state.failed) return retval;

                    // USE.g:1380:7: (objName= inSoilExpression )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==AT||LA119_0==HASH||(LA119_0 >= IDENT && LA119_0 <= INT)||(LA119_0 >= LPAREN && LA119_0 <= MINUS)||LA119_0==PLUS||LA119_0==REAL||(LA119_0 >= STAR && LA119_0 <= STRING)||(LA119_0 >= 44 && LA119_0 <= 50)||LA119_0==73||LA119_0==76||(LA119_0 >= 82 && LA119_0 <= 83)||(LA119_0 >= 86 && LA119_0 <= 93)||(LA119_0 >= 101 && LA119_0 <= 102)||LA119_0==108) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // USE.g:1380:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat6559);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6567); if (state.failed) return retval;

                    }
                    break;

            }


            // USE.g:1384:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==58) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // USE.g:1385:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,58,FOLLOW_58_in_objCreateStat6585); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat6593); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6607);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat6615); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { 
                        retval.n = new ASTNewLinkObjectStatement(((Token)retval.start), ident, (p!=null?p.participans:null), (p!=null?p.qualifiers:null), objName);
                        }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                if (retval.n == null) {
                  retval.n = new ASTNewObjectStatement(((Token)retval.start), ident, objName);
                }
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objCreateStat"


    public static class objDestroyStat_return extends ParserRuleReturnScope {
        public ASTStatement n;
    };


    // $ANTLR start "objDestroyStat"
    // USE.g:1404:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final USEParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        USEParser.objDestroyStat_return retval = new USEParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // USE.g:1405:3: ( 'destroy' el= exprListMin1 )
            // USE.g:1406:3: 'destroy' el= exprListMin1
            {
            match(input,65,FOLLOW_65_in_objDestroyStat6651); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat6659);
            el=exprListMin1();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {
                ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));
                
                for (ASTExpression expression : el) {
                  seq.addStatement(
                    new ASTObjectDestructionStatement(((Token)retval.start), expression));
                }
                
                retval.n = seq.simplify();
              }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "objDestroyStat"


    public static class lnkInsStat_return extends ParserRuleReturnScope {
        public ASTLinkInsertionStatement n;
    };


    // $ANTLR start "lnkInsStat"
    // USE.g:1425:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final USEParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        USEParser.lnkInsStat_return retval = new USEParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1426:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // USE.g:1427:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,79,FOLLOW_79_in_lnkInsStat6685); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat6689); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat6699);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat6703); if (state.failed) return retval;

            match(input,80,FOLLOW_80_in_lnkInsStat6707); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat6715); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTLinkInsertionStatement(((Token)retval.start), (ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lnkInsStat"


    public static class rValListMin2WithOptionalQualifiers_return extends ParserRuleReturnScope {
        public List<ASTRValue> participans;
        public List<List<ASTRValue>> qualifiers;
    };


    // $ANTLR start "rValListMin2WithOptionalQualifiers"
    // USE.g:1437:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final USEParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        USEParser.rValListMin2WithOptionalQualifiers_return retval = new USEParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // USE.g:1443:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // USE.g:1444:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6744);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1445:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==LBRACE) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // USE.g:1446:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6755); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6764);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6771); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6787); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6798);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // USE.g:1458:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==LBRACE) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // USE.g:1459:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6809); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6818);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6825); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // USE.g:1468:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==COMMA) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // USE.g:1469:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6847); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6862);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // USE.g:1473:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==LBRACE) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // USE.g:1474:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6882); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6893);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6902); if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	          retval.qualifiers.add(currentQualifiers);
            	          currentQualifiers = Collections.emptyList();
            	        }

            	    }
            	    break;

            	default :
            	    break loop125;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rValListMin2WithOptionalQualifiers"


    public static class lnkDelStat_return extends ParserRuleReturnScope {
        public ASTLinkDeletionStatement n;
    };


    // $ANTLR start "lnkDelStat"
    // USE.g:1489:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final USEParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        USEParser.lnkDelStat_return retval = new USEParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        USEParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // USE.g:1490:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // USE.g:1491:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,64,FOLLOW_64_in_lnkDelStat6943); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat6947); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat6957);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat6961); if (state.failed) return retval;

            match(input,75,FOLLOW_75_in_lnkDelStat6965); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat6974); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTLinkDeletionStatement(((Token)retval.start), (ass!=null?ass.getText():null), (p!=null?p.participans:null), (p!=null?p.qualifiers:null)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lnkDelStat"


    public static class condExStat_return extends ParserRuleReturnScope {
        public ASTConditionalExecutionStatement n;
    };


    // $ANTLR start "condExStat"
    // USE.g:1505:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final USEParser.condExStat_return condExStat() throws RecognitionException {
        USEParser.condExStat_return retval = new USEParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // USE.g:1509:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // USE.g:1510:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,76,FOLLOW_76_in_condExStat7005); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat7014);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,106,FOLLOW_106_in_condExStat7018); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7027);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // USE.g:1514:3: ( 'else' es= statOrImplicitBlock )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==68) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // USE.g:1515:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,68,FOLLOW_68_in_condExStat7038); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat7050);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,69,FOLLOW_69_in_condExStat7062); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTConditionalExecutionStatement(((Token)retval.start), con, ts, elseStat); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condExStat"


    public static class iterStat_return extends ParserRuleReturnScope {
        public ASTIterationStatement n;
    };


    // $ANTLR start "iterStat"
    // USE.g:1526:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.iterStat_return iterStat() throws RecognitionException {
        USEParser.iterStat_return retval = new USEParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // USE.g:1527:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1528:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,74,FOLLOW_74_in_iterStat7087); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat7095); if (state.failed) return retval;

            match(input,78,FOLLOW_78_in_iterStat7099); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat7107);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,67,FOLLOW_67_in_iterStat7111); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat7119);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,69,FOLLOW_69_in_iterStat7124); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTIterationStatement(((Token)retval.start), (var!=null?var.getText():null), set, s); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "iterStat"


    public static class whileStat_return extends ParserRuleReturnScope {
        public ASTWhileStatement n;
    };


    // $ANTLR start "whileStat"
    // USE.g:1543:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final USEParser.whileStat_return whileStat() throws RecognitionException {
        USEParser.whileStat_return retval = new USEParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // USE.g:1544:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // USE.g:1545:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,109,FOLLOW_109_in_whileStat7150); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat7158);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,67,FOLLOW_67_in_whileStat7162); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat7170);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,69,FOLLOW_69_in_whileStat7175); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTWhileStatement(((Token)retval.start), cond, s); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStat"


    public static class blockStat_return extends ParserRuleReturnScope {
        public ASTBlockStatement n;
    };


    // $ANTLR start "blockStat"
    // USE.g:1557:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final USEParser.blockStat_return blockStat() throws RecognitionException {
        USEParser.blockStat_return retval = new USEParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // USE.g:1561:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // USE.g:1562:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,57,FOLLOW_57_in_blockStat7205); if (state.failed) return retval;

            // USE.g:1563:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==63) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // USE.g:1563:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,63,FOLLOW_63_in_blockStat7210); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat7216);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // USE.g:1563:73: ( COMMA vd1= variableDeclaration )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==COMMA) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // USE.g:1563:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat7222); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat7228);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat7235); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat7245);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,69,FOLLOW_69_in_blockStat7250); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "blockStat"


    public static class implicitBlockStat_return extends ParserRuleReturnScope {
        public ASTBlockStatement n;
    };


    // $ANTLR start "implicitBlockStat"
    // USE.g:1572:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final USEParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        USEParser.implicitBlockStat_return retval = new USEParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        USEParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // USE.g:1576:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // USE.g:1577:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,63,FOLLOW_63_in_implicitBlockStat7276); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat7282);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // USE.g:1577:72: ( COMMA vd1= variableDeclaration )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==COMMA) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // USE.g:1577:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat7288); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat7294);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat7301); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat7309);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "implicitBlockStat"



    // $ANTLR start "statOrImplicitBlock"
    // USE.g:1581:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        USEParser.stat_return s1 =null;

        USEParser.implicitBlockStat_return s2 =null;


        try {
            // USE.g:1582:3: ( (s1= stat |s2= implicitBlockStat ) )
            // USE.g:1583:3: (s1= stat |s2= implicitBlockStat )
            {
            // USE.g:1583:3: (s1= stat |s2= implicitBlockStat )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==AT||LA130_0==HASH||(LA130_0 >= IDENT && LA130_0 <= INT)||(LA130_0 >= LPAREN && LA130_0 <= MINUS)||LA130_0==PLUS||LA130_0==REAL||LA130_0==SEMI||(LA130_0 >= STAR && LA130_0 <= STRING)||(LA130_0 >= 44 && LA130_0 <= 50)||LA130_0==57||(LA130_0 >= 64 && LA130_0 <= 65)||(LA130_0 >= 68 && LA130_0 <= 69)||(LA130_0 >= 73 && LA130_0 <= 74)||LA130_0==76||LA130_0==79||(LA130_0 >= 82 && LA130_0 <= 83)||(LA130_0 >= 85 && LA130_0 <= 93)||(LA130_0 >= 101 && LA130_0 <= 102)||(LA130_0 >= 108 && LA130_0 <= 109)) ) {
                alt130=1;
            }
            else if ( (LA130_0==63) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }
            switch (alt130) {
                case 1 :
                    // USE.g:1583:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock7332);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // USE.g:1583:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock7342);
                    s2=implicitBlockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s2!=null?s2.n:null); }

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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "statOrImplicitBlock"



    // $ANTLR start "nothing"
    // USE.g:1597:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // USE.g:1598:1: ()
            // USE.g:1599:1: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "nothing"



    // $ANTLR start "rValue"
    // USE.g:1605:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        USEParser.objCreateStat_return oc =null;


        try {
            // USE.g:1606:5: (e= inSoilExpression |oc= objCreateStat )
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==AT||LA131_0==HASH||(LA131_0 >= IDENT && LA131_0 <= INT)||(LA131_0 >= LPAREN && LA131_0 <= MINUS)||LA131_0==PLUS||LA131_0==REAL||(LA131_0 >= STAR && LA131_0 <= STRING)||(LA131_0 >= 44 && LA131_0 <= 50)||LA131_0==73||LA131_0==76||(LA131_0 >= 82 && LA131_0 <= 83)||(LA131_0 >= 86 && LA131_0 <= 93)||(LA131_0 >= 101 && LA131_0 <= 102)||LA131_0==108) ) {
                alt131=1;
            }
            else if ( (LA131_0==85) ) {
                alt131=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;

            }
            switch (alt131) {
                case 1 :
                    // USE.g:1607:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue7388);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // USE.g:1608:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue7400);
                    oc=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { 
                        if ((oc!=null?oc.n:null) instanceof ASTNewLinkObjectStatement)
                        	n = new ASTRValueNewLinkObject((ASTNewLinkObjectStatement)(oc!=null?oc.n:null));
                        else
                        	n = new ASTRValueNewObject((ASTNewObjectStatement)(oc!=null?oc.n:null));
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
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValue"



    // $ANTLR start "rValList"
    // USE.g:1621:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // USE.g:1622:3: ( nothing |rl= rValListMin1 )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RBRACE) ) {
                alt132=1;
            }
            else if ( (LA132_0==AT||LA132_0==HASH||(LA132_0 >= IDENT && LA132_0 <= INT)||(LA132_0 >= LPAREN && LA132_0 <= MINUS)||LA132_0==PLUS||LA132_0==REAL||(LA132_0 >= STAR && LA132_0 <= STRING)||(LA132_0 >= 44 && LA132_0 <= 50)||LA132_0==73||LA132_0==76||(LA132_0 >= 82 && LA132_0 <= 83)||(LA132_0 >= 85 && LA132_0 <= 93)||(LA132_0 >= 101 && LA132_0 <= 102)||LA132_0==108) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;

            }
            switch (alt132) {
                case 1 :
                    // USE.g:1623:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList7423);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // USE.g:1626:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList7450);
                    rl=rValListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = rl; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValList"



    // $ANTLR start "rValListMin1"
    // USE.g:1634:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1638:3: (r= rValue ( COMMA r= rValue )* )
            // USE.g:1639:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin17483);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1641:3: ( COMMA r= rValue )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==COMMA) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // USE.g:1642:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin17497); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin17507);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValListMin1"



    // $ANTLR start "rValListMin2"
    // USE.g:1652:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // USE.g:1656:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // USE.g:1657:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin27546);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin27554); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin27562);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // USE.g:1662:3: ( COMMA r= rValue )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // USE.g:1663:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin27576); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin27586);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "rValListMin2"



    // $ANTLR start "inSoilExpression"
    // USE.g:1673:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        USEParser.expression_return e =null;


        try {
            // USE.g:1674:3: (e= expression )
            // USE.g:1675:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression7620);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if ((e!=null?e.n:null) != null) (e!=null?e.n:null).setStringRep((e!=null?input.toString(e.start,e.stop):null)); }

            if ( state.backtracking==0 ) { n = (e!=null?e.n:null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "inSoilExpression"



    // $ANTLR start "exprList"
    // USE.g:1684:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // USE.g:1685:3: ( nothing |el= exprListMin1 )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==EOF) ) {
                alt135=1;
            }
            else if ( (LA135_0==AT||LA135_0==HASH||(LA135_0 >= IDENT && LA135_0 <= INT)||(LA135_0 >= LPAREN && LA135_0 <= MINUS)||LA135_0==PLUS||LA135_0==REAL||(LA135_0 >= STAR && LA135_0 <= STRING)||(LA135_0 >= 44 && LA135_0 <= 50)||LA135_0==73||LA135_0==76||(LA135_0 >= 82 && LA135_0 <= 83)||(LA135_0 >= 86 && LA135_0 <= 93)||(LA135_0 >= 101 && LA135_0 <= 102)||LA135_0==108) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;

            }
            switch (alt135) {
                case 1 :
                    // USE.g:1686:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList7649);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1689:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList7667);
                    el=exprListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = el; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprList"



    // $ANTLR start "exprListMin1"
    // USE.g:1697:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1701:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1702:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin17700);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1704:3: ( COMMA e= inSoilExpression )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==COMMA) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // USE.g:1705:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin17715); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin17725);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprListMin1"



    // $ANTLR start "exprListMin2"
    // USE.g:1715:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // USE.g:1719:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // USE.g:1720:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27765);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin27773); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin27781);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // USE.g:1725:3: ( COMMA e= inSoilExpression )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==COMMA) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // USE.g:1726:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin27795); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin27805);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "exprListMin2"



    // $ANTLR start "identList"
    // USE.g:1736:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // USE.g:1737:3: ( nothing |il= identListMin1 )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==EOF||LA138_0==RBRACE||LA138_0==SEMI||(LA138_0 >= 68 && LA138_0 <= 69)) ) {
                alt138=1;
            }
            else if ( (LA138_0==IDENT) ) {
                alt138=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;

            }
            switch (alt138) {
                case 1 :
                    // USE.g:1738:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList7835);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // USE.g:1741:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList7852);
                    il=identListMin1();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = il; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "identList"



    // $ANTLR start "identListMin1"
    // USE.g:1749:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // USE.g:1753:3: (id= IDENT ( COMMA id= IDENT )* )
            // USE.g:1754:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin17886); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // USE.g:1756:3: ( COMMA id= IDENT )*
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==COMMA) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // USE.g:1757:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin17900); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin17910); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop139;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "identListMin1"

    // $ANTLR start synpred1_USE
    public final void synpred1_USE_fragment() throws RecognitionException {
        // USE.g:1155:7: ( COLON type EQUAL )
        // USE.g:1155:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_USE5636); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_USE5638);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_USE5640); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_USE

    // $ANTLR start synpred2_USE
    public final void synpred2_USE_fragment() throws RecognitionException {
        // USE.g:1306:5: ( statStartingWithExpr )
        // USE.g:1306:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_USE6188);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_USE

    // Delegated rules

    public final boolean synpred2_USE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_USE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_USE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_USE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA2_eotS =
        "\25\uffff";
    static final String DFA2_eofS =
        "\1\1\24\uffff";
    static final String DFA2_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\2\uffff\1\31\1\27\1\12\1\uffff\1"+
        "\15\1\23\1\5\1\35\1\15\1\23\1\12\1\35\1\27\1\12";
    static final String DFA2_maxS =
        "\1\107\1\uffff\1\23\1\uffff\1\23\2\uffff\1\31\1\147\1\44\1\uffff"+
        "\1\15\1\23\1\107\1\35\1\15\1\23\1\44\1\35\1\147\1\44";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\12\uffff";
    static final String DFA2_specialS =
        "\25\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\15\uffff\1\4\37\uffff\1\3\2\uffff\2\3\4\uffff\1\5\12\uffff"+
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\3\40\uffff\1\3\1\uffff\1\12\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\10\uffff\1\3",
            "\1\14\10\uffff\1\13\20\uffff\1\15",
            "",
            "\1\16",
            "\1\17",
            "\1\2\15\uffff\1\20\37\uffff\1\3\2\uffff\2\3\17\uffff\1\6",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\14\31\uffff\1\15",
            "\1\24",
            "\1\3\40\uffff\1\3\1\uffff\1\12\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\10\uffff\1\3",
            "\1\14\31\uffff\1\15"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 132:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*";
        }
    }
    static final String DFA33_eotS =
        "\16\uffff";
    static final String DFA33_eofS =
        "\16\uffff";
    static final String DFA33_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA33_maxS =
        "\1\147\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\142\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA33_specialS =
        "\16\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\26\uffff\1\1\10\uffff\1\1\33"+
            "\uffff\2\3\4\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\115\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 317:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA47_eotS =
        "\16\uffff";
    static final String DFA47_eofS =
        "\1\1\15\uffff";
    static final String DFA47_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA47_maxS =
        "\1\121\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\121\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA47_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA47_specialS =
        "\16\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\2\15\uffff\1\1\37\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff"+
            "\1\1\1\3\10\uffff\1\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\37\uffff\1\1\2\uffff\2\1\17\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "()* loopback of 421:5: (inv= invariantClause )*";
        }
    }
    static final String DFA52_eotS =
        "\16\uffff";
    static final String DFA52_eofS =
        "\1\1\15\uffff";
    static final String DFA52_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA52_maxS =
        "\1\142\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\142\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\15\uffff\1\1\37\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff"+
            "\1\1\31\uffff\2\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\37\uffff\1\1\2\uffff\2\1\17\uffff\1\1\31"+
            "\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "()+ loopback of 449:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_annotationSet_in_model70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_model76 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model80 = new BitSet(new long[]{0x10C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model92 = new BitSet(new long[]{0x10C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_associationDefinition_in_model105 = new BitSet(new long[]{0x10C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_60_in_model119 = new BitSet(new long[]{0x30C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_invariant_in_model137 = new BitSet(new long[]{0x30C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_prePost_in_model158 = new BitSet(new long[]{0x30C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model198 = new BitSet(new long[]{0x10C8000000080020L,0x0000000000000080L});
    public static final BitSet FOLLOW_EOF_in_model213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_enumTypeDefinition247 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition251 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition253 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition257 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition259 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition301 = new BitSet(new long[]{0x00C8000000080000L});
    public static final BitSet FOLLOW_51_in_generalClassifierDefinition309 = new BitSet(new long[]{0x00C0000000080000L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition474 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition478 = new BitSet(new long[]{0x1100000000800000L,0x0000008040000020L});
    public static final BitSet FOLLOW_LESS_in_classDefinition488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition492 = new BitSet(new long[]{0x1100000000000000L,0x0000008040000020L});
    public static final BitSet FOLLOW_56_in_classDefinition505 = new BitSet(new long[]{0x1000000000080020L,0x0000008040000020L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition518 = new BitSet(new long[]{0x1000000000080020L,0x0000008040000020L});
    public static final BitSet FOLLOW_94_in_classDefinition539 = new BitSet(new long[]{0x1000000000080020L,0x0000008000000020L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition552 = new BitSet(new long[]{0x1000000000080020L,0x0000008000000020L});
    public static final BitSet FOLLOW_60_in_classDefinition573 = new BitSet(new long[]{0x0000000000000020L,0x0000008000020120L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition593 = new BitSet(new long[]{0x0000000000000020L,0x0000008000020120L});
    public static final BitSet FOLLOW_103_in_classDefinition619 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000020L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition639 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000020L});
    public static final BitSet FOLLOW_69_in_classDefinition663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition696 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition722 = new BitSet(new long[]{0x1500000000880000L,0x0000008040000020L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition732 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition736 = new BitSet(new long[]{0x1500000000080000L,0x0000008040000020L});
    public static final BitSet FOLLOW_58_in_associationClassDefinition748 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition756 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition768 = new BitSet(new long[]{0x1100000000080020L,0x0000008040000020L});
    public static final BitSet FOLLOW_56_in_associationClassDefinition788 = new BitSet(new long[]{0x1000000000080020L,0x0000008040000020L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition801 = new BitSet(new long[]{0x1000000000080020L,0x0000008040000020L});
    public static final BitSet FOLLOW_94_in_associationClassDefinition822 = new BitSet(new long[]{0x1000000000080020L,0x0000008000000020L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition835 = new BitSet(new long[]{0x1000000000080020L,0x0000008000000020L});
    public static final BitSet FOLLOW_60_in_associationClassDefinition856 = new BitSet(new long[]{0x0000000000080020L,0x0000008000020120L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition876 = new BitSet(new long[]{0x0000000000080020L,0x0000008000020120L});
    public static final BitSet FOLLOW_103_in_associationClassDefinition902 = new BitSet(new long[]{0x0000000000080000L,0x0000000800000020L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition922 = new BitSet(new long[]{0x0000000000080000L,0x0000000800000020L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_associationClassDefinition990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition1018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition1026 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition1028 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition1032 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition1056 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition1058 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1061 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1071 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition1091 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition1095 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition1107 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition1152 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition1162 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition1172 = new BitSet(new long[]{0x02000020000020A2L,0x0000000600000000L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition1186 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition1192 = new BitSet(new long[]{0x0200002000002022L,0x0000000600000000L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition1220 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationDefinition1226 = new BitSet(new long[]{0x0000002000000022L,0x0000000600000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition1248 = new BitSet(new long[]{0x0000002000000022L,0x0000000600000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition1270 = new BitSet(new long[]{0x0000002000000022L,0x0000000600000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition1314 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition1328 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition1332 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition1336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition1346 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_associationDefinition1354 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1362 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition1374 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_associationDefinition1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd1410 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1418 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd1420 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd1424 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd1426 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd1437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1441 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_96_in_associationEnd1462 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_105_in_associationEnd1474 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1478 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd1490 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_100_in_associationEnd1502 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd1506 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd1519 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd1521 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd1526 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd1532 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd1534 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd1538 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_associationEnd1542 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd1554 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd1560 = new BitSet(new long[]{0x0000002000080002L,0x0000021100000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1612 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity1622 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity1626 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1655 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange1665 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_invariant1754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant1764 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant1777 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant1781 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant1789 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant1801 = new BitSet(new long[]{0x0000000000000022L,0x0000000000020100L});
    public static final BitSet FOLLOW_invariantClause_in_invariant1813 = new BitSet(new long[]{0x0000000000000022L,0x0000000000020100L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_invariantClause1851 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause1857 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause1862 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_invariantClause1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_invariantClause1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_invariantClause1885 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause1891 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause1896 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_invariantClause1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_prePost1933 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost1937 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost1939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost1943 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost1947 = new BitSet(new long[]{0x00000000000000A0L,0x0000000600000000L});
    public static final BitSet FOLLOW_COLON_in_prePost1951 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_prePost1955 = new BitSet(new long[]{0x0000000000000020L,0x0000000600000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost1974 = new BitSet(new long[]{0x0000000000000022L,0x0000000600000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause2008 = new BitSet(new long[]{0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_set_in_prePostClause2020 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause2035 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause2040 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_prePostClause2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet2071 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation2090 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation2094 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation2100 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation2109 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2137 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues2145 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues2149 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue2168 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue2173 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_stateMachine2209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine2242 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_stateMachine2255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine2271 = new BitSet(new long[]{0x0000000000080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_stateMachine2281 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine2297 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_stateMachine2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2323 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition2331 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition2335 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition2346 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_stateDefinition2352 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition2377 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2381 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition2391 = new BitSet(new long[]{0x4000000000480000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2401 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2405 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2409 = new BitSet(new long[]{0x4000000000080000L});
    public static final BitSet FOLLOW_event_in_transitionDefinition2433 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition2449 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition2453 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition2458 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition2465 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition2482 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition2486 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition2490 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_event2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition2540 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition2544 = new BitSet(new long[]{0x1100000000800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition2559 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition2563 = new BitSet(new long[]{0x1100000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_56_in_signalDefinition2576 = new BitSet(new long[]{0x1000000000080020L,0x0000000000000020L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition2589 = new BitSet(new long[]{0x1000000000080020L,0x0000000000000020L});
    public static final BitSet FOLLOW_60_in_signalDefinition2610 = new BitSet(new long[]{0x0000000000000020L,0x0000000000020120L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition2630 = new BitSet(new long[]{0x0000000000000020L,0x0000000000020120L});
    public static final BitSet FOLLOW_69_in_signalDefinition2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition2712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly2833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_expression2883 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression2894 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression2898 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression2902 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression2907 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_expression2911 = new BitSet(new long[]{0x0000000000000400L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_expression2949 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression2961 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression2965 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_expression2969 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression2974 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_expression2978 = new BitSet(new long[]{0x0000000000000400L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_expression3019 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList3068 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3085 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList3097 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList3101 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList3150 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList3160 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList3164 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration3195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration3197 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3237 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_conditionalImpliesExpression3250 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression3254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3299 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_conditionalOrExpression3312 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression3316 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3360 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_110_in_conditionalXOrExpression3373 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression3377 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3421 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalAndExpression3434 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression3438 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3486 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression3505 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression3515 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3564 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression3582 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression3600 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3650 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression3668 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression3678 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3728 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression3746 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression3760 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_unaryExpression3822 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FC41200L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression3899 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression3917 = new BitSet(new long[]{0x0000000000080000L,0x000000601D040000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression3923 = new BitSet(new long[]{0x0000000000080000L,0x000000601D040000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression3934 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4011 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4015 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4041 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4043 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_primaryExpression4045 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4068 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_primaryExpression4070 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4088 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4103 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression4105 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_primaryExpression4107 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression4111 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4115 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression4117 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression4137 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_primaryExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference4165 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression4325 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression4332 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression4343 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression4347 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_queryExpression4358 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_iterateExpression4396 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression4402 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression4410 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression4412 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression4420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression4422 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_iterateExpression4430 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression4480 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4502 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4515 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4528 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4532 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4544 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression4561 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4576 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4591 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4595 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression4609 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression4634 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_operationExpression4636 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression4661 = new BitSet(new long[]{0x0007F318861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4682 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression4694 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_operationExpression4698 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_inStateExpression4755 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression4760 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression4769 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression4810 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression4834 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression4838 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration4878 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration4881 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration4885 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration4895 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration4901 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration4904 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration4910 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization4938 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization4940 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization4944 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization4946 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_variableInitialization4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ifExpression4982 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_ifExpression4986 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_ifExpression4988 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_ifExpression4992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ifExpression4994 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_ifExpression4998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ifExpression5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_literal5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_literal5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal5105 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal5121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal5123 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal5187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral5225 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral5254 = new BitSet(new long[]{0x0007F30A861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5271 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral5284 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral5288 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem5336 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem5347 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_collectionItem5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_emptyCollectionLiteral5380 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral5382 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5386 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral5404 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral5406 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_undefinedLiteral5438 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5440 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5444 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_undefinedLiteral5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_undefinedLiteral5474 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral5476 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral5480 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral5482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_undefinedLiteral5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleLiteral5535 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral5541 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5549 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral5560 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral5564 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem5606 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem5645 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem5649 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem5651 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_tupleItem5655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem5677 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_expression_in_tupleItem5687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type5777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly5809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly5811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType5877 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType5904 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType5908 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_tupleType5944 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType5946 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType5955 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType5966 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType5970 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart6014 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart6016 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly6069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat6108 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat6120 = new BitSet(new long[]{0x0207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_singleStat_in_stat6130 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat6170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat6222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat6266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat6322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr6393 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat6445 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat6449 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat6481 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat6490 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat6494 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_objCreateStat6528 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat6536 = new BitSet(new long[]{0x0400000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6546 = new BitSet(new long[]{0x0007F318861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat6559 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6567 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_objCreateStat6585 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat6593 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat6607 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat6615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_objDestroyStat6651 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat6659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_lnkInsStat6685 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat6689 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat6699 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat6703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_lnkInsStat6707 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6744 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6755 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6764 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6771 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6787 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6798 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6809 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6818 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6825 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers6847 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers6862 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers6882 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers6893 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers6902 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_64_in_lnkDelStat6943 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat6947 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat6957 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat6961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_lnkDelStat6965 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_condExStat7005 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat7014 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_condExStat7018 = new BitSet(new long[]{0x8207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_68_in_condExStat7038 = new BitSet(new long[]{0x8207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat7050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_condExStat7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_iterStat7087 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat7095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_iterStat7099 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat7107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_iterStat7111 = new BitSet(new long[]{0x8207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat7119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_iterStat7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_whileStat7150 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat7158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_whileStat7162 = new BitSet(new long[]{0x8207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat7170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_whileStat7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_blockStat7205 = new BitSet(new long[]{0x8207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_63_in_blockStat7210 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat7216 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat7222 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat7228 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat7235 = new BitSet(new long[]{0x0207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_stat_in_blockStat7245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_blockStat7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_implicitBlockStat7276 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat7282 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat7288 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat7294 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat7301 = new BitSet(new long[]{0x0207F308861A0020L,0x000030603FEC9603L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock7332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock7342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue7388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17483 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin17497 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin17507 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27546 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27554 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27562 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin27576 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FEC1200L});
    public static final BitSet FOLLOW_rValue_in_rValListMin27586 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList7649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17700 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin17715 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin17725 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27765 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27773 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27781 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin27795 = new BitSet(new long[]{0x0007F308861A0020L,0x000010603FCC1200L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin27805 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList7852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin17886 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin17900 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin17910 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_USE5636 = new BitSet(new long[]{0x0003F00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_USE5638 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_USE5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_USE6188 = new BitSet(new long[]{0x0000000000000002L});

}