package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            List<Integer> dividedNumbers = new ArrayList<>();
            for (Integer number : x) {
                dividedNumbers.add(number / divider);
            }
            return dividedNumbers;
        };
    }
}
