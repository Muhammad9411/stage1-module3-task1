package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {

    //TODO: Refactor Method-1
    public List<?> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<List<String>> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void cloneMethod(List consumer, List<?> producer) {
        consumer.addAll(producer.stream().collect(Collectors.toList()));
    }

}
