/*
 * intellij-racket
 * Copyright (C) 2016 Micxjo Funkcio
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package studio.lambda.racket.psi;

public interface RacketTokenElementTypes {

    // Keywords

    RacketTokenType ELSE = new RacketKeywordTokenType("else");
    RacketTokenType ARROW = new RacketKeywordTokenType("=>");
    RacketTokenType DEFINE = new RacketKeywordTokenType("define");
    RacketTokenType UNQUOTE = new RacketKeywordTokenType("unquote");
    RacketTokenType UNQUOTE_SPLICING = new RacketKeywordTokenType("unquote-splicing");
    RacketTokenType QUOTE = new RacketKeywordTokenType("quote");
    RacketTokenType LAMBDA = new RacketKeywordTokenType("lambda");
    RacketTokenType IF = new RacketKeywordTokenType("if");
    RacketTokenType SET = new RacketKeywordTokenType("set!");
    RacketTokenType BEGIN = new RacketKeywordTokenType("begin");
    RacketTokenType COND = new RacketKeywordTokenType("cond");
    RacketTokenType AND = new RacketKeywordTokenType("and");
    RacketTokenType OR = new RacketKeywordTokenType("or");
    RacketTokenType CASE = new RacketKeywordTokenType("case");
    RacketTokenType LET = new RacketKeywordTokenType("let");
    RacketTokenType LET_STAR = new RacketKeywordTokenType("let*");
    RacketTokenType LET_REC = new RacketKeywordTokenType("letrec");
    RacketTokenType DO = new RacketKeywordTokenType("do");
    RacketTokenType DELAY = new RacketKeywordTokenType("delay");
    RacketTokenType QUASIQUOTE = new RacketKeywordTokenType("quasiquote");

    // Literals

    RacketTokenType TRUE = new RacketLiteralTokenType("#t");
    RacketTokenType FALSE = new RacketLiteralTokenType("#f");
    RacketTokenType CHAR_LITERAL = new RacketLiteralTokenType("<CHAR>");
    RacketTokenType STRING_LITERAL = new RacketLiteralTokenType("<STRING>");
    RacketTokenType NUMBER_LITERAL = new RacketLiteralTokenType("<NUMBER>");

    // Variables

    RacketTokenType VARIABLE = new RacketTokenType("<VARIABLE>");

    // Comments

    RacketTokenType COMMENT = new RacketCommentTokenType("<COMMENT>");

    // List delimiters

    RacketTokenType LPAREN = new RacketTokenType("(");
    RacketTokenType RPAREN = new RacketTokenType(")");
    RacketTokenType LBRACE = new RacketTokenType("[");
    RacketTokenType RBRACE = new RacketTokenType("]");
    RacketTokenType LBRACK = new RacketTokenType("{");
    RacketTokenType RBRACK = new RacketTokenType("}");

    // Vector delimiters

    RacketTokenType HASH_LPAREN = new RacketTokenType("#(");
    RacketTokenType HASH_LBRACE = new RacketTokenType("#[");
    RacketTokenType HASH_LBRACK = new RacketTokenType("#{");

    // Other

    RacketTokenType VEC_OPEN = new RacketTokenType("#(");
    RacketTokenType LANG = new RacketTokenType("<#lang>");
    RacketTokenType SINGLE_QUOTE = new RacketTokenType("'");
    RacketTokenType ABBREVIATION_PREFIX = new RacketTokenType("<ABBREV PREFIX>");

}
