// $ANTLR 3.4 Generator.g 2020-09-22 13:54:35
 
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

package org.tzi.use.parser.generator;

import org.tzi.use.parser.base.BaseParser;
import org.tzi.use.parser.use.statemachines.*;
import org.tzi.use.parser.use.*;
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
public class GeneratorParser extends BaseParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARROW", "AT", "BAR", "COLON", "COLON_COLON", "COLON_EQUAL", "COMMA", "DOT", "DOTDOT", "EQUAL", "ESC", "GREATER", "GREATER_EQUAL", "HASH", "HEX_DIGIT", "IDENT", "INT", "LBRACE", "LBRACK", "LESS", "LESS_EQUAL", "LPAREN", "MINUS", "ML_COMMENT", "NEWLINE", "NON_OCL_STRING", "NOT_EQUAL", "PLUS", "RANGE_OR_INT", "RBRACE", "RBRACK", "REAL", "RPAREN", "SEMI", "SLASH", "SL_COMMENT", "STAR", "STRING", "VOCAB", "WS", "'ASSLCall'", "'Bag'", "'Barrier'", "'Collection'", "'OpEnter'", "'OpExit'", "'OrderedSet'", "'Sequence'", "'Set'", "'Tuple'", "'Undefined'", "'abstract'", "'allInstances'", "'and'", "'associationClass'", "'associationclass'", "'attributes'", "'begin'", "'between'", "'byUseId'", "'constraints'", "'context'", "'create'", "'declare'", "'delete'", "'destroy'", "'div'", "'do'", "'else'", "'end'", "'endif'", "'enum'", "'existential'", "'false'", "'for'", "'from'", "'if'", "'implies'", "'in'", "'insert'", "'into'", "'inv'", "'iterate'", "'let'", "'model'", "'new'", "'not'", "'null'", "'oclAsType'", "'oclEmpty'", "'oclInState'", "'oclIsKindOf'", "'oclIsTypeOf'", "'oclUndefined'", "'operations'", "'or'", "'ordered'", "'post'", "'pre'", "'procedure'", "'psm'", "'redefines'", "'selectByKind'", "'selectByType'", "'statemachines'", "'states'", "'subsets'", "'then'", "'transitions'", "'true'", "'var'", "'while'", "'xor'"
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
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
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


    public GeneratorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public GeneratorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return GeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "Generator.g"; }



    // $ANTLR start "invariantListOnly"
    // Generator.g:79:1: invariantListOnly returns [List<ASTConstraintDefinition> invariantList] : (def= invariant )* EOF ;
    public final List<ASTConstraintDefinition> invariantListOnly() throws RecognitionException {
        List<ASTConstraintDefinition> invariantList = null;


        ASTConstraintDefinition def =null;


         invariantList = new ArrayList<ASTConstraintDefinition>(); 
        try {
            // Generator.g:81:5: ( (def= invariant )* EOF )
            // Generator.g:82:5: (def= invariant )* EOF
            {
            // Generator.g:82:5: (def= invariant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==65) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Generator.g:82:7: def= invariant
            	    {
            	    pushFollow(FOLLOW_invariant_in_invariantListOnly80);
            	    def=invariant();

            	    state._fsp--;
            	    if (state.failed) return invariantList;

            	    if ( state.backtracking==0 ) { invariantList.add(def); }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_invariantListOnly91); if (state.failed) return invariantList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return invariantList;
    }
    // $ANTLR end "invariantListOnly"



    // $ANTLR start "procedureListOnly"
    // Generator.g:136:1: procedureListOnly returns [List<ASTGProcedure> procedureList] : (proc= procedure )* EOF ;
    public final List<ASTGProcedure> procedureListOnly() throws RecognitionException {
        List<ASTGProcedure> procedureList = null;


        ASTGProcedure proc =null;


         procedureList = new ArrayList<ASTGProcedure>(); 
        try {
            // Generator.g:138:5: ( (proc= procedure )* EOF )
            // Generator.g:139:5: (proc= procedure )* EOF
            {
            // Generator.g:139:5: (proc= procedure )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==103) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Generator.g:140:7: proc= procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_procedureListOnly136);
            	    proc=procedure();

            	    state._fsp--;
            	    if (state.failed) return procedureList;

            	    if ( state.backtracking==0 ) { procedureList.add(proc); }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_procedureListOnly151); if (state.failed) return procedureList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return procedureList;
    }
    // $ANTLR end "procedureListOnly"



    // $ANTLR start "procedure"
    // Generator.g:151:1: procedure returns [ASTGProcedure proc] : 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI ;
    public final ASTGProcedure procedure() throws RecognitionException {
        ASTGProcedure proc = null;


        Token name=null;
        List parameterDecls =null;

        List localDecls =null;

        List instructions =null;


         localDecls = new ArrayList(); 
        try {
            // Generator.g:153:5: ( 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI )
            // Generator.g:154:5: 'procedure' name= IDENT LPAREN parameterDecls= variableDeclarationList RPAREN ( 'var' localDecls= variableDeclarationList SEMI )? 'begin' instructions= instructionList 'end' SEMI
            {
            match(input,103,FOLLOW_103_in_procedure179); if (state.failed) return proc;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedure183); if (state.failed) return proc;

            match(input,LPAREN,FOLLOW_LPAREN_in_procedure185); if (state.failed) return proc;

            pushFollow(FOLLOW_variableDeclarationList_in_procedure189);
            parameterDecls=variableDeclarationList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,RPAREN,FOLLOW_RPAREN_in_procedure191); if (state.failed) return proc;

            // Generator.g:155:5: ( 'var' localDecls= variableDeclarationList SEMI )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==114) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Generator.g:155:7: 'var' localDecls= variableDeclarationList SEMI
                    {
                    match(input,114,FOLLOW_114_in_procedure199); if (state.failed) return proc;

                    pushFollow(FOLLOW_variableDeclarationList_in_procedure203);
                    localDecls=variableDeclarationList();

                    state._fsp--;
                    if (state.failed) return proc;

                    match(input,SEMI,FOLLOW_SEMI_in_procedure205); if (state.failed) return proc;

                    }
                    break;

            }


            match(input,61,FOLLOW_61_in_procedure214); if (state.failed) return proc;

            pushFollow(FOLLOW_instructionList_in_procedure218);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return proc;

            match(input,73,FOLLOW_73_in_procedure220); if (state.failed) return proc;

            match(input,SEMI,FOLLOW_SEMI_in_procedure222); if (state.failed) return proc;

            if ( state.backtracking==0 ) { proc = new ASTGProcedure(name, parameterDecls, localDecls, instructions ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return proc;
    }
    // $ANTLR end "procedure"



    // $ANTLR start "variableDeclarationList"
    // Generator.g:164:1: variableDeclarationList returns [List varDecls] : (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? ;
    public final List variableDeclarationList() throws RecognitionException {
        List varDecls = null;


        ASTVariableDeclaration decl =null;


         varDecls = new ArrayList(); 
        try {
            // Generator.g:166:5: ( (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )? )
            // Generator.g:167:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            {
            // Generator.g:167:5: (decl= variableDeclaration ( COMMA decl= variableDeclaration )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Generator.g:167:7: decl= variableDeclaration ( COMMA decl= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList260);
                    decl=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return varDecls;

                    if ( state.backtracking==0 ) {varDecls.add(decl);}

                    // Generator.g:168:7: ( COMMA decl= variableDeclaration )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Generator.g:168:8: COMMA decl= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_variableDeclarationList271); if (state.failed) return varDecls;

                    	    pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList275);
                    	    decl=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return varDecls;

                    	    if ( state.backtracking==0 ) {varDecls.add(decl);}

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
        return varDecls;
    }
    // $ANTLR end "variableDeclarationList"



    // $ANTLR start "instructionList"
    // Generator.g:176:1: instructionList returns [List instructions] : (instr= instruction SEMI )* ;
    public final List instructionList() throws RecognitionException {
        List instructions = null;


        ASTGInstruction instr =null;


         instructions = new ArrayList(); 
        try {
            // Generator.g:178:5: ( (instr= instruction SEMI )* )
            // Generator.g:179:5: (instr= instruction SEMI )*
            {
            // Generator.g:179:5: (instr= instruction SEMI )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT||LA6_0==LBRACK||LA6_0==44||LA6_0==46||(LA6_0 >= 48 && LA6_0 <= 49)||LA6_0==78||LA6_0==80) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Generator.g:179:7: instr= instruction SEMI
            	    {
            	    pushFollow(FOLLOW_instruction_in_instructionList319);
            	    instr=instruction();

            	    state._fsp--;
            	    if (state.failed) return instructions;

            	    match(input,SEMI,FOLLOW_SEMI_in_instructionList321); if (state.failed) return instructions;

            	    if ( state.backtracking==0 ) {instructions.add(instr);}

            	    }
            	    break;

            	default :
            	    break loop6;
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
        return instructions;
    }
    // $ANTLR end "instructionList"



    // $ANTLR start "instruction"
    // Generator.g:194:1: instruction returns [ASTGInstruction instr] : (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier );
    public final ASTGInstruction instruction() throws RecognitionException {
        ASTGInstruction instr = null;


        ASTGVariableAssignment instrVA =null;

        ASTGAttributeAssignment instrAA =null;

        ASTGLoop instrLO =null;

        ASTGAtomicInstruction instrAI =null;

        ASTGIfThenElse instrIT =null;

        ASTGAsslCall instrAC =null;

        ASTGOpEnter instrOE =null;

        ASTGOpExit instrOX =null;

        ASTGBarrier instrBA =null;


        try {
            // Generator.g:195:7: (instrVA= variableAssignment |instrAA= attributeAssignment |instrLO= loop |instrAI= atomicInstruction |instrIT= ifThenElse |instrAC= asslCall |instrOE= opEnter |instrOX= opExit |instrBA= barrier )
            int alt7=9;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==COLON_EQUAL) ) {
                    alt7=1;
                }
                else if ( (LA7_1==LPAREN) ) {
                    alt7=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return instr;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACK:
                {
                alt7=2;
                }
                break;
            case 78:
                {
                alt7=3;
                }
                break;
            case 80:
                {
                alt7=5;
                }
                break;
            case 44:
                {
                alt7=6;
                }
                break;
            case 48:
                {
                alt7=7;
                }
                break;
            case 49:
                {
                alt7=8;
                }
                break;
            case 46:
                {
                alt7=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return instr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // Generator.g:196:7: instrVA= variableAssignment
                    {
                    pushFollow(FOLLOW_variableAssignment_in_instruction356);
                    instrVA=variableAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrVA;}

                    }
                    break;
                case 2 :
                    // Generator.g:197:7: instrAA= attributeAssignment
                    {
                    pushFollow(FOLLOW_attributeAssignment_in_instruction371);
                    instrAA=attributeAssignment();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAA;}

                    }
                    break;
                case 3 :
                    // Generator.g:198:7: instrLO= loop
                    {
                    pushFollow(FOLLOW_loop_in_instruction385);
                    instrLO=loop();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrLO;}

                    }
                    break;
                case 4 :
                    // Generator.g:199:7: instrAI= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_instruction402);
                    instrAI=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAI;}

                    }
                    break;
                case 5 :
                    // Generator.g:200:7: instrIT= ifThenElse
                    {
                    pushFollow(FOLLOW_ifThenElse_in_instruction416);
                    instrIT=ifThenElse();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrIT;}

                    }
                    break;
                case 6 :
                    // Generator.g:201:7: instrAC= asslCall
                    {
                    pushFollow(FOLLOW_asslCall_in_instruction432);
                    instrAC=asslCall();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrAC;}

                    }
                    break;
                case 7 :
                    // Generator.g:202:7: instrOE= opEnter
                    {
                    pushFollow(FOLLOW_opEnter_in_instruction448);
                    instrOE=opEnter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOE;}

                    }
                    break;
                case 8 :
                    // Generator.g:203:7: instrOX= opExit
                    {
                    pushFollow(FOLLOW_opExit_in_instruction465);
                    instrOX=opExit();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrOX;}

                    }
                    break;
                case 9 :
                    // Generator.g:204:7: instrBA= barrier
                    {
                    pushFollow(FOLLOW_barrier_in_instruction482);
                    instrBA=barrier();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) {instr = instrBA;}

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
        return instr;
    }
    // $ANTLR end "instruction"



    // $ANTLR start "variableAssignment"
    // Generator.g:211:1: variableAssignment returns [ASTGVariableAssignment assignment] : target= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGVariableAssignment variableAssignment() throws RecognitionException {
        ASTGVariableAssignment assignment = null;


        Token target=null;
        ASTGValueInstruction source =null;


        try {
            // Generator.g:212:5: (target= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:213:5: target= IDENT COLON_EQUAL source= valueInstruction
            {
            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableAssignment513); if (state.failed) return assignment;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_variableAssignment515); if (state.failed) return assignment;

            pushFollow(FOLLOW_valueInstruction_in_variableAssignment519);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;

            if ( state.backtracking==0 ) { assignment = new ASTGVariableAssignment( target, source ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assignment;
    }
    // $ANTLR end "variableAssignment"



    // $ANTLR start "attributeAssignment"
    // Generator.g:221:1: attributeAssignment returns [ASTGAttributeAssignment assignment] : targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction ;
    public final ASTGAttributeAssignment attributeAssignment() throws RecognitionException {
        ASTGAttributeAssignment assignment = null;


        Token attributeName=null;
        ASTGocl targetObject =null;

        ASTGValueInstruction source =null;


        try {
            // Generator.g:222:5: (targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction )
            // Generator.g:223:5: targetObject= oclExpression DOT attributeName= IDENT COLON_EQUAL source= valueInstruction
            {
            pushFollow(FOLLOW_oclExpression_in_attributeAssignment551);
            targetObject=oclExpression();

            state._fsp--;
            if (state.failed) return assignment;

            match(input,DOT,FOLLOW_DOT_in_attributeAssignment553); if (state.failed) return assignment;

            attributeName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeAssignment557); if (state.failed) return assignment;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attributeAssignment565); if (state.failed) return assignment;

            pushFollow(FOLLOW_valueInstruction_in_attributeAssignment569);
            source=valueInstruction();

            state._fsp--;
            if (state.failed) return assignment;

            if ( state.backtracking==0 ) { assignment = new ASTGAttributeAssignment(
            			 targetObject, attributeName, source ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assignment;
    }
    // $ANTLR end "attributeAssignment"



    // $ANTLR start "loop"
    // Generator.g:233:1: loop returns [ASTGLoop loop] : t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' ;
    public final ASTGLoop loop() throws RecognitionException {
        ASTGLoop loop = null;


        Token t=null;
        ASTVariableDeclaration decl =null;

        ASTGocl sequence =null;

        List instructions =null;


        try {
            // Generator.g:234:5: (t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end' )
            // Generator.g:235:5: t= 'for' decl= variableDeclaration 'in' sequence= oclExpression 'begin' instructions= instructionList 'end'
            {
            t=(Token)match(input,78,FOLLOW_78_in_loop601); if (state.failed) return loop;

            pushFollow(FOLLOW_variableDeclaration_in_loop605);
            decl=variableDeclaration();

            state._fsp--;
            if (state.failed) return loop;

            match(input,82,FOLLOW_82_in_loop607); if (state.failed) return loop;

            pushFollow(FOLLOW_oclExpression_in_loop611);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return loop;

            match(input,61,FOLLOW_61_in_loop613); if (state.failed) return loop;

            pushFollow(FOLLOW_instructionList_in_loop624);
            instructions=instructionList();

            state._fsp--;
            if (state.failed) return loop;

            match(input,73,FOLLOW_73_in_loop626); if (state.failed) return loop;

            if ( state.backtracking==0 ) { loop = new ASTGLoop( decl, sequence, instructions, t ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return loop;
    }
    // $ANTLR end "loop"



    // $ANTLR start "ifThenElse"
    // Generator.g:246:1: ifThenElse returns [ASTGIfThenElse ifThenElse] : token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? ;
    public final ASTGIfThenElse ifThenElse() throws RecognitionException {
        ASTGIfThenElse ifThenElse = null;


        Token token=null;
        ASTGocl sequence =null;

        List thenInstructions =null;

        List elseInstructions =null;


         List elseInstructionsList = new ArrayList(); 
        try {
            // Generator.g:248:5: (token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )? )
            // Generator.g:249:5: token= 'if' sequence= oclExpression 'then' 'begin' thenInstructions= instructionList 'end' ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            {
            token=(Token)match(input,80,FOLLOW_80_in_ifThenElse662); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_oclExpression_in_ifThenElse666);
            sequence=oclExpression();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,111,FOLLOW_111_in_ifThenElse677); if (state.failed) return ifThenElse;

            match(input,61,FOLLOW_61_in_ifThenElse679); if (state.failed) return ifThenElse;

            pushFollow(FOLLOW_instructionList_in_ifThenElse683);
            thenInstructions=instructionList();

            state._fsp--;
            if (state.failed) return ifThenElse;

            match(input,73,FOLLOW_73_in_ifThenElse685); if (state.failed) return ifThenElse;

            // Generator.g:251:9: ( 'else' 'begin' elseInstructions= instructionList 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==72) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Generator.g:251:10: 'else' 'begin' elseInstructions= instructionList 'end'
                    {
                    match(input,72,FOLLOW_72_in_ifThenElse696); if (state.failed) return ifThenElse;

                    match(input,61,FOLLOW_61_in_ifThenElse698); if (state.failed) return ifThenElse;

                    pushFollow(FOLLOW_instructionList_in_ifThenElse702);
                    elseInstructions=instructionList();

                    state._fsp--;
                    if (state.failed) return ifThenElse;

                    match(input,73,FOLLOW_73_in_ifThenElse704); if (state.failed) return ifThenElse;

                    if ( state.backtracking==0 ) { elseInstructionsList=elseInstructions; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { ifThenElse = new ASTGIfThenElse( sequence, thenInstructions,
                            elseInstructionsList, token ); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ifThenElse;
    }
    // $ANTLR end "ifThenElse"



    // $ANTLR start "valueInstruction"
    // Generator.g:260:1: valueInstruction returns [ASTGValueInstruction valueinstr] : (atmoicInstr= atomicInstruction |oclExpr= oclExpression );
    public final ASTGValueInstruction valueInstruction() throws RecognitionException {
        ASTGValueInstruction valueinstr = null;


        ASTGAtomicInstruction atmoicInstr =null;

        ASTGocl oclExpr =null;


        try {
            // Generator.g:261:7: (atmoicInstr= atomicInstruction |oclExpr= oclExpression )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT) ) {
                alt9=1;
            }
            else if ( (LA9_0==LBRACK) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return valueinstr;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Generator.g:262:7: atmoicInstr= atomicInstruction
                    {
                    pushFollow(FOLLOW_atomicInstruction_in_valueInstruction744);
                    atmoicInstr=atomicInstruction();

                    state._fsp--;
                    if (state.failed) return valueinstr;

                    if ( state.backtracking==0 ) {valueinstr = atmoicInstr; }

                    }
                    break;
                case 2 :
                    // Generator.g:263:7: oclExpr= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_valueInstruction758);
                    oclExpr=oclExpression();

                    state._fsp--;
                    if (state.failed) return valueinstr;

                    if ( state.backtracking==0 ) {valueinstr = oclExpr; }

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
        return valueinstr;
    }
    // $ANTLR end "valueInstruction"



    // $ANTLR start "atomicInstruction"
    // Generator.g:271:1: atomicInstruction returns [ASTGAtomicInstruction instr] : name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN ;
    public final ASTGAtomicInstruction atomicInstruction() throws RecognitionException {
        ASTGAtomicInstruction instr = null;


        Token name=null;
        Object parameter =null;


        try {
            // Generator.g:272:5: (name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN )
            // Generator.g:273:5: name= IDENT LPAREN (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )? RPAREN
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_atomicInstruction788); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAtomicInstruction(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_atomicInstruction792); if (state.failed) return instr;

            // Generator.g:274:9: (parameter= instructionParameter ( COMMA parameter= instructionParameter )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT||LA11_0==LBRACK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Generator.g:274:11: parameter= instructionParameter ( COMMA parameter= instructionParameter )*
                    {
                    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction806);
                    parameter=instructionParameter();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:275:13: ( COMMA parameter= instructionParameter )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Generator.g:275:15: COMMA parameter= instructionParameter
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_atomicInstruction824); if (state.failed) return instr;

                    	    pushFollow(FOLLOW_instructionParameter_in_atomicInstruction828);
                    	    parameter=instructionParameter();

                    	    state._fsp--;
                    	    if (state.failed) return instr;

                    	    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_atomicInstruction876); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "atomicInstruction"



    // $ANTLR start "asslCall"
    // Generator.g:286:1: asslCall returns [ASTGAsslCall instr] : 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGAsslCall asslCall() throws RecognitionException {
        ASTGAsslCall instr = null;


        Token name=null;
        ASTGocl parameter =null;


        try {
            // Generator.g:287:5: ( 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:288:5: 'ASSLCall' name= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,44,FOLLOW_44_in_asslCall899); if (state.failed) return instr;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_asslCall903); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGAsslCall(name); }

            match(input,LPAREN,FOLLOW_LPAREN_in_asslCall907); if (state.failed) return instr;

            // Generator.g:289:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Generator.g:289:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_asslCall921);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:290:13: ( COMMA parameter= oclExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Generator.g:290:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_asslCall939); if (state.failed) return instr;

                    	    pushFollow(FOLLOW_oclExpression_in_asslCall943);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;

                    	    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_asslCall991); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "asslCall"



    // $ANTLR start "opEnter"
    // Generator.g:301:1: opEnter returns [ASTGOpEnter instr] : 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN ;
    public final ASTGOpEnter opEnter() throws RecognitionException {
        ASTGOpEnter instr = null;


        Token opname=null;
        ASTGocl oid =null;

        ASTGocl parameter =null;


        try {
            // Generator.g:302:5: ( 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN )
            // Generator.g:303:5: 'OpEnter' oid= oclExpression opname= IDENT LPAREN (parameter= oclExpression ( COMMA parameter= oclExpression )* )? RPAREN
            {
            match(input,48,FOLLOW_48_in_opEnter1014); if (state.failed) return instr;

            pushFollow(FOLLOW_oclExpression_in_opEnter1018);
            oid=oclExpression();

            state._fsp--;
            if (state.failed) return instr;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_opEnter1022); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGOpEnter(oid, opname); }

            match(input,LPAREN,FOLLOW_LPAREN_in_opEnter1026); if (state.failed) return instr;

            // Generator.g:304:9: (parameter= oclExpression ( COMMA parameter= oclExpression )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LBRACK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // Generator.g:304:11: parameter= oclExpression ( COMMA parameter= oclExpression )*
                    {
                    pushFollow(FOLLOW_oclExpression_in_opEnter1041);
                    parameter=oclExpression();

                    state._fsp--;
                    if (state.failed) return instr;

                    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    // Generator.g:305:13: ( COMMA parameter= oclExpression )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Generator.g:305:15: COMMA parameter= oclExpression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_opEnter1059); if (state.failed) return instr;

                    	    pushFollow(FOLLOW_oclExpression_in_opEnter1063);
                    	    parameter=oclExpression();

                    	    state._fsp--;
                    	    if (state.failed) return instr;

                    	    if ( state.backtracking==0 ) { instr.addParameter(parameter); }

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_opEnter1111); if (state.failed) return instr;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "opEnter"



    // $ANTLR start "opExit"
    // Generator.g:315:1: opExit returns [ASTGOpExit instr] : 'OpExit' ;
    public final ASTGOpExit opExit() throws RecognitionException {
        ASTGOpExit instr = null;


        try {
            // Generator.g:316:5: ( 'OpExit' )
            // Generator.g:317:5: 'OpExit'
            {
            match(input,49,FOLLOW_49_in_opExit1134); if (state.failed) return instr;

            if ( state.backtracking==0 ) { instr = new ASTGOpExit(); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return instr;
    }
    // $ANTLR end "opExit"



    // $ANTLR start "instructionParameter"
    // Generator.g:323:1: instructionParameter returns [Object parameter] : (parameterOcl= oclExpression |parameterIdent= instrParameterIdent );
    public final Object instructionParameter() throws RecognitionException {
        Object parameter = null;


        ASTGocl parameterOcl =null;

        Token parameterIdent =null;


        try {
            // Generator.g:324:7: (parameterOcl= oclExpression |parameterIdent= instrParameterIdent )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LBRACK) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENT) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Generator.g:325:7: parameterOcl= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_instructionParameter1163);
                    parameterOcl=oclExpression();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) {parameter = parameterOcl; }

                    }
                    break;
                case 2 :
                    // Generator.g:326:7: parameterIdent= instrParameterIdent
                    {
                    pushFollow(FOLLOW_instrParameterIdent_in_instructionParameter1175);
                    parameterIdent=instrParameterIdent();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) {parameter = parameterIdent; }

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
        return parameter;
    }
    // $ANTLR end "instructionParameter"



    // $ANTLR start "instrParameterIdent"
    // Generator.g:333:1: instrParameterIdent returns [Token t] : i= IDENT ;
    public final Token instrParameterIdent() throws RecognitionException {
        Token t = null;


        Token i=null;

        try {
            // Generator.g:334:5: (i= IDENT )
            // Generator.g:335:5: i= IDENT
            {
            i=(Token)match(input,IDENT,FOLLOW_IDENT_in_instrParameterIdent1203); if (state.failed) return t;

            if ( state.backtracking==0 ) { t = i; }

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
    // $ANTLR end "instrParameterIdent"



    // $ANTLR start "oclExpression"
    // Generator.g:342:1: oclExpression returns [ASTGocl encapOcl] : i= LBRACK ocl= expression RBRACK ;
    public final ASTGocl oclExpression() throws RecognitionException {
        ASTGocl encapOcl = null;


        Token i=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:343:5: (i= LBRACK ocl= expression RBRACK )
            // Generator.g:344:5: i= LBRACK ocl= expression RBRACK
            {
            i=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_oclExpression1231); if (state.failed) return encapOcl;

            pushFollow(FOLLOW_expression_in_oclExpression1235);
            ocl=expression();

            state._fsp--;
            if (state.failed) return encapOcl;

            match(input,RBRACK,FOLLOW_RBRACK_in_oclExpression1237); if (state.failed) return encapOcl;

            if ( state.backtracking==0 ) { encapOcl = new ASTGocl((ocl!=null?ocl.n:null), i); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return encapOcl;
    }
    // $ANTLR end "oclExpression"



    // $ANTLR start "barrier"
    // Generator.g:351:1: barrier returns [ASTGBarrier barrier] : 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN ;
    public final ASTGBarrier barrier() throws RecognitionException {
        ASTGBarrier barrier = null;


        Token invClass=null;
        Token invName=null;
        ASTGocl exp =null;


        try {
            // Generator.g:352:4: ( 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN )
            // Generator.g:353:4: 'Barrier' LPAREN (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression ) RPAREN
            {
            match(input,46,FOLLOW_46_in_barrier1265); if (state.failed) return barrier;

            match(input,LPAREN,FOLLOW_LPAREN_in_barrier1270); if (state.failed) return barrier;

            // Generator.g:354:11: (invClass= IDENT COLON_COLON invName= IDENT |exp= oclExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            else if ( (LA17_0==LBRACK) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return barrier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // Generator.g:355:8: invClass= IDENT COLON_COLON invName= IDENT
                    {
                    invClass=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1285); if (state.failed) return barrier;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_barrier1287); if (state.failed) return barrier;

                    invName=(Token)match(input,IDENT,FOLLOW_IDENT_in_barrier1293); if (state.failed) return barrier;

                    if ( state.backtracking==0 ) { barrier = new ASTGBarrierInvariant(invClass, invName); }

                    }
                    break;
                case 2 :
                    // Generator.g:356:8: exp= oclExpression
                    {
                    pushFollow(FOLLOW_oclExpression_in_barrier1309);
                    exp=oclExpression();

                    state._fsp--;
                    if (state.failed) return barrier;

                    if ( state.backtracking==0 ) { barrier = new ASTGBarrierExpression(exp); }

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_barrier1321); if (state.failed) return barrier;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return barrier;
    }
    // $ANTLR end "barrier"



    // $ANTLR start "procedureCallOnly"
    // Generator.g:369:1: procedureCallOnly returns [ASTGProcedureCall call] : name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF ;
    public final ASTGProcedureCall procedureCallOnly() throws RecognitionException {
        ASTGProcedureCall call = null;


        Token name=null;
        GeneratorParser.expression_return ocl =null;


        try {
            // Generator.g:370:5: (name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF )
            // Generator.g:371:5: name= IDENT LPAREN (ocl= expression ( COMMA ocl= expression )* )? RPAREN EOF
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCallOnly1345); if (state.failed) return call;

            if ( state.backtracking==0 ) {call = new ASTGProcedureCall(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_procedureCallOnly1353); if (state.failed) return call;

            // Generator.g:372:12: (ocl= expression ( COMMA ocl= expression )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==AT||LA19_0==HASH||(LA19_0 >= IDENT && LA19_0 <= INT)||(LA19_0 >= LPAREN && LA19_0 <= MINUS)||LA19_0==PLUS||LA19_0==REAL||(LA19_0 >= STAR && LA19_0 <= STRING)||LA19_0==45||LA19_0==47||(LA19_0 >= 50 && LA19_0 <= 54)||LA19_0==77||LA19_0==80||(LA19_0 >= 86 && LA19_0 <= 87)||(LA19_0 >= 90 && LA19_0 <= 97)||(LA19_0 >= 106 && LA19_0 <= 107)||LA19_0==113) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Generator.g:373:5: ocl= expression ( COMMA ocl= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureCallOnly1364);
                    ocl=expression();

                    state._fsp--;
                    if (state.failed) return call;

                    if ( state.backtracking==0 ) {call.addParameter((ocl!=null?ocl.n:null));}

                    // Generator.g:374:5: ( COMMA ocl= expression )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Generator.g:374:7: COMMA ocl= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_procedureCallOnly1374); if (state.failed) return call;

                    	    pushFollow(FOLLOW_expression_in_procedureCallOnly1378);
                    	    ocl=expression();

                    	    state._fsp--;
                    	    if (state.failed) return call;

                    	    if ( state.backtracking==0 ) {call.addParameter((ocl!=null?ocl.n:null));}

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_procedureCallOnly1392); if (state.failed) return call;

            match(input,EOF,FOLLOW_EOF_in_procedureCallOnly1398); if (state.failed) return call;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return call;
    }
    // $ANTLR end "procedureCallOnly"



    // $ANTLR start "model"
    // Generator.g:395:1: model returns [ASTModel n] : as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF ;
    public final ASTModel model() throws RecognitionException {
        ASTModel n = null;


        Token modelName=null;
        Set<ASTAnnotation> as =null;

        ASTAssociation a =null;

        ASTConstraintDefinition cons =null;

        ASTPrePost ppc =null;

        ASTEnumTypeDefinition e =null;


        try {
            // Generator.g:396:2: (as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF )
            // Generator.g:397:2: as= annotationSet 'model' modelName= IDENT ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )* EOF
            {
            pushFollow(FOLLOW_annotationSet_in_model1426);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,88,FOLLOW_88_in_model1432); if (state.failed) return n;

            modelName=(Token)match(input,IDENT,FOLLOW_IDENT_in_model1436); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTModel(modelName); n.setAnnotations(as); }

            // Generator.g:399:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*
            loop21:
            do {
                int alt21=5;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // Generator.g:399:9: generalClassifierDefinition[$n]
            	    {
            	    pushFollow(FOLLOW_generalClassifierDefinition_in_model1448);
            	    generalClassifierDefinition(n);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:400:9: a= associationDefinition
            	    {
            	    pushFollow(FOLLOW_associationDefinition_in_model1461);
            	    a=associationDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addAssociation(a); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:401:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    {
            	    // Generator.g:401:9: ( 'constraints' (cons= invariant |ppc= prePost )* )
            	    // Generator.g:401:11: 'constraints' (cons= invariant |ppc= prePost )*
            	    {
            	    match(input,64,FOLLOW_64_in_model1475); if (state.failed) return n;

            	    // Generator.g:402:11: (cons= invariant |ppc= prePost )*
            	    loop20:
            	    do {
            	        int alt20=3;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==65) ) {
            	            int LA20_2 = input.LA(2);

            	            if ( (LA20_2==IDENT) ) {
            	                int LA20_3 = input.LA(3);

            	                if ( (LA20_3==COLON_COLON) ) {
            	                    alt20=2;
            	                }
            	                else if ( (LA20_3==EOF||LA20_3==AT||LA20_3==COLON||LA20_3==COMMA||LA20_3==IDENT||LA20_3==55||(LA20_3 >= 58 && LA20_3 <= 59)||(LA20_3 >= 64 && LA20_3 <= 65)||(LA20_3 >= 75 && LA20_3 <= 76)||LA20_3==85) ) {
            	                    alt20=1;
            	                }


            	            }


            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // Generator.g:402:15: cons= invariant
            	    	    {
            	    	    pushFollow(FOLLOW_invariant_in_model1493);
            	    	    cons=invariant();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addConstraint(cons); }

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // Generator.g:403:15: ppc= prePost
            	    	    {
            	    	    pushFollow(FOLLOW_prePost_in_model1514);
            	    	    ppc=prePost();

            	    	    state._fsp--;
            	    	    if (state.failed) return n;

            	    	    if ( state.backtracking==0 ) { n.addPrePost(ppc); }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // Generator.g:406:9: e= enumTypeDefinition
            	    {
            	    pushFollow(FOLLOW_enumTypeDefinition_in_model1554);
            	    e=enumTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnumTypeDef(e); }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_model1569); if (state.failed) return n;

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
    // Generator.g:415:1: enumTypeDefinition returns [ASTEnumTypeDefinition n] : as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? ;
    public final ASTEnumTypeDefinition enumTypeDefinition() throws RecognitionException {
        ASTEnumTypeDefinition n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List idListRes =null;


        try {
            // Generator.g:416:2: (as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )? )
            // Generator.g:417:2: as= annotationSet 'enum' name= IDENT LBRACE idListRes= idList RBRACE ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_enumTypeDefinition1597);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            match(input,75,FOLLOW_75_in_enumTypeDefinition1603); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_enumTypeDefinition1607); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_enumTypeDefinition1609); if (state.failed) return n;

            pushFollow(FOLLOW_idList_in_enumTypeDefinition1613);
            idListRes=idList();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACE,FOLLOW_RBRACE_in_enumTypeDefinition1615); if (state.failed) return n;

            // Generator.g:418:54: ( SEMI )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==SEMI) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Generator.g:418:56: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_enumTypeDefinition1619); if (state.failed) return n;

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
    // Generator.g:427:1: generalClassifierDefinition[ASTModel n] : as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) ;
    public final void generalClassifierDefinition(ASTModel n) throws RecognitionException {
        Set<ASTAnnotation> as =null;

        ASTClass c =null;

        ASTAssociationClass ac =null;

        ASTSignal s =null;


         
          boolean isAbstract = false;

        try {
            // Generator.g:431:2: (as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] ) )
            // Generator.g:432:2: as= annotationSet ( 'abstract' )? (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            {
            pushFollow(FOLLOW_annotationSet_in_generalClassifierDefinition1657);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return ;

            // Generator.g:433:5: ( 'abstract' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==55) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Generator.g:433:7: 'abstract'
                    {
                    match(input,55,FOLLOW_55_in_generalClassifierDefinition1665); if (state.failed) return ;

                    if ( state.backtracking==0 ) { isAbstract = true; }

                    }
                    break;

            }


            // Generator.g:434:5: (c= classDefinition[isAbstract] |ac= associationClassDefinition[isAbstract] |s= signalDefinition[isAbstract] )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT) ) {
                int LA24_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("class"))) ) {
                    alt24=1;
                }
                else if ( ((input.LT(1).getText().equals("signal"))) ) {
                    alt24=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA24_0 >= 58 && LA24_0 <= 59)) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // Generator.g:435:9: c= classDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_classDefinition_in_generalClassifierDefinition1693);
                    c=classDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addClass(c); c.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // Generator.g:438:9: ac= associationClassDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_associationClassDefinition_in_generalClassifierDefinition1731);
                    ac=associationClassDefinition(isAbstract);

                    state._fsp--;
                    if (state.failed) return ;

                    if ( state.backtracking==0 ) { n.addAssociationClass(ac); ac.setAnnotations(as); }

                    }
                    break;
                case 3 :
                    // Generator.g:441:9: s= signalDefinition[isAbstract]
                    {
                    pushFollow(FOLLOW_signalDefinition_in_generalClassifierDefinition1776);
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
    // Generator.g:462:1: classDefinition[boolean isAbstract] returns [ASTClass n] : keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' ;
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
            // Generator.g:464:5: ( keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end' )
            // Generator.g:465:5: keyClass name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? 'end'
            {
            pushFollow(FOLLOW_keyClass_in_classDefinition1830);
            keyClass();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_classDefinition1834); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTClass(name, isAbstract); }

            // Generator.g:466:5: ( LESS idListRes= idList )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LESS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Generator.g:466:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_classDefinition1844); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_classDefinition1848);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:467:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==60) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Generator.g:467:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,60,FOLLOW_60_in_classDefinition1861); if (state.failed) return n;

                    // Generator.g:468:7: (a= attributeDefinition )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==AT||LA26_0==IDENT||LA26_0==55||(LA26_0 >= 58 && LA26_0 <= 59)||LA26_0==75||LA26_0==85||LA26_0==88||(LA26_0 >= 101 && LA26_0 <= 102)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Generator.g:468:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_classDefinition1874);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:470:5: ( 'operations' (op= operationDefinition )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==98) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Generator.g:470:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,98,FOLLOW_98_in_classDefinition1895); if (state.failed) return n;

                    // Generator.g:471:7: (op= operationDefinition )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==AT||LA28_0==IDENT||LA28_0==55||(LA28_0 >= 58 && LA28_0 <= 59)||LA28_0==75||LA28_0==85||LA28_0==88||(LA28_0 >= 101 && LA28_0 <= 102)) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Generator.g:471:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_classDefinition1908);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:473:5: ( 'constraints' (inv= invariantClause )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // Generator.g:473:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,64,FOLLOW_64_in_classDefinition1929); if (state.failed) return n;

                    // Generator.g:474:7: (inv= invariantClause )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==AT||LA30_0==IDENT||LA30_0==55||(LA30_0 >= 58 && LA30_0 <= 59)||(LA30_0 >= 75 && LA30_0 <= 76)||LA30_0==85||LA30_0==88||(LA30_0 >= 101 && LA30_0 <= 102)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Generator.g:475:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_classDefinition1949);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:478:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==108) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // Generator.g:478:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,108,FOLLOW_108_in_classDefinition1975); if (state.failed) return n;

                    // Generator.g:479:7: (sm= stateMachine )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==104) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // Generator.g:480:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_classDefinition1995);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_classDefinition2019); if (state.failed) return n;

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
    // Generator.g:501:1: associationClassDefinition[boolean isAbstract] returns [ASTAssociationClass n] : classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' ;
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
            // Generator.g:503:5: (classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end' )
            // Generator.g:504:5: classKW= ( 'associationClass' | 'associationclass' ) name= IDENT ( LESS idListRes= idList )? ( 'between' ae= associationEnd (ae= associationEnd )+ )? ( 'attributes' (a= attributeDefinition )* )? ( 'operations' (op= operationDefinition )* )? ( 'constraints' (inv= invariantClause )* )? ( 'statemachines' (sm= stateMachine )* )? ( ( keyAggregation | keyComposition ) )? 'end'
            {
            classKW=(Token)input.LT(1);

            if ( (input.LA(1) >= 58 && input.LA(1) <= 59) ) {
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

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationClassDefinition2078); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationClass(name, isAbstract); }

            // Generator.g:513:5: ( LESS idListRes= idList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LESS) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Generator.g:513:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_associationClassDefinition2088); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_associationClassDefinition2092);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addSuperClasses(idListRes); }

                    }
                    break;

            }


            // Generator.g:514:5: ( 'between' ae= associationEnd (ae= associationEnd )+ )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==62) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Generator.g:514:6: 'between' ae= associationEnd (ae= associationEnd )+
                    {
                    match(input,62,FOLLOW_62_in_associationClassDefinition2104); if (state.failed) return n;

                    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2112);
                    ae=associationEnd();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    // Generator.g:516:5: (ae= associationEnd )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==IDENT) ) {
                            int LA35_2 = input.LA(2);

                            if ( (LA35_2==LBRACK) ) {
                                alt35=1;
                            }


                        }
                        else if ( (LA35_0==AT) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Generator.g:516:7: ae= associationEnd
                    	    {
                    	    pushFollow(FOLLOW_associationEnd_in_associationClassDefinition2124);
                    	    ae=associationEnd();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addEnd(ae); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return n;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;

            }


            // Generator.g:518:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // Generator.g:518:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,60,FOLLOW_60_in_associationClassDefinition2144); if (state.failed) return n;

                    // Generator.g:519:7: (a= attributeDefinition )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==IDENT) ) {
                            int LA37_2 = input.LA(2);

                            if ( (LA37_2==COLON) ) {
                                alt37=1;
                            }


                        }
                        else if ( (LA37_0==AT) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // Generator.g:519:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_associationClassDefinition2157);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:521:5: ( 'operations' (op= operationDefinition )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==98) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Generator.g:521:7: 'operations' (op= operationDefinition )*
                    {
                    match(input,98,FOLLOW_98_in_associationClassDefinition2178); if (state.failed) return n;

                    // Generator.g:522:7: (op= operationDefinition )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==IDENT) ) {
                            int LA39_2 = input.LA(2);

                            if ( (LA39_2==LPAREN) ) {
                                alt39=1;
                            }


                        }
                        else if ( (LA39_0==AT) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Generator.g:522:9: op= operationDefinition
                    	    {
                    	    pushFollow(FOLLOW_operationDefinition_in_associationClassDefinition2191);
                    	    op=operationDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addOperation(op); }

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:524:5: ( 'constraints' (inv= invariantClause )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==64) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // Generator.g:524:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,64,FOLLOW_64_in_associationClassDefinition2212); if (state.failed) return n;

                    // Generator.g:525:7: (inv= invariantClause )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==AT||LA41_0==76||LA41_0==85) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // Generator.g:526:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_associationClassDefinition2232);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:529:5: ( 'statemachines' (sm= stateMachine )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==108) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // Generator.g:529:7: 'statemachines' (sm= stateMachine )*
                    {
                    match(input,108,FOLLOW_108_in_associationClassDefinition2258); if (state.failed) return n;

                    // Generator.g:530:7: (sm= stateMachine )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==104) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // Generator.g:531:9: sm= stateMachine
                    	    {
                    	    pushFollow(FOLLOW_stateMachine_in_associationClassDefinition2278);
                    	    sm=stateMachine();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addStateMachine(sm); }

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:535:5: ( ( keyAggregation | keyComposition ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // Generator.g:535:7: ( keyAggregation | keyComposition )
                    {
                    if ( state.backtracking==0 ) { t = input.LT(1); }

                    // Generator.g:536:7: ( keyAggregation | keyComposition )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==IDENT) ) {
                        int LA45_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                            alt45=1;
                        }
                        else if ( ((input.LT(1).getText().equals("composition"))) ) {
                            alt45=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 45, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }
                    switch (alt45) {
                        case 1 :
                            // Generator.g:536:9: keyAggregation
                            {
                            pushFollow(FOLLOW_keyAggregation_in_associationClassDefinition2319);
                            keyAggregation();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:536:26: keyComposition
                            {
                            pushFollow(FOLLOW_keyComposition_in_associationClassDefinition2323);
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


            match(input,73,FOLLOW_73_in_associationClassDefinition2346); if (state.failed) return n;

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
    // Generator.g:546:1: attributeDefinition returns [ASTAttribute n] : as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? ;
    public final ASTAttribute attributeDefinition() throws RecognitionException {
        ASTAttribute n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTType t =null;

        GeneratorParser.expression_return deriveExpression =null;

        GeneratorParser.expression_return initExpression =null;


        try {
            // Generator.g:547:2: (as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )? )
            // Generator.g:548:2: as= annotationSet name= IDENT COLON t= type ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )? ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_attributeDefinition2374);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_attributeDefinition2382); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_attributeDefinition2384); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_attributeDefinition2388);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:551:5: ( ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression ) | ( keyInit ( COLON | EQUAL ) initExpression= expression ) )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                int LA48_1 = input.LA(2);

                if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                    alt48=1;
                }
                else if ( ((input.LT(1).getText().equals("init"))) ) {
                    alt48=2;
                }
            }
            switch (alt48) {
                case 1 :
                    // Generator.g:552:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    {
                    // Generator.g:552:9: ( ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression )
                    // Generator.g:552:10: ( keyDerive | keyDerived ) ( COLON | EQUAL ) deriveExpression= expression
                    {
                    // Generator.g:552:10: ( keyDerive | keyDerived )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==IDENT) ) {
                        int LA47_1 = input.LA(2);

                        if ( ((input.LT(1).getText().equals("derive"))) ) {
                            alt47=1;
                        }
                        else if ( ((input.LT(1).getText().equals("derived"))) ) {
                            alt47=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return n;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 47, 1, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }
                    switch (alt47) {
                        case 1 :
                            // Generator.g:552:11: keyDerive
                            {
                            pushFollow(FOLLOW_keyDerive_in_attributeDefinition2412);
                            keyDerive();

                            state._fsp--;
                            if (state.failed) return n;

                            }
                            break;
                        case 2 :
                            // Generator.g:552:21: keyDerived
                            {
                            pushFollow(FOLLOW_keyDerived_in_attributeDefinition2414);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2427);
                    deriveExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:554:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    {
                    // Generator.g:554:9: ( keyInit ( COLON | EQUAL ) initExpression= expression )
                    // Generator.g:554:10: keyInit ( COLON | EQUAL ) initExpression= expression
                    {
                    pushFollow(FOLLOW_keyInit_in_attributeDefinition2447);
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


                    pushFollow(FOLLOW_expression_in_attributeDefinition2463);
                    initExpression=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    }


                    }
                    break;

            }


            // Generator.g:556:5: ( SEMI )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==SEMI) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // Generator.g:556:5: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_attributeDefinition2477); if (state.failed) return n;

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
    // Generator.g:570:1: operationDefinition returns [ASTOperation n] : as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? ;
    public final ASTOperation operationDefinition() throws RecognitionException {
        ASTOperation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        List<ASTVariableDeclaration> pl =null;

        ASTType t =null;

        GeneratorParser.expression_return e =null;

        GeneratorParser.blockStat_return s =null;

        ASTPrePostClause ppc =null;


        try {
            // Generator.g:571:2: (as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )? )
            // Generator.g:572:2: as= annotationSet name= IDENT pl= paramList ( COLON t= type )? ( ( EQUAL e= expression ) | (s= blockStat ) )? (ppc= prePostClause )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_operationDefinition2508);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationDefinition2518); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_operationDefinition2528);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:578:5: ( COLON t= type )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==COLON) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // Generator.g:578:7: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_operationDefinition2542); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_operationDefinition2548);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTOperation(name, pl, t); n.setAnnotations(as); }

            // Generator.g:580:5: ( ( EQUAL e= expression ) | (s= blockStat ) )?
            int alt51=3;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==EQUAL) ) {
                alt51=1;
            }
            else if ( (LA51_0==61) ) {
                alt51=2;
            }
            switch (alt51) {
                case 1 :
                    // Generator.g:581:9: ( EQUAL e= expression )
                    {
                    // Generator.g:581:9: ( EQUAL e= expression )
                    // Generator.g:581:11: EQUAL e= expression
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_operationDefinition2576); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_operationDefinition2582);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setExpression((e!=null?e.n:null)); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:582:9: (s= blockStat )
                    {
                    // Generator.g:582:9: (s= blockStat )
                    // Generator.g:582:11: s= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_operationDefinition2604);
                    s=blockStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setStatement((s!=null?s.n:null));  }

                    }


                    }
                    break;

            }


            // Generator.g:584:5: (ppc= prePostClause )*
            loop52:
            do {
                int alt52=2;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // Generator.g:584:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_operationDefinition2626);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            // Generator.g:585:5: ( SEMI )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==SEMI) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // Generator.g:585:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_operationDefinition2639); if (state.failed) return n;

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
    // Generator.g:595:1: associationDefinition returns [ASTAssociation n] : as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' ;
    public final ASTAssociation associationDefinition() throws RecognitionException {
        ASTAssociation n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        ASTAssociationEnd ae =null;


         Token t = null; 
        try {
            // Generator.g:597:2: (as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end' )
            // Generator.g:598:2: as= annotationSet ( keyAssociation | keyAggregation | keyComposition ) name= IDENT 'between' ae= associationEnd (ae= associationEnd )+ 'end'
            {
            pushFollow(FOLLOW_annotationSet_in_associationDefinition2670);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            // Generator.g:600:5: ( keyAssociation | keyAggregation | keyComposition )
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==IDENT) ) {
                int LA54_1 = input.LA(2);

                if ( ((input.LT(1).getText().equals("association"))) ) {
                    alt54=1;
                }
                else if ( ((input.LT(1).getText().equals("aggregation"))) ) {
                    alt54=2;
                }
                else if ( ((input.LT(1).getText().equals("composition"))) ) {
                    alt54=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // Generator.g:600:7: keyAssociation
                    {
                    pushFollow(FOLLOW_keyAssociation_in_associationDefinition2684);
                    keyAssociation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 2 :
                    // Generator.g:600:24: keyAggregation
                    {
                    pushFollow(FOLLOW_keyAggregation_in_associationDefinition2688);
                    keyAggregation();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;
                case 3 :
                    // Generator.g:600:41: keyComposition
                    {
                    pushFollow(FOLLOW_keyComposition_in_associationDefinition2692);
                    keyComposition();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationDefinition2702); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociation(t, name); n.setAnnotations(as); }

            match(input,62,FOLLOW_62_in_associationDefinition2710); if (state.failed) return n;

            pushFollow(FOLLOW_associationEnd_in_associationDefinition2718);
            ae=associationEnd();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addEnd(ae); }

            // Generator.g:604:5: (ae= associationEnd )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==AT||LA55_0==IDENT||LA55_0==55||(LA55_0 >= 58 && LA55_0 <= 59)||LA55_0==75||LA55_0==85||LA55_0==88||(LA55_0 >= 101 && LA55_0 <= 102)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Generator.g:604:7: ae= associationEnd
            	    {
            	    pushFollow(FOLLOW_associationEnd_in_associationDefinition2730);
            	    ae=associationEnd();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addEnd(ae); }

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            match(input,73,FOLLOW_73_in_associationDefinition2741); if (state.failed) return n;

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
    // Generator.g:613:1: associationEnd returns [ASTAssociationEnd n] : as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? ;
    public final ASTAssociationEnd associationEnd() throws RecognitionException {
        ASTAssociationEnd n = null;


        Token name=null;
        Token rn=null;
        Token sr=null;
        Token rd=null;
        Set<ASTAnnotation> as =null;

        ASTMultiplicity m =null;

        ASTElemVarsDeclaration parameter =null;

        GeneratorParser.expression_return exp =null;

        List<ASTVariableDeclaration> qualifiers =null;


        try {
            // Generator.g:614:2: (as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )? )
            // Generator.g:615:2: as= annotationSet name= IDENT LBRACK m= multiplicity RBRACK ( keyRole rn= IDENT )? ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )* ( SEMI )?
            {
            pushFollow(FOLLOW_annotationSet_in_associationEnd2766);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2774); if (state.failed) return n;

            match(input,LBRACK,FOLLOW_LBRACK_in_associationEnd2776); if (state.failed) return n;

            pushFollow(FOLLOW_multiplicity_in_associationEnd2780);
            m=multiplicity();

            state._fsp--;
            if (state.failed) return n;

            match(input,RBRACK,FOLLOW_RBRACK_in_associationEnd2782); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTAssociationEnd(name, m); n.setAnnotations(as); }

            // Generator.g:617:5: ( keyRole rn= IDENT )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENT) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==IDENT) ) {
                    int LA56_3 = input.LA(3);

                    if ( ((input.LT(1).getText().equals("role"))) ) {
                        alt56=1;
                    }
                }
            }
            switch (alt56) {
                case 1 :
                    // Generator.g:617:7: keyRole rn= IDENT
                    {
                    pushFollow(FOLLOW_keyRole_in_associationEnd2793);
                    keyRole();

                    state._fsp--;
                    if (state.failed) return n;

                    rn=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2797); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.setRolename(rn); }

                    }
                    break;

            }


            // Generator.g:618:5: ( 'ordered' | 'subsets' sr= IDENT | keyUnion | 'redefines' rd= IDENT | ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression | keyQualifier qualifiers= paramList )*
            loop59:
            do {
                int alt59=7;
                switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA59_3 = input.LA(2);

                    if ( ((input.LT(1).getText().equals("union"))) ) {
                        alt59=3;
                    }
                    else if ( (((input.LT(1).getText().equals("derived"))||(input.LT(1).getText().equals("derive")))) ) {
                        alt59=5;
                    }
                    else if ( ((input.LT(1).getText().equals("qualifier"))) ) {
                        alt59=6;
                    }


                    }
                    break;
                case 100:
                    {
                    alt59=1;
                    }
                    break;
                case 110:
                    {
                    alt59=2;
                    }
                    break;
                case 105:
                    {
                    alt59=4;
                    }
                    break;

                }

                switch (alt59) {
            	case 1 :
            	    // Generator.g:619:9: 'ordered'
            	    {
            	    match(input,100,FOLLOW_100_in_associationEnd2818); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setOrdered(); }

            	    }
            	    break;
            	case 2 :
            	    // Generator.g:620:9: 'subsets' sr= IDENT
            	    {
            	    match(input,110,FOLLOW_110_in_associationEnd2830); if (state.failed) return n;

            	    sr=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2834); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addSubsetsRolename(sr); }

            	    }
            	    break;
            	case 3 :
            	    // Generator.g:621:9: keyUnion
            	    {
            	    pushFollow(FOLLOW_keyUnion_in_associationEnd2846);
            	    keyUnion();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setUnion(true); }

            	    }
            	    break;
            	case 4 :
            	    // Generator.g:622:9: 'redefines' rd= IDENT
            	    {
            	    match(input,105,FOLLOW_105_in_associationEnd2858); if (state.failed) return n;

            	    rd=(Token)match(input,IDENT,FOLLOW_IDENT_in_associationEnd2862); if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRedefinesRolename(rd); }

            	    }
            	    break;
            	case 5 :
            	    // Generator.g:623:9: ( keyDerived | keyDerive ) ( LPAREN parameter= elemVarsDeclaration RPAREN )? EQUAL exp= expression
            	    {
            	    // Generator.g:623:9: ( keyDerived | keyDerive )
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==IDENT) ) {
            	        int LA57_1 = input.LA(2);

            	        if ( ((input.LT(1).getText().equals("derived"))) ) {
            	            alt57=1;
            	        }
            	        else if ( ((input.LT(1).getText().equals("derive"))) ) {
            	            alt57=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return n;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 57, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // Generator.g:623:10: keyDerived
            	            {
            	            pushFollow(FOLLOW_keyDerived_in_associationEnd2875);
            	            keyDerived();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:623:21: keyDerive
            	            {
            	            pushFollow(FOLLOW_keyDerive_in_associationEnd2877);
            	            keyDerive();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    // Generator.g:623:32: ( LPAREN parameter= elemVarsDeclaration RPAREN )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==LPAREN) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // Generator.g:623:34: LPAREN parameter= elemVarsDeclaration RPAREN
            	            {
            	            match(input,LPAREN,FOLLOW_LPAREN_in_associationEnd2882); if (state.failed) return n;

            	            pushFollow(FOLLOW_elemVarsDeclaration_in_associationEnd2888);
            	            parameter=elemVarsDeclaration();

            	            state._fsp--;
            	            if (state.failed) return n;

            	            match(input,RPAREN,FOLLOW_RPAREN_in_associationEnd2890); if (state.failed) return n;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_associationEnd2894); if (state.failed) return n;

            	    pushFollow(FOLLOW_expression_in_associationEnd2898);
            	    exp=expression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.setDerived((exp!=null?exp.n:null), parameter); }

            	    }
            	    break;
            	case 6 :
            	    // Generator.g:624:9: keyQualifier qualifiers= paramList
            	    {
            	    pushFollow(FOLLOW_keyQualifier_in_associationEnd2910);
            	    keyQualifier();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    pushFollow(FOLLOW_paramList_in_associationEnd2916);
            	    qualifiers=paramList();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) {n.setQualifiers(qualifiers); }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            // Generator.g:626:5: ( SEMI )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SEMI) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // Generator.g:626:7: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_associationEnd2933); if (state.failed) return n;

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
    // Generator.g:640:1: multiplicity returns [ASTMultiplicity n] :mr= multiplicityRange ( COMMA mr= multiplicityRange )* ;
    public final ASTMultiplicity multiplicity() throws RecognitionException {
        ASTMultiplicity n = null;


        ASTMultiplicityRange mr =null;


        try {
            // Generator.g:641:5: (mr= multiplicityRange ( COMMA mr= multiplicityRange )* )
            // Generator.g:642:5: mr= multiplicityRange ( COMMA mr= multiplicityRange )*
            {
            if ( state.backtracking==0 ) { 
            	Token t = input.LT(1); // remember start position of expression
            	n = new ASTMultiplicity(t);
                }

            pushFollow(FOLLOW_multiplicityRange_in_multiplicity2968);
            mr=multiplicityRange();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.addRange(mr); }

            // Generator.g:647:5: ( COMMA mr= multiplicityRange )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==COMMA) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // Generator.g:647:7: COMMA mr= multiplicityRange
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiplicity2978); if (state.failed) return n;

            	    pushFollow(FOLLOW_multiplicityRange_in_multiplicity2982);
            	    mr=multiplicityRange();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addRange(mr); }

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // Generator.g:650:1: multiplicityRange returns [ASTMultiplicityRange n] : ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? ;
    public final ASTMultiplicityRange multiplicityRange() throws RecognitionException {
        ASTMultiplicityRange n = null;


        int ms1 =0;

        int ms2 =0;


        try {
            // Generator.g:651:5: (ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )? )
            // Generator.g:652:5: ms1= multiplicitySpec ( DOTDOT ms2= multiplicitySpec )?
            {
            pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3011);
            ms1=multiplicitySpec();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTMultiplicityRange(ms1); }

            // Generator.g:653:5: ( DOTDOT ms2= multiplicitySpec )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DOTDOT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // Generator.g:653:7: DOTDOT ms2= multiplicitySpec
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_multiplicityRange3021); if (state.failed) return n;

                    pushFollow(FOLLOW_multiplicitySpec_in_multiplicityRange3025);
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
    // Generator.g:656:1: multiplicitySpec returns [int m] : (i= INT | STAR );
    public final int multiplicitySpec() throws RecognitionException {
        int m = 0;


        Token i=null;

         m = -1; 
        try {
            // Generator.g:658:7: (i= INT | STAR )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==INT) ) {
                alt63=1;
            }
            else if ( (LA63_0==STAR) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return m;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }
            switch (alt63) {
                case 1 :
                    // Generator.g:659:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_multiplicitySpec3059); if (state.failed) return m;

                    if ( state.backtracking==0 ) { m = Integer.parseInt((i!=null?i.getText():null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:660:7: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplicitySpec3069); if (state.failed) return m;

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
    // Generator.g:681:1: invariant returns [ASTConstraintDefinition n] : 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* ;
    public final ASTConstraintDefinition invariant() throws RecognitionException {
        ASTConstraintDefinition n = null;


        Token v=null;
        ASTSimpleType t =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:682:5: ( 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )* )
            // Generator.g:683:5: 'context' (v= IDENT ( ',' v= IDENT )* COLON )? t= simpleType (inv= invariantClause )*
            {
            if ( state.backtracking==0 ) { n = new ASTConstraintDefinition(); }

            match(input,65,FOLLOW_65_in_invariant3110); if (state.failed) return n;

            // Generator.g:685:5: (v= IDENT ( ',' v= IDENT )* COLON )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IDENT) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==COLON||LA65_1==COMMA) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // Generator.g:685:7: v= IDENT ( ',' v= IDENT )* COLON
                    {
                    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3120); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addVarName(v); }

                    // Generator.g:686:8: ( ',' v= IDENT )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==COMMA) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // Generator.g:686:9: ',' v= IDENT
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_invariant3133); if (state.failed) return n;

                    	    v=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariant3137); if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addVarName(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    match(input,COLON,FOLLOW_COLON_in_invariant3145); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_simpleType_in_invariant3157);
            t=simpleType();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setType(t); }

            // Generator.g:688:5: (inv= invariantClause )*
            loop66:
            do {
                int alt66=2;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // Generator.g:688:7: inv= invariantClause
            	    {
            	    pushFollow(FOLLOW_invariantClause_in_invariant3169);
            	    inv=invariantClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

            	    }
            	    break;

            	default :
            	    break loop66;
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
    // Generator.g:695:1: invariantClause returns [ASTInvariantClause n] : (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression );
    public final ASTInvariantClause invariantClause() throws RecognitionException {
        ASTInvariantClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:696:2: (as= annotationSet 'inv' (name= IDENT )? COLON e= expression | 'existential' 'inv' (name= IDENT )? COLON e= expression )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==AT||LA69_0==IDENT||LA69_0==55||(LA69_0 >= 58 && LA69_0 <= 59)||LA69_0==75||LA69_0==85||LA69_0==88||(LA69_0 >= 101 && LA69_0 <= 102)) ) {
                alt69=1;
            }
            else if ( (LA69_0==76) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // Generator.g:697:2: as= annotationSet 'inv' (name= IDENT )? COLON e= expression
                    {
                    pushFollow(FOLLOW_annotationSet_in_invariantClause3199);
                    as=annotationSet();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,85,FOLLOW_85_in_invariantClause3207); if (state.failed) return n;

                    // Generator.g:698:13: (name= IDENT )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==IDENT) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // Generator.g:698:15: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3213); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3218); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3222);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTInvariantClause(name, (e!=null?e.n:null)); n.setAnnotations(as); }

                    }
                    break;
                case 2 :
                    // Generator.g:700:7: 'existential' 'inv' (name= IDENT )? COLON e= expression
                    {
                    match(input,76,FOLLOW_76_in_invariantClause3239); if (state.failed) return n;

                    match(input,85,FOLLOW_85_in_invariantClause3241); if (state.failed) return n;

                    // Generator.g:700:27: (name= IDENT )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==IDENT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // Generator.g:700:29: name= IDENT
                            {
                            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_invariantClause3247); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_invariantClause3252); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_invariantClause3256);
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
    // Generator.g:712:1: prePost returns [ASTPrePost n] : 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ ;
    public final ASTPrePost prePost() throws RecognitionException {
        ASTPrePost n = null;


        Token classname=null;
        Token opname=null;
        List<ASTVariableDeclaration> pl =null;

        ASTType rt =null;

        ASTPrePostClause ppc =null;


        try {
            // Generator.g:713:5: ( 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+ )
            // Generator.g:714:5: 'context' classname= IDENT COLON_COLON opname= IDENT pl= paramList ( COLON rt= type )? (ppc= prePostClause )+
            {
            match(input,65,FOLLOW_65_in_prePost3289); if (state.failed) return n;

            classname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3293); if (state.failed) return n;

            match(input,COLON_COLON,FOLLOW_COLON_COLON_in_prePost3295); if (state.failed) return n;

            opname=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePost3299); if (state.failed) return n;

            pushFollow(FOLLOW_paramList_in_prePost3303);
            pl=paramList();

            state._fsp--;
            if (state.failed) return n;

            // Generator.g:714:69: ( COLON rt= type )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==COLON) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // Generator.g:714:71: COLON rt= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_prePost3307); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_prePost3311);
                    rt=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) { n = new ASTPrePost(classname, opname, pl, rt); }

            // Generator.g:716:5: (ppc= prePostClause )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                alt71 = dfa71.predict(input);
                switch (alt71) {
            	case 1 :
            	    // Generator.g:716:7: ppc= prePostClause
            	    {
            	    pushFollow(FOLLOW_prePostClause_in_prePost3330);
            	    ppc=prePostClause();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addPrePostClause(ppc); }

            	    }
            	    break;

            	default :
            	    if ( cnt71 >= 1 ) break loop71;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
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
    // Generator.g:723:1: prePostClause returns [ASTPrePostClause n] : as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression ;
    public final ASTPrePostClause prePostClause() throws RecognitionException {
        ASTPrePostClause n = null;


        Token name=null;
        Set<ASTAnnotation> as =null;

        GeneratorParser.expression_return e =null;


         Token t = null; 
        try {
            // Generator.g:725:2: (as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression )
            // Generator.g:726:2: as= annotationSet ( 'pre' | 'post' ) (name= IDENT )? COLON e= expression
            {
            pushFollow(FOLLOW_annotationSet_in_prePostClause3364);
            as=annotationSet();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { t = input.LT(1); }

            if ( (input.LA(1) >= 101 && input.LA(1) <= 102) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // Generator.g:728:25: (name= IDENT )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==IDENT) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // Generator.g:728:27: name= IDENT
                    {
                    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_prePostClause3391); if (state.failed) return n;

                    }
                    break;

            }


            match(input,COLON,FOLLOW_COLON_in_prePostClause3396); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_prePostClause3400);
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
    // Generator.g:732:1: annotationSet returns [Set<ASTAnnotation> annotations] : (an= annotation )* ;
    public final Set<ASTAnnotation> annotationSet() throws RecognitionException {
        Set<ASTAnnotation> annotations = null;


        ASTAnnotation an =null;


         annotations = new HashSet<ASTAnnotation>(); 
        try {
            // Generator.g:734:2: ( (an= annotation )* )
            // Generator.g:735:2: (an= annotation )*
            {
            // Generator.g:735:2: (an= annotation )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==AT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // Generator.g:735:3: an= annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotationSet3427);
            	    an=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(an); }

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // Generator.g:738:1: annotation returns [ASTAnnotation n] : AT name= IDENT LPAREN values= annotationValues RPAREN ;
    public final ASTAnnotation annotation() throws RecognitionException {
        ASTAnnotation n = null;


        Token name=null;
        Map<Token, Token> values =null;


        try {
            // Generator.g:738:37: ( AT name= IDENT LPAREN values= annotationValues RPAREN )
            // Generator.g:739:2: AT name= IDENT LPAREN values= annotationValues RPAREN
            {
            match(input,AT,FOLLOW_AT_in_annotation3446); if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotation3450); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTAnnotation(name);}

            match(input,LPAREN,FOLLOW_LPAREN_in_annotation3456); if (state.failed) return n;

            pushFollow(FOLLOW_annotationValues_in_annotation3465);
            values=annotationValues();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setValues(values); }

            match(input,RPAREN,FOLLOW_RPAREN_in_annotation3470); if (state.failed) return n;

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
    // Generator.g:745:1: annotationValues returns [Map<Token, Token> values] : (firstVal= annotationValue )? ( COMMA val= annotationValue )* ;
    public final Map<Token, Token> annotationValues() throws RecognitionException {
        Map<Token, Token> values = null;


        GeneratorParser.annotationValue_return firstVal =null;

        GeneratorParser.annotationValue_return val =null;


         values = new HashMap<Token, Token>(); 
        try {
            // Generator.g:747:2: ( (firstVal= annotationValue )? ( COMMA val= annotationValue )* )
            // Generator.g:748:2: (firstVal= annotationValue )? ( COMMA val= annotationValue )*
            {
            // Generator.g:748:2: (firstVal= annotationValue )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==IDENT) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // Generator.g:748:3: firstVal= annotationValue
                    {
                    pushFollow(FOLLOW_annotationValue_in_annotationValues3493);
                    firstVal=annotationValue();

                    state._fsp--;
                    if (state.failed) return values;

                    if ( state.backtracking==0 ) { values.put((firstVal!=null?firstVal.name:null), (firstVal!=null?firstVal.value:null)); }

                    }
                    break;

            }


            // Generator.g:749:2: ( COMMA val= annotationValue )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // Generator.g:749:3: COMMA val= annotationValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_annotationValues3501); if (state.failed) return values;

            	    pushFollow(FOLLOW_annotationValue_in_annotationValues3505);
            	    val=annotationValue();

            	    state._fsp--;
            	    if (state.failed) return values;

            	    if ( state.backtracking==0 ) { values.put((val!=null?val.name:null), (val!=null?val.value:null)); }

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // Generator.g:752:1: annotationValue returns [Token name, Token value] : aName= IDENT EQUAL aValue= NON_OCL_STRING ;
    public final GeneratorParser.annotationValue_return annotationValue() throws RecognitionException {
        GeneratorParser.annotationValue_return retval = new GeneratorParser.annotationValue_return();
        retval.start = input.LT(1);


        Token aName=null;
        Token aValue=null;

        try {
            // Generator.g:752:50: (aName= IDENT EQUAL aValue= NON_OCL_STRING )
            // Generator.g:753:2: aName= IDENT EQUAL aValue= NON_OCL_STRING
            {
            aName=(Token)match(input,IDENT,FOLLOW_IDENT_in_annotationValue3524); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.name = aName; }

            match(input,EQUAL,FOLLOW_EQUAL_in_annotationValue3529); if (state.failed) return retval;

            aValue=(Token)match(input,NON_OCL_STRING,FOLLOW_NON_OCL_STRING_in_annotationValue3535); if (state.failed) return retval;

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
    // Generator.g:758:1: stateMachine returns [ASTStateMachine n] : ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' ;
    public final ASTStateMachine stateMachine() throws RecognitionException {
        ASTStateMachine n = null;


        Token smName=null;
        ASTStateDefinition s =null;

        ASTTransitionDefinition t =null;


        try {
            // Generator.g:759:5: ( ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end' )
            // Generator.g:760:5: ( 'psm' ) smName= IDENT 'states' (s= stateDefinition )+ 'transitions' (t= transitionDefinition )+ 'end'
            {
            // Generator.g:760:5: ( 'psm' )
            // Generator.g:761:8: 'psm'
            {
            match(input,104,FOLLOW_104_in_stateMachine3565); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTProtocolStateMachine(); }

            }


            smName=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateMachine3598); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setName(smName); }

            match(input,109,FOLLOW_109_in_stateMachine3611); if (state.failed) return n;

            // Generator.g:768:10: (s= stateDefinition )+
            int cnt76=0;
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==IDENT) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // Generator.g:768:11: s= stateDefinition
            	    {
            	    pushFollow(FOLLOW_stateDefinition_in_stateMachine3627);
            	    s=stateDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addStateDefinition(s); }

            	    }
            	    break;

            	default :
            	    if ( cnt76 >= 1 ) break loop76;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(76, input);
                        throw eee;
                }
                cnt76++;
            } while (true);


            match(input,112,FOLLOW_112_in_stateMachine3637); if (state.failed) return n;

            // Generator.g:770:10: (t= transitionDefinition )+
            int cnt77=0;
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==IDENT) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // Generator.g:770:11: t= transitionDefinition
            	    {
            	    pushFollow(FOLLOW_transitionDefinition_in_stateMachine3653);
            	    t=transitionDefinition();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.addTransitionDefinition(t); }

            	    }
            	    break;

            	default :
            	    if ( cnt77 >= 1 ) break loop77;
            	    if (state.backtracking>0) {state.failed=true; return n;}
                        EarlyExitException eee =
                            new EarlyExitException(77, input);
                        throw eee;
                }
                cnt77++;
            } while (true);


            match(input,73,FOLLOW_73_in_stateMachine3663); if (state.failed) return n;

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
    // Generator.g:774:1: stateDefinition returns [ASTStateDefinition n] : sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? ;
    public final ASTStateDefinition stateDefinition() throws RecognitionException {
        ASTStateDefinition n = null;


        Token sn=null;
        Token stateType=null;
        GeneratorParser.expression_return stateInv =null;


        try {
            // Generator.g:774:47: (sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )? )
            // Generator.g:775:3: sn= IDENT ( COLON stateType= IDENT )? ( LBRACK stateInv= expression RBRACK )?
            {
            sn=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition3679); if (state.failed) return n;

            if ( state.backtracking==0 ) {n = new ASTStateDefinition(sn); }

            // Generator.g:776:3: ( COLON stateType= IDENT )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==COLON) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // Generator.g:776:5: COLON stateType= IDENT
                    {
                    match(input,COLON,FOLLOW_COLON_in_stateDefinition3687); if (state.failed) return n;

                    stateType=(Token)match(input,IDENT,FOLLOW_IDENT_in_stateDefinition3691); if (state.failed) return n;

                    if ( state.backtracking==0 ) {n.setType(stateType); }

                    }
                    break;

            }


            // Generator.g:777:3: ( LBRACK stateInv= expression RBRACK )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==LBRACK) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // Generator.g:777:5: LBRACK stateInv= expression RBRACK
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_stateDefinition3702); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_stateDefinition3708);
                    stateInv=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RBRACK,FOLLOW_RBRACK_in_stateDefinition3710); if (state.failed) return n;

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
    // Generator.g:780:1: transitionDefinition returns [ASTTransitionDefinition n] : source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? ;
    public final ASTTransitionDefinition transitionDefinition() throws RecognitionException {
        ASTTransitionDefinition n = null;


        Token source=null;
        Token target=null;
        Token o=null;
        GeneratorParser.expression_return pre =null;

        Token e =null;

        List<ASTVariableDeclaration> args =null;

        GeneratorParser.expression_return post =null;


        try {
            // Generator.g:780:57: (source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )? )
            // Generator.g:781:3: source= IDENT ARROW target= IDENT ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            {
            source=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition3731); if (state.failed) return n;

            match(input,ARROW,FOLLOW_ARROW_in_transitionDefinition3733); if (state.failed) return n;

            target=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition3737); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTTransitionDefinition(source, target); }

            // Generator.g:782:5: ( LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==LBRACE) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // Generator.g:782:6: LBRACE ( LBRACK pre= expression RBRACK )? (e= event |o= IDENT LPAREN (args= paramList )? RPAREN ) ( LBRACK post= expression RBRACK )? RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_transitionDefinition3747); if (state.failed) return n;

                    // Generator.g:783:7: ( LBRACK pre= expression RBRACK )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==LBRACK) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // Generator.g:783:8: LBRACK pre= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition3757); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition3761);
                            pre=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPreCondition((pre!=null?pre.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition3765); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:784:7: (e= event |o= IDENT LPAREN (args= paramList )? RPAREN )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==66) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==IDENT) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;

                    }
                    switch (alt82) {
                        case 1 :
                            // Generator.g:785:11: e= event
                            {
                            pushFollow(FOLLOW_event_in_transitionDefinition3789);
                            e=event();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setEvent(e); }

                            }
                            break;
                        case 2 :
                            // Generator.g:786:11: o= IDENT LPAREN (args= paramList )? RPAREN
                            {
                            o=(Token)match(input,IDENT,FOLLOW_IDENT_in_transitionDefinition3805); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setOperation(o); }

                            match(input,LPAREN,FOLLOW_LPAREN_in_transitionDefinition3809); if (state.failed) return n;

                            // Generator.g:786:50: (args= paramList )?
                            int alt81=2;
                            int LA81_0 = input.LA(1);

                            if ( (LA81_0==LPAREN) ) {
                                alt81=1;
                            }
                            switch (alt81) {
                                case 1 :
                                    // Generator.g:786:51: args= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_transitionDefinition3814);
                                    args=paramList();

                                    state._fsp--;
                                    if (state.failed) return n;

                                    if ( state.backtracking==0 ) { n.setOperationArgs(args); }

                                    }
                                    break;

                            }


                            match(input,RPAREN,FOLLOW_RPAREN_in_transitionDefinition3821); if (state.failed) return n;

                            }
                            break;

                    }


                    // Generator.g:788:7: ( LBRACK post= expression RBRACK )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==LBRACK) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // Generator.g:788:8: LBRACK post= expression RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_transitionDefinition3838); if (state.failed) return n;

                            pushFollow(FOLLOW_expression_in_transitionDefinition3842);
                            post=expression();

                            state._fsp--;
                            if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setPostCondition((post!=null?post.n:null)); }

                            match(input,RBRACK,FOLLOW_RBRACK_in_transitionDefinition3846); if (state.failed) return n;

                            }
                            break;

                    }


                    match(input,RBRACE,FOLLOW_RBRACE_in_transitionDefinition3854); if (state.failed) return n;

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
    // Generator.g:792:1: event returns [Token t] : tcr= 'create' ;
    public final Token event() throws RecognitionException {
        Token t = null;


        Token tcr=null;

        try {
            // Generator.g:792:24: (tcr= 'create' )
            // Generator.g:793:5: tcr= 'create'
            {
            tcr=(Token)match(input,66,FOLLOW_66_in_event3876); if (state.failed) return t;

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
    // Generator.g:796:1: signalDefinition[boolean isAbstract] returns [ASTSignal n] : keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' ;
    public final ASTSignal signalDefinition(boolean isAbstract) throws RecognitionException {
        ASTSignal n = null;


        Token name=null;
        List idListRes =null;

        ASTAttribute a =null;

        ASTInvariantClause inv =null;


        try {
            // Generator.g:796:59: ( keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end' )
            // Generator.g:797:5: keySignal name= IDENT ( LESS idListRes= idList )? ( 'attributes' (a= attributeDefinition )* )? ( 'constraints' (inv= invariantClause )* )? 'end'
            {
            pushFollow(FOLLOW_keySignal_in_signalDefinition3896);
            keySignal();

            state._fsp--;
            if (state.failed) return n;

            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_signalDefinition3900); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new ASTSignal(name, isAbstract); }

            // Generator.g:799:5: ( LESS idListRes= idList )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==LESS) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // Generator.g:799:7: LESS idListRes= idList
                    {
                    match(input,LESS,FOLLOW_LESS_in_signalDefinition3915); if (state.failed) return n;

                    pushFollow(FOLLOW_idList_in_signalDefinition3919);
                    idListRes=idList();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addGenerals(idListRes); }

                    }
                    break;

            }


            // Generator.g:800:5: ( 'attributes' (a= attributeDefinition )* )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==60) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // Generator.g:800:7: 'attributes' (a= attributeDefinition )*
                    {
                    match(input,60,FOLLOW_60_in_signalDefinition3932); if (state.failed) return n;

                    // Generator.g:801:7: (a= attributeDefinition )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==AT||LA86_0==IDENT||LA86_0==55||(LA86_0 >= 58 && LA86_0 <= 59)||LA86_0==75||LA86_0==85||LA86_0==88||(LA86_0 >= 101 && LA86_0 <= 102)) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // Generator.g:801:9: a= attributeDefinition
                    	    {
                    	    pushFollow(FOLLOW_attributeDefinition_in_signalDefinition3945);
                    	    a=attributeDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addAttribute(a); }

                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }
                    break;

            }


            // Generator.g:803:5: ( 'constraints' (inv= invariantClause )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==64) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // Generator.g:803:7: 'constraints' (inv= invariantClause )*
                    {
                    match(input,64,FOLLOW_64_in_signalDefinition3966); if (state.failed) return n;

                    // Generator.g:804:7: (inv= invariantClause )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==AT||LA88_0==IDENT||LA88_0==55||(LA88_0 >= 58 && LA88_0 <= 59)||(LA88_0 >= 75 && LA88_0 <= 76)||LA88_0==85||LA88_0==88||(LA88_0 >= 101 && LA88_0 <= 102)) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // Generator.g:805:9: inv= invariantClause
                    	    {
                    	    pushFollow(FOLLOW_invariantClause_in_signalDefinition3986);
                    	    inv=invariantClause();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addInvariantClause(inv); }

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_signalDefinition4010); if (state.failed) return n;

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
    // Generator.g:811:1: keyUnion :{...}? IDENT ;
    public final void keyUnion() throws RecognitionException {
        try {
            // Generator.g:811:9: ({...}? IDENT )
            // Generator.g:812:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("union"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyUnion", "input.LT(1).getText().equals(\"union\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyUnion4028); if (state.failed) return ;

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
    // Generator.g:814:1: keyAssociation :{...}? IDENT ;
    public final void keyAssociation() throws RecognitionException {
        try {
            // Generator.g:814:15: ({...}? IDENT )
            // Generator.g:815:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("association"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAssociation", "input.LT(1).getText().equals(\"association\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAssociation4042); if (state.failed) return ;

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
    // Generator.g:817:1: keyRole :{...}? IDENT ;
    public final void keyRole() throws RecognitionException {
        try {
            // Generator.g:817:8: ({...}? IDENT )
            // Generator.g:818:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("role"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyRole", "input.LT(1).getText().equals(\"role\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyRole4056); if (state.failed) return ;

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
    // Generator.g:820:1: keyComposition :{...}? IDENT ;
    public final void keyComposition() throws RecognitionException {
        try {
            // Generator.g:820:15: ({...}? IDENT )
            // Generator.g:821:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("composition"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyComposition", "input.LT(1).getText().equals(\"composition\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyComposition4068); if (state.failed) return ;

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
    // Generator.g:823:1: keyAggregation :{...}? IDENT ;
    public final void keyAggregation() throws RecognitionException {
        try {
            // Generator.g:823:15: ({...}? IDENT )
            // Generator.g:824:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("aggregation"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyAggregation", "input.LT(1).getText().equals(\"aggregation\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyAggregation4080); if (state.failed) return ;

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
    // Generator.g:826:1: keyClass :{...}? IDENT ;
    public final void keyClass() throws RecognitionException {
        try {
            // Generator.g:826:9: ({...}? IDENT )
            // Generator.g:827:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("class"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyClass", "input.LT(1).getText().equals(\"class\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyClass4094); if (state.failed) return ;

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
    // Generator.g:829:1: keySignal :{...}? IDENT ;
    public final void keySignal() throws RecognitionException {
        try {
            // Generator.g:829:10: ({...}? IDENT )
            // Generator.g:830:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("signal"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keySignal", "input.LT(1).getText().equals(\"signal\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keySignal4106); if (state.failed) return ;

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
    // Generator.g:832:1: keyDerived :{...}? IDENT ;
    public final void keyDerived() throws RecognitionException {
        try {
            // Generator.g:832:11: ({...}? IDENT )
            // Generator.g:833:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derived"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerived", "input.LT(1).getText().equals(\"derived\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerived4120); if (state.failed) return ;

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
    // Generator.g:835:1: keyDerive :{...}? IDENT ;
    public final void keyDerive() throws RecognitionException {
        try {
            // Generator.g:835:10: ({...}? IDENT )
            // Generator.g:836:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("derive"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyDerive", "input.LT(1).getText().equals(\"derive\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyDerive4134); if (state.failed) return ;

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
    // Generator.g:838:1: keyInit :{...}? IDENT ;
    public final void keyInit() throws RecognitionException {
        try {
            // Generator.g:838:8: ({...}? IDENT )
            // Generator.g:839:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("init"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyInit", "input.LT(1).getText().equals(\"init\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyInit4146); if (state.failed) return ;

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
    // Generator.g:841:1: keyQualifier :{...}? IDENT ;
    public final void keyQualifier() throws RecognitionException {
        try {
            // Generator.g:841:13: ({...}? IDENT )
            // Generator.g:842:3: {...}? IDENT
            {
            if ( !((input.LT(1).getText().equals("qualifier"))) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "keyQualifier", "input.LT(1).getText().equals(\"qualifier\")");
            }

            match(input,IDENT,FOLLOW_IDENT_in_keyQualifier4162); if (state.failed) return ;

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
    // Generator.g:870:1: expressionOnly returns [ASTExpression n] : nExp= expression EOF ;
    public final ASTExpression expressionOnly() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:871:5: (nExp= expression EOF )
            // Generator.g:872:5: nExp= expression EOF
            {
            pushFollow(FOLLOW_expression_in_expressionOnly4189);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_expressionOnly4191); if (state.failed) return n;

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
    // Generator.g:879:1: expression returns [ASTExpression n] : ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression ;
    public final GeneratorParser.expression_return expression() throws RecognitionException {
        GeneratorParser.expression_return retval = new GeneratorParser.expression_return();
        retval.start = input.LT(1);


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e1 =null;

        ASTExpression nCndImplies =null;


         
          ASTLetExpression prevLet = null, firstLet = null;
          ASTExpression e2;
          Token tok = null;

        try {
            // Generator.g:885:5: ( ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression )
            // Generator.g:886:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )* nCndImplies= conditionalImpliesExpression
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of expression */ }

            // Generator.g:887:5: ( 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in' )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==87) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // Generator.g:888:7: 'let' name= IDENT ( COLON t= type )? EQUAL e1= expression ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )* 'in'
            	    {
            	    match(input,87,FOLLOW_87_in_expression4239); if (state.failed) return retval;

            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4250); if (state.failed) return retval;

            	    // Generator.g:889:18: ( COLON t= type )?
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==COLON) ) {
            	        alt90=1;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // Generator.g:889:20: COLON t= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_expression4254); if (state.failed) return retval;

            	            pushFollow(FOLLOW_type_in_expression4258);
            	            t=type();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            }
            	            break;

            	    }


            	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4263); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expression_in_expression4267);
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

            	    // Generator.g:899:7: ( COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression )*
            	    loop92:
            	    do {
            	        int alt92=2;
            	        int LA92_0 = input.LA(1);

            	        if ( (LA92_0==COMMA) ) {
            	            alt92=1;
            	        }


            	        switch (alt92) {
            	    	case 1 :
            	    	    // Generator.g:900:7: COMMA name= IDENT ( COLON t= type )? EQUAL e1= expression
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_expression4305); if (state.failed) return retval;

            	    	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_expression4317); if (state.failed) return retval;

            	    	    // Generator.g:901:20: ( COLON t= type )?
            	    	    int alt91=2;
            	    	    int LA91_0 = input.LA(1);

            	    	    if ( (LA91_0==COLON) ) {
            	    	        alt91=1;
            	    	    }
            	    	    switch (alt91) {
            	    	        case 1 :
            	    	            // Generator.g:901:22: COLON t= type
            	    	            {
            	    	            match(input,COLON,FOLLOW_COLON_in_expression4321); if (state.failed) return retval;

            	    	            pushFollow(FOLLOW_type_in_expression4325);
            	    	            t=type();

            	    	            state._fsp--;
            	    	            if (state.failed) return retval;

            	    	            }
            	    	            break;

            	    	    }


            	    	    match(input,EQUAL,FOLLOW_EQUAL_in_expression4330); if (state.failed) return retval;

            	    	    pushFollow(FOLLOW_expression_in_expression4334);
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
            	    	    break loop92;
            	        }
            	    } while (true);


            	    match(input,82,FOLLOW_82_in_expression4375); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            pushFollow(FOLLOW_conditionalImpliesExpression_in_expression4391);
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
    // Generator.g:933:1: paramList returns [List<ASTVariableDeclaration> paramList] : LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN ;
    public final List<ASTVariableDeclaration> paramList() throws RecognitionException {
        List<ASTVariableDeclaration> paramList = null;


        ASTVariableDeclaration v =null;


         paramList = new ArrayList<ASTVariableDeclaration>(); 
        try {
            // Generator.g:935:5: ( LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN )
            // Generator.g:936:5: LPAREN (v= variableDeclaration ( COMMA v= variableDeclaration )* )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_paramList4424); if (state.failed) return paramList;

            // Generator.g:937:5: (v= variableDeclaration ( COMMA v= variableDeclaration )* )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==IDENT) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // Generator.g:938:7: v= variableDeclaration ( COMMA v= variableDeclaration )*
                    {
                    pushFollow(FOLLOW_variableDeclaration_in_paramList4441);
                    v=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return paramList;

                    if ( state.backtracking==0 ) { paramList.add(v); }

                    // Generator.g:939:7: ( COMMA v= variableDeclaration )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==COMMA) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // Generator.g:939:9: COMMA v= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_paramList4453); if (state.failed) return paramList;

                    	    pushFollow(FOLLOW_variableDeclaration_in_paramList4457);
                    	    v=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return paramList;

                    	    if ( state.backtracking==0 ) { paramList.add(v); }

                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_paramList4477); if (state.failed) return paramList;

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
    // Generator.g:947:1: idList returns [List idList] : id0= IDENT ( COMMA idn= IDENT )* ;
    public final List idList() throws RecognitionException {
        List idList = null;


        Token id0=null;
        Token idn=null;

         idList = new ArrayList(); 
        try {
            // Generator.g:949:5: (id0= IDENT ( COMMA idn= IDENT )* )
            // Generator.g:950:5: id0= IDENT ( COMMA idn= IDENT )*
            {
            id0=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4506); if (state.failed) return idList;

            if ( state.backtracking==0 ) { idList.add(id0); }

            // Generator.g:951:5: ( COMMA idn= IDENT )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==COMMA) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // Generator.g:951:7: COMMA idn= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_idList4516); if (state.failed) return idList;

            	    idn=(Token)match(input,IDENT,FOLLOW_IDENT_in_idList4520); if (state.failed) return idList;

            	    if ( state.backtracking==0 ) { idList.add(idn); }

            	    }
            	    break;

            	default :
            	    break loop96;
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
    // Generator.g:959:1: variableDeclaration returns [ASTVariableDeclaration n] : name= IDENT COLON t= type ;
    public final ASTVariableDeclaration variableDeclaration() throws RecognitionException {
        ASTVariableDeclaration n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:960:5: (name= IDENT COLON t= type )
            // Generator.g:961:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaration4551); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableDeclaration4553); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableDeclaration4557);
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
    // Generator.g:969:1: conditionalImpliesExpression returns [ASTExpression n] : nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* ;
    public final ASTExpression conditionalImpliesExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndOrExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:970:5: (nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )* )
            // Generator.g:971:5: nCndOrExp= conditionalOrExpression (op= 'implies' n1= conditionalOrExpression )*
            {
            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4593);
            nCndOrExp=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndOrExp;}

            // Generator.g:972:5: (op= 'implies' n1= conditionalOrExpression )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==81) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // Generator.g:972:7: op= 'implies' n1= conditionalOrExpression
            	    {
            	    op=(Token)match(input,81,FOLLOW_81_in_conditionalImpliesExpression4606); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4610);
            	    n1=conditionalOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop97;
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
    // Generator.g:981:1: conditionalOrExpression returns [ASTExpression n] : nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* ;
    public final ASTExpression conditionalOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndXorExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:982:5: (nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )* )
            // Generator.g:983:5: nCndXorExp= conditionalXOrExpression (op= 'or' n1= conditionalXOrExpression )*
            {
            pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4655);
            nCndXorExp=conditionalXOrExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndXorExp;}

            // Generator.g:984:5: (op= 'or' n1= conditionalXOrExpression )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==99) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // Generator.g:984:7: op= 'or' n1= conditionalXOrExpression
            	    {
            	    op=(Token)match(input,99,FOLLOW_99_in_conditionalOrExpression4668); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4672);
            	    n1=conditionalXOrExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop98;
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
    // Generator.g:993:1: conditionalXOrExpression returns [ASTExpression n] : nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* ;
    public final ASTExpression conditionalXOrExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nCndAndExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:994:5: (nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )* )
            // Generator.g:995:5: nCndAndExp= conditionalAndExpression (op= 'xor' n1= conditionalAndExpression )*
            {
            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4716);
            nCndAndExp=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nCndAndExp;}

            // Generator.g:996:5: (op= 'xor' n1= conditionalAndExpression )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==116) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // Generator.g:996:7: op= 'xor' n1= conditionalAndExpression
            	    {
            	    op=(Token)match(input,116,FOLLOW_116_in_conditionalXOrExpression4729); if (state.failed) return n;

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4733);
            	    n1=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop99;
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
    // Generator.g:1005:1: conditionalAndExpression returns [ASTExpression n] : nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* ;
    public final ASTExpression conditionalAndExpression() throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTExpression nEqExp =null;

        ASTExpression n1 =null;


        try {
            // Generator.g:1006:5: (nEqExp= equalityExpression (op= 'and' n1= equalityExpression )* )
            // Generator.g:1007:5: nEqExp= equalityExpression (op= 'and' n1= equalityExpression )*
            {
            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression4777);
            nEqExp=equalityExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nEqExp;}

            // Generator.g:1008:5: (op= 'and' n1= equalityExpression )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==57) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // Generator.g:1008:7: op= 'and' n1= equalityExpression
            	    {
            	    op=(Token)match(input,57,FOLLOW_57_in_conditionalAndExpression4790); if (state.failed) return n;

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression4794);
            	    n1=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop100;
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
    // Generator.g:1017:1: equalityExpression returns [ASTExpression n] : nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* ;
    public final ASTExpression equalityExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nRelExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1019:5: (nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )* )
            // Generator.g:1020:5: nRelExp= relationalExpression ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            {
            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4842);
            nRelExp=relationalExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nRelExp;}

            // Generator.g:1021:5: ( ( EQUAL | NOT_EQUAL ) n1= relationalExpression )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==EQUAL||LA101_0==NOT_EQUAL) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // Generator.g:1021:7: ( EQUAL | NOT_EQUAL ) n1= relationalExpression
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


            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4871);
            	    n1=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop101;
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
    // Generator.g:1031:1: relationalExpression returns [ASTExpression n] : nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* ;
    public final ASTExpression relationalExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nAddiExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1033:5: (nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )* )
            // Generator.g:1034:5: nAddiExp= additiveExpression ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            {
            pushFollow(FOLLOW_additiveExpression_in_relationalExpression4920);
            nAddiExp=additiveExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nAddiExp;}

            // Generator.g:1035:5: ( ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0 >= GREATER && LA102_0 <= GREATER_EQUAL)||(LA102_0 >= LESS && LA102_0 <= LESS_EQUAL)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // Generator.g:1035:7: ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) n1= additiveExpression
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


            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression4956);
            	    n1=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop102;
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
    // Generator.g:1045:1: additiveExpression returns [ASTExpression n] : nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* ;
    public final ASTExpression additiveExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nMulExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1047:5: (nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )* )
            // Generator.g:1048:5: nMulExp= multiplicativeExpression ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5006);
            nMulExp=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) {n = nMulExp;}

            // Generator.g:1049:5: ( ( PLUS | MINUS ) n1= multiplicativeExpression )*
            loop103:
            do {
                int alt103=2;
                int LA103_0 = input.LA(1);

                if ( (LA103_0==MINUS||LA103_0==PLUS) ) {
                    alt103=1;
                }


                switch (alt103) {
            	case 1 :
            	    // Generator.g:1049:7: ( PLUS | MINUS ) n1= multiplicativeExpression
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


            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression5034);
            	    n1=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop103;
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
    // Generator.g:1060:1: multiplicativeExpression returns [ASTExpression n] : nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* ;
    public final ASTExpression multiplicativeExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression n1 =null;


         Token op = null; 
        try {
            // Generator.g:1062:5: (nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )* )
            // Generator.g:1063:5: nUnExp= unaryExpression ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            {
            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5084);
            nUnExp=unaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nUnExp;}

            // Generator.g:1064:5: ( ( STAR | SLASH | 'div' ) n1= unaryExpression )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==SLASH||LA104_0==STAR||LA104_0==70) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // Generator.g:1064:7: ( STAR | SLASH | 'div' ) n1= unaryExpression
            	    {
            	    if ( state.backtracking==0 ) { op = input.LT(1); }

            	    if ( input.LA(1)==SLASH||input.LA(1)==STAR||input.LA(1)==70 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression5116);
            	    n1=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = new ASTBinaryExpression(op, n, n1); }

            	    }
            	    break;

            	default :
            	    break loop104;
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
    // Generator.g:1076:1: unaryExpression returns [ASTExpression n] : ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression );
    public final ASTExpression unaryExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nUnExp =null;

        ASTExpression nPosExp =null;


         Token op = null; 
        try {
            // Generator.g:1078:7: ( ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression ) |nPosExp= postfixExpression )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==MINUS||LA105_0==PLUS||LA105_0==90) ) {
                alt105=1;
            }
            else if ( (LA105_0==AT||LA105_0==HASH||(LA105_0 >= IDENT && LA105_0 <= INT)||LA105_0==LPAREN||LA105_0==REAL||(LA105_0 >= STAR && LA105_0 <= STRING)||LA105_0==45||LA105_0==47||(LA105_0 >= 50 && LA105_0 <= 54)||LA105_0==77||LA105_0==80||LA105_0==86||(LA105_0 >= 91 && LA105_0 <= 97)||(LA105_0 >= 106 && LA105_0 <= 107)||LA105_0==113) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // Generator.g:1079:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    {
                    // Generator.g:1079:7: ( ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression )
                    // Generator.g:1079:9: ( 'not' | MINUS | PLUS ) nUnExp= unaryExpression
                    {
                    if ( state.backtracking==0 ) { op = input.LT(1); }

                    if ( input.LA(1)==MINUS||input.LA(1)==PLUS||input.LA(1)==90 ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression5202);
                    nUnExp=unaryExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUnaryExpression(op, nUnExp); }

                    }


                    }
                    break;
                case 2 :
                    // Generator.g:1083:7: nPosExp= postfixExpression
                    {
                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression5222);
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
    // Generator.g:1091:1: postfixExpression returns [ASTExpression n] : nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* ;
    public final ASTExpression postfixExpression() throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nPrimExp =null;

        ASTExpression nPc =null;


         boolean arrow = false; 
        try {
            // Generator.g:1093:5: (nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )* )
            // Generator.g:1094:5: nPrimExp= primaryExpression ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            {
            pushFollow(FOLLOW_primaryExpression_in_postfixExpression5255);
            nPrimExp=primaryExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n = nPrimExp; }

            // Generator.g:1095:5: ( ( ARROW | DOT ) nPc= propertyCall[$n, arrow] )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==DOT) ) {
                    int LA107_2 = input.LA(2);

                    if ( (LA107_2==IDENT) ) {
                        int LA107_4 = input.LA(3);

                        if ( (LA107_4==EOF||(LA107_4 >= ARROW && LA107_4 <= BAR)||(LA107_4 >= COMMA && LA107_4 <= EQUAL)||(LA107_4 >= GREATER && LA107_4 <= GREATER_EQUAL)||LA107_4==IDENT||(LA107_4 >= LBRACE && LA107_4 <= MINUS)||(LA107_4 >= NOT_EQUAL && LA107_4 <= PLUS)||(LA107_4 >= RBRACE && LA107_4 <= RBRACK)||(LA107_4 >= RPAREN && LA107_4 <= SLASH)||LA107_4==STAR||LA107_4==55||(LA107_4 >= 57 && LA107_4 <= 60)||(LA107_4 >= 64 && LA107_4 <= 65)||(LA107_4 >= 70 && LA107_4 <= 76)||(LA107_4 >= 81 && LA107_4 <= 82)||LA107_4==85||(LA107_4 >= 98 && LA107_4 <= 102)||LA107_4==105||LA107_4==108||(LA107_4 >= 110 && LA107_4 <= 111)||LA107_4==116) ) {
                            alt107=1;
                        }


                    }
                    else if ( (LA107_2==86||LA107_2==92||(LA107_2 >= 94 && LA107_2 <= 96)||(LA107_2 >= 106 && LA107_2 <= 107)) ) {
                        alt107=1;
                    }


                }
                else if ( (LA107_0==ARROW) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // Generator.g:1096:6: ( ARROW | DOT ) nPc= propertyCall[$n, arrow]
            	    {
            	    // Generator.g:1096:6: ( ARROW | DOT )
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==ARROW) ) {
            	        alt106=1;
            	    }
            	    else if ( (LA106_0==DOT) ) {
            	        alt106=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return n;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 106, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // Generator.g:1096:8: ARROW
            	            {
            	            match(input,ARROW,FOLLOW_ARROW_in_postfixExpression5273); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = true; }

            	            }
            	            break;
            	        case 2 :
            	            // Generator.g:1096:34: DOT
            	            {
            	            match(input,DOT,FOLLOW_DOT_in_postfixExpression5279); if (state.failed) return n;

            	            if ( state.backtracking==0 ) { arrow = false; }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_propertyCall_in_postfixExpression5290);
            	    nPc=propertyCall(n, arrow);

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n = nPc; }

            	    }
            	    break;

            	default :
            	    break loop107;
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
    // Generator.g:1112:1: primaryExpression returns [ASTExpression n] : (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? );
    public final ASTExpression primaryExpression() throws RecognitionException {
        ASTExpression n = null;


        Token id1=null;
        Token id2=null;
        ASTExpression nLit =null;

        ASTExpression nOr =null;

        ASTExpression nPc =null;

        GeneratorParser.expression_return nExp =null;

        ASTExpression nIfExp =null;

        GeneratorParser.expression_return idExp =null;


        try {
            // Generator.g:1113:7: (nLit= literal |nOr= objectReference |nPc= propertyCall[null, false] | LPAREN nExp= expression RPAREN |nIfExp= ifExpression |id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )? |id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )? )
            int alt111=7;
            switch ( input.LA(1) ) {
            case HASH:
            case INT:
            case REAL:
            case STAR:
            case STRING:
            case 45:
            case 47:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 77:
            case 91:
            case 93:
            case 97:
            case 113:
                {
                alt111=1;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case COLON_COLON:
                    {
                    alt111=1;
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
                case 55:
                case 57:
                case 58:
                case 59:
                case 60:
                case 64:
                case 65:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 81:
                case 82:
                case 85:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 105:
                case 108:
                case 110:
                case 111:
                case 116:
                    {
                    alt111=3;
                    }
                    break;
                case DOT:
                    {
                    switch ( input.LA(3) ) {
                    case 56:
                        {
                        alt111=6;
                        }
                        break;
                    case 63:
                        {
                        alt111=7;
                        }
                        break;
                    case IDENT:
                    case 86:
                    case 92:
                    case 94:
                    case 95:
                    case 96:
                    case 106:
                    case 107:
                        {
                        alt111=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return n;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 7, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 2, input);

                    throw nvae;

                }

                }
                break;
            case AT:
                {
                alt111=2;
                }
                break;
            case 86:
            case 92:
            case 94:
            case 95:
            case 96:
            case 106:
            case 107:
                {
                alt111=3;
                }
                break;
            case LPAREN:
                {
                alt111=4;
                }
                break;
            case 80:
                {
                alt111=5;
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
                    // Generator.g:1114:7: nLit= literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression5330);
                    nLit=literal();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nLit; }

                    }
                    break;
                case 2 :
                    // Generator.g:1115:7: nOr= objectReference
                    {
                    pushFollow(FOLLOW_objectReference_in_primaryExpression5344);
                    nOr=objectReference();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nOr; }

                    }
                    break;
                case 3 :
                    // Generator.g:1116:7: nPc= propertyCall[null, false]
                    {
                    pushFollow(FOLLOW_propertyCall_in_primaryExpression5356);
                    nPc=propertyCall(null, false);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nPc; }

                    }
                    break;
                case 4 :
                    // Generator.g:1117:7: LPAREN nExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5367); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5371);
                    nExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5373); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExp!=null?nExp.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1118:7: nIfExp= ifExpression
                    {
                    pushFollow(FOLLOW_ifExpression_in_primaryExpression5385);
                    nIfExp=ifExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nIfExp; }

                    }
                    break;
                case 6 :
                    // Generator.g:1119:7: id1= IDENT DOT 'allInstances' ( AT 'pre' )? ( LPAREN RPAREN )?
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5397); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5399); if (state.failed) return n;

                    match(input,56,FOLLOW_56_in_primaryExpression5401); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTAllInstancesExpression(id1); }

                    // Generator.g:1121:9: ( AT 'pre' )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==AT) ) {
                        int LA108_1 = input.LA(2);

                        if ( (LA108_1==102) ) {
                            alt108=1;
                        }
                    }
                    switch (alt108) {
                        case 1 :
                            // Generator.g:1121:11: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5424); if (state.failed) return n;

                            match(input,102,FOLLOW_102_in_primaryExpression5426); if (state.failed) return n;

                            if ( state.backtracking==0 ) { n.setIsPre(); }

                            }
                            break;

                    }


                    // Generator.g:1122:9: ( LPAREN RPAREN )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==LPAREN) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Generator.g:1122:11: LPAREN RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5444); if (state.failed) return n;

                            match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5446); if (state.failed) return n;

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // Generator.g:1123:7: id2= IDENT DOT 'byUseId' ( LPAREN idExp= expression RPAREN ) ( AT 'pre' )?
                    {
                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5459); if (state.failed) return n;

                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5461); if (state.failed) return n;

                    match(input,63,FOLLOW_63_in_primaryExpression5463); if (state.failed) return n;

                    // Generator.g:1123:31: ( LPAREN idExp= expression RPAREN )
                    // Generator.g:1123:33: LPAREN idExp= expression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression5467); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_primaryExpression5471);
                    idExp=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression5473); if (state.failed) return n;

                    }


                    if ( state.backtracking==0 ) { n = new ASTObjectByUseIdExpression(id2, (idExp!=null?idExp.n:null)); }

                    // Generator.g:1125:7: ( AT 'pre' )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==AT) ) {
                        int LA110_1 = input.LA(2);

                        if ( (LA110_1==102) ) {
                            alt110=1;
                        }
                    }
                    switch (alt110) {
                        case 1 :
                            // Generator.g:1125:9: AT 'pre'
                            {
                            match(input,AT,FOLLOW_AT_in_primaryExpression5493); if (state.failed) return n;

                            match(input,102,FOLLOW_102_in_primaryExpression5495); if (state.failed) return n;

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
    // Generator.g:1129:1: objectReference returns [ASTExpression n] : AT objectName= IDENT ;
    public final ASTExpression objectReference() throws RecognitionException {
        ASTExpression n = null;


        Token objectName=null;

        try {
            // Generator.g:1130:3: ( AT objectName= IDENT )
            // Generator.g:1131:3: AT objectName= IDENT
            {
            match(input,AT,FOLLOW_AT_in_objectReference5521); if (state.failed) return n;

            objectName=(Token)match(input,IDENT,FOLLOW_IDENT_in_objectReference5529); if (state.failed) return n;

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
    // Generator.g:1145:1: propertyCall[ASTExpression source, boolean followsArrow] returns [ASTExpression n] : ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] );
    public final ASTExpression propertyCall(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTExpression n = null;


        ASTExpression nExpQuery =null;

        ASTExpression nExpIterate =null;

        GeneratorParser.operationExpression_return nExpOperation =null;

        ASTTypeArgExpression nExpType =null;

        ASTInStateExpression nExpInState =null;


        try {
            // Generator.g:1146:7: ({...}?{...}?nExpQuery= queryExpression[source] |nExpIterate= iterateExpression[source] |nExpOperation= operationExpression[source, followsArrow] |nExpType= typeExpression[source, followsArrow] |nExpInState= inStateExpression[source, followsArrow] )
            int alt112=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA112_1 = input.LA(2);

                if ( (((( input.LA(2) == LPAREN )&&( input.LA(2) == LPAREN ))&&( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ))) ) {
                    alt112=1;
                }
                else if ( (true) ) {
                    alt112=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 112, 1, input);

                    throw nvae;

                }
                }
                break;
            case 86:
                {
                alt112=2;
                }
                break;
            case 92:
            case 95:
            case 96:
            case 106:
            case 107:
                {
                alt112=4;
                }
                break;
            case 94:
                {
                alt112=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;

            }

            switch (alt112) {
                case 1 :
                    // Generator.g:1150:7: {...}?{...}?nExpQuery= queryExpression[source]
                    {
                    if ( !(( org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " org.tzi.use.parser.base.ParserHelper.isQueryIdent(input.LT(1)) ");
                    }

                    if ( !(( input.LA(2) == LPAREN )) ) {
                        if (state.backtracking>0) {state.failed=true; return n;}
                        throw new FailedPredicateException(input, "propertyCall", " input.LA(2) == LPAREN ");
                    }

                    pushFollow(FOLLOW_queryExpression_in_propertyCall5594);
                    nExpQuery=queryExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpQuery; }

                    }
                    break;
                case 2 :
                    // Generator.g:1153:7: nExpIterate= iterateExpression[source]
                    {
                    pushFollow(FOLLOW_iterateExpression_in_propertyCall5607);
                    nExpIterate=iterateExpression(source);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpIterate; }

                    }
                    break;
                case 3 :
                    // Generator.g:1154:7: nExpOperation= operationExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_operationExpression_in_propertyCall5620);
                    nExpOperation=operationExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (nExpOperation!=null?nExpOperation.n:null); }

                    }
                    break;
                case 4 :
                    // Generator.g:1155:7: nExpType= typeExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_typeExpression_in_propertyCall5633);
                    nExpType=typeExpression(source, followsArrow);

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nExpType; }

                    }
                    break;
                case 5 :
                    // Generator.g:1156:7: nExpInState= inStateExpression[source, followsArrow]
                    {
                    pushFollow(FOLLOW_inStateExpression_in_propertyCall5646);
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
    // Generator.g:1165:1: queryExpression[ASTExpression range] returns [ASTExpression n] : op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN ;
    public final ASTExpression queryExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token op=null;
        ASTElemVarsDeclaration decls =null;

        GeneratorParser.expression_return nExp =null;


        ASTElemVarsDeclaration decl = new ASTElemVarsDeclaration(); 
        try {
            // Generator.g:1166:69: (op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN )
            // Generator.g:1167:5: op= IDENT LPAREN (decls= elemVarsDeclaration BAR )? nExp= expression RPAREN
            {
            op=(Token)match(input,IDENT,FOLLOW_IDENT_in_queryExpression5681); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_queryExpression5688); if (state.failed) return n;

            // Generator.g:1169:5: (decls= elemVarsDeclaration BAR )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==IDENT) ) {
                int LA113_1 = input.LA(2);

                if ( ((LA113_1 >= BAR && LA113_1 <= COLON)||LA113_1==COMMA) ) {
                    alt113=1;
                }
            }
            switch (alt113) {
                case 1 :
                    // Generator.g:1169:7: decls= elemVarsDeclaration BAR
                    {
                    pushFollow(FOLLOW_elemVarsDeclaration_in_queryExpression5699);
                    decls=elemVarsDeclaration();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {decl = decls;}

                    match(input,BAR,FOLLOW_BAR_in_queryExpression5703); if (state.failed) return n;

                    }
                    break;

            }


            pushFollow(FOLLOW_expression_in_queryExpression5714);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_queryExpression5720); if (state.failed) return n;

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
    // Generator.g:1183:1: iterateExpression[ASTExpression range] returns [ASTExpression n] : i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN ;
    public final ASTExpression iterateExpression(ASTExpression range) throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        ASTElemVarsDeclaration decls =null;

        ASTVariableInitialization init =null;

        GeneratorParser.expression_return nExp =null;


        try {
            // Generator.g:1183:65: (i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN )
            // Generator.g:1184:5: i= 'iterate' LPAREN decls= elemVarsDeclaration SEMI init= variableInitialization BAR nExp= expression RPAREN
            {
            i=(Token)match(input,86,FOLLOW_86_in_iterateExpression5752); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_iterateExpression5758); if (state.failed) return n;

            pushFollow(FOLLOW_elemVarsDeclaration_in_iterateExpression5766);
            decls=elemVarsDeclaration();

            state._fsp--;
            if (state.failed) return n;

            match(input,SEMI,FOLLOW_SEMI_in_iterateExpression5768); if (state.failed) return n;

            pushFollow(FOLLOW_variableInitialization_in_iterateExpression5776);
            init=variableInitialization();

            state._fsp--;
            if (state.failed) return n;

            match(input,BAR,FOLLOW_BAR_in_iterateExpression5778); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_iterateExpression5786);
            nExp=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_iterateExpression5792); if (state.failed) return n;

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
    // Generator.g:1205:1: operationExpression[ASTExpression source, boolean followsArrow] returns [ASTOperationExpression n] : name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? ;
    public final GeneratorParser.operationExpression_return operationExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        GeneratorParser.operationExpression_return retval = new GeneratorParser.operationExpression_return();
        retval.start = input.LT(1);


        Token name=null;
        GeneratorParser.expression_return rolename =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1207:5: (name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )? )
            // Generator.g:1208:5: name= IDENT ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )? ( AT 'pre' )? ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_operationExpression5836); if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n = new ASTOperationExpression(name, source, followsArrow); }

            // Generator.g:1214:5: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )? )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==LBRACK) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // Generator.g:1214:7: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    {
                    match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression5858); if (state.failed) return retval;

                    pushFollow(FOLLOW_expression_in_operationExpression5871);
                    rolename=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    // Generator.g:1216:9: ( COMMA rolename= expression )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==COMMA) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // Generator.g:1216:10: COMMA rolename= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5884); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_expression_in_operationExpression5888);
                    	    rolename=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addExplicitRolenameOrQualifier((rolename!=null?rolename.n:null)); }

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression5900); if (state.failed) return retval;

                    // Generator.g:1219:7: ( LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK )?
                    int alt116=2;
                    int LA116_0 = input.LA(1);

                    if ( (LA116_0==LBRACK) ) {
                        alt116=1;
                    }
                    switch (alt116) {
                        case 1 :
                            // Generator.g:1219:9: LBRACK rolename= expression ( COMMA rolename= expression )* RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_operationExpression5917); if (state.failed) return retval;

                            pushFollow(FOLLOW_expression_in_operationExpression5932);
                            rolename=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            // Generator.g:1221:11: ( COMMA rolename= expression )*
                            loop115:
                            do {
                                int alt115=2;
                                int LA115_0 = input.LA(1);

                                if ( (LA115_0==COMMA) ) {
                                    alt115=1;
                                }


                                switch (alt115) {
                            	case 1 :
                            	    // Generator.g:1221:12: COMMA rolename= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression5947); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression5951);
                            	    rolename=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addQualifier((rolename!=null?rolename.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop115;
                                }
                            } while (true);


                            match(input,RBRACK,FOLLOW_RBRACK_in_operationExpression5965); if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            // Generator.g:1226:5: ( AT 'pre' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==AT) ) {
                int LA118_1 = input.LA(2);

                if ( (LA118_1==102) ) {
                    alt118=1;
                }
            }
            switch (alt118) {
                case 1 :
                    // Generator.g:1226:7: AT 'pre'
                    {
                    match(input,AT,FOLLOW_AT_in_operationExpression5990); if (state.failed) return retval;

                    match(input,102,FOLLOW_102_in_operationExpression5992); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.setIsPre(); }

                    }
                    break;

            }


            // Generator.g:1228:5: ( LPAREN (e= expression ( COMMA e= expression )* )? RPAREN )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==LPAREN) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // Generator.g:1229:7: LPAREN (e= expression ( COMMA e= expression )* )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_operationExpression6017); if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.hasParentheses(); }

                    // Generator.g:1230:7: (e= expression ( COMMA e= expression )* )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==AT||LA120_0==HASH||(LA120_0 >= IDENT && LA120_0 <= INT)||(LA120_0 >= LPAREN && LA120_0 <= MINUS)||LA120_0==PLUS||LA120_0==REAL||(LA120_0 >= STAR && LA120_0 <= STRING)||LA120_0==45||LA120_0==47||(LA120_0 >= 50 && LA120_0 <= 54)||LA120_0==77||LA120_0==80||(LA120_0 >= 86 && LA120_0 <= 87)||(LA120_0 >= 90 && LA120_0 <= 97)||(LA120_0 >= 106 && LA120_0 <= 107)||LA120_0==113) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // Generator.g:1231:7: e= expression ( COMMA e= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_operationExpression6038);
                            e=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            // Generator.g:1232:7: ( COMMA e= expression )*
                            loop119:
                            do {
                                int alt119=2;
                                int LA119_0 = input.LA(1);

                                if ( (LA119_0==COMMA) ) {
                                    alt119=1;
                                }


                                switch (alt119) {
                            	case 1 :
                            	    // Generator.g:1232:9: COMMA e= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_operationExpression6050); if (state.failed) return retval;

                            	    pushFollow(FOLLOW_expression_in_operationExpression6054);
                            	    e=expression();

                            	    state._fsp--;
                            	    if (state.failed) return retval;

                            	    if ( state.backtracking==0 ) { retval.n.addArg((e!=null?e.n:null)); }

                            	    }
                            	    break;

                            	default :
                            	    break loop119;
                                }
                            } while (true);


                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_operationExpression6074); if (state.failed) return retval;

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
    // Generator.g:1239:1: inStateExpression[ASTExpression source, boolean followsArrow] returns [ASTInStateExpression n] : opToken= 'oclInState' LPAREN s= IDENT RPAREN ;
    public final ASTInStateExpression inStateExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTInStateExpression n = null;


        Token opToken=null;
        Token s=null;

        try {
            // Generator.g:1240:35: (opToken= 'oclInState' LPAREN s= IDENT RPAREN )
            // Generator.g:1241:4: opToken= 'oclInState' LPAREN s= IDENT RPAREN
            {
            opToken=(Token)match(input,94,FOLLOW_94_in_inStateExpression6111); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_inStateExpression6116); if (state.failed) return n;

            s=(Token)match(input,IDENT,FOLLOW_IDENT_in_inStateExpression6125); if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_inStateExpression6130); if (state.failed) return n;

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
    // Generator.g:1253:1: typeExpression[ASTExpression source, boolean followsArrow] returns [ASTTypeArgExpression n] : ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN ;
    public final ASTTypeArgExpression typeExpression(ASTExpression source, boolean followsArrow) throws RecognitionException {
        ASTTypeArgExpression n = null;


        ASTType t =null;


         Token opToken = null; 
        try {
            // Generator.g:1256:2: ( ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN )
            // Generator.g:1257:2: ( 'oclAsType' | 'oclIsKindOf' | 'oclIsTypeOf' | 'selectByType' | 'selectByKind' ) LPAREN t= type RPAREN
            {
            if ( state.backtracking==0 ) { opToken = input.LT(1); }

            if ( input.LA(1)==92||(input.LA(1) >= 95 && input.LA(1) <= 96)||(input.LA(1) >= 106 && input.LA(1) <= 107) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_typeExpression6190); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_typeExpression6194);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_typeExpression6196); if (state.failed) return n;

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
    // Generator.g:1268:1: elemVarsDeclaration returns [ASTElemVarsDeclaration n] :var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* ;
    public final ASTElemVarsDeclaration elemVarsDeclaration() throws RecognitionException {
        ASTElemVarsDeclaration n = null;


        Token var1=null;
        Token varN=null;
        ASTType t =null;

        ASTType tN =null;


        try {
            // Generator.g:1269:1: (var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )* )
            // Generator.g:1270:1: var1= IDENT ( COLON t= type )? ( COMMA varN= IDENT ( COLON tN= type )? )*
            {
            if ( state.backtracking==0 ) { n = new ASTElemVarsDeclaration(); }

            var1=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration6234); if (state.failed) return n;

            // Generator.g:1271:17: ( COLON t= type )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==COLON) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // Generator.g:1271:18: COLON t= type
                    {
                    match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6237); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_elemVarsDeclaration6241);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {n.addDeclaration(var1, t);}

            // Generator.g:1272:4: ( COMMA varN= IDENT ( COLON tN= type )? )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // Generator.g:1272:5: COMMA varN= IDENT ( COLON tN= type )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_elemVarsDeclaration6251); if (state.failed) return n;

            	    varN=(Token)match(input,IDENT,FOLLOW_IDENT_in_elemVarsDeclaration6257); if (state.failed) return n;

            	    // Generator.g:1272:24: ( COLON tN= type )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==COLON) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // Generator.g:1272:25: COLON tN= type
            	            {
            	            match(input,COLON,FOLLOW_COLON_in_elemVarsDeclaration6260); if (state.failed) return n;

            	            pushFollow(FOLLOW_type_in_elemVarsDeclaration6266);
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
            	    break loop124;
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
    // Generator.g:1280:1: variableInitialization returns [ASTVariableInitialization n] : name= IDENT COLON t= type EQUAL e= expression ;
    public final ASTVariableInitialization variableInitialization() throws RecognitionException {
        ASTVariableInitialization n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1281:5: (name= IDENT COLON t= type EQUAL e= expression )
            // Generator.g:1282:5: name= IDENT COLON t= type EQUAL e= expression
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_variableInitialization6294); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_variableInitialization6296); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_variableInitialization6300);
            t=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EQUAL,FOLLOW_EQUAL_in_variableInitialization6302); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_variableInitialization6306);
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
    // Generator.g:1291:1: ifExpression returns [ASTExpression n] : i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' ;
    public final ASTExpression ifExpression() throws RecognitionException {
        ASTExpression n = null;


        Token i=null;
        GeneratorParser.expression_return cond =null;

        GeneratorParser.expression_return t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1292:5: (i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif' )
            // Generator.g:1293:5: i= 'if' cond= expression 'then' t= expression 'else' e= expression 'endif'
            {
            i=(Token)match(input,80,FOLLOW_80_in_ifExpression6338); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6342);
            cond=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,111,FOLLOW_111_in_ifExpression6344); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6348);
            t=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,72,FOLLOW_72_in_ifExpression6350); if (state.failed) return n;

            pushFollow(FOLLOW_expression_in_ifExpression6354);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            match(input,74,FOLLOW_74_in_ifExpression6356); if (state.failed) return n;

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
    // Generator.g:1312:1: literal returns [ASTExpression n] : (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR );
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
            // Generator.g:1313:7: (t= 'true' |f= 'false' |i= INT |r= REAL |s= STRING | HASH enumLit= IDENT |enumName= IDENT '::' enumLit= IDENT |nColIt= collectionLiteral |nEColIt= emptyCollectionLiteral |nUndLit= undefinedLiteral |nTupleLit= tupleLiteral |un= STAR )
            int alt125=12;
            switch ( input.LA(1) ) {
            case 113:
                {
                alt125=1;
                }
                break;
            case 77:
                {
                alt125=2;
                }
                break;
            case INT:
                {
                alt125=3;
                }
                break;
            case REAL:
                {
                alt125=4;
                }
                break;
            case STRING:
                {
                alt125=5;
                }
                break;
            case HASH:
                {
                alt125=6;
                }
                break;
            case IDENT:
                {
                alt125=7;
                }
                break;
            case 45:
            case 50:
            case 51:
            case 52:
                {
                int LA125_8 = input.LA(2);

                if ( (LA125_8==LPAREN) ) {
                    alt125=9;
                }
                else if ( (LA125_8==LBRACE) ) {
                    alt125=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 8, input);

                    throw nvae;

                }
                }
                break;
            case 47:
            case 93:
                {
                alt125=9;
                }
                break;
            case 54:
            case 91:
            case 97:
                {
                alt125=10;
                }
                break;
            case 53:
                {
                alt125=11;
                }
                break;
            case STAR:
                {
                alt125=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }

            switch (alt125) {
                case 1 :
                    // Generator.g:1314:7: t= 'true'
                    {
                    t=(Token)match(input,113,FOLLOW_113_in_literal6395); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(true); }

                    }
                    break;
                case 2 :
                    // Generator.g:1315:7: f= 'false'
                    {
                    f=(Token)match(input,77,FOLLOW_77_in_literal6409); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTBooleanLiteral(false); }

                    }
                    break;
                case 3 :
                    // Generator.g:1316:7: i= INT
                    {
                    i=(Token)match(input,INT,FOLLOW_INT_in_literal6422); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTIntegerLiteral(i); }

                    }
                    break;
                case 4 :
                    // Generator.g:1317:7: r= REAL
                    {
                    r=(Token)match(input,REAL,FOLLOW_REAL_in_literal6437); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRealLiteral(r); }

                    }
                    break;
                case 5 :
                    // Generator.g:1318:7: s= STRING
                    {
                    s=(Token)match(input,STRING,FOLLOW_STRING_in_literal6451); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTStringLiteral(s); }

                    }
                    break;
                case 6 :
                    // Generator.g:1319:7: HASH enumLit= IDENT
                    {
                    match(input,HASH,FOLLOW_HASH_in_literal6461); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6465); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumLit);}

                    }
                    break;
                case 7 :
                    // Generator.g:1320:7: enumName= IDENT '::' enumLit= IDENT
                    {
                    enumName=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6477); if (state.failed) return n;

                    match(input,COLON_COLON,FOLLOW_COLON_COLON_in_literal6479); if (state.failed) return n;

                    enumLit=(Token)match(input,IDENT,FOLLOW_IDENT_in_literal6483); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEnumLiteral(enumName, enumLit); }

                    }
                    break;
                case 8 :
                    // Generator.g:1321:7: nColIt= collectionLiteral
                    {
                    pushFollow(FOLLOW_collectionLiteral_in_literal6495);
                    nColIt=collectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nColIt; }

                    }
                    break;
                case 9 :
                    // Generator.g:1322:7: nEColIt= emptyCollectionLiteral
                    {
                    pushFollow(FOLLOW_emptyCollectionLiteral_in_literal6507);
                    nEColIt=emptyCollectionLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nEColIt; }

                    }
                    break;
                case 10 :
                    // Generator.g:1323:7: nUndLit= undefinedLiteral
                    {
                    pushFollow(FOLLOW_undefinedLiteral_in_literal6519);
                    nUndLit=undefinedLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nUndLit; }

                    }
                    break;
                case 11 :
                    // Generator.g:1324:7: nTupleLit= tupleLiteral
                    {
                    pushFollow(FOLLOW_tupleLiteral_in_literal6531);
                    nTupleLit=tupleLiteral();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) {n = nTupleLit; }

                    }
                    break;
                case 12 :
                    // Generator.g:1325:7: un= STAR
                    {
                    un=(Token)match(input,STAR,FOLLOW_STAR_in_literal6543); if (state.failed) return n;

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
    // Generator.g:1333:1: collectionLiteral returns [ASTCollectionLiteral n] : ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE ;
    public final ASTCollectionLiteral collectionLiteral() throws RecognitionException {
        ASTCollectionLiteral n = null;


        ASTCollectionItem ci =null;


         Token op = null; 
        try {
            // Generator.g:1335:5: ( ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE )
            // Generator.g:1336:5: ( 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LBRACE (ci= collectionItem ( COMMA ci= collectionItem )* )? RBRACE
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||(input.LA(1) >= 50 && input.LA(1) <= 52) ) {
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

            match(input,LBRACE,FOLLOW_LBRACE_in_collectionLiteral6610); if (state.failed) return n;

            // Generator.g:1340:5: (ci= collectionItem ( COMMA ci= collectionItem )* )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==AT||LA127_0==HASH||(LA127_0 >= IDENT && LA127_0 <= INT)||(LA127_0 >= LPAREN && LA127_0 <= MINUS)||LA127_0==PLUS||LA127_0==REAL||(LA127_0 >= STAR && LA127_0 <= STRING)||LA127_0==45||LA127_0==47||(LA127_0 >= 50 && LA127_0 <= 54)||LA127_0==77||LA127_0==80||(LA127_0 >= 86 && LA127_0 <= 87)||(LA127_0 >= 90 && LA127_0 <= 97)||(LA127_0 >= 106 && LA127_0 <= 107)||LA127_0==113) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // Generator.g:1341:7: ci= collectionItem ( COMMA ci= collectionItem )*
                    {
                    pushFollow(FOLLOW_collectionItem_in_collectionLiteral6627);
                    ci=collectionItem();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n.addItem(ci); }

                    // Generator.g:1342:7: ( COMMA ci= collectionItem )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==COMMA) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // Generator.g:1342:9: COMMA ci= collectionItem
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_collectionLiteral6640); if (state.failed) return n;

                    	    pushFollow(FOLLOW_collectionItem_in_collectionLiteral6644);
                    	    ci=collectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return n;

                    	    if ( state.backtracking==0 ) { n.addItem(ci); }

                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input,RBRACE,FOLLOW_RBRACE_in_collectionLiteral6663); if (state.failed) return n;

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
    // Generator.g:1351:1: collectionItem returns [ASTCollectionItem n] : e= expression ( DOTDOT e= expression )? ;
    public final ASTCollectionItem collectionItem() throws RecognitionException {
        ASTCollectionItem n = null;


        GeneratorParser.expression_return e =null;


         n = new ASTCollectionItem(); 
        try {
            // Generator.g:1353:5: (e= expression ( DOTDOT e= expression )? )
            // Generator.g:1354:5: e= expression ( DOTDOT e= expression )?
            {
            pushFollow(FOLLOW_expression_in_collectionItem6692);
            e=expression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.setFirst((e!=null?e.n:null)); }

            // Generator.g:1355:5: ( DOTDOT e= expression )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==DOTDOT) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // Generator.g:1355:7: DOTDOT e= expression
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_collectionItem6703); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_collectionItem6707);
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
    // Generator.g:1365:1: emptyCollectionLiteral returns [ASTEmptyCollectionLiteral n] : ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE );
    public final ASTEmptyCollectionLiteral emptyCollectionLiteral() throws RecognitionException {
        ASTEmptyCollectionLiteral n = null;


        ASTCollectionType t =null;


        try {
            // Generator.g:1366:5: ( 'oclEmpty' LPAREN t= collectionType RPAREN |t= collectionType LBRACE RBRACE )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==93) ) {
                alt129=1;
            }
            else if ( (LA129_0==45||LA129_0==47||(LA129_0 >= 50 && LA129_0 <= 52)) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }
            switch (alt129) {
                case 1 :
                    // Generator.g:1367:5: 'oclEmpty' LPAREN t= collectionType RPAREN
                    {
                    match(input,93,FOLLOW_93_in_emptyCollectionLiteral6736); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_emptyCollectionLiteral6738); if (state.failed) return n;

                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral6742);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_emptyCollectionLiteral6744); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTEmptyCollectionLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1370:5: t= collectionType LBRACE RBRACE
                    {
                    pushFollow(FOLLOW_collectionType_in_emptyCollectionLiteral6760);
                    t=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,LBRACE,FOLLOW_LBRACE_in_emptyCollectionLiteral6762); if (state.failed) return n;

                    match(input,RBRACE,FOLLOW_RBRACE_in_emptyCollectionLiteral6764); if (state.failed) return n;

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
    // Generator.g:1381:1: undefinedLiteral returns [ASTUndefinedLiteral n] : ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' );
    public final ASTUndefinedLiteral undefinedLiteral() throws RecognitionException {
        ASTUndefinedLiteral n = null;


        ASTType t =null;


        try {
            // Generator.g:1382:5: ( 'oclUndefined' LPAREN t= type RPAREN | 'Undefined' | 'null' LPAREN t= type RPAREN | 'null' )
            int alt130=4;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt130=1;
                }
                break;
            case 54:
                {
                alt130=2;
                }
                break;
            case 91:
                {
                int LA130_3 = input.LA(2);

                if ( (LA130_3==LPAREN) ) {
                    alt130=3;
                }
                else if ( (LA130_3==EOF||(LA130_3 >= ARROW && LA130_3 <= BAR)||(LA130_3 >= COMMA && LA130_3 <= EQUAL)||(LA130_3 >= GREATER && LA130_3 <= GREATER_EQUAL)||LA130_3==IDENT||LA130_3==LBRACE||(LA130_3 >= LESS && LA130_3 <= LESS_EQUAL)||LA130_3==MINUS||(LA130_3 >= NOT_EQUAL && LA130_3 <= PLUS)||(LA130_3 >= RBRACE && LA130_3 <= RBRACK)||(LA130_3 >= RPAREN && LA130_3 <= SLASH)||LA130_3==STAR||LA130_3==55||(LA130_3 >= 57 && LA130_3 <= 60)||(LA130_3 >= 64 && LA130_3 <= 65)||(LA130_3 >= 70 && LA130_3 <= 76)||(LA130_3 >= 81 && LA130_3 <= 82)||LA130_3==85||(LA130_3 >= 98 && LA130_3 <= 102)||LA130_3==105||LA130_3==108||(LA130_3 >= 110 && LA130_3 <= 111)||LA130_3==116) ) {
                    alt130=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 130, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }

            switch (alt130) {
                case 1 :
                    // Generator.g:1383:5: 'oclUndefined' LPAREN t= type RPAREN
                    {
                    match(input,97,FOLLOW_97_in_undefinedLiteral6794); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral6796); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral6800);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral6802); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 2 :
                    // Generator.g:1386:5: 'Undefined'
                    {
                    match(input,54,FOLLOW_54_in_undefinedLiteral6816); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(); }

                    }
                    break;
                case 3 :
                    // Generator.g:1389:5: 'null' LPAREN t= type RPAREN
                    {
                    match(input,91,FOLLOW_91_in_undefinedLiteral6830); if (state.failed) return n;

                    match(input,LPAREN,FOLLOW_LPAREN_in_undefinedLiteral6832); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_undefinedLiteral6836);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,RPAREN,FOLLOW_RPAREN_in_undefinedLiteral6838); if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTUndefinedLiteral(t); }

                    }
                    break;
                case 4 :
                    // Generator.g:1392:5: 'null'
                    {
                    match(input,91,FOLLOW_91_in_undefinedLiteral6852); if (state.failed) return n;

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
    // Generator.g:1402:1: tupleLiteral returns [ASTTupleLiteral n] : 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE ;
    public final ASTTupleLiteral tupleLiteral() throws RecognitionException {
        ASTTupleLiteral n = null;


        ASTTupleItem ti =null;


         List tiList = new ArrayList(); 
        try {
            // Generator.g:1404:5: ( 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE )
            // Generator.g:1405:5: 'Tuple' LBRACE ti= tupleItem ( COMMA ti= tupleItem )* RBRACE
            {
            match(input,53,FOLLOW_53_in_tupleLiteral6891); if (state.failed) return n;

            match(input,LBRACE,FOLLOW_LBRACE_in_tupleLiteral6897); if (state.failed) return n;

            pushFollow(FOLLOW_tupleItem_in_tupleLiteral6905);
            ti=tupleItem();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tiList.add(ti); }

            // Generator.g:1408:5: ( COMMA ti= tupleItem )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==COMMA) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // Generator.g:1408:7: COMMA ti= tupleItem
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleLiteral6916); if (state.failed) return n;

            	    pushFollow(FOLLOW_tupleItem_in_tupleLiteral6920);
            	    ti=tupleItem();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tiList.add(ti); }

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            match(input,RBRACE,FOLLOW_RBRACE_in_tupleLiteral6931); if (state.failed) return n;

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
    // Generator.g:1416:1: tupleItem returns [ASTTupleItem n] : name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) ;
    public final ASTTupleItem tupleItem() throws RecognitionException {
        ASTTupleItem n = null;


        Token name=null;
        ASTType t =null;

        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1417:5: (name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression ) )
            // Generator.g:1418:5: name= IDENT ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tupleItem6962); if (state.failed) return n;

            // Generator.g:1419:5: ( ( COLON type EQUAL )=> COLON t= type EQUAL e= expression | ( COLON | EQUAL ) e= expression )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==COLON) ) {
                int LA132_1 = input.LA(2);

                if ( (synpred1_Generator()) ) {
                    alt132=1;
                }
                else if ( (true) ) {
                    alt132=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA132_0==EQUAL) ) {
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
                    // Generator.g:1422:7: ( COLON type EQUAL )=> COLON t= type EQUAL e= expression
                    {
                    match(input,COLON,FOLLOW_COLON_in_tupleItem7001); if (state.failed) return n;

                    pushFollow(FOLLOW_type_in_tupleItem7005);
                    t=type();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleItem7007); if (state.failed) return n;

                    pushFollow(FOLLOW_expression_in_tupleItem7011);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTTupleItem(name, t, (e!=null?e.n:null)); }

                    }
                    break;
                case 2 :
                    // Generator.g:1425:7: ( COLON | EQUAL ) e= expression
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


                    pushFollow(FOLLOW_expression_in_tupleItem7043);
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
    // Generator.g:1436:1: type returns [ASTType n] : (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) ;
    public final ASTType type() throws RecognitionException {
        ASTType n = null;


        ASTSimpleType nTSimple =null;

        ASTCollectionType nTCollection =null;

        ASTTupleType nTTuple =null;


         Token tok = null; 
        try {
            // Generator.g:1438:5: ( (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType ) )
            // Generator.g:1439:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            {
            if ( state.backtracking==0 ) { tok = input.LT(1); /* remember start of type */ }

            // Generator.g:1440:5: (nTSimple= simpleType |nTCollection= collectionType |nTTuple= tupleType )
            int alt133=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt133=1;
                }
                break;
            case 45:
            case 47:
            case 50:
            case 51:
            case 52:
                {
                alt133=2;
                }
                break;
            case 53:
                {
                alt133=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;

            }

            switch (alt133) {
                case 1 :
                    // Generator.g:1441:7: nTSimple= simpleType
                    {
                    pushFollow(FOLLOW_simpleType_in_type7109);
                    nTSimple=simpleType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTSimple; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 2 :
                    // Generator.g:1442:7: nTCollection= collectionType
                    {
                    pushFollow(FOLLOW_collectionType_in_type7121);
                    nTCollection=collectionType();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = nTCollection; if (n != null) n.setStartToken(tok); }

                    }
                    break;
                case 3 :
                    // Generator.g:1443:7: nTTuple= tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_type7133);
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
    // Generator.g:1448:1: typeOnly returns [ASTType n] : nT= type EOF ;
    public final ASTType typeOnly() throws RecognitionException {
        ASTType n = null;


        ASTType nT =null;


        try {
            // Generator.g:1449:5: (nT= type EOF )
            // Generator.g:1450:5: nT= type EOF
            {
            pushFollow(FOLLOW_type_in_typeOnly7165);
            nT=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_typeOnly7167); if (state.failed) return n;

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
    // Generator.g:1460:1: simpleType returns [ASTSimpleType n] : name= IDENT ;
    public final ASTSimpleType simpleType() throws RecognitionException {
        ASTSimpleType n = null;


        Token name=null;

        try {
            // Generator.g:1461:5: (name= IDENT )
            // Generator.g:1462:5: name= IDENT
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_simpleType7195); if (state.failed) return n;

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
    // Generator.g:1470:1: collectionType returns [ASTCollectionType n] : ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN ;
    public final ASTCollectionType collectionType() throws RecognitionException {
        ASTCollectionType n = null;


        ASTType elemType =null;


         Token op = null; 
        try {
            // Generator.g:1472:5: ( ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN )
            // Generator.g:1473:5: ( 'Collection' | 'Set' | 'Sequence' | 'Bag' | 'OrderedSet' ) LPAREN elemType= type RPAREN
            {
            if ( state.backtracking==0 ) { op = input.LT(1); }

            if ( input.LA(1)==45||input.LA(1)==47||(input.LA(1) >= 50 && input.LA(1) <= 52) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input,LPAREN,FOLLOW_LPAREN_in_collectionType7260); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_collectionType7264);
            elemType=type();

            state._fsp--;
            if (state.failed) return n;

            match(input,RPAREN,FOLLOW_RPAREN_in_collectionType7266); if (state.failed) return n;

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
    // Generator.g:1483:1: tupleType returns [ASTTupleType n] : 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN ;
    public final ASTTupleType tupleType() throws RecognitionException {
        ASTTupleType n = null;


        ASTTuplePart tp =null;


         List tpList = new ArrayList(); 
        try {
            // Generator.g:1485:5: ( 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN )
            // Generator.g:1486:5: 'Tuple' LPAREN tp= tuplePart ( COMMA tp= tuplePart )* RPAREN
            {
            match(input,53,FOLLOW_53_in_tupleType7300); if (state.failed) return n;

            match(input,LPAREN,FOLLOW_LPAREN_in_tupleType7302); if (state.failed) return n;

            pushFollow(FOLLOW_tuplePart_in_tupleType7311);
            tp=tuplePart();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { tpList.add(tp); }

            // Generator.g:1488:5: ( COMMA tp= tuplePart )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==COMMA) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // Generator.g:1488:7: COMMA tp= tuplePart
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_tupleType7322); if (state.failed) return n;

            	    pushFollow(FOLLOW_tuplePart_in_tupleType7326);
            	    tp=tuplePart();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { tpList.add(tp); }

            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_tupleType7338); if (state.failed) return n;

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
    // Generator.g:1497:1: tuplePart returns [ASTTuplePart n] : name= IDENT COLON t= type ;
    public final ASTTuplePart tuplePart() throws RecognitionException {
        ASTTuplePart n = null;


        Token name=null;
        ASTType t =null;


        try {
            // Generator.g:1498:5: (name= IDENT COLON t= type )
            // Generator.g:1499:5: name= IDENT COLON t= type
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_tuplePart7370); if (state.failed) return n;

            match(input,COLON,FOLLOW_COLON_in_tuplePart7372); if (state.failed) return n;

            pushFollow(FOLLOW_type_in_tuplePart7376);
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
    // Generator.g:1538:1: statOnly returns [ASTStatement n] : s= stat EOF ;
    public final ASTStatement statOnly() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s =null;


        try {
            // Generator.g:1539:3: (s= stat EOF )
            // Generator.g:1540:3: s= stat EOF
            {
            pushFollow(FOLLOW_stat_in_statOnly7425);
            s=stat();

            state._fsp--;
            if (state.failed) return n;

            match(input,EOF,FOLLOW_EOF_in_statOnly7429); if (state.failed) return n;

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
    // Generator.g:1550:1: stat returns [ASTStatement n] : s= singleStat ( SEMI s2= singleStat )* ;
    public final GeneratorParser.stat_return stat() throws RecognitionException {
        GeneratorParser.stat_return retval = new GeneratorParser.stat_return();
        retval.start = input.LT(1);


        ASTStatement s =null;

        ASTStatement s2 =null;



          ASTSequenceStatement seq = new ASTSequenceStatement(((Token)retval.start));

        try {
            // Generator.g:1554:3: (s= singleStat ( SEMI s2= singleStat )* )
            // Generator.g:1555:3: s= singleStat ( SEMI s2= singleStat )*
            {
            pushFollow(FOLLOW_singleStat_in_stat7464);
            s=singleStat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {seq.addStatement(s);}

            // Generator.g:1556:3: ( SEMI s2= singleStat )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==SEMI) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // Generator.g:1557:5: SEMI s2= singleStat
            	    {
            	    match(input,SEMI,FOLLOW_SEMI_in_stat7476); if (state.failed) return retval;

            	    pushFollow(FOLLOW_singleStat_in_stat7486);
            	    s2=singleStat();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) {seq.addStatement(s2); }

            	    }
            	    break;

            	default :
            	    break loop135;
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
    // Generator.g:1569:1: singleStat returns [ASTStatement n] : (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat );
    public final ASTStatement singleStat() throws RecognitionException {
        ASTStatement n = null;


        ASTEmptyStatement emp =null;

        GeneratorParser.statStartingWithExpr_return sse =null;

        ASTStatement vas =null;

        GeneratorParser.objCreateStat_return ocs =null;

        GeneratorParser.objDestroyStat_return ods =null;

        GeneratorParser.lnkInsStat_return lis =null;

        GeneratorParser.lnkDelStat_return lds =null;

        GeneratorParser.condExStat_return ces =null;

        GeneratorParser.iterStat_return its =null;

        GeneratorParser.whileStat_return whs =null;

        GeneratorParser.blockStat_return blk =null;


        try {
            // Generator.g:1570:5: (emp= emptyStat | ( statStartingWithExpr )=>sse= statStartingWithExpr |vas= varAssignStat |ocs= objCreateStat |ods= objDestroyStat |lis= lnkInsStat |lds= lnkDelStat |ces= condExStat |its= iterStat |whs= whileStat |blk= blockStat )
            int alt136=11;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==EOF||LA136_0==SEMI||(LA136_0 >= 72 && LA136_0 <= 73)) ) {
                alt136=1;
            }
            else if ( (LA136_0==87) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==MINUS||LA136_0==PLUS||LA136_0==90) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==113) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==77) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==INT) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==REAL) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==STRING) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==HASH) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==IDENT) ) {
                int LA136_13 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt136=2;
                }
                else if ( (true) ) {
                    alt136=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 136, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA136_0==45||(LA136_0 >= 50 && LA136_0 <= 52)) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==93) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==47) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==97) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==54) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==91) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==53) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==STAR) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==AT) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==86) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==92||(LA136_0 >= 95 && LA136_0 <= 96)||(LA136_0 >= 106 && LA136_0 <= 107)) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==94) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==LPAREN) && (synpred2_Generator())) {
                alt136=2;
            }
            else if ( (LA136_0==80) ) {
                int LA136_27 = input.LA(2);

                if ( (synpred2_Generator()) ) {
                    alt136=2;
                }
                else if ( (true) ) {
                    alt136=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return n;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 136, 27, input);

                    throw nvae;

                }
            }
            else if ( (LA136_0==89) ) {
                alt136=4;
            }
            else if ( (LA136_0==69) ) {
                alt136=5;
            }
            else if ( (LA136_0==83) ) {
                alt136=6;
            }
            else if ( (LA136_0==68) ) {
                alt136=7;
            }
            else if ( (LA136_0==78) ) {
                alt136=9;
            }
            else if ( (LA136_0==115) ) {
                alt136=10;
            }
            else if ( (LA136_0==61) ) {
                alt136=11;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;

            }
            switch (alt136) {
                case 1 :
                    // Generator.g:1571:5: emp= emptyStat
                    {
                    pushFollow(FOLLOW_emptyStat_in_singleStat7526);
                    emp=emptyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = emp; }

                    }
                    break;
                case 2 :
                    // Generator.g:1573:5: ( statStartingWithExpr )=>sse= statStartingWithExpr
                    {
                    pushFollow(FOLLOW_statStartingWithExpr_in_singleStat7552);
                    sse=statStartingWithExpr();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (sse!=null?sse.n:null); }

                    }
                    break;
                case 3 :
                    // Generator.g:1574:5: vas= varAssignStat
                    {
                    pushFollow(FOLLOW_varAssignStat_in_singleStat7564);
                    vas=varAssignStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = vas; }

                    }
                    break;
                case 4 :
                    // Generator.g:1575:5: ocs= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_singleStat7578);
                    ocs=objCreateStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ocs!=null?ocs.n:null); }

                    }
                    break;
                case 5 :
                    // Generator.g:1576:5: ods= objDestroyStat
                    {
                    pushFollow(FOLLOW_objDestroyStat_in_singleStat7592);
                    ods=objDestroyStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ods!=null?ods.n:null); }

                    }
                    break;
                case 6 :
                    // Generator.g:1577:5: lis= lnkInsStat
                    {
                    pushFollow(FOLLOW_lnkInsStat_in_singleStat7605);
                    lis=lnkInsStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lis!=null?lis.n:null); }

                    }
                    break;
                case 7 :
                    // Generator.g:1578:5: lds= lnkDelStat
                    {
                    pushFollow(FOLLOW_lnkDelStat_in_singleStat7622);
                    lds=lnkDelStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (lds!=null?lds.n:null); }

                    }
                    break;
                case 8 :
                    // Generator.g:1579:5: ces= condExStat
                    {
                    pushFollow(FOLLOW_condExStat_in_singleStat7639);
                    ces=condExStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (ces!=null?ces.n:null); }

                    }
                    break;
                case 9 :
                    // Generator.g:1580:5: its= iterStat
                    {
                    pushFollow(FOLLOW_iterStat_in_singleStat7656);
                    its=iterStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (its!=null?its.n:null); }

                    }
                    break;
                case 10 :
                    // Generator.g:1582:5: whs= whileStat
                    {
                    pushFollow(FOLLOW_whileStat_in_singleStat7678);
                    whs=whileStat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (whs!=null?whs.n:null); }

                    }
                    break;
                case 11 :
                    // Generator.g:1583:5: blk= blockStat
                    {
                    pushFollow(FOLLOW_blockStat_in_singleStat7696);
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
    // Generator.g:1590:1: emptyStat returns [ASTEmptyStatement n] : nothing ;
    public final ASTEmptyStatement emptyStat() throws RecognitionException {
        ASTEmptyStatement n = null;


        try {
            // Generator.g:1591:3: ( nothing )
            // Generator.g:1592:3: nothing
            {
            pushFollow(FOLLOW_nothing_in_emptyStat7723);
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
    // Generator.g:1597:1: statStartingWithExpr returns [ASTStatement n] : expr= inSoilExpression (aas= attAssignStat[$expr.n] )? ;
    public final GeneratorParser.statStartingWithExpr_return statStartingWithExpr() throws RecognitionException {
        GeneratorParser.statStartingWithExpr_return retval = new GeneratorParser.statStartingWithExpr_return();
        retval.start = input.LT(1);


        ASTExpression expr =null;

        ASTAttributeAssignmentStatement aas =null;


        try {
            // Generator.g:1598:3: (expr= inSoilExpression (aas= attAssignStat[$expr.n] )? )
            // Generator.g:1599:3: expr= inSoilExpression (aas= attAssignStat[$expr.n] )?
            {
            pushFollow(FOLLOW_inSoilExpression_in_statStartingWithExpr7749);
            expr=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1600:3: (aas= attAssignStat[$expr.n] )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==DOT) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // Generator.g:1601:5: aas= attAssignStat[$expr.n]
                    {
                    pushFollow(FOLLOW_attAssignStat_in_statStartingWithExpr7763);
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
    // Generator.g:1613:1: varAssignStat returns [ASTStatement n] : varName= IDENT COLON_EQUAL rVal= rValue ;
    public final ASTStatement varAssignStat() throws RecognitionException {
        ASTStatement n = null;


        Token varName=null;
        ASTRValue rVal =null;


        try {
            // Generator.g:1614:3: (varName= IDENT COLON_EQUAL rVal= rValue )
            // Generator.g:1615:3: varName= IDENT COLON_EQUAL rVal= rValue
            {
            varName=(Token)match(input,IDENT,FOLLOW_IDENT_in_varAssignStat7801); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_varAssignStat7805); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_varAssignStat7813);
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
    // Generator.g:1627:1: attAssignStat[ASTExpression exp] returns [ASTAttributeAssignmentStatement n] : DOT attName= IDENT COLON_EQUAL r= rValue ;
    public final ASTAttributeAssignmentStatement attAssignStat(ASTExpression exp) throws RecognitionException {
        ASTAttributeAssignmentStatement n = null;


        Token attName=null;
        ASTRValue r =null;


        try {
            // Generator.g:1628:3: ( DOT attName= IDENT COLON_EQUAL r= rValue )
            // Generator.g:1629:3: DOT attName= IDENT COLON_EQUAL r= rValue
            {
            match(input,DOT,FOLLOW_DOT_in_attAssignStat7837); if (state.failed) return n;

            attName=(Token)match(input,IDENT,FOLLOW_IDENT_in_attAssignStat7846); if (state.failed) return n;

            match(input,COLON_EQUAL,FOLLOW_COLON_EQUAL_in_attAssignStat7850); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_attAssignStat7858);
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
    // Generator.g:1641:1: objCreateStat returns [ASTStatement n] : 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? ;
    public final GeneratorParser.objCreateStat_return objCreateStat() throws RecognitionException {
        GeneratorParser.objCreateStat_return retval = new GeneratorParser.objCreateStat_return();
        retval.start = input.LT(1);


        ASTSimpleType ident =null;

        ASTExpression objName =null;

        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1642:3: ( 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )? )
            // Generator.g:1643:3: 'new' ident= simpleType ( LPAREN (objName= inSoilExpression )? RPAREN )? ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            {
            match(input,89,FOLLOW_89_in_objCreateStat7884); if (state.failed) return retval;

            pushFollow(FOLLOW_simpleType_in_objCreateStat7892);
            ident=simpleType();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1645:3: ( LPAREN (objName= inSoilExpression )? RPAREN )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LPAREN) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // Generator.g:1646:5: LPAREN (objName= inSoilExpression )? RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat7902); if (state.failed) return retval;

                    // Generator.g:1647:7: (objName= inSoilExpression )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==AT||LA138_0==HASH||(LA138_0 >= IDENT && LA138_0 <= INT)||(LA138_0 >= LPAREN && LA138_0 <= MINUS)||LA138_0==PLUS||LA138_0==REAL||(LA138_0 >= STAR && LA138_0 <= STRING)||LA138_0==45||LA138_0==47||(LA138_0 >= 50 && LA138_0 <= 54)||LA138_0==77||LA138_0==80||(LA138_0 >= 86 && LA138_0 <= 87)||(LA138_0 >= 90 && LA138_0 <= 97)||(LA138_0 >= 106 && LA138_0 <= 107)||LA138_0==113) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // Generator.g:1647:8: objName= inSoilExpression
                            {
                            pushFollow(FOLLOW_inSoilExpression_in_objCreateStat7915);
                            objName=inSoilExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7923); if (state.failed) return retval;

                    }
                    break;

            }


            // Generator.g:1651:3: ( 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==62) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // Generator.g:1652:5: 'between' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN
                    {
                    match(input,62,FOLLOW_62_in_objCreateStat7941); if (state.failed) return retval;

                    match(input,LPAREN,FOLLOW_LPAREN_in_objCreateStat7949); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat7963);
                    p=rValListMin2WithOptionalQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,RPAREN,FOLLOW_RPAREN_in_objCreateStat7971); if (state.failed) return retval;

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
    // Generator.g:1671:1: objDestroyStat returns [ASTStatement n] : 'destroy' el= exprListMin1 ;
    public final GeneratorParser.objDestroyStat_return objDestroyStat() throws RecognitionException {
        GeneratorParser.objDestroyStat_return retval = new GeneratorParser.objDestroyStat_return();
        retval.start = input.LT(1);


        List<ASTExpression> el =null;


        try {
            // Generator.g:1672:3: ( 'destroy' el= exprListMin1 )
            // Generator.g:1673:3: 'destroy' el= exprListMin1
            {
            match(input,69,FOLLOW_69_in_objDestroyStat8007); if (state.failed) return retval;

            pushFollow(FOLLOW_exprListMin1_in_objDestroyStat8015);
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
    // Generator.g:1692:1: lnkInsStat returns [ASTLinkInsertionStatement n] : 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT ;
    public final GeneratorParser.lnkInsStat_return lnkInsStat() throws RecognitionException {
        GeneratorParser.lnkInsStat_return retval = new GeneratorParser.lnkInsStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1693:3: ( 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT )
            // Generator.g:1694:3: 'insert' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'into' ass= IDENT
            {
            match(input,83,FOLLOW_83_in_lnkInsStat8041); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkInsStat8045); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8055);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkInsStat8059); if (state.failed) return retval;

            match(input,84,FOLLOW_84_in_lnkInsStat8063); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkInsStat8071); if (state.failed) return retval;

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
    // Generator.g:1704:1: rValListMin2WithOptionalQualifiers returns [List<ASTRValue> participans, List<List<ASTRValue>> qualifiers] : r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* ;
    public final GeneratorParser.rValListMin2WithOptionalQualifiers_return rValListMin2WithOptionalQualifiers() throws RecognitionException {
        GeneratorParser.rValListMin2WithOptionalQualifiers_return retval = new GeneratorParser.rValListMin2WithOptionalQualifiers_return();
        retval.start = input.LT(1);


        ASTRValue r =null;

        List<ASTRValue> qualifierValues =null;



          retval.participans = new ArrayList<ASTRValue>();
          retval.qualifiers = new ArrayList<List<ASTRValue>>();
          List<ASTRValue> currentQualifiers = Collections.emptyList();

        try {
            // Generator.g:1710:3: (r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )* )
            // Generator.g:1711:3: r= rValue ( LBRACE qualifierValues= rValList RBRACE )? COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8100);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1712:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==LBRACE) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // Generator.g:1713:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8111); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8120);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8127); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8143); if (state.failed) return retval;

            pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8154);
            r=rValue();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.participans.add(r); }

            // Generator.g:1725:3: ( LBRACE qualifierValues= rValList RBRACE )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==LBRACE) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // Generator.g:1726:4: LBRACE qualifierValues= rValList RBRACE
                    {
                    match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8165); if (state.failed) return retval;

                    pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8174);
                    qualifierValues=rValList();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

                    match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8181); if (state.failed) return retval;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                retval.qualifiers.add(currentQualifiers);
                currentQualifiers = Collections.emptyList();
              }

            // Generator.g:1735:3: ( COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )? )*
            loop144:
            do {
                int alt144=2;
                int LA144_0 = input.LA(1);

                if ( (LA144_0==COMMA) ) {
                    alt144=1;
                }


                switch (alt144) {
            	case 1 :
            	    // Generator.g:1736:5: COMMA r= rValue ( LBRACE qualifierValues= rValList RBRACE )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8203); if (state.failed) return retval;

            	    pushFollow(FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8218);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.participans.add(r); }

            	    // Generator.g:1740:5: ( LBRACE qualifierValues= rValList RBRACE )?
            	    int alt143=2;
            	    int LA143_0 = input.LA(1);

            	    if ( (LA143_0==LBRACE) ) {
            	        alt143=1;
            	    }
            	    switch (alt143) {
            	        case 1 :
            	            // Generator.g:1741:6: LBRACE qualifierValues= rValList RBRACE
            	            {
            	            match(input,LBRACE,FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8238); if (state.failed) return retval;

            	            pushFollow(FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8249);
            	            qualifierValues=rValList();

            	            state._fsp--;
            	            if (state.failed) return retval;

            	            if ( state.backtracking==0 ) {currentQualifiers = qualifierValues;}

            	            match(input,RBRACE,FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8258); if (state.failed) return retval;

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
            	    break loop144;
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
    // Generator.g:1756:1: lnkDelStat returns [ASTLinkDeletionStatement n] : 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT ;
    public final GeneratorParser.lnkDelStat_return lnkDelStat() throws RecognitionException {
        GeneratorParser.lnkDelStat_return retval = new GeneratorParser.lnkDelStat_return();
        retval.start = input.LT(1);


        Token ass=null;
        GeneratorParser.rValListMin2WithOptionalQualifiers_return p =null;


        try {
            // Generator.g:1757:3: ( 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT )
            // Generator.g:1758:3: 'delete' LPAREN p= rValListMin2WithOptionalQualifiers RPAREN 'from' ass= IDENT
            {
            match(input,68,FOLLOW_68_in_lnkDelStat8299); if (state.failed) return retval;

            match(input,LPAREN,FOLLOW_LPAREN_in_lnkDelStat8303); if (state.failed) return retval;

            pushFollow(FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8313);
            p=rValListMin2WithOptionalQualifiers();

            state._fsp--;
            if (state.failed) return retval;

            match(input,RPAREN,FOLLOW_RPAREN_in_lnkDelStat8317); if (state.failed) return retval;

            match(input,79,FOLLOW_79_in_lnkDelStat8321); if (state.failed) return retval;

            ass=(Token)match(input,IDENT,FOLLOW_IDENT_in_lnkDelStat8330); if (state.failed) return retval;

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
    // Generator.g:1772:1: condExStat returns [ASTConditionalExecutionStatement n] : 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' ;
    public final GeneratorParser.condExStat_return condExStat() throws RecognitionException {
        GeneratorParser.condExStat_return retval = new GeneratorParser.condExStat_return();
        retval.start = input.LT(1);


        ASTExpression con =null;

        ASTStatement ts =null;

        ASTStatement es =null;



          ASTStatement elseStat = new ASTEmptyStatement();

        try {
            // Generator.g:1776:3: ( 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end' )
            // Generator.g:1777:3: 'if' con= inSoilExpression 'then' ts= statOrImplicitBlock ( 'else' es= statOrImplicitBlock )? 'end'
            {
            match(input,80,FOLLOW_80_in_condExStat8361); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_condExStat8370);
            con=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,111,FOLLOW_111_in_condExStat8374); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8383);
            ts=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            // Generator.g:1781:3: ( 'else' es= statOrImplicitBlock )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==72) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // Generator.g:1782:5: 'else' es= statOrImplicitBlock
                    {
                    match(input,72,FOLLOW_72_in_condExStat8394); if (state.failed) return retval;

                    pushFollow(FOLLOW_statOrImplicitBlock_in_condExStat8406);
                    es=statOrImplicitBlock();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { elseStat = es; }

                    }
                    break;

            }


            match(input,73,FOLLOW_73_in_condExStat8418); if (state.failed) return retval;

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
    // Generator.g:1793:1: iterStat returns [ASTIterationStatement n] : 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.iterStat_return iterStat() throws RecognitionException {
        GeneratorParser.iterStat_return retval = new GeneratorParser.iterStat_return();
        retval.start = input.LT(1);


        Token var=null;
        ASTExpression set =null;

        ASTStatement s =null;


        try {
            // Generator.g:1794:3: ( 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:1795:3: 'for' var= IDENT 'in' set= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,78,FOLLOW_78_in_iterStat8443); if (state.failed) return retval;

            var=(Token)match(input,IDENT,FOLLOW_IDENT_in_iterStat8451); if (state.failed) return retval;

            match(input,82,FOLLOW_82_in_iterStat8455); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_iterStat8463);
            set=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,71,FOLLOW_71_in_iterStat8467); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_iterStat8475);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,73,FOLLOW_73_in_iterStat8480); if (state.failed) return retval;

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
    // Generator.g:1810:1: whileStat returns [ASTWhileStatement n] : 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' ;
    public final GeneratorParser.whileStat_return whileStat() throws RecognitionException {
        GeneratorParser.whileStat_return retval = new GeneratorParser.whileStat_return();
        retval.start = input.LT(1);


        ASTExpression cond =null;

        ASTStatement s =null;


        try {
            // Generator.g:1811:3: ( 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end' )
            // Generator.g:1812:3: 'while' cond= inSoilExpression 'do' s= statOrImplicitBlock 'end'
            {
            match(input,115,FOLLOW_115_in_whileStat8506); if (state.failed) return retval;

            pushFollow(FOLLOW_inSoilExpression_in_whileStat8514);
            cond=inSoilExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input,71,FOLLOW_71_in_whileStat8518); if (state.failed) return retval;

            pushFollow(FOLLOW_statOrImplicitBlock_in_whileStat8526);
            s=statOrImplicitBlock();

            state._fsp--;
            if (state.failed) return retval;

            match(input,73,FOLLOW_73_in_whileStat8531); if (state.failed) return retval;

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
    // Generator.g:1824:1: blockStat returns [ASTBlockStatement n] : 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' ;
    public final GeneratorParser.blockStat_return blockStat() throws RecognitionException {
        GeneratorParser.blockStat_return retval = new GeneratorParser.blockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), org.tzi.use.config.Options.explicitVariableDeclarations);

        try {
            // Generator.g:1828:2: ( 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end' )
            // Generator.g:1829:2: 'begin' ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )? s= stat 'end'
            {
            match(input,61,FOLLOW_61_in_blockStat8561); if (state.failed) return retval;

            // Generator.g:1830:2: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==67) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // Generator.g:1830:4: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI
                    {
                    match(input,67,FOLLOW_67_in_blockStat8566); if (state.failed) return retval;

                    pushFollow(FOLLOW_variableDeclaration_in_blockStat8572);
                    vd=variableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

                    // Generator.g:1830:73: ( COMMA vd1= variableDeclaration )*
                    loop146:
                    do {
                        int alt146=2;
                        int LA146_0 = input.LA(1);

                        if ( (LA146_0==COMMA) ) {
                            alt146=1;
                        }


                        switch (alt146) {
                    	case 1 :
                    	    // Generator.g:1830:75: COMMA vd1= variableDeclaration
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_blockStat8578); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_variableDeclaration_in_blockStat8584);
                    	    vd1=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

                    	    }
                    	    break;

                    	default :
                    	    break loop146;
                        }
                    } while (true);


                    match(input,SEMI,FOLLOW_SEMI_in_blockStat8591); if (state.failed) return retval;

                    }
                    break;

            }


            pushFollow(FOLLOW_stat_in_blockStat8601);
            s=stat();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.setBody((s!=null?s.n:null)); }

            match(input,73,FOLLOW_73_in_blockStat8606); if (state.failed) return retval;

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
    // Generator.g:1839:1: implicitBlockStat returns [ASTBlockStatement n] : 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat ;
    public final GeneratorParser.implicitBlockStat_return implicitBlockStat() throws RecognitionException {
        GeneratorParser.implicitBlockStat_return retval = new GeneratorParser.implicitBlockStat_return();
        retval.start = input.LT(1);


        ASTVariableDeclaration vd =null;

        ASTVariableDeclaration vd1 =null;

        GeneratorParser.stat_return s =null;



          retval.n = new ASTBlockStatement(((Token)retval.start), false);

        try {
            // Generator.g:1843:3: ( 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat )
            // Generator.g:1844:3: 'declare' vd= variableDeclaration ( COMMA vd1= variableDeclaration )* SEMI s= stat
            {
            match(input,67,FOLLOW_67_in_implicitBlockStat8632); if (state.failed) return retval;

            pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8638);
            vd=variableDeclaration();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd);}

            // Generator.g:1844:72: ( COMMA vd1= variableDeclaration )*
            loop148:
            do {
                int alt148=2;
                int LA148_0 = input.LA(1);

                if ( (LA148_0==COMMA) ) {
                    alt148=1;
                }


                switch (alt148) {
            	case 1 :
            	    // Generator.g:1844:74: COMMA vd1= variableDeclaration
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_implicitBlockStat8644); if (state.failed) return retval;

            	    pushFollow(FOLLOW_variableDeclaration_in_implicitBlockStat8650);
            	    vd1=variableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    if ( state.backtracking==0 ) { retval.n.addVariableDeclaration(vd1);}

            	    }
            	    break;

            	default :
            	    break loop148;
                }
            } while (true);


            match(input,SEMI,FOLLOW_SEMI_in_implicitBlockStat8657); if (state.failed) return retval;

            pushFollow(FOLLOW_stat_in_implicitBlockStat8665);
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
    // Generator.g:1848:1: statOrImplicitBlock returns [ASTStatement n] : (s1= stat |s2= implicitBlockStat ) ;
    public final ASTStatement statOrImplicitBlock() throws RecognitionException {
        ASTStatement n = null;


        GeneratorParser.stat_return s1 =null;

        GeneratorParser.implicitBlockStat_return s2 =null;


        try {
            // Generator.g:1849:3: ( (s1= stat |s2= implicitBlockStat ) )
            // Generator.g:1850:3: (s1= stat |s2= implicitBlockStat )
            {
            // Generator.g:1850:3: (s1= stat |s2= implicitBlockStat )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==AT||LA149_0==HASH||(LA149_0 >= IDENT && LA149_0 <= INT)||(LA149_0 >= LPAREN && LA149_0 <= MINUS)||LA149_0==PLUS||LA149_0==REAL||LA149_0==SEMI||(LA149_0 >= STAR && LA149_0 <= STRING)||LA149_0==45||LA149_0==47||(LA149_0 >= 50 && LA149_0 <= 54)||LA149_0==61||(LA149_0 >= 68 && LA149_0 <= 69)||(LA149_0 >= 72 && LA149_0 <= 73)||(LA149_0 >= 77 && LA149_0 <= 78)||LA149_0==80||LA149_0==83||(LA149_0 >= 86 && LA149_0 <= 87)||(LA149_0 >= 89 && LA149_0 <= 97)||(LA149_0 >= 106 && LA149_0 <= 107)||LA149_0==113||LA149_0==115) ) {
                alt149=1;
            }
            else if ( (LA149_0==67) ) {
                alt149=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;

            }
            switch (alt149) {
                case 1 :
                    // Generator.g:1850:4: s1= stat
                    {
                    pushFollow(FOLLOW_stat_in_statOrImplicitBlock8688);
                    s1=stat();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = (s1!=null?s1.n:null); }

                    }
                    break;
                case 2 :
                    // Generator.g:1850:31: s2= implicitBlockStat
                    {
                    pushFollow(FOLLOW_implicitBlockStat_in_statOrImplicitBlock8698);
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
    // Generator.g:1864:1: nothing :;
    public final void nothing() throws RecognitionException {
        try {
            // Generator.g:1865:1: ()
            // Generator.g:1866:1: 
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
    // Generator.g:1872:1: rValue returns [ASTRValue n] : (e= inSoilExpression |oc= objCreateStat );
    public final ASTRValue rValue() throws RecognitionException {
        ASTRValue n = null;


        ASTExpression e =null;

        GeneratorParser.objCreateStat_return oc =null;


        try {
            // Generator.g:1873:5: (e= inSoilExpression |oc= objCreateStat )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==AT||LA150_0==HASH||(LA150_0 >= IDENT && LA150_0 <= INT)||(LA150_0 >= LPAREN && LA150_0 <= MINUS)||LA150_0==PLUS||LA150_0==REAL||(LA150_0 >= STAR && LA150_0 <= STRING)||LA150_0==45||LA150_0==47||(LA150_0 >= 50 && LA150_0 <= 54)||LA150_0==77||LA150_0==80||(LA150_0 >= 86 && LA150_0 <= 87)||(LA150_0 >= 90 && LA150_0 <= 97)||(LA150_0 >= 106 && LA150_0 <= 107)||LA150_0==113) ) {
                alt150=1;
            }
            else if ( (LA150_0==89) ) {
                alt150=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 150, 0, input);

                throw nvae;

            }
            switch (alt150) {
                case 1 :
                    // Generator.g:1874:5: e= inSoilExpression
                    {
                    pushFollow(FOLLOW_inSoilExpression_in_rValue8744);
                    e=inSoilExpression();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ASTRValueExpressionOrOpCall(e); }

                    }
                    break;
                case 2 :
                    // Generator.g:1875:5: oc= objCreateStat
                    {
                    pushFollow(FOLLOW_objCreateStat_in_rValue8756);
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
    // Generator.g:1888:1: rValList returns [List<ASTRValue> n] : ( nothing |rl= rValListMin1 );
    public final List<ASTRValue> rValList() throws RecognitionException {
        List<ASTRValue> n = null;


        List<ASTRValue> rl =null;


        try {
            // Generator.g:1889:3: ( nothing |rl= rValListMin1 )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==RBRACE) ) {
                alt151=1;
            }
            else if ( (LA151_0==AT||LA151_0==HASH||(LA151_0 >= IDENT && LA151_0 <= INT)||(LA151_0 >= LPAREN && LA151_0 <= MINUS)||LA151_0==PLUS||LA151_0==REAL||(LA151_0 >= STAR && LA151_0 <= STRING)||LA151_0==45||LA151_0==47||(LA151_0 >= 50 && LA151_0 <= 54)||LA151_0==77||LA151_0==80||(LA151_0 >= 86 && LA151_0 <= 87)||(LA151_0 >= 89 && LA151_0 <= 97)||(LA151_0 >= 106 && LA151_0 <= 107)||LA151_0==113) ) {
                alt151=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;

            }
            switch (alt151) {
                case 1 :
                    // Generator.g:1890:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_rValList8779);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = Collections.<ASTRValue>emptyList(); }

                    }
                    break;
                case 2 :
                    // Generator.g:1893:3: rl= rValListMin1
                    {
                    pushFollow(FOLLOW_rValListMin1_in_rValList8806);
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
    // Generator.g:1901:1: rValListMin1 returns [List<ASTRValue> n] : r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin1() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1905:3: (r= rValue ( COMMA r= rValue )* )
            // Generator.g:1906:3: r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin18839);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:1908:3: ( COMMA r= rValue )*
            loop152:
            do {
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==COMMA) ) {
                    alt152=1;
                }


                switch (alt152) {
            	case 1 :
            	    // Generator.g:1909:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin18853); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin18863);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop152;
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
    // Generator.g:1919:1: rValListMin2 returns [List<ASTRValue> n] : r= rValue COMMA r= rValue ( COMMA r= rValue )* ;
    public final List<ASTRValue> rValListMin2() throws RecognitionException {
        List<ASTRValue> n = null;


        ASTRValue r =null;



          n = new ArrayList<ASTRValue>();

        try {
            // Generator.g:1923:3: (r= rValue COMMA r= rValue ( COMMA r= rValue )* )
            // Generator.g:1924:3: r= rValue COMMA r= rValue ( COMMA r= rValue )*
            {
            pushFollow(FOLLOW_rValue_in_rValListMin28902);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            match(input,COMMA,FOLLOW_COMMA_in_rValListMin28910); if (state.failed) return n;

            pushFollow(FOLLOW_rValue_in_rValListMin28918);
            r=rValue();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add(r); }

            // Generator.g:1929:3: ( COMMA r= rValue )*
            loop153:
            do {
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==COMMA) ) {
                    alt153=1;
                }


                switch (alt153) {
            	case 1 :
            	    // Generator.g:1930:5: COMMA r= rValue
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_rValListMin28932); if (state.failed) return n;

            	    pushFollow(FOLLOW_rValue_in_rValListMin28942);
            	    r=rValue();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { n.add(r); }

            	    }
            	    break;

            	default :
            	    break loop153;
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
    // Generator.g:1940:1: inSoilExpression returns [ASTExpression n] : e= expression ;
    public final ASTExpression inSoilExpression() throws RecognitionException {
        ASTExpression n = null;


        GeneratorParser.expression_return e =null;


        try {
            // Generator.g:1941:3: (e= expression )
            // Generator.g:1942:3: e= expression
            {
            pushFollow(FOLLOW_expression_in_inSoilExpression8976);
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
    // Generator.g:1951:1: exprList returns [List<ASTExpression> n] : ( nothing |el= exprListMin1 );
    public final List<ASTExpression> exprList() throws RecognitionException {
        List<ASTExpression> n = null;


        List<ASTExpression> el =null;


        try {
            // Generator.g:1952:3: ( nothing |el= exprListMin1 )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==EOF) ) {
                alt154=1;
            }
            else if ( (LA154_0==AT||LA154_0==HASH||(LA154_0 >= IDENT && LA154_0 <= INT)||(LA154_0 >= LPAREN && LA154_0 <= MINUS)||LA154_0==PLUS||LA154_0==REAL||(LA154_0 >= STAR && LA154_0 <= STRING)||LA154_0==45||LA154_0==47||(LA154_0 >= 50 && LA154_0 <= 54)||LA154_0==77||LA154_0==80||(LA154_0 >= 86 && LA154_0 <= 87)||(LA154_0 >= 90 && LA154_0 <= 97)||(LA154_0 >= 106 && LA154_0 <= 107)||LA154_0==113) ) {
                alt154=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;

            }
            switch (alt154) {
                case 1 :
                    // Generator.g:1953:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_exprList9005);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<ASTExpression>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:1956:3: el= exprListMin1
                    {
                    pushFollow(FOLLOW_exprListMin1_in_exprList9023);
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
    // Generator.g:1964:1: exprListMin1 returns [List<ASTExpression> n] : e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin1() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:1968:3: (e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:1969:3: e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin19056);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:1971:3: ( COMMA e= inSoilExpression )*
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==COMMA) ) {
                    alt155=1;
                }


                switch (alt155) {
            	case 1 :
            	    // Generator.g:1972:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin19071); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin19081);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop155;
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
    // Generator.g:1982:1: exprListMin2 returns [List<ASTExpression> n] : e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* ;
    public final List<ASTExpression> exprListMin2() throws RecognitionException {
        List<ASTExpression> n = null;


        ASTExpression e =null;



          n = new ArrayList<ASTExpression>();

        try {
            // Generator.g:1986:3: (e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )* )
            // Generator.g:1987:3: e= inSoilExpression COMMA e= inSoilExpression ( COMMA e= inSoilExpression )*
            {
            pushFollow(FOLLOW_inSoilExpression_in_exprListMin29121);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            match(input,COMMA,FOLLOW_COMMA_in_exprListMin29129); if (state.failed) return n;

            pushFollow(FOLLOW_inSoilExpression_in_exprListMin29137);
            e=inSoilExpression();

            state._fsp--;
            if (state.failed) return n;

            if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            // Generator.g:1992:3: ( COMMA e= inSoilExpression )*
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==COMMA) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // Generator.g:1993:5: COMMA e= inSoilExpression
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_exprListMin29151); if (state.failed) return n;

            	    pushFollow(FOLLOW_inSoilExpression_in_exprListMin29161);
            	    e=inSoilExpression();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { if (e != null) n.add(e); }

            	    }
            	    break;

            	default :
            	    break loop156;
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
    // Generator.g:2003:1: identList returns [List<String> n] : ( nothing |il= identListMin1 );
    public final List<String> identList() throws RecognitionException {
        List<String> n = null;


        List<String> il =null;


        try {
            // Generator.g:2004:3: ( nothing |il= identListMin1 )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==EOF||LA157_0==RBRACE||LA157_0==SEMI||(LA157_0 >= 72 && LA157_0 <= 73)) ) {
                alt157=1;
            }
            else if ( (LA157_0==IDENT) ) {
                alt157=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return n;}
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;

            }
            switch (alt157) {
                case 1 :
                    // Generator.g:2005:3: nothing
                    {
                    pushFollow(FOLLOW_nothing_in_identList9191);
                    nothing();

                    state._fsp--;
                    if (state.failed) return n;

                    if ( state.backtracking==0 ) { n = new ArrayList<String>(); }

                    }
                    break;
                case 2 :
                    // Generator.g:2008:3: il= identListMin1
                    {
                    pushFollow(FOLLOW_identListMin1_in_identList9208);
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
    // Generator.g:2016:1: identListMin1 returns [List<String> n] : id= IDENT ( COMMA id= IDENT )* ;
    public final List<String> identListMin1() throws RecognitionException {
        List<String> n = null;


        Token id=null;


          n = new ArrayList<String>();

        try {
            // Generator.g:2020:3: (id= IDENT ( COMMA id= IDENT )* )
            // Generator.g:2021:3: id= IDENT ( COMMA id= IDENT )*
            {
            id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19242); if (state.failed) return n;

            if ( state.backtracking==0 ) { n.add((id!=null?id.getText():null)); }

            // Generator.g:2023:3: ( COMMA id= IDENT )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==COMMA) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // Generator.g:2024:5: COMMA id= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identListMin19256); if (state.failed) return n;

            	    id=(Token)match(input,IDENT,FOLLOW_IDENT_in_identListMin19266); if (state.failed) return n;

            	    if ( state.backtracking==0 ) {
            	        n.add((id!=null?id.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop158;
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

    // $ANTLR start synpred1_Generator
    public final void synpred1_Generator_fragment() throws RecognitionException {
        // Generator.g:1422:7: ( COLON type EQUAL )
        // Generator.g:1422:8: COLON type EQUAL
        {
        match(input,COLON,FOLLOW_COLON_in_synpred1_Generator6992); if (state.failed) return ;

        pushFollow(FOLLOW_type_in_synpred1_Generator6994);
        type();

        state._fsp--;
        if (state.failed) return ;

        match(input,EQUAL,FOLLOW_EQUAL_in_synpred1_Generator6996); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Generator

    // $ANTLR start synpred2_Generator
    public final void synpred2_Generator_fragment() throws RecognitionException {
        // Generator.g:1573:5: ( statStartingWithExpr )
        // Generator.g:1573:6: statStartingWithExpr
        {
        pushFollow(FOLLOW_statStartingWithExpr_in_synpred2_Generator7544);
        statStartingWithExpr();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Generator

    // Delegated rules

    public final boolean synpred1_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA71 dfa71 = new DFA71(this);
    static final String DFA21_eotS =
        "\25\uffff";
    static final String DFA21_eofS =
        "\1\1\24\uffff";
    static final String DFA21_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\23\2\uffff\1\31\1\27\1\12\1\uffff\1"+
        "\15\1\23\1\5\1\35\1\15\1\23\1\12\1\35\1\27\1\12";
    static final String DFA21_maxS =
        "\1\113\1\uffff\1\23\1\uffff\1\23\2\uffff\1\31\1\154\1\44\1\uffff"+
        "\1\15\1\23\1\113\1\35\1\15\1\23\1\44\1\35\1\154\1\44";
    static final String DFA21_acceptS =
        "\1\uffff\1\5\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\12\uffff";
    static final String DFA21_specialS =
        "\25\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\15\uffff\1\4\43\uffff\1\3\2\uffff\2\3\4\uffff\1\5\12\uffff"+
            "\1\6",
            "",
            "\1\7",
            "",
            "\1\10",
            "",
            "",
            "\1\11",
            "\1\3\44\uffff\1\3\1\uffff\1\12\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\14\10\uffff\1\13\20\uffff\1\15",
            "",
            "\1\16",
            "\1\17",
            "\1\2\15\uffff\1\20\43\uffff\1\3\2\uffff\2\3\17\uffff\1\6",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\14\31\uffff\1\15",
            "\1\24",
            "\1\3\44\uffff\1\3\1\uffff\1\12\1\uffff\1\3\10\uffff\1\3\30"+
            "\uffff\1\3\11\uffff\1\3",
            "\1\14\31\uffff\1\15"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 399:5: ( generalClassifierDefinition[$n] |a= associationDefinition | ( 'constraints' (cons= invariant |ppc= prePost )* ) |e= enumTypeDefinition )*";
        }
    }
    static final String DFA52_eotS =
        "\16\uffff";
    static final String DFA52_eofS =
        "\16\uffff";
    static final String DFA52_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA52_maxS =
        "\1\154\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\146\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA52_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA52_specialS =
        "\16\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\2\15\uffff\1\1\21\uffff\1\1\32\uffff\1\1\10\uffff\1\1\33"+
            "\uffff\2\3\5\uffff\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\121\uffff\2\3",
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
            return "()* loopback of 584:5: (ppc= prePostClause )*";
        }
    }
    static final String DFA66_eotS =
        "\16\uffff";
    static final String DFA66_eofS =
        "\1\1\15\uffff";
    static final String DFA66_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA66_maxS =
        "\1\125\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\125\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA66_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA66_specialS =
        "\16\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\2\15\uffff\1\1\43\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff"+
            "\1\1\1\3\10\uffff\1\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\43\uffff\1\1\2\uffff\2\1\17\uffff\1\1\11"+
            "\uffff\1\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "()* loopback of 688:5: (inv= invariantClause )*";
        }
    }
    static final String DFA71_eotS =
        "\16\uffff";
    static final String DFA71_eofS =
        "\1\1\15\uffff";
    static final String DFA71_minS =
        "\1\5\1\uffff\1\23\1\uffff\1\31\1\12\1\15\1\23\1\5\1\35\1\15\1\12"+
        "\1\35\1\12";
    static final String DFA71_maxS =
        "\1\146\1\uffff\1\23\1\uffff\1\31\1\44\1\15\1\23\1\146\1\35\1\15"+
        "\1\44\1\35\1\44";
    static final String DFA71_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\12\uffff";
    static final String DFA71_specialS =
        "\16\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\2\15\uffff\1\1\43\uffff\1\1\2\uffff\2\1\4\uffff\2\1\11\uffff"+
            "\1\1\31\uffff\2\3",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\7\10\uffff\1\6\20\uffff\1\10",
            "\1\11",
            "\1\12",
            "\1\2\15\uffff\1\1\43\uffff\1\1\2\uffff\2\1\17\uffff\1\1\31"+
            "\uffff\2\3",
            "\1\13",
            "\1\14",
            "\1\7\31\uffff\1\10",
            "\1\15",
            "\1\7\31\uffff\1\10"
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "()+ loopback of 716:5: (ppc= prePostClause )+";
        }
    }
 

    public static final BitSet FOLLOW_invariant_in_invariantListOnly80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_invariantListOnly91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_procedureListOnly136 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureListOnly151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_procedure179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_procedure183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedure185 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure189 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_procedure191 = new BitSet(new long[]{0x2000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_procedure199 = new BitSet(new long[]{0x0000002000080000L});
    public static final BitSet FOLLOW_variableDeclarationList_in_procedure203 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure205 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_procedure214 = new BitSet(new long[]{0x0003500000480000L,0x0000000000014200L});
    public static final BitSet FOLLOW_instructionList_in_procedure218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_procedure220 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_procedure222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList260 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_variableDeclarationList271 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList275 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_instruction_in_instructionList319 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_instructionList321 = new BitSet(new long[]{0x0003500000480002L,0x0000000000014000L});
    public static final BitSet FOLLOW_variableAssignment_in_instruction356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeAssignment_in_instruction371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_in_instruction385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_instruction402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifThenElse_in_instruction416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_asslCall_in_instruction432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opEnter_in_instruction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_opExit_in_instruction465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_barrier_in_instruction482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variableAssignment513 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_variableAssignment515 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_valueInstruction_in_variableAssignment519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_attributeAssignment551 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_attributeAssignment553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeAssignment557 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attributeAssignment565 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_valueInstruction_in_attributeAssignment569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_loop601 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_loop605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_loop607 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_loop611 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_loop613 = new BitSet(new long[]{0x0003500000480000L,0x0000000000014200L});
    public static final BitSet FOLLOW_instructionList_in_loop624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_loop626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ifThenElse662 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_ifThenElse666 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ifThenElse677 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifThenElse679 = new BitSet(new long[]{0x0003500000480000L,0x0000000000014200L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ifThenElse685 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifThenElse696 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ifThenElse698 = new BitSet(new long[]{0x0003500000480000L,0x0000000000014200L});
    public static final BitSet FOLLOW_instructionList_in_ifThenElse702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ifThenElse704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicInstruction_in_valueInstruction744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_valueInstruction758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_atomicInstruction788 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_atomicInstruction792 = new BitSet(new long[]{0x0000001000480000L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction806 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_atomicInstruction824 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_instructionParameter_in_atomicInstruction828 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_atomicInstruction876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_asslCall899 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_asslCall903 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_asslCall907 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall921 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_asslCall939 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_asslCall943 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_asslCall991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_opEnter1014 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_opEnter1022 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_opEnter1026 = new BitSet(new long[]{0x0000001000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1041 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_opEnter1059 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_oclExpression_in_opEnter1063 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_opEnter1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_opExit1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclExpression_in_instructionParameter1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrParameterIdent_in_instructionParameter1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_instrParameterIdent1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_oclExpression1231 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_oclExpression1235 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_oclExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_barrier1265 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_barrier1270 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_IDENT_in_barrier1285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_barrier1287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_barrier1293 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_oclExpression_in_barrier1309 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_barrier1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCallOnly1345 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_procedureCallOnly1353 = new BitSet(new long[]{0x007CA318861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1364 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_procedureCallOnly1374 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_procedureCallOnly1378 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_procedureCallOnly1392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_procedureCallOnly1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_model1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_model1432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_model1436 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000801L});
    public static final BitSet FOLLOW_generalClassifierDefinition_in_model1448 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000801L});
    public static final BitSet FOLLOW_associationDefinition_in_model1461 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000801L});
    public static final BitSet FOLLOW_64_in_model1475 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000803L});
    public static final BitSet FOLLOW_invariant_in_model1493 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000803L});
    public static final BitSet FOLLOW_prePost_in_model1514 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000803L});
    public static final BitSet FOLLOW_enumTypeDefinition_in_model1554 = new BitSet(new long[]{0x0C80000000080020L,0x0000000000000801L});
    public static final BitSet FOLLOW_EOF_in_model1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_enumTypeDefinition1597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_enumTypeDefinition1603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_enumTypeDefinition1607 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_enumTypeDefinition1609 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_enumTypeDefinition1613 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_enumTypeDefinition1615 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_enumTypeDefinition1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_generalClassifierDefinition1657 = new BitSet(new long[]{0x0C80000000080000L});
    public static final BitSet FOLLOW_55_in_generalClassifierDefinition1665 = new BitSet(new long[]{0x0C00000000080000L});
    public static final BitSet FOLLOW_classDefinition_in_generalClassifierDefinition1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_associationClassDefinition_in_generalClassifierDefinition1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signalDefinition_in_generalClassifierDefinition1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyClass_in_classDefinition1830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_classDefinition1834 = new BitSet(new long[]{0x1000000000800000L,0x0000100400000201L});
    public static final BitSet FOLLOW_LESS_in_classDefinition1844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_classDefinition1848 = new BitSet(new long[]{0x1000000000000000L,0x0000100400000201L});
    public static final BitSet FOLLOW_60_in_classDefinition1861 = new BitSet(new long[]{0x0000000000080020L,0x0000100400000201L});
    public static final BitSet FOLLOW_attributeDefinition_in_classDefinition1874 = new BitSet(new long[]{0x0000000000080020L,0x0000100400000201L});
    public static final BitSet FOLLOW_98_in_classDefinition1895 = new BitSet(new long[]{0x0000000000080020L,0x0000100000000201L});
    public static final BitSet FOLLOW_operationDefinition_in_classDefinition1908 = new BitSet(new long[]{0x0000000000080020L,0x0000100000000201L});
    public static final BitSet FOLLOW_64_in_classDefinition1929 = new BitSet(new long[]{0x0000000000000020L,0x0000100000201200L});
    public static final BitSet FOLLOW_invariantClause_in_classDefinition1949 = new BitSet(new long[]{0x0000000000000020L,0x0000100000201200L});
    public static final BitSet FOLLOW_108_in_classDefinition1975 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000200L});
    public static final BitSet FOLLOW_stateMachine_in_classDefinition1995 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000200L});
    public static final BitSet FOLLOW_73_in_classDefinition2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_associationClassDefinition2052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationClassDefinition2078 = new BitSet(new long[]{0x5000000000880000L,0x0000100400000201L});
    public static final BitSet FOLLOW_LESS_in_associationClassDefinition2088 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_associationClassDefinition2092 = new BitSet(new long[]{0x5000000000080000L,0x0000100400000201L});
    public static final BitSet FOLLOW_62_in_associationClassDefinition2104 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2112 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationClassDefinition2124 = new BitSet(new long[]{0x1000000000080020L,0x0000100400000201L});
    public static final BitSet FOLLOW_60_in_associationClassDefinition2144 = new BitSet(new long[]{0x0000000000080020L,0x0000100400000201L});
    public static final BitSet FOLLOW_attributeDefinition_in_associationClassDefinition2157 = new BitSet(new long[]{0x0000000000080020L,0x0000100400000201L});
    public static final BitSet FOLLOW_98_in_associationClassDefinition2178 = new BitSet(new long[]{0x0000000000080020L,0x0000100000000201L});
    public static final BitSet FOLLOW_operationDefinition_in_associationClassDefinition2191 = new BitSet(new long[]{0x0000000000080020L,0x0000100000000201L});
    public static final BitSet FOLLOW_64_in_associationClassDefinition2212 = new BitSet(new long[]{0x0000000000080020L,0x0000100000201200L});
    public static final BitSet FOLLOW_invariantClause_in_associationClassDefinition2232 = new BitSet(new long[]{0x0000000000080020L,0x0000100000201200L});
    public static final BitSet FOLLOW_108_in_associationClassDefinition2258 = new BitSet(new long[]{0x0000000000080000L,0x0000010000000200L});
    public static final BitSet FOLLOW_stateMachine_in_associationClassDefinition2278 = new BitSet(new long[]{0x0000000000080000L,0x0000010000000200L});
    public static final BitSet FOLLOW_keyAggregation_in_associationClassDefinition2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_keyComposition_in_associationClassDefinition2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_associationClassDefinition2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_attributeDefinition2374 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attributeDefinition2382 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_attributeDefinition2384 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_attributeDefinition2388 = new BitSet(new long[]{0x0000002000080002L});
    public static final BitSet FOLLOW_keyDerive_in_attributeDefinition2412 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_keyDerived_in_attributeDefinition2414 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2417 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2427 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_keyInit_in_attributeDefinition2447 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_set_in_attributeDefinition2451 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_attributeDefinition2463 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_attributeDefinition2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_operationDefinition2508 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_operationDefinition2518 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_operationDefinition2528 = new BitSet(new long[]{0x20000020000020A2L,0x0000006000000000L});
    public static final BitSet FOLLOW_COLON_in_operationDefinition2542 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_operationDefinition2548 = new BitSet(new long[]{0x2000002000002022L,0x0000006000000000L});
    public static final BitSet FOLLOW_EQUAL_in_operationDefinition2576 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationDefinition2582 = new BitSet(new long[]{0x0000002000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_blockStat_in_operationDefinition2604 = new BitSet(new long[]{0x0000002000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_prePostClause_in_operationDefinition2626 = new BitSet(new long[]{0x0000002000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_SEMI_in_operationDefinition2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationDefinition2670 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAssociation_in_associationDefinition2684 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyAggregation_in_associationDefinition2688 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_keyComposition_in_associationDefinition2692 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationDefinition2702 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_associationDefinition2710 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2718 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_associationEnd_in_associationDefinition2730 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_associationDefinition2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSet_in_associationEnd2766 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2774 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_LBRACK_in_associationEnd2776 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicity_in_associationEnd2780 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_associationEnd2782 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_keyRole_in_associationEnd2793 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2797 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_100_in_associationEnd2818 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_110_in_associationEnd2830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2834 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_keyUnion_in_associationEnd2846 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_105_in_associationEnd2858 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_associationEnd2862 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_keyDerived_in_associationEnd2875 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_keyDerive_in_associationEnd2877 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_LPAREN_in_associationEnd2882 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_associationEnd2888 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_associationEnd2890 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_associationEnd2894 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_associationEnd2898 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_keyQualifier_in_associationEnd2910 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_associationEnd2916 = new BitSet(new long[]{0x0000002000080002L,0x0000421000000000L});
    public static final BitSet FOLLOW_SEMI_in_associationEnd2933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2968 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_multiplicity2978 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicityRange_in_multiplicity2982 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3011 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_multiplicityRange3021 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_multiplicitySpec_in_multiplicityRange3025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_multiplicitySpec3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplicitySpec3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_invariant3110 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3120 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COMMA_in_invariant3133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_invariant3137 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_COLON_in_invariant3145 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_invariant3157 = new BitSet(new long[]{0x0000000000000022L,0x0000000000201000L});
    public static final BitSet FOLLOW_invariantClause_in_invariant3169 = new BitSet(new long[]{0x0000000000000022L,0x0000000000201000L});
    public static final BitSet FOLLOW_annotationSet_in_invariantClause3199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_invariantClause3207 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3213 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3218 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_invariantClause3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_invariantClause3239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_invariantClause3241 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_invariantClause3247 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_invariantClause3252 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_invariantClause3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_prePost3289 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3293 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_prePost3295 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_prePost3299 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_paramList_in_prePost3303 = new BitSet(new long[]{0x00000000000000A0L,0x0000006000000000L});
    public static final BitSet FOLLOW_COLON_in_prePost3307 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_prePost3311 = new BitSet(new long[]{0x0000000000000020L,0x0000006000000000L});
    public static final BitSet FOLLOW_prePostClause_in_prePost3330 = new BitSet(new long[]{0x0000000000000022L,0x0000006000000000L});
    public static final BitSet FOLLOW_annotationSet_in_prePostClause3364 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_prePostClause3376 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_IDENT_in_prePostClause3391 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_prePostClause3396 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_prePostClause3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_annotationSet3427 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_annotation3446 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_annotation3450 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_annotation3456 = new BitSet(new long[]{0x0000001000080400L});
    public static final BitSet FOLLOW_annotationValues_in_annotation3465 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_annotation3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3493 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_annotationValues3501 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_annotationValue_in_annotationValues3505 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_annotationValue3524 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_annotationValue3529 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NON_OCL_STRING_in_annotationValue3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_stateMachine3565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateMachine3598 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_stateMachine3611 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_stateDefinition_in_stateMachine3627 = new BitSet(new long[]{0x0000000000080000L,0x0001000000000000L});
    public static final BitSet FOLLOW_112_in_stateMachine3637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_transitionDefinition_in_stateMachine3653 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_stateMachine3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition3679 = new BitSet(new long[]{0x0000000000400082L});
    public static final BitSet FOLLOW_COLON_in_stateDefinition3687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_stateDefinition3691 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_LBRACK_in_stateDefinition3702 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_stateDefinition3708 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_stateDefinition3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition3731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ARROW_in_transitionDefinition3733 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition3737 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_LBRACE_in_transitionDefinition3747 = new BitSet(new long[]{0x0000000000480000L,0x0000000000000004L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition3757 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition3761 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition3765 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_event_in_transitionDefinition3789 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_IDENT_in_transitionDefinition3805 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_transitionDefinition3809 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_paramList_in_transitionDefinition3814 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_transitionDefinition3821 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_LBRACK_in_transitionDefinition3838 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_transitionDefinition3842 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RBRACK_in_transitionDefinition3846 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_transitionDefinition3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_event3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keySignal_in_signalDefinition3896 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_signalDefinition3900 = new BitSet(new long[]{0x1000000000800000L,0x0000000000000201L});
    public static final BitSet FOLLOW_LESS_in_signalDefinition3915 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_idList_in_signalDefinition3919 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_60_in_signalDefinition3932 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000201L});
    public static final BitSet FOLLOW_attributeDefinition_in_signalDefinition3945 = new BitSet(new long[]{0x0000000000080020L,0x0000000000000201L});
    public static final BitSet FOLLOW_64_in_signalDefinition3966 = new BitSet(new long[]{0x0000000000000020L,0x0000000000201200L});
    public static final BitSet FOLLOW_invariantClause_in_signalDefinition3986 = new BitSet(new long[]{0x0000000000000020L,0x0000000000201200L});
    public static final BitSet FOLLOW_73_in_signalDefinition4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyUnion4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAssociation4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyRole4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyComposition4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyAggregation4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyClass4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keySignal4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerived4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyDerive4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyInit4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_keyQualifier4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionOnly4189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_expressionOnly4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_expression4239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4250 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4254 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_expression4258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4263 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_expression4267 = new BitSet(new long[]{0x0000000000000400L,0x0000000000040000L});
    public static final BitSet FOLLOW_COMMA_in_expression4305 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_expression4317 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_expression4321 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_expression4325 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_expression4330 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_expression4334 = new BitSet(new long[]{0x0000000000000400L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_expression4375 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_conditionalImpliesExpression_in_expression4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_paramList4424 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4441 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_paramList4453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_paramList4457 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_paramList4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_idList4506 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_idList4516 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_idList4520 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaration4551 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableDeclaration4553 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4593 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_conditionalImpliesExpression4606 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalImpliesExpression4610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4655 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_conditionalOrExpression4668 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_conditionalXOrExpression_in_conditionalOrExpression4672 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4716 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_conditionalXOrExpression4729 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalXOrExpression4733 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression4777 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_conditionalAndExpression4790 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression4794 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4842 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_set_in_equalityExpression4861 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4871 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4920 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_set_in_relationalExpression4938 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression4956 = new BitSet(new long[]{0x0000000001818002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5006 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_set_in_additiveExpression5024 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression5034 = new BitSet(new long[]{0x0000000084000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5084 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression5102 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression5116 = new BitSet(new long[]{0x0000014000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_set_in_unaryExpression5178 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FC412000L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression5222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_postfixExpression5255 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_ARROW_in_postfixExpression5273 = new BitSet(new long[]{0x0000000000080000L,0x00000C01D0400000L});
    public static final BitSet FOLLOW_DOT_in_postfixExpression5279 = new BitSet(new long[]{0x0000000000080000L,0x00000C01D0400000L});
    public static final BitSet FOLLOW_propertyCall_in_postfixExpression5290 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_literal_in_primaryExpression5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectReference_in_primaryExpression5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyCall_in_primaryExpression5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5367 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5371 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpression_in_primaryExpression5385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5399 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_primaryExpression5401 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5424 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_primaryExpression5426 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5444 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5459 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5461 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_primaryExpression5463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression5467 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5471 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression5473 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AT_in_primaryExpression5493 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_primaryExpression5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_objectReference5521 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_objectReference5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryExpression_in_propertyCall5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterateExpression_in_propertyCall5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operationExpression_in_propertyCall5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeExpression_in_propertyCall5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inStateExpression_in_propertyCall5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_queryExpression5681 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_queryExpression5688 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_queryExpression5699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_queryExpression5703 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_queryExpression5714 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_queryExpression5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_iterateExpression5752 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_iterateExpression5758 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_elemVarsDeclaration_in_iterateExpression5766 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SEMI_in_iterateExpression5768 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableInitialization_in_iterateExpression5776 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_BAR_in_iterateExpression5778 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_iterateExpression5786 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_iterateExpression5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_operationExpression5836 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression5858 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5871 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5884 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5888 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression5900 = new BitSet(new long[]{0x0000000002400022L});
    public static final BitSet FOLLOW_LBRACK_in_operationExpression5917 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5932 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression5947 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression5951 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_RBRACK_in_operationExpression5965 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_AT_in_operationExpression5990 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_operationExpression5992 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_operationExpression6017 = new BitSet(new long[]{0x007CA318861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6038 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_operationExpression6050 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_operationExpression6054 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_operationExpression6074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_inStateExpression6111 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_inStateExpression6116 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_inStateExpression6125 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_inStateExpression6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_typeExpression6166 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_typeExpression6190 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_typeExpression6194 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_typeExpression6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration6234 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6237 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6241 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_elemVarsDeclaration6251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_elemVarsDeclaration6257 = new BitSet(new long[]{0x0000000000000482L});
    public static final BitSet FOLLOW_COLON_in_elemVarsDeclaration6260 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_elemVarsDeclaration6266 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_IDENT_in_variableInitialization6294 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_variableInitialization6296 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_variableInitialization6300 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_variableInitialization6302 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_variableInitialization6306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ifExpression6338 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6342 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ifExpression6344 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ifExpression6350 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_ifExpression6354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ifExpression6356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_literal6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_literal6409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_literal6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal6451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_literal6461 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_literal6477 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_COLON_in_literal6479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_literal6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionLiteral_in_literal6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyCollectionLiteral_in_literal6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_undefinedLiteral_in_literal6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleLiteral_in_literal6531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_literal6543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionLiteral6581 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_collectionLiteral6610 = new BitSet(new long[]{0x007CA30A861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6627 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_collectionLiteral6640 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_collectionItem_in_collectionLiteral6644 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_collectionLiteral6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_collectionItem6692 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DOTDOT_in_collectionItem6703 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_collectionItem6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_emptyCollectionLiteral6736 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_emptyCollectionLiteral6738 = new BitSet(new long[]{0x001CA00000000000L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral6742 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_emptyCollectionLiteral6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_emptyCollectionLiteral6760 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_emptyCollectionLiteral6762 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_emptyCollectionLiteral6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_undefinedLiteral6794 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral6796 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral6800 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_undefinedLiteral6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_undefinedLiteral6830 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_undefinedLiteral6832 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_undefinedLiteral6836 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_undefinedLiteral6838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_undefinedLiteral6852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_tupleLiteral6891 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LBRACE_in_tupleLiteral6897 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral6905 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleLiteral6916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tupleItem_in_tupleLiteral6920 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_RBRACE_in_tupleLiteral6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tupleItem6962 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_COLON_in_tupleItem7001 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_tupleItem7005 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_tupleItem7007 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_tupleItem7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_tupleItem7033 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_expression_in_tupleItem7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectionType_in_type7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tupleType_in_type7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeOnly7165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_typeOnly7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_simpleType7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_collectionType7233 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_collectionType7260 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_collectionType7264 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_collectionType7266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_tupleType7300 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_tupleType7302 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7311 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_COMMA_in_tupleType7322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_tuplePart_in_tupleType7326 = new BitSet(new long[]{0x0000001000000400L});
    public static final BitSet FOLLOW_RPAREN_in_tupleType7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_tuplePart7370 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_COLON_in_tuplePart7372 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_tuplePart7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOnly7425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_statOnly7429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_singleStat_in_stat7464 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_SEMI_in_stat7476 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96030L});
    public static final BitSet FOLLOW_singleStat_in_stat7486 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_emptyStat_in_singleStat7526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_singleStat7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varAssignStat_in_singleStat7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_singleStat7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDestroyStat_in_singleStat7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkInsStat_in_singleStat7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lnkDelStat_in_singleStat7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExStat_in_singleStat7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterStat_in_singleStat7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStat_in_singleStat7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blockStat_in_singleStat7696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_emptyStat7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_statStartingWithExpr7749 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attAssignStat_in_statStartingWithExpr7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varAssignStat7801 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_varAssignStat7805 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_varAssignStat7813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_attAssignStat7837 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_attAssignStat7846 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COLON_EQUAL_in_attAssignStat7850 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_attAssignStat7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_objCreateStat7884 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_simpleType_in_objCreateStat7892 = new BitSet(new long[]{0x4000000002000002L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat7902 = new BitSet(new long[]{0x007CA318861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_objCreateStat7915 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat7923 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_objCreateStat7941 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_objCreateStat7949 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_objCreateStat7963 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_objCreateStat7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_objDestroyStat8007 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_exprListMin1_in_objDestroyStat8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_lnkInsStat8041 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkInsStat8045 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkInsStat8055 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkInsStat8059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_lnkInsStat8063 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkInsStat8071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8100 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8111 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8120 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8127 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8143 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8154 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8165 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8174 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8181 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin2WithOptionalQualifiers8203 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin2WithOptionalQualifiers8218 = new BitSet(new long[]{0x0000000000200402L});
    public static final BitSet FOLLOW_LBRACE_in_rValListMin2WithOptionalQualifiers8238 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValList_in_rValListMin2WithOptionalQualifiers8249 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_RBRACE_in_rValListMin2WithOptionalQualifiers8258 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_68_in_lnkDelStat8299 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LPAREN_in_lnkDelStat8303 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValListMin2WithOptionalQualifiers_in_lnkDelStat8313 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lnkDelStat8317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_lnkDelStat8321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_lnkDelStat8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_condExStat8361 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_condExStat8370 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_condExStat8374 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_condExStat8394 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_condExStat8406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_condExStat8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_iterStat8443 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_iterStat8451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_iterStat8455 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_iterStat8463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_iterStat8467 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_iterStat8475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_iterStat8480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_whileStat8506 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_whileStat8514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_whileStat8518 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96038L});
    public static final BitSet FOLLOW_statOrImplicitBlock_in_whileStat8526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_whileStat8531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_blockStat8561 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96038L});
    public static final BitSet FOLLOW_67_in_blockStat8566 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8572 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_blockStat8578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_blockStat8584 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_blockStat8591 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96030L});
    public static final BitSet FOLLOW_stat_in_blockStat8601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_blockStat8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_implicitBlockStat8632 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8638 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_COMMA_in_implicitBlockStat8644 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_variableDeclaration_in_implicitBlockStat8650 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_SEMI_in_implicitBlockStat8657 = new BitSet(new long[]{0x207CA308861A0020L,0x000A0C03FEC96030L});
    public static final BitSet FOLLOW_stat_in_implicitBlockStat8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stat_in_statOrImplicitBlock8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implicitBlockStat_in_statOrImplicitBlock8698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_rValue8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objCreateStat_in_rValue8756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_rValList8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValListMin1_in_rValList8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rValue_in_rValListMin18839 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin18853 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin18863 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_rValue_in_rValListMin28902 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin28910 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin28918 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_rValListMin28932 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FEC12000L});
    public static final BitSet FOLLOW_rValue_in_rValListMin28942 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expression_in_inSoilExpression8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nothing_in_exprList9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprListMin1_in_exprList9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19056 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin19071 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin19081 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29121 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin29129 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29137 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_exprListMin29151 = new BitSet(new long[]{0x007CA308861A0020L,0x00020C03FCC12000L});
    public static final BitSet FOLLOW_inSoilExpression_in_exprListMin29161 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_nothing_in_identList9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identListMin1_in_identList9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19242 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COMMA_in_identListMin19256 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_IDENT_in_identListMin19266 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_COLON_in_synpred1_Generator6992 = new BitSet(new long[]{0x003CA00000080000L});
    public static final BitSet FOLLOW_type_in_synpred1_Generator6994 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQUAL_in_synpred1_Generator6996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statStartingWithExpr_in_synpred2_Generator7544 = new BitSet(new long[]{0x0000000000000002L});

}