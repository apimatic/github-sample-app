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
 * ProtectedDomainStateEnum to be used.
 */
public enum ProtectedDomainStateEnum {
    PENDING,

    VERIFIED,

    UNVERIFIED;


    private static TreeMap<String, ProtectedDomainStateEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PENDING.value = "pending";
        VERIFIED.value = "verified";
        UNVERIFIED.value = "unverified";

        valueMap.put("pending", PENDING);
        valueMap.put("verified", VERIFIED);
        valueMap.put("unverified", UNVERIFIED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProtectedDomainStateEnum fromString(String toConvert) {
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
     * Convert list of ProtectedDomainStateEnum values to list of string values.
     * @param toConvert The list of ProtectedDomainStateEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ProtectedDomainStateEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ProtectedDomainStateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 