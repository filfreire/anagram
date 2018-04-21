/**
 * Copyright (c) 2018 Filipe Freire
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.filfreire;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Unit tests for AnagramOf class.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 */
public class AnagramOfTest {

    /**
     * Returns true for an anagram.
     */
    @Test
    public final void returnsExactFalseAndMeaningfulTrue() {
        final AnagramOf possible = new AnagramOf(
            "Eleven plus two",
            "Twelve plus one"
        );
        Assertions.assertThat(possible.isExact()).isFalse();
        Assertions.assertThat(possible.isMeaningful()).isTrue();
    }

    /**
     * Returns true for an anagram.
     */
    @Test
    public final void returnsExactTrueAndMeaningfulTrue() {
        final String str = "ccc";
        final AnagramOf possible = new AnagramOf(
            str,
            str
        );
        Assertions.assertThat(possible.isExact()).isTrue();
        Assertions.assertThat(possible.isMeaningful()).isTrue();
    }

    /**
     * Returns true for an anagram.
     */
    @Test
    public final void returnsExactFalseAndMeaningfulFalse() {
        final AnagramOf possible = new AnagramOf(
            "aaa",
            "aab"
        );
        Assertions.assertThat(possible.isExact()).isFalse();
        Assertions.assertThat(possible.isMeaningful()).isFalse();
    }
}
