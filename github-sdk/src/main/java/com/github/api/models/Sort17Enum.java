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
 * Sort17Enum to be used.
 */
public enum Sort17Enum {
    COMMENTS,

    REACTIONS,

    ENUM_REACTIONS1,

    REACTIONS1,

    REACTIONSSMILE,

    REACTIONSTHINKING_FACE,

    REACTIONSHEART,

    REACTIONSTADA,

    INTERACTIONS,

    CREATED,

    UPDATED;


    private static TreeMap<String, Sort17Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        COMMENTS.value = "comments";
        REACTIONS.value = "reactions";
        ENUM_REACTIONS1.value = "reactions-+1";
        REACTIONS1.value = "reactions--1";
        REACTIONSSMILE.value = "reactions-smile";
        REACTIONSTHINKING_FACE.value = "reactions-thinking_face";
        REACTIONSHEART.value = "reactions-heart";
        REACTIONSTADA.value = "reactions-tada";
        INTERACTIONS.value = "interactions";
        CREATED.value = "created";
        UPDATED.value = "updated";

        valueMap.put("comments", COMMENTS);
        valueMap.put("reactions", REACTIONS);
        valueMap.put("reactions-+1", ENUM_REACTIONS1);
        valueMap.put("reactions--1", REACTIONS1);
        valueMap.put("reactions-smile", REACTIONSSMILE);
        valueMap.put("reactions-thinking_face", REACTIONSTHINKING_FACE);
        valueMap.put("reactions-heart", REACTIONSHEART);
        valueMap.put("reactions-tada", REACTIONSTADA);
        valueMap.put("interactions", INTERACTIONS);
        valueMap.put("created", CREATED);
        valueMap.put("updated", UPDATED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Sort17Enum fromString(String toConvert) {
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
     * Convert list of Sort17Enum values to list of string values.
     * @param toConvert The list of Sort17Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Sort17Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Sort17Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 