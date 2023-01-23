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
 * Role6Enum to be used.
 */
public enum Role6Enum {
    MEMBER,

    MAINTAINER;


    private static TreeMap<String, Role6Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        MEMBER.value = "member";
        MAINTAINER.value = "maintainer";

        valueMap.put("member", MEMBER);
        valueMap.put("maintainer", MAINTAINER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Role6Enum fromString(String toConvert) {
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
     * Convert list of Role6Enum values to list of string values.
     * @param toConvert The list of Role6Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Role6Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Role6Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 