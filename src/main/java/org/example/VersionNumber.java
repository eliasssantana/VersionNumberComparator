package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class VersionNumber {

    public static int compare(@NotNull String v1, @NotNull String v2) {

        int[] a1 = Arrays.stream(v1.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] a2 = Arrays.stream(v2.split("\\."))
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();

        int idx = 0;

        while (idx < a1.length || idx < a2.length) {

            if (idx < a1.length && idx < a2.length) {
                if (a1[idx] < a2[idx]) {
                    return -1;
                } else if (a1[idx] > a2[idx]) {
                    return 1;
                }
            } else if (idx < a1.length) {
                if (a1[idx] != 0) {
                    return 1;
                }
            } else if (idx < a2.length) {
                if (a2[idx] != 0) {
                    return -1;
                }
            }
            idx++;
        }
        return 0;
    }
}
