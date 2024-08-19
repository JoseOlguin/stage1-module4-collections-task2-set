package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (Integer source : sourceList) {
            int i = source;
            if (i % 2 == 0) {
                hashSet.add(i);
                while (i % 2 == 0) {
                    i /= 2;
                    hashSet.add(i);
                }
            } else {
                hashSet.add(i);
                hashSet.add(i * 2);
            }
        }

        return hashSet;
    }
}
