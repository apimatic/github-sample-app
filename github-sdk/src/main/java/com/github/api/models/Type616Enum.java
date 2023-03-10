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
 * Type616Enum to be used.
 */
public enum Type616Enum {
    ALL,

    OWNER,

    MEMBER;


    private static TreeMap<String, Type616Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        ALL.value = "all";
        OWNER.value = "owner";
        MEMBER.value = "member";

        valueMap.put("all", ALL);
        valueMap.put("owner", OWNER);
        valueMap.put("member", MEMBER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Type616Enum fromString(String toConvert) {
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
     * Convert list of Type616Enum values to list of string values.
     * @param toConvert The list of Type616Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Type616Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Type616Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 