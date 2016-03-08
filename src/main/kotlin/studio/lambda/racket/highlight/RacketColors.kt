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

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as Default
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey as c

object RacketColors {
    val STRING =      c("RACKET_STRING",      Default.STRING)
    val CHARACTER =   c("RACKET_CHARACTER",   Default.STRING)
    val NUMBER =      c("RACKET_NUMBER",      Default.NUMBER)

    val KEYWORD =     c("RACKET_KEYWORD",     Default.KEYWORD)
    val IDENTIFIER =  c("RACKET_IDENTIFIER",  Default.IDENTIFIER)

    val PARENTHESIS = c("RACKET_PARENTHESIS", Default.PARENTHESES)
    val BRACES  =     c("RACKET_BRACES", Default.BRACES)
    val BRACKETS =    c("RACKET_BRACKETS", Default.BRACKETS)

    val COMMENT =     c("RACKET_COMMENT",     Default.LINE_COMMENT)
}

