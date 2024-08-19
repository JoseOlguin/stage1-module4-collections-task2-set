package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstAndSecondButNotThird = new HashSet<>(firstSet);

        firstAndSecondButNotThird.retainAll(secondSet);
        firstAndSecondButNotThird.removeAll(thirdSet);

        Set<String> thirdButNotFirstAndNotSecond = new HashSet<>(thirdSet);
        thirdButNotFirstAndNotSecond.removeAll(firstSet);
        thirdButNotFirstAndNotSecond.removeAll(secondSet);

        Set<String> unitedDifferences = new HashSet<>(firstAndSecondButNotThird);
        unitedDifferences.addAll(thirdButNotFirstAndNotSecond);

        return unitedDifferences;
    }
}
