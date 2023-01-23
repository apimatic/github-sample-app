/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.github.api.ApiHelper;
import com.github.api.models.ProtectionRule;
import com.github.api.models.ProtectionRule1;
import com.github.api.models.ProtectionRule2;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = EnvironmentProtectionRules.EnvironmentProtectionRulesDeserializer.class)
public abstract class EnvironmentProtectionRules {
    
    /**
     * Any-of type initialization method.
     * @param protectionRule ProtectionRule value for protectionRule.
     * @return The ProtectionRuleCase object.
     */
    public static EnvironmentProtectionRules fromProtectionRule(ProtectionRule protectionRule) {
        return protectionRule == null ? null : new ProtectionRuleCase(protectionRule);
    }

    /**
     * Any-of type initialization method.
     * @param protectionRule1 ProtectionRule1 value for protectionRule1.
     * @return The ProtectionRule1Case object.
     */
    public static EnvironmentProtectionRules fromProtectionRule1(ProtectionRule1 protectionRule1) {
        return protectionRule1 == null ? null : new ProtectionRule1Case(protectionRule1);
    }

    /**
     * Any-of type initialization method.
     * @param protectionRule2 ProtectionRule2 value for protectionRule2.
     * @return The ProtectionRule2Case object.
     */
    public static EnvironmentProtectionRules fromProtectionRule2(ProtectionRule2 protectionRule2) {
        return protectionRule2 == null ? null : new ProtectionRule2Case(protectionRule2);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R protectionRule(ProtectionRule protectionRule);

        R protectionRule1(ProtectionRule1 protectionRule1);

        R protectionRule2(ProtectionRule2 protectionRule2);
    }

    /**
     * This is a implementation class for ProtectionRuleCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ProtectionRuleCase extends EnvironmentProtectionRules {

        @JsonValue
        private ProtectionRule protectionRule;

        ProtectionRuleCase(ProtectionRule protectionRule) {
            this.protectionRule = protectionRule;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.protectionRule(this.protectionRule);
        }

        @JsonCreator
        private ProtectionRuleCase(JsonNode jsonNode) throws IOException {
            this.protectionRule = ApiHelper.deserialize(jsonNode,
                ProtectionRule.class);
        }

        @Override
        public String toString() {
            return protectionRule.toString();
        }
    }

    /**
     * This is a implementation class for ProtectionRule1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ProtectionRule1Case extends EnvironmentProtectionRules {

        @JsonValue
        private ProtectionRule1 protectionRule1;

        ProtectionRule1Case(ProtectionRule1 protectionRule1) {
            this.protectionRule1 = protectionRule1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.protectionRule1(this.protectionRule1);
        }

        @JsonCreator
        private ProtectionRule1Case(JsonNode jsonNode) throws IOException {
            this.protectionRule1 = ApiHelper.deserialize(jsonNode,
                ProtectionRule1.class);
        }

        @Override
        public String toString() {
            return protectionRule1.toString();
        }
    }

    /**
     * This is a implementation class for ProtectionRule2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase
    private static class ProtectionRule2Case extends EnvironmentProtectionRules {

        @JsonValue
        private ProtectionRule2 protectionRule2;

        ProtectionRule2Case(ProtectionRule2 protectionRule2) {
            this.protectionRule2 = protectionRule2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.protectionRule2(this.protectionRule2);
        }

        @JsonCreator
        private ProtectionRule2Case(JsonNode jsonNode) throws IOException {
            this.protectionRule2 = ApiHelper.deserialize(jsonNode,
                ProtectionRule2.class);
        }

        @Override
        public String toString() {
            return protectionRule2.toString();
        }
    }

    /**
     * This is a custom deserializer class for EnvironmentProtectionRules.
     */
    protected static class EnvironmentProtectionRulesDeserializer
            extends JsonDeserializer<EnvironmentProtectionRules> {

        @Override
        public EnvironmentProtectionRules deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(ProtectionRuleCase.class,
                    ProtectionRule1Case.class, ProtectionRule2Case.class), false);
        }
    }

}