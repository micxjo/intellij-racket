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

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import studio.lambda.racket.psi.RacketTokenElementTypes.*

class RacketBraceMatcher : PairedBraceMatcher {

    companion object {
        val PAIRS: Array<BracePair> = arrayOf(
                BracePair(LPAREN, RPAREN, true),
                BracePair(LBRACE, RBRACE, true),
                BracePair(LBRACK, RBRACK, true),
                BracePair(VEC_OPEN, RPAREN, true)
        )
    }

    override fun getPairs(): Array<out BracePair> = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?): Boolean {
        return true
    }

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }
}
