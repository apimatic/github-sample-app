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
 * RequiredConversationResolutionLevelEnum to be used.
 */
public enum RequiredConversationResolutionLevelEnum {
    OFF,

    NON_ADMINS,

    EVERYONE;


    private static TreeMap<String, RequiredConversationResolutionLevelEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        OFF.value = "off";
        NON_ADMINS.value = "non_admins";
        EVERYONE.value = "everyone";

        valueMap.put("off", OFF);
        valueMap.put("non_admins", NON_ADMINS);
        valueMap.put("everyone", EVERYONE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RequiredConversationResolutionLevelEnum fromString(String toConvert) {
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
     * Convert list of RequiredConversationResolutionLevelEnum values to list of string values.
     * @param toConvert The list of RequiredConversationResolutionLevelEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RequiredConversationResolutionLevelEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RequiredConversationResolutionLevelEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 