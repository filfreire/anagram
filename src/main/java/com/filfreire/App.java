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

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.cactoos.list.StickyList;

/**
 * Anagram App.
 *
 * @author Filipe Freire (livrofubia@gmail.com)
 * @version $Id: ??? $
 * @since 1.0
 */
public final class App {

    /**
     * Arguments.
     */
    private final transient Iterable<String> arguments;

    /**
     * Ctor.
     * @param args Command line args
     */
    public App(final String... args) {
        this.arguments = Arrays.asList(args);
    }

    /**
     * Main.
     *
     * @param args Arguments
     * @throws IOException If fails
     */
    public static void main(final String... args) throws IOException {
        new App(args).exec();
    }

    /**
     * Run it all.
     * @throws IOException If fails
     */
    @SuppressWarnings("PMD.SystemPrintln")
    public void exec() throws IOException {
        final List<String> sentences = new StickyList<>(this.arguments);
        if (sentences.size() < 2) {
            throw new IOException("Min number of arguments is 2!");
        }
        final AnagramOf anagram = new AnagramOf(
            sentences.get(0),
            sentences.get(1)
        );
        if (anagram.isExact()) {
            System.out.println("Exact anagram: TRUE");
        } else {
            System.out.println("Exact anagram: FALSE");
        }
        if (anagram.isMeaningful()) {
            System.out.println("Meaningful anagram: TRUE");
        } else {
            System.out.println("Meaningful anagram: FALSE");
        }
    }

}
