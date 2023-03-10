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
 * SecurityProduct11Enum to be used.
 */
public enum SecurityProduct11Enum {
    DEPENDENCY_GRAPH,

    DEPENDABOT_ALERTS,

    DEPENDABOT_SECURITY_UPDATES,

    ADVANCED_SECURITY,

    SECRET_SCANNING,

    SECRET_SCANNING_PUSH_PROTECTION;


    private static TreeMap<String, SecurityProduct11Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        DEPENDENCY_GRAPH.value = "dependency_graph";
        DEPENDABOT_ALERTS.value = "dependabot_alerts";
        DEPENDABOT_SECURITY_UPDATES.value = "dependabot_security_updates";
        ADVANCED_SECURITY.value = "advanced_security";
        SECRET_SCANNING.value = "secret_scanning";
        SECRET_SCANNING_PUSH_PROTECTION.value = "secret_scanning_push_protection";

        valueMap.put("dependency_graph", DEPENDENCY_GRAPH);
        valueMap.put("dependabot_alerts", DEPENDABOT_ALERTS);
        valueMap.put("dependabot_security_updates", DEPENDABOT_SECURITY_UPDATES);
        valueMap.put("advanced_security", ADVANCED_SECURITY);
        valueMap.put("secret_scanning", SECRET_SCANNING);
        valueMap.put("secret_scanning_push_protection", SECRET_SCANNING_PUSH_PROTECTION);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SecurityProduct11Enum fromString(String toConvert) {
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
     * Convert list of SecurityProduct11Enum values to list of string values.
     * @param toConvert The list of SecurityProduct11Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SecurityProduct11Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SecurityProduct11Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 