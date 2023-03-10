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
 * MembersAllowedRepositoryCreationTypeEnum to be used.
 */
public enum MembersAllowedRepositoryCreationTypeEnum {
    ALL,

    ENUM_PRIVATE,

    NONE;


    private static TreeMap<String, MembersAllowedRepositoryCreationTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ALL.value = "all";
        ENUM_PRIVATE.value = "private";
        NONE.value = "none";

        valueMap.put("all", ALL);
        valueMap.put("private", ENUM_PRIVATE);
        valueMap.put("none", NONE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static MembersAllowedRepositoryCreationTypeEnum fromString(String toConvert) {
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
     * Convert list of MembersAllowedRepositoryCreationTypeEnum values to list of string values.
     * @param toConvert The list of MembersAllowedRepositoryCreationTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MembersAllowedRepositoryCreationTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MembersAllowedRepositoryCreationTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 