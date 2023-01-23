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
 * LockReasonEnum to be used.
 */
public enum LockReasonEnum {
    OFFTOPIC,

    ENUM_TOO_HEATED,

    RESOLVED,

    SPAM;


    private static TreeMap<String, LockReasonEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        OFFTOPIC.value = "off-topic";
        ENUM_TOO_HEATED.value = "too heated";
        RESOLVED.value = "resolved";
        SPAM.value = "spam";

        valueMap.put("off-topic", OFFTOPIC);
        valueMap.put("too heated", ENUM_TOO_HEATED);
        valueMap.put("resolved", RESOLVED);
        valueMap.put("spam", SPAM);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static LockReasonEnum fromString(String toConvert) {
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
     * Convert list of LockReasonEnum values to list of string values.
     * @param toConvert The list of LockReasonEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LockReasonEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LockReasonEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 