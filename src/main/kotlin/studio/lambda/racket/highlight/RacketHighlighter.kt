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

package studio.lambda.racket.highlight

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import studio.lambda.racket.lexer.RacketLexer
import studio.lambda.racket.psi.RacketKeywordTokenType
import studio.lambda.racket.psi.RacketTokenElementTypes.*

class RacketHighlighter : SyntaxHighlighterBase() {

    override fun getHighlightingLexer(): Lexer = RacketLexer()

    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey> {
        return pack(when(tokenType) {
            is RacketKeywordTokenType -> RacketColors.KEYWORD

            STRING_LITERAL -> RacketColors.STRING
            CHAR_LITERAL -> RacketColors.CHARACTER
            NUMBER_LITERAL -> RacketColors.NUMBER

            COMMENT -> RacketColors.COMMENT

            VARIABLE -> RacketColors.IDENTIFIER

            LPAREN, RPAREN -> RacketColors.PARENTHESIS
            LBRACE, RBRACE -> RacketColors.BRACES
            LBRACK, RBRACK -> RacketColors.BRACKETS

            else -> null
        })
    }
}
