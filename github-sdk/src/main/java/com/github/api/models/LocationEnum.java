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
 * LocationEnum to be used.
 */
public enum LocationEnum {
    EASTUS,

    SOUTHEASTASIA,

    WESTEUROPE,

    WESTUS2;


    private static TreeMap<String, LocationEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        EASTUS.value = "EastUs";
        SOUTHEASTASIA.value = "SouthEastAsia";
        WESTEUROPE.value = "WestEurope";
        WESTUS2.value = "WestUs2";

        valueMap.put("EastUs", EASTUS);
        valueMap.put("SouthEastAsia", SOUTHEASTASIA);
        valueMap.put("WestEurope", WESTEUROPE);
        valueMap.put("WestUs2", WESTUS2);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static LocationEnum fromString(String toConvert) {
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
     * Convert list of LocationEnum values to list of string values.
     * @param toConvert The list of LocationEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LocationEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LocationEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 