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
 * Unit tests for Anagram App.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 */
public class AppTest {

    /**
     * Min number of args exception msg.
     */
    private static final String MIN_ARGS = "Min number of arguments is 2!";

    /**
     * Throws exception with 0 args.
     */
    @Test
    public final void exceptionIsThrownOnEmptyArgs() {
        final Throwable thrown = Assertions.catchThrowable(
            () -> new App().exec()
        );
        Assertions.assertThat(thrown).hasMessageContaining(
            this.MIN_ARGS
        );
    }

    /**
     * Throws exception with 1 args.
     */
    @Test
    public final void exceptionIsThrownOnOneArg() {
        final Throwable thrown = Assertions.catchThrowable(
            () -> new App("aaa").exec()
        );
        Assertions.assertThat(thrown).hasMessageContaining(
            this.MIN_ARGS
        );
    }
}
