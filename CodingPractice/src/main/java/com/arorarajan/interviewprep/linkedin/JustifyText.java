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
package com.arorarajan.interviewprep.linkedin;

/**
 * @author Rajan Arora
 * @since Nov 18, 2014
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JustifyText {
    public static String justify(Character length, String input) {
        int len = Character.getNumericValue(length);
        System.out.println("Length is: " + len);
        return "";
    }

    private static void tc(String s, int m) {
        System.out.println(s + " | justify by: " + m);
        for (String line : justify(s, m)) {
            System.out.println(line);
        }
    }

    private static List<String> justify(String s, int m) {
        final int n = s.length();
        if (m > n) {
            return null;
        }
        if (m == n) {
            return Collections.singletonList(s);
        }

        final int lines = n % m == 0 ? n / m : (n / m) + 1;
        final List<String> r = new ArrayList<>(lines);
        int c = 0, p;
        while (c < n) {
            p = c;
            c += m;
            StringBuilder sb = new StringBuilder();

            if (c >= n) {
                for (int j = p; j < n - p; ++j) {
                    sb.append(" ");
                }
                r.add(sb.append(s.substring(p)).toString());
                break;
            }
            if (s.charAt(c) == ' ') {
                r.add(s.substring(p, ++c));
                continue;
            }

            --c;

            for (; c > p; --c) {
                sb.append(" ");
                if (s.charAt(c) == ' ') {
                    break;
                }
            }

            if (c == p) {
                // premature exit; one word cannot be broken (m < word.length)
                // return the existing justified lines
                return r;
            }

            r.add(sb.append(s.substring(p, c + 1)).toString());
            if (s.charAt(c) == ' ') {
                c++;
            }
            sb.setLength(0);
        }

        return r;
    }

    public static void main(String[] args) {
        justify('2', "Hello");
        tc("ala bala ala bala", 4);
        tc("boka moka poka", 4);
    }
}
