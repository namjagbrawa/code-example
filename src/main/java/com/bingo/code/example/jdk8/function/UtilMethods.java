package com.bingo.code.example.jdk8.function;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static com.google.common.collect.ImmutableList.toImmutableList;

/**
 * Created by ZhangGe on 2017/9/11.
 */
public class UtilMethods {

    private static List<Method> requestMappingMethods(Object object) {
        return Arrays.stream(object.getClass().getMethods())
//                .filter(m -> m.getAnnotation(Path.class) != null ||
//                        !httpMethodAnnotations(m).isEmpty())
//                .sorted(Comparator.comparingInt(AnnotatedHttpServices::order))
                .collect(toImmutableList());
    }

}
