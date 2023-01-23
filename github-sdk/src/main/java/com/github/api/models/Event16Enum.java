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
 * Event16Enum to be used.
 */
public enum Event16Enum {
    BRANCH_PROTECTION_RULE,

    CHECK_RUN,

    CHECK_SUITE,

    CODE_SCANNING_ALERT,

    COMMIT_COMMENT,

    CONTENT_REFERENCE,

    CREATE,

    DELETE,

    DEPLOYMENT,

    DEPLOYMENT_REVIEW,

    DEPLOYMENT_STATUS,

    DEPLOY_KEY,

    DISCUSSION,

    DISCUSSION_COMMENT,

    FORK,

    GOLLUM,

    ISSUES,

    ISSUE_COMMENT,

    LABEL,

    MEMBER,

    MEMBERSHIP,

    MILESTONE,

    ORGANIZATION,

    ORG_BLOCK,

    PAGE_BUILD,

    PROJECT,

    PROJECT_CARD,

    PROJECT_COLUMN,

    ENUM_PUBLIC,

    PULL_REQUEST,

    PULL_REQUEST_REVIEW,

    PULL_REQUEST_REVIEW_COMMENT,

    PUSH,

    REGISTRY_PACKAGE,

    RELEASE,

    REPOSITORY,

    REPOSITORY_DISPATCH,

    SECRET_SCANNING_ALERT,

    STAR,

    STATUS,

    TEAM,

    TEAM_ADD,

    WATCH,

    WORKFLOW_DISPATCH,

    WORKFLOW_RUN,

    REMINDER,

    SECURITY_AND_ANALYSIS;


    private static TreeMap<String, Event16Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        BRANCH_PROTECTION_RULE.value = "branch_protection_rule";
        CHECK_RUN.value = "check_run";
        CHECK_SUITE.value = "check_suite";
        CODE_SCANNING_ALERT.value = "code_scanning_alert";
        COMMIT_COMMENT.value = "commit_comment";
        CONTENT_REFERENCE.value = "content_reference";
        CREATE.value = "create";
        DELETE.value = "delete";
        DEPLOYMENT.value = "deployment";
        DEPLOYMENT_REVIEW.value = "deployment_review";
        DEPLOYMENT_STATUS.value = "deployment_status";
        DEPLOY_KEY.value = "deploy_key";
        DISCUSSION.value = "discussion";
        DISCUSSION_COMMENT.value = "discussion_comment";
        FORK.value = "fork";
        GOLLUM.value = "gollum";
        ISSUES.value = "issues";
        ISSUE_COMMENT.value = "issue_comment";
        LABEL.value = "label";
        MEMBER.value = "member";
        MEMBERSHIP.value = "membership";
        MILESTONE.value = "milestone";
        ORGANIZATION.value = "organization";
        ORG_BLOCK.value = "org_block";
        PAGE_BUILD.value = "page_build";
        PROJECT.value = "project";
        PROJECT_CARD.value = "project_card";
        PROJECT_COLUMN.value = "project_column";
        ENUM_PUBLIC.value = "public";
        PULL_REQUEST.value = "pull_request";
        PULL_REQUEST_REVIEW.value = "pull_request_review";
        PULL_REQUEST_REVIEW_COMMENT.value = "pull_request_review_comment";
        PUSH.value = "push";
        REGISTRY_PACKAGE.value = "registry_package";
        RELEASE.value = "release";
        REPOSITORY.value = "repository";
        REPOSITORY_DISPATCH.value = "repository_dispatch";
        SECRET_SCANNING_ALERT.value = "secret_scanning_alert";
        STAR.value = "star";
        STATUS.value = "status";
        TEAM.value = "team";
        TEAM_ADD.value = "team_add";
        WATCH.value = "watch";
        WORKFLOW_DISPATCH.value = "workflow_dispatch";
        WORKFLOW_RUN.value = "workflow_run";
        REMINDER.value = "reminder";
        SECURITY_AND_ANALYSIS.value = "security_and_analysis";

        valueMap.put("branch_protection_rule", BRANCH_PROTECTION_RULE);
        valueMap.put("check_run", CHECK_RUN);
        valueMap.put("check_suite", CHECK_SUITE);
        valueMap.put("code_scanning_alert", CODE_SCANNING_ALERT);
        valueMap.put("commit_comment", COMMIT_COMMENT);
        valueMap.put("content_reference", CONTENT_REFERENCE);
        valueMap.put("create", CREATE);
        valueMap.put("delete", DELETE);
        valueMap.put("deployment", DEPLOYMENT);
        valueMap.put("deployment_review", DEPLOYMENT_REVIEW);
        valueMap.put("deployment_status", DEPLOYMENT_STATUS);
        valueMap.put("deploy_key", DEPLOY_KEY);
        valueMap.put("discussion", DISCUSSION);
        valueMap.put("discussion_comment", DISCUSSION_COMMENT);
        valueMap.put("fork", FORK);
        valueMap.put("gollum", GOLLUM);
        valueMap.put("issues", ISSUES);
        valueMap.put("issue_comment", ISSUE_COMMENT);
        valueMap.put("label", LABEL);
        valueMap.put("member", MEMBER);
        valueMap.put("membership", MEMBERSHIP);
        valueMap.put("milestone", MILESTONE);
        valueMap.put("organization", ORGANIZATION);
        valueMap.put("org_block", ORG_BLOCK);
        valueMap.put("page_build", PAGE_BUILD);
        valueMap.put("project", PROJECT);
        valueMap.put("project_card", PROJECT_CARD);
        valueMap.put("project_column", PROJECT_COLUMN);
        valueMap.put("public", ENUM_PUBLIC);
        valueMap.put("pull_request", PULL_REQUEST);
        valueMap.put("pull_request_review", PULL_REQUEST_REVIEW);
        valueMap.put("pull_request_review_comment", PULL_REQUEST_REVIEW_COMMENT);
        valueMap.put("push", PUSH);
        valueMap.put("registry_package", REGISTRY_PACKAGE);
        valueMap.put("release", RELEASE);
        valueMap.put("repository", REPOSITORY);
        valueMap.put("repository_dispatch", REPOSITORY_DISPATCH);
        valueMap.put("secret_scanning_alert", SECRET_SCANNING_ALERT);
        valueMap.put("star", STAR);
        valueMap.put("status", STATUS);
        valueMap.put("team", TEAM);
        valueMap.put("team_add", TEAM_ADD);
        valueMap.put("watch", WATCH);
        valueMap.put("workflow_dispatch", WORKFLOW_DISPATCH);
        valueMap.put("workflow_run", WORKFLOW_RUN);
        valueMap.put("reminder", REMINDER);
        valueMap.put("security_and_analysis", SECURITY_AND_ANALYSIS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Event16Enum fromString(String toConvert) {
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
     * Convert list of Event16Enum values to list of string values.
     * @param toConvert The list of Event16Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Event16Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Event16Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 