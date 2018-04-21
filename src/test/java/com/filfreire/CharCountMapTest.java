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
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Unit tests for CharCountMap class.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 * @checkstyle MagicNumberCheck (500 lines)
 */
public class CharCountMapTest {

    /**
     * Returns char map with correct count lowercase.
     */
    @Test
    public final void returnsCharLowerCaseMapWithCorrectCount() {
        final Map map = new CharCountMap("Aaab").lowercaseMap();
        Assertions.assertThat(map.get('a')).isEqualTo(3);
        Assertions.assertThat(map.get('b')).isEqualTo(1);
    }

    /**
     * Returns char map with correct count.
     */
    @Test
    public final void returnsCharMapWithCorrectCount() {
        final Map map = new CharCountMap("Cccb").map();
        Assertions.assertThat(map.get('C')).isEqualTo(1);
        Assertions.assertThat(map.get('c')).isEqualTo(2);
        Assertions.assertThat(map.get('b')).isEqualTo(1);
    }
}
