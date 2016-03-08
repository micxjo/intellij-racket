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

package studio.lambda.racket.parser

import com.intellij.lang.ASTNode
import com.intellij.lang.Language
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import studio.lambda.racket.RacketLanguage
import studio.lambda.racket.lexer.RacketLexer
import studio.lambda.racket.psi.RacketTypes
import studio.lambda.racket.psi.RacketTokenElementTypes.*;
import studio.lambda.racket.psi.impl.RacketFile

class RacketParserDefinition : ParserDefinition {

    companion object {
        val WHITESPACE_TOKENS = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENT_TOKENS = TokenSet.create(COMMENT)
        val STRING_LITERALS = TokenSet.create(STRING_LITERAL)

        val FILE = IFileElementType(
                Language.findInstance(RacketLanguage::class.java))
    }

    override fun createLexer(projet: Project?): Lexer = RacketLexer()

    override fun getWhitespaceTokens(): TokenSet = WHITESPACE_TOKENS

    override fun getCommentTokens(): TokenSet = COMMENT_TOKENS

    override fun getStringLiteralElements(): TokenSet = STRING_LITERALS

    override fun getFileNodeType(): IFileElementType = FILE

    override fun createFile(viewProvider: FileViewProvider): PsiFile? {
        return RacketFile(viewProvider)
    }

    override fun createParser(project: Project?): PsiParser = RacketParser()

    override fun createElement(node: ASTNode?): PsiElement {
        return RacketTypes.Factory.createElement(node)
    }

    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?,
                                                 right: ASTNode?):
            ParserDefinition.SpaceRequirements?
    {
        return ParserDefinition.SpaceRequirements.MAY
    }
}
