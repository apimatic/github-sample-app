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
 * RoleEnum to be used.
 */
public enum RoleEnum {
    ADMIN,

    MEMBER,

    BILLING_MANAGER;


    private static TreeMap<String, RoleEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ADMIN.value = "admin";
        MEMBER.value = "member";
        BILLING_MANAGER.value = "billing_manager";

        valueMap.put("admin", ADMIN);
        valueMap.put("member", MEMBER);
        valueMap.put("billing_manager", BILLING_MANAGER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RoleEnum fromString(String toConvert) {
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
     * Convert list of RoleEnum values to list of string values.
     * @param toConvert The list of RoleEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RoleEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RoleEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 