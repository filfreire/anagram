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

import java.util.Locale;
import java.util.Map;

/**
 * CharCountMap.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 * @checkstyle LineLengthCheck (500 lines)
 */
public final class CharCountMap {

    /**
     * Sentence.
     */
    private final String sentence;

    /**
     * Ctor.
     *
     * @param sentence Sentence to create count map
     */
    public CharCountMap(final String sentence) {
        this.sentence = sentence;
    }

    /**
     * Map with char count.
     *
     * @return Map with char count.
     */
    public Map<Character, Integer> map() {
        return new CharIntMap(
            this.sentence.toCharArray()
        ).map();
    }

    /**
     * Map with lowercase char count.
     *
     * @return Map with char count.
     */
    public Map<Character, Integer> lowercaseMap() {
        return new CharIntMap(
            this.sentence.toLowerCase(Locale.ENGLISH).toCharArray()
        ).map();
    }
}
