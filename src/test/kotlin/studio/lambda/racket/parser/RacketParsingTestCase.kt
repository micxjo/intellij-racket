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

import com.intellij.testFramework.ParsingTestCase

class RacketParsingTestCase : ParsingTestCase(
    "studio/lambda/racket/parser/fixtures",
    "rkt",
    true,
    RacketParserDefinition())
{

    fun testBasicExpressions() = doTest(true)

    override fun getTestDataPath(): String = "src/test/resources"

    override fun skipSpaces(): Boolean = false

    override fun includeRanges(): Boolean = true
}
