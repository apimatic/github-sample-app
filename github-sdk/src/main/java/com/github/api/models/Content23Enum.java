/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Content23Enum to be used.
 */
public enum Content23Enum {
    PLUS1,

    MINUS1,

    LAUGH,

    CONFUSED,

    HEART,

    HOORAY,

    ROCKET,

    EYES;


    private static TreeMap<String, Content23Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        PLUS1.value = "plus1";
        MINUS1.value = "minus1";
        LAUGH.value = "laugh";
        CONFUSED.value = "confused";
        HEART.value = "heart";
        HOORAY.value = "hooray";
        ROCKET.value = "rocket";
        EYES.value = "eyes";

        valueMap.put("plus1", PLUS1);
        valueMap.put("minus1", MINUS1);
        valueMap.put("laugh", LAUGH);
        valueMap.put("confused", CONFUSED);
        valueMap.put("heart", HEART);
        valueMap.put("hooray", HOORAY);
        valueMap.put("rocket", ROCKET);
        valueMap.put("eyes", EYES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Content23Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Content23Enum values to list of string values.
     * @param toConvert The list of Content23Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Content23Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Content23Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 