/*
 *  Copyright (c) 2013-2014 Rajan Arora
 *  All Rights Reserved Worldwide.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.arorarajan.interviewprep.codingbat.nosection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Rajan Arora
 * @since Oct 14, 2014
 */
public class StringReversalTest {
    StringReversal stringReversal = new StringReversal();

    @Test
    public void stringReversalTest() {
        assertEquals("1234567890", stringReversal.reverse("0987654321"));
    }
}
