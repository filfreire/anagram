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

import java.util.Map;

/**
 * Anagram App.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 * @checkstyle LineLengthCheck (500 lines)
 */
public final class AnagramOf {

    /**
     * Sentence 1.
     */
    private final String left;

    /**
     * Sentence 2.
     */
    private final String right;

    /**
     * Ctor.
     *
     * @param left Sentence to create count map
     * @param right Sentence to create count map
     */
    public AnagramOf(final String left, final String right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Check if is exact anagram.
     *
     * @return Boolean if is anagram.
     */
    public boolean isExact() {
        return this.verifyAnagram(
            new CharCountMap(this.left).map(),
            new CharCountMap(this.right).map()
        );
    }

    /**
     * Check if is meaningful anagram.
     *
     * @return Boolean if is anagram.
     */
    public boolean isMeaningful() {
        return this.verifyAnagram(
            new CharCountMap(this.left).lowercaseMap(),
            new CharCountMap(this.right).lowercaseMap()
        );
    }

    /**
     * Verify anagram.
     *
     * @param left First sentence
     * @param right Second sentence
     * @return Boolean if is anagram.
     */
    private static boolean verifyAnagram(final Map<Character, Integer> left, final Map<Character, Integer> right) {
        boolean res = true;
        if (left.size() == right.size()) {
            for (final char key : left.keySet()) {
                if (!left.get(key).equals(right.get(key))) {
                    res = false;
                    break;
                }
            }
        } else {
            res = false;
        }
        return res;
    }

}
