# Dependabot

Endpoints to manage Dependabot.

```java
DependabotController dependabotController = client.getDependabotController();
```

## Class Name

`DependabotController`

## Methods

* [Dependabot List-Alerts-for-Enterprise](../../doc/controllers/dependabot.md#dependabot-list-alerts-for-enterprise)
* [Dependabot List-Alerts-for-Org](../../doc/controllers/dependabot.md#dependabot-list-alerts-for-org)
* [Dependabot List-Org-Secrets](../../doc/controllers/dependabot.md#dependabot-list-org-secrets)
* [Dependabot Get-Org-Public-Key](../../doc/controllers/dependabot.md#dependabot-get-org-public-key)
* [Dependabot Get-Org-Secret](../../doc/controllers/dependabot.md#dependabot-get-org-secret)
* [Dependabot Create-or-Update-Org-Secret](../../doc/controllers/dependabot.md#dependabot-create-or-update-org-secret)
* [Dependabot Delete-Org-Secret](../../doc/controllers/dependabot.md#dependabot-delete-org-secret)
* [Dependabot List-Selected-Repos-for-Org-Secret](../../doc/controllers/dependabot.md#dependabot-list-selected-repos-for-org-secret)
* [Dependabot Set-Selected-Repos-for-Org-Secret](../../doc/controllers/dependabot.md#dependabot-set-selected-repos-for-org-secret)
* [Dependabot Add-Selected-Repo-to-Org-Secret](../../doc/controllers/dependabot.md#dependabot-add-selected-repo-to-org-secret)
* [Dependabot Remove-Selected-Repo-From-Org-Secret](../../doc/controllers/dependabot.md#dependabot-remove-selected-repo-from-org-secret)
* [Dependabot List-Alerts-for-Repo](../../doc/controllers/dependabot.md#dependabot-list-alerts-for-repo)
* [Dependabot Get-Alert](../../doc/controllers/dependabot.md#dependabot-get-alert)
* [Dependabot Update-Alert](../../doc/controllers/dependabot.md#dependabot-update-alert)
* [Dependabot List-Repo-Secrets](../../doc/controllers/dependabot.md#dependabot-list-repo-secrets)
* [Dependabot Get-Repo-Public-Key](../../doc/controllers/dependabot.md#dependabot-get-repo-public-key)
* [Dependabot Get-Repo-Secret](../../doc/controllers/dependabot.md#dependabot-get-repo-secret)
* [Dependabot Create-or-Update-Repo-Secret](../../doc/controllers/dependabot.md#dependabot-create-or-update-repo-secret)
* [Dependabot Delete-Repo-Secret](../../doc/controllers/dependabot.md#dependabot-delete-repo-secret)


# Dependabot List-Alerts-for-Enterprise

Lists Dependabot alerts for repositories that are owned by the specified enterprise.
To use this endpoint, you must be a member of the enterprise, and you must use an
access token with the `repo` scope or `security_events` scope.
Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security manager. For more information about security managers, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."

API method documentation: [https://docs.github.com/rest/dependabot/alerts#list-dependabot-alerts-for-an-enterprise](https://docs.github.com/rest/dependabot/alerts#list-dependabot-alerts-for-an-enterprise)

```java
CompletableFuture<List<DependabotAlertWithRepository>> dependabotListAlertsForEnterpriseAsync(
    final String enterprise,
    final String state,
    final String severity,
    final String ecosystem,
    final String mPackage,
    final Scope61Enum scope,
    final Sort18Enum sort,
    final Direction1Enum direction,
    final String before,
    final String after,
    final Integer first,
    final Integer last,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `state` | `String` | Query, Optional | A comma-separated list of states. If specified, only alerts with these states will be returned.<br><br>Can be: `dismissed`, `fixed`, `open` |
| `severity` | `String` | Query, Optional | A comma-separated list of severities. If specified, only alerts with these severities will be returned.<br><br>Can be: `low`, `medium`, `high`, `critical` |
| `ecosystem` | `String` | Query, Optional | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.<br><br>Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust` |
| `mPackage` | `String` | Query, Optional | A comma-separated list of package names. If specified, only alerts for these packages will be returned. |
| `scope` | [`Scope61Enum`](../../doc/models/scope-61-enum.md) | Query, Optional | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. |
| `sort` | [`Sort18Enum`](../../doc/models/sort-18-enum.md) | Query, Optional | The property by which to sort the results.<br>`created` means when the alert was created.<br>`updated` means when the alert's state last changed. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. |
| `first` | `Integer` | Query, Optional | **Deprecated**. The number of results per page (max 100), starting from the first matching result.<br>This parameter must not be used in combination with `last`.<br>Instead, use `per_page` in combination with `after` to fetch the first page of results.<br>**Default**: `30`<br>**Constraints**: `>= 1`, `<= 100` |
| `last` | `Integer` | Query, Optional | **Deprecated**. The number of results per page (max 100), starting from the last matching result.<br>This parameter must not be used in combination with `first`.<br>Instead, use `per_page` in combination with `before` to fetch the last page of results.<br>**Constraints**: `>= 1`, `<= 100` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`List<DependabotAlertWithRepository>`](../../doc/models/dependabot-alert-with-repository.md)

## Example Usage

```java
String enterprise = "enterprise4";
Integer first = 30;
Integer perPage = 30;

dependabotController.dependabotListAlertsForEnterpriseAsync(enterprise, null, null, null, null, null, null, null, null, null, first, null, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "number": 2,
    "state": "dismissed",
    "dependency": {
      "package": {
        "ecosystem": "pip",
        "name": "django"
      },
      "manifest_path": "path/to/requirements.txt",
      "scope": "runtime"
    },
    "security_advisory": {
      "ghsa_id": "GHSA-rf4j-j272-fj86",
      "cve_id": "CVE-2018-6188",
      "summary": "Django allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive",
      "description": "django.contrib.auth.forms.AuthenticationForm in Django 2.0 before 2.0.2, and 1.11.8 and 1.11.9, allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive.",
      "vulnerabilities": [
        {
          "package": {
            "ecosystem": "pip",
            "name": "django"
          },
          "severity": "high",
          "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
          "first_patched_version": {
            "identifier": "2.0.2"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "django"
          },
          "severity": "high",
          "vulnerable_version_range": ">= 1.11.8, < 1.11.10",
          "first_patched_version": {
            "identifier": "1.11.10"
          }
        }
      ],
      "severity": "high",
      "cvss": {
        "vector_string": "CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:N/A:N",
        "score": 7.5
      },
      "cwes": [
        {
          "cwe_id": "CWE-200",
          "name": "Exposure of Sensitive Information to an Unauthorized Actor"
        }
      ],
      "identifiers": [
        {
          "type": "GHSA",
          "value": "GHSA-rf4j-j272-fj86"
        },
        {
          "type": "CVE",
          "value": "CVE-2018-6188"
        }
      ],
      "references": [
        {
          "url": "https://nvd.nist.gov/vuln/detail/CVE-2018-6188"
        },
        {
          "url": "https://github.com/advisories/GHSA-rf4j-j272-fj86"
        },
        {
          "url": "https://usn.ubuntu.com/3559-1/"
        },
        {
          "url": "https://www.djangoproject.com/weblog/2018/feb/01/security-releases/"
        },
        {
          "url": "http://www.securitytracker.com/id/1040422"
        }
      ],
      "published_at": "2018-10-03T21:13:54Z",
      "updated_at": "2022-04-26T18:35:37Z",
      "withdrawn_at": null
    },
    "security_vulnerability": {
      "package": {
        "ecosystem": "pip",
        "name": "django"
      },
      "severity": "high",
      "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
      "first_patched_version": {
        "identifier": "2.0.2"
      }
    },
    "url": "https://api.github.com/repos/octo-org/octo-repo/dependabot/alerts/2",
    "html_url": "https://github.com/octo-org/octo-repo/security/dependabot/2",
    "created_at": "2022-06-15T07:43:03Z",
    "updated_at": "2022-08-23T14:29:47Z",
    "dismissed_at": "2022-08-23T14:29:47Z",
    "dismissed_by": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "dismissed_reason": "tolerable_risk",
    "dismissed_comment": "This alert is accurate but we use a sanitizer.",
    "fixed_at": null,
    "repository": {
      "id": 217723378,
      "node_id": "MDEwOlJlcG9zaXRvcnkyMTc3MjMzNzg=",
      "name": "octo-repo",
      "full_name": "octo-org/octo-repo",
      "owner": {
        "login": "octo-org",
        "id": 6811672,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjY4MTE2NzI=",
        "avatar_url": "https://avatars3.githubusercontent.com/u/6811672?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octo-org",
        "html_url": "https://github.com/octo-org",
        "followers_url": "https://api.github.com/users/octo-org/followers",
        "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
        "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
        "organizations_url": "https://api.github.com/users/octo-org/orgs",
        "repos_url": "https://api.github.com/users/octo-org/repos",
        "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octo-org/received_events",
        "type": "Organization",
        "site_admin": false
      },
      "private": true,
      "html_url": "https://github.com/octo-org/octo-repo",
      "description": null,
      "fork": false,
      "url": "https://api.github.com/repos/octo-org/octo-repo",
      "archive_url": "https://api.github.com/repos/octo-org/octo-repo/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octo-org/octo-repo/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octo-org/octo-repo/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octo-org/octo-repo/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octo-org/octo-repo/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octo-org/octo-repo/comments{/number}",
      "commits_url": "https://api.github.com/repos/octo-org/octo-repo/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octo-org/octo-repo/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octo-org/octo-repo/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octo-org/octo-repo/contributors",
      "deployments_url": "https://api.github.com/repos/octo-org/octo-repo/deployments",
      "downloads_url": "https://api.github.com/repos/octo-org/octo-repo/downloads",
      "events_url": "https://api.github.com/repos/octo-org/octo-repo/events",
      "forks_url": "https://api.github.com/repos/octo-org/octo-repo/forks",
      "git_commits_url": "https://api.github.com/repos/octo-org/octo-repo/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octo-org/octo-repo/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octo-org/octo-repo/git/tags{/sha}",
      "hooks_url": "https://api.github.com/repos/octo-org/octo-repo/hooks",
      "issue_comment_url": "https://api.github.com/repos/octo-org/octo-repo/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octo-org/octo-repo/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octo-org/octo-repo/issues{/number}",
      "keys_url": "https://api.github.com/repos/octo-org/octo-repo/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octo-org/octo-repo/labels{/name}",
      "languages_url": "https://api.github.com/repos/octo-org/octo-repo/languages",
      "merges_url": "https://api.github.com/repos/octo-org/octo-repo/merges",
      "milestones_url": "https://api.github.com/repos/octo-org/octo-repo/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octo-org/octo-repo/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octo-org/octo-repo/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octo-org/octo-repo/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octo-org/octo-repo/stargazers",
      "statuses_url": "https://api.github.com/repos/octo-org/octo-repo/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octo-org/octo-repo/subscribers",
      "subscription_url": "https://api.github.com/repos/octo-org/octo-repo/subscription",
      "tags_url": "https://api.github.com/repos/octo-org/octo-repo/tags",
      "teams_url": "https://api.github.com/repos/octo-org/octo-repo/teams",
      "trees_url": "https://api.github.com/repos/octo-org/octo-repo/git/trees{/sha}"
    }
  },
  {
    "number": 1,
    "state": "open",
    "dependency": {
      "package": {
        "ecosystem": "pip",
        "name": "ansible"
      },
      "manifest_path": "path/to/requirements.txt",
      "scope": "runtime"
    },
    "security_advisory": {
      "ghsa_id": "GHSA-8f4m-hccc-8qph",
      "cve_id": "CVE-2021-20191",
      "summary": "Insertion of Sensitive Information into Log File in ansible",
      "description": "A flaw was found in ansible. Credentials, such as secrets, are being disclosed in console log by default and not protected by no_log feature when using those modules. An attacker can take advantage of this information to steal those credentials. The highest threat from this vulnerability is to data confidentiality.",
      "vulnerabilities": [
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": ">= 2.9.0, < 2.9.18",
          "first_patched_version": {
            "identifier": "2.9.18"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": "< 2.8.19",
          "first_patched_version": {
            "identifier": "2.8.19"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": ">= 2.10.0, < 2.10.7",
          "first_patched_version": {
            "identifier": "2.10.7"
          }
        }
      ],
      "severity": "medium",
      "cvss": {
        "vector_string": "CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N",
        "score": 5.5
      },
      "cwes": [
        {
          "cwe_id": "CWE-532",
          "name": "Insertion of Sensitive Information into Log File"
        }
      ],
      "identifiers": [
        {
          "type": "GHSA",
          "value": "GHSA-8f4m-hccc-8qph"
        },
        {
          "type": "CVE",
          "value": "CVE-2021-20191"
        }
      ],
      "references": [
        {
          "url": "https://nvd.nist.gov/vuln/detail/CVE-2021-20191"
        },
        {
          "url": "https://access.redhat.com/security/cve/cve-2021-20191"
        },
        {
          "url": "https://bugzilla.redhat.com/show_bug.cgi?id=1916813"
        }
      ],
      "published_at": "2021-06-01T17:38:00Z",
      "updated_at": "2021-08-12T23:06:00Z",
      "withdrawn_at": null
    },
    "security_vulnerability": {
      "package": {
        "ecosystem": "pip",
        "name": "ansible"
      },
      "severity": "medium",
      "vulnerable_version_range": "< 2.8.19",
      "first_patched_version": {
        "identifier": "2.8.19"
      }
    },
    "url": "https://api.github.com/repos/octo-org/hello-world/dependabot/alerts/1",
    "html_url": "https://github.com/octo-org/hello-world/security/dependabot/1",
    "created_at": "2022-06-14T15:21:52Z",
    "updated_at": "2022-06-14T15:21:52Z",
    "dismissed_at": null,
    "dismissed_by": null,
    "dismissed_reason": null,
    "dismissed_comment": null,
    "fixed_at": null,
    "repository": {
      "id": 664700648,
      "node_id": "MDEwOlJlcG9zaXRvcnk2NjQ3MDA2NDg=",
      "name": "hello-world",
      "full_name": "octo-org/hello-world",
      "owner": {
        "login": "octo-org",
        "id": 6811672,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjY4MTE2NzI=",
        "avatar_url": "https://avatars3.githubusercontent.com/u/6811672?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octo-org",
        "html_url": "https://github.com/octo-org",
        "followers_url": "https://api.github.com/users/octo-org/followers",
        "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
        "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
        "organizations_url": "https://api.github.com/users/octo-org/orgs",
        "repos_url": "https://api.github.com/users/octo-org/repos",
        "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octo-org/received_events",
        "type": "Organization",
        "site_admin": false
      },
      "private": true,
      "html_url": "https://github.com/octo-org/hello-world",
      "description": null,
      "fork": false,
      "url": "https://api.github.com/repos/octo-org/hello-world",
      "archive_url": "https://api.github.com/repos/octo-org/hello-world/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octo-org/hello-world/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octo-org/hello-world/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octo-org/hello-world/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octo-org/hello-world/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octo-org/hello-world/comments{/number}",
      "commits_url": "https://api.github.com/repos/octo-org/hello-world/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octo-org/hello-world/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octo-org/hello-world/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octo-org/hello-world/contributors",
      "deployments_url": "https://api.github.com/repos/octo-org/hello-world/deployments",
      "downloads_url": "https://api.github.com/repos/octo-org/hello-world/downloads",
      "events_url": "https://api.github.com/repos/octo-org/hello-world/events",
      "forks_url": "https://api.github.com/repos/octo-org/hello-world/forks",
      "git_commits_url": "https://api.github.com/repos/octo-org/hello-world/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octo-org/hello-world/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octo-org/hello-world/git/tags{/sha}",
      "hooks_url": "https://api.github.com/repos/octo-org/hello-world/hooks",
      "issue_comment_url": "https://api.github.com/repos/octo-org/hello-world/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octo-org/hello-world/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octo-org/hello-world/issues{/number}",
      "keys_url": "https://api.github.com/repos/octo-org/hello-world/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octo-org/hello-world/labels{/name}",
      "languages_url": "https://api.github.com/repos/octo-org/hello-world/languages",
      "merges_url": "https://api.github.com/repos/octo-org/hello-world/merges",
      "milestones_url": "https://api.github.com/repos/octo-org/hello-world/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octo-org/hello-world/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octo-org/hello-world/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octo-org/hello-world/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octo-org/hello-world/stargazers",
      "statuses_url": "https://api.github.com/repos/octo-org/hello-world/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octo-org/hello-world/subscribers",
      "subscription_url": "https://api.github.com/repos/octo-org/hello-world/subscription",
      "tags_url": "https://api.github.com/repos/octo-org/hello-world/tags",
      "teams_url": "https://api.github.com/repos/octo-org/hello-world/teams",
      "trees_url": "https://api.github.com/repos/octo-org/hello-world/git/trees{/sha}"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`EnterprisesDependabotAlerts403ErrorException`](../../doc/models/enterprises-dependabot-alerts-403-error-exception.md) |
| 404 | Resource not found | [`EnterprisesDependabotAlerts404ErrorException`](../../doc/models/enterprises-dependabot-alerts-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`EnterprisesDependabotAlerts422ErrorException`](../../doc/models/enterprises-dependabot-alerts-422-error-exception.md) |


# Dependabot List-Alerts-for-Org

Lists Dependabot alerts for an organization.

To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.

For public repositories, you may instead use the `public_repo` scope.

GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/dependabot/alerts#list-dependabot-alerts-for-an-organization](https://docs.github.com/rest/dependabot/alerts#list-dependabot-alerts-for-an-organization)

```java
CompletableFuture<List<DependabotAlertWithRepository>> dependabotListAlertsForOrgAsync(
    final String org,
    final String state,
    final String severity,
    final String ecosystem,
    final String mPackage,
    final Scope61Enum scope,
    final Sort18Enum sort,
    final Direction1Enum direction,
    final String before,
    final String after,
    final Integer first,
    final Integer last,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `state` | `String` | Query, Optional | A comma-separated list of states. If specified, only alerts with these states will be returned.<br><br>Can be: `dismissed`, `fixed`, `open` |
| `severity` | `String` | Query, Optional | A comma-separated list of severities. If specified, only alerts with these severities will be returned.<br><br>Can be: `low`, `medium`, `high`, `critical` |
| `ecosystem` | `String` | Query, Optional | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.<br><br>Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust` |
| `mPackage` | `String` | Query, Optional | A comma-separated list of package names. If specified, only alerts for these packages will be returned. |
| `scope` | [`Scope61Enum`](../../doc/models/scope-61-enum.md) | Query, Optional | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. |
| `sort` | [`Sort18Enum`](../../doc/models/sort-18-enum.md) | Query, Optional | The property by which to sort the results.<br>`created` means when the alert was created.<br>`updated` means when the alert's state last changed. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. |
| `first` | `Integer` | Query, Optional | **Deprecated**. The number of results per page (max 100), starting from the first matching result.<br>This parameter must not be used in combination with `last`.<br>Instead, use `per_page` in combination with `after` to fetch the first page of results.<br>**Default**: `30`<br>**Constraints**: `>= 1`, `<= 100` |
| `last` | `Integer` | Query, Optional | **Deprecated**. The number of results per page (max 100), starting from the last matching result.<br>This parameter must not be used in combination with `first`.<br>Instead, use `per_page` in combination with `before` to fetch the last page of results.<br>**Constraints**: `>= 1`, `<= 100` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`List<DependabotAlertWithRepository>`](../../doc/models/dependabot-alert-with-repository.md)

## Example Usage

```java
String org = "org6";
Integer first = 30;
Integer perPage = 30;

dependabotController.dependabotListAlertsForOrgAsync(org, null, null, null, null, null, null, null, null, null, first, null, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "number": 2,
    "state": "dismissed",
    "dependency": {
      "package": {
        "ecosystem": "pip",
        "name": "django"
      },
      "manifest_path": "path/to/requirements.txt",
      "scope": "runtime"
    },
    "security_advisory": {
      "ghsa_id": "GHSA-rf4j-j272-fj86",
      "cve_id": "CVE-2018-6188",
      "summary": "Django allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive",
      "description": "django.contrib.auth.forms.AuthenticationForm in Django 2.0 before 2.0.2, and 1.11.8 and 1.11.9, allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive.",
      "vulnerabilities": [
        {
          "package": {
            "ecosystem": "pip",
            "name": "django"
          },
          "severity": "high",
          "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
          "first_patched_version": {
            "identifier": "2.0.2"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "django"
          },
          "severity": "high",
          "vulnerable_version_range": ">= 1.11.8, < 1.11.10",
          "first_patched_version": {
            "identifier": "1.11.10"
          }
        }
      ],
      "severity": "high",
      "cvss": {
        "vector_string": "CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:N/A:N",
        "score": 7.5
      },
      "cwes": [
        {
          "cwe_id": "CWE-200",
          "name": "Exposure of Sensitive Information to an Unauthorized Actor"
        }
      ],
      "identifiers": [
        {
          "type": "GHSA",
          "value": "GHSA-rf4j-j272-fj86"
        },
        {
          "type": "CVE",
          "value": "CVE-2018-6188"
        }
      ],
      "references": [
        {
          "url": "https://nvd.nist.gov/vuln/detail/CVE-2018-6188"
        },
        {
          "url": "https://github.com/advisories/GHSA-rf4j-j272-fj86"
        },
        {
          "url": "https://usn.ubuntu.com/3559-1/"
        },
        {
          "url": "https://www.djangoproject.com/weblog/2018/feb/01/security-releases/"
        },
        {
          "url": "http://www.securitytracker.com/id/1040422"
        }
      ],
      "published_at": "2018-10-03T21:13:54Z",
      "updated_at": "2022-04-26T18:35:37Z",
      "withdrawn_at": null
    },
    "security_vulnerability": {
      "package": {
        "ecosystem": "pip",
        "name": "django"
      },
      "severity": "high",
      "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
      "first_patched_version": {
        "identifier": "2.0.2"
      }
    },
    "url": "https://api.github.com/repos/octo-org/octo-repo/dependabot/alerts/2",
    "html_url": "https://github.com/octo-org/octo-repo/security/dependabot/2",
    "created_at": "2022-06-15T07:43:03Z",
    "updated_at": "2022-08-23T14:29:47Z",
    "dismissed_at": "2022-08-23T14:29:47Z",
    "dismissed_by": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "dismissed_reason": "tolerable_risk",
    "dismissed_comment": "This alert is accurate but we use a sanitizer.",
    "fixed_at": null,
    "repository": {
      "id": 217723378,
      "node_id": "MDEwOlJlcG9zaXRvcnkyMTc3MjMzNzg=",
      "name": "octo-repo",
      "full_name": "octo-org/octo-repo",
      "owner": {
        "login": "octo-org",
        "id": 6811672,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjY4MTE2NzI=",
        "avatar_url": "https://avatars3.githubusercontent.com/u/6811672?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octo-org",
        "html_url": "https://github.com/octo-org",
        "followers_url": "https://api.github.com/users/octo-org/followers",
        "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
        "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
        "organizations_url": "https://api.github.com/users/octo-org/orgs",
        "repos_url": "https://api.github.com/users/octo-org/repos",
        "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octo-org/received_events",
        "type": "Organization",
        "site_admin": false
      },
      "private": true,
      "html_url": "https://github.com/octo-org/octo-repo",
      "description": null,
      "fork": false,
      "url": "https://api.github.com/repos/octo-org/octo-repo",
      "archive_url": "https://api.github.com/repos/octo-org/octo-repo/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octo-org/octo-repo/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octo-org/octo-repo/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octo-org/octo-repo/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octo-org/octo-repo/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octo-org/octo-repo/comments{/number}",
      "commits_url": "https://api.github.com/repos/octo-org/octo-repo/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octo-org/octo-repo/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octo-org/octo-repo/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octo-org/octo-repo/contributors",
      "deployments_url": "https://api.github.com/repos/octo-org/octo-repo/deployments",
      "downloads_url": "https://api.github.com/repos/octo-org/octo-repo/downloads",
      "events_url": "https://api.github.com/repos/octo-org/octo-repo/events",
      "forks_url": "https://api.github.com/repos/octo-org/octo-repo/forks",
      "git_commits_url": "https://api.github.com/repos/octo-org/octo-repo/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octo-org/octo-repo/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octo-org/octo-repo/git/tags{/sha}",
      "hooks_url": "https://api.github.com/repos/octo-org/octo-repo/hooks",
      "issue_comment_url": "https://api.github.com/repos/octo-org/octo-repo/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octo-org/octo-repo/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octo-org/octo-repo/issues{/number}",
      "keys_url": "https://api.github.com/repos/octo-org/octo-repo/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octo-org/octo-repo/labels{/name}",
      "languages_url": "https://api.github.com/repos/octo-org/octo-repo/languages",
      "merges_url": "https://api.github.com/repos/octo-org/octo-repo/merges",
      "milestones_url": "https://api.github.com/repos/octo-org/octo-repo/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octo-org/octo-repo/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octo-org/octo-repo/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octo-org/octo-repo/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octo-org/octo-repo/stargazers",
      "statuses_url": "https://api.github.com/repos/octo-org/octo-repo/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octo-org/octo-repo/subscribers",
      "subscription_url": "https://api.github.com/repos/octo-org/octo-repo/subscription",
      "tags_url": "https://api.github.com/repos/octo-org/octo-repo/tags",
      "teams_url": "https://api.github.com/repos/octo-org/octo-repo/teams",
      "trees_url": "https://api.github.com/repos/octo-org/octo-repo/git/trees{/sha}"
    }
  },
  {
    "number": 1,
    "state": "open",
    "dependency": {
      "package": {
        "ecosystem": "pip",
        "name": "ansible"
      },
      "manifest_path": "path/to/requirements.txt",
      "scope": "runtime"
    },
    "security_advisory": {
      "ghsa_id": "GHSA-8f4m-hccc-8qph",
      "cve_id": "CVE-2021-20191",
      "summary": "Insertion of Sensitive Information into Log File in ansible",
      "description": "A flaw was found in ansible. Credentials, such as secrets, are being disclosed in console log by default and not protected by no_log feature when using those modules. An attacker can take advantage of this information to steal those credentials. The highest threat from this vulnerability is to data confidentiality.",
      "vulnerabilities": [
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": ">= 2.9.0, < 2.9.18",
          "first_patched_version": {
            "identifier": "2.9.18"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": "< 2.8.19",
          "first_patched_version": {
            "identifier": "2.8.19"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": ">= 2.10.0, < 2.10.7",
          "first_patched_version": {
            "identifier": "2.10.7"
          }
        }
      ],
      "severity": "medium",
      "cvss": {
        "vector_string": "CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N",
        "score": 5.5
      },
      "cwes": [
        {
          "cwe_id": "CWE-532",
          "name": "Insertion of Sensitive Information into Log File"
        }
      ],
      "identifiers": [
        {
          "type": "GHSA",
          "value": "GHSA-8f4m-hccc-8qph"
        },
        {
          "type": "CVE",
          "value": "CVE-2021-20191"
        }
      ],
      "references": [
        {
          "url": "https://nvd.nist.gov/vuln/detail/CVE-2021-20191"
        },
        {
          "url": "https://access.redhat.com/security/cve/cve-2021-20191"
        },
        {
          "url": "https://bugzilla.redhat.com/show_bug.cgi?id=1916813"
        }
      ],
      "published_at": "2021-06-01T17:38:00Z",
      "updated_at": "2021-08-12T23:06:00Z",
      "withdrawn_at": null
    },
    "security_vulnerability": {
      "package": {
        "ecosystem": "pip",
        "name": "ansible"
      },
      "severity": "medium",
      "vulnerable_version_range": "< 2.8.19",
      "first_patched_version": {
        "identifier": "2.8.19"
      }
    },
    "url": "https://api.github.com/repos/octo-org/hello-world/dependabot/alerts/1",
    "html_url": "https://github.com/octo-org/hello-world/security/dependabot/1",
    "created_at": "2022-06-14T15:21:52Z",
    "updated_at": "2022-06-14T15:21:52Z",
    "dismissed_at": null,
    "dismissed_by": null,
    "dismissed_reason": null,
    "dismissed_comment": null,
    "fixed_at": null,
    "repository": {
      "id": 664700648,
      "node_id": "MDEwOlJlcG9zaXRvcnk2NjQ3MDA2NDg=",
      "name": "hello-world",
      "full_name": "octo-org/hello-world",
      "owner": {
        "login": "octo-org",
        "id": 6811672,
        "node_id": "MDEyOk9yZ2FuaXphdGlvbjY4MTE2NzI=",
        "avatar_url": "https://avatars3.githubusercontent.com/u/6811672?v=4",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octo-org",
        "html_url": "https://github.com/octo-org",
        "followers_url": "https://api.github.com/users/octo-org/followers",
        "following_url": "https://api.github.com/users/octo-org/following{/other_user}",
        "gists_url": "https://api.github.com/users/octo-org/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octo-org/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octo-org/subscriptions",
        "organizations_url": "https://api.github.com/users/octo-org/orgs",
        "repos_url": "https://api.github.com/users/octo-org/repos",
        "events_url": "https://api.github.com/users/octo-org/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octo-org/received_events",
        "type": "Organization",
        "site_admin": false
      },
      "private": true,
      "html_url": "https://github.com/octo-org/hello-world",
      "description": null,
      "fork": false,
      "url": "https://api.github.com/repos/octo-org/hello-world",
      "archive_url": "https://api.github.com/repos/octo-org/hello-world/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octo-org/hello-world/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octo-org/hello-world/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octo-org/hello-world/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octo-org/hello-world/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octo-org/hello-world/comments{/number}",
      "commits_url": "https://api.github.com/repos/octo-org/hello-world/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octo-org/hello-world/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octo-org/hello-world/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octo-org/hello-world/contributors",
      "deployments_url": "https://api.github.com/repos/octo-org/hello-world/deployments",
      "downloads_url": "https://api.github.com/repos/octo-org/hello-world/downloads",
      "events_url": "https://api.github.com/repos/octo-org/hello-world/events",
      "forks_url": "https://api.github.com/repos/octo-org/hello-world/forks",
      "git_commits_url": "https://api.github.com/repos/octo-org/hello-world/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octo-org/hello-world/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octo-org/hello-world/git/tags{/sha}",
      "hooks_url": "https://api.github.com/repos/octo-org/hello-world/hooks",
      "issue_comment_url": "https://api.github.com/repos/octo-org/hello-world/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octo-org/hello-world/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octo-org/hello-world/issues{/number}",
      "keys_url": "https://api.github.com/repos/octo-org/hello-world/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octo-org/hello-world/labels{/name}",
      "languages_url": "https://api.github.com/repos/octo-org/hello-world/languages",
      "merges_url": "https://api.github.com/repos/octo-org/hello-world/merges",
      "milestones_url": "https://api.github.com/repos/octo-org/hello-world/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octo-org/hello-world/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octo-org/hello-world/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octo-org/hello-world/releases{/id}",
      "stargazers_url": "https://api.github.com/repos/octo-org/hello-world/stargazers",
      "statuses_url": "https://api.github.com/repos/octo-org/hello-world/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octo-org/hello-world/subscribers",
      "subscription_url": "https://api.github.com/repos/octo-org/hello-world/subscription",
      "tags_url": "https://api.github.com/repos/octo-org/hello-world/tags",
      "teams_url": "https://api.github.com/repos/octo-org/hello-world/teams",
      "trees_url": "https://api.github.com/repos/octo-org/hello-world/git/trees{/sha}"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`OrgsDependabotAlerts400ErrorException`](../../doc/models/orgs-dependabot-alerts-400-error-exception.md) |
| 403 | Forbidden | [`OrgsDependabotAlerts403ErrorException`](../../doc/models/orgs-dependabot-alerts-403-error-exception.md) |
| 404 | Resource not found | [`OrgsDependabotAlerts404ErrorException`](../../doc/models/orgs-dependabot-alerts-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsDependabotAlerts422ErrorException`](../../doc/models/orgs-dependabot-alerts-422-error-exception.md) |


# Dependabot List-Org-Secrets

Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#list-organization-secrets](https://docs.github.com/rest/reference/dependabot#list-organization-secrets)

```java
CompletableFuture<OrgsDependabotSecretsResponse> dependabotListOrgSecretsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsDependabotSecretsResponse`](../../doc/models/orgs-dependabot-secrets-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

dependabotController.dependabotListOrgSecretsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "secrets": [
    {
      "name": "MY_ARTIFACTORY_PASSWORD",
      "created_at": "2021-08-10T14:59:22Z",
      "updated_at": "2021-12-10T14:59:22Z",
      "visibility": "private"
    },
    {
      "name": "NPM_TOKEN",
      "created_at": "2021-08-10T14:59:22Z",
      "updated_at": "2021-12-10T14:59:22Z",
      "visibility": "all"
    },
    {
      "name": "GH_TOKEN",
      "created_at": "2021-08-10T14:59:22Z",
      "updated_at": "2021-12-10T14:59:22Z",
      "visibility": "selected",
      "selected_repositories_url": "https://api.github.com/orgs/octo-org/dependabot/secrets/SUPER_SECRET/repositories"
    }
  ]
}
```


# Dependabot Get-Org-Public-Key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#get-an-organization-public-key](https://docs.github.com/rest/reference/dependabot#get-an-organization-public-key)

```java
CompletableFuture<OrgsDependabotSecretsPublicKeyResponse> dependabotGetOrgPublicKeyAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsDependabotSecretsPublicKeyResponse`](../../doc/models/orgs-dependabot-secrets-public-key-response.md)

## Example Usage

```java
String org = "org6";

dependabotController.dependabotGetOrgPublicKeyAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Dependabot Get-Org-Secret

Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#get-an-organization-secret](https://docs.github.com/rest/reference/dependabot#get-an-organization-secret)

```java
CompletableFuture<OrgsDependabotSecretsResponse2> dependabotGetOrgSecretAsync(
    final String org,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`OrgsDependabotSecretsResponse2`](../../doc/models/orgs-dependabot-secrets-response-2.md)

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";

dependabotController.dependabotGetOrgSecretAsync(org, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "NPM_TOKEN",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z",
  "visibility": "selected",
  "selected_repositories_url": "https://api.github.com/orgs/octo-org/dependabot/secrets/NPM_TOKEN/repositories"
}
```


# Dependabot Create-or-Update-Org-Secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization
permission to use this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret)

```java
CompletableFuture<Object> dependabotCreateOrUpdateOrgSecretAsync(
    final String org,
    final String secretName,
    final OrgsDependabotSecretsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`OrgsDependabotSecretsRequest`](../../doc/models/orgs-dependabot-secrets-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
OrgsDependabotSecretsRequest body = new OrgsDependabotSecretsRequest();
body.setVisibility(Visibility81Enum.SELECTED);
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");
List<String> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add("1296269");
selectedRepositoryIds.add("1296280");

body.setSelectedRepositoryIds(selectedRepositoryIds);

dependabotController.dependabotCreateOrUpdateOrgSecretAsync(org, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Dependabot Delete-Org-Secret

Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#delete-an-organization-secret](https://docs.github.com/rest/reference/dependabot#delete-an-organization-secret)

```java
CompletableFuture<Void> dependabotDeleteOrgSecretAsync(
    final String org,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";

dependabotController.dependabotDeleteOrgSecretAsync(org, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Dependabot List-Selected-Repos-for-Org-Secret

Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#list-selected-repositories-for-an-organization-secret](https://docs.github.com/rest/reference/dependabot#list-selected-repositories-for-an-organization-secret)

```java
CompletableFuture<OrgsActionsSecretsRepositoriesResponse> dependabotListSelectedReposForOrgSecretAsync(
    final String org,
    final String secretName,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`OrgsActionsSecretsRepositoriesResponse`](../../doc/models/orgs-actions-secrets-repositories-response.md)

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
Integer page = 1;
Integer perPage = 30;

dependabotController.dependabotListSelectedReposForOrgSecretAsync(org, secretName, page, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
    }
  ]
}
```


# Dependabot Set-Selected-Repos-for-Org-Secret

Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#set-selected-repositories-for-an-organization-secret](https://docs.github.com/rest/reference/dependabot#set-selected-repositories-for-an-organization-secret)

```java
CompletableFuture<Void> dependabotSetSelectedReposForOrgSecretAsync(
    final String org,
    final String secretName,
    final OrgsDependabotSecretsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`OrgsDependabotSecretsRepositoriesRequest`](../../doc/models/orgs-dependabot-secrets-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
OrgsDependabotSecretsRepositoriesRequest body = new OrgsDependabotSecretsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(64780797);

body.setSelectedRepositoryIds(selectedRepositoryIds);

dependabotController.dependabotSetSelectedReposForOrgSecretAsync(org, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Dependabot Add-Selected-Repo-to-Org-Secret

Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#add-selected-repository-to-an-organization-secret](https://docs.github.com/rest/reference/dependabot#add-selected-repository-to-an-organization-secret)

```java
CompletableFuture<Void> dependabotAddSelectedRepoToOrgSecretAsync(
    final String org,
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
int repositoryId = 254;

dependabotController.dependabotAddSelectedRepoToOrgSecretAsync(org, secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict when visibility type is not set to selected | `ApiException` |


# Dependabot Remove-Selected-Repo-From-Org-Secret

Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#remove-selected-repository-from-an-organization-secret](https://docs.github.com/rest/reference/dependabot#remove-selected-repository-from-an-organization-secret)

```java
CompletableFuture<Void> dependabotRemoveSelectedRepoFromOrgSecretAsync(
    final String org,
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
int repositoryId = 254;

dependabotController.dependabotRemoveSelectedRepoFromOrgSecretAsync(org, secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 409 | Conflict when visibility type not set to selected | `ApiException` |


# Dependabot List-Alerts-for-Repo

You must use an access token with the `security_events` scope to use this endpoint with private repositories.
You can also use tokens with the `public_repo` scope for public repositories only.
GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#list-dependabot-alerts-for-a-repository](https://docs.github.com/rest/reference/dependabot#list-dependabot-alerts-for-a-repository)

```java
CompletableFuture<List<DependabotAlert>> dependabotListAlertsForRepoAsync(
    final String owner,
    final String repo,
    final String state,
    final String severity,
    final String ecosystem,
    final String mPackage,
    final String manifest,
    final Scope61Enum scope,
    final Sort18Enum sort,
    final Direction1Enum direction,
    final Integer page,
    final Integer perPage,
    final String before,
    final String after,
    final Integer first,
    final Integer last)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `state` | `String` | Query, Optional | A comma-separated list of states. If specified, only alerts with these states will be returned.<br><br>Can be: `dismissed`, `fixed`, `open` |
| `severity` | `String` | Query, Optional | A comma-separated list of severities. If specified, only alerts with these severities will be returned.<br><br>Can be: `low`, `medium`, `high`, `critical` |
| `ecosystem` | `String` | Query, Optional | A comma-separated list of ecosystems. If specified, only alerts for these ecosystems will be returned.<br><br>Can be: `composer`, `go`, `maven`, `npm`, `nuget`, `pip`, `pub`, `rubygems`, `rust` |
| `mPackage` | `String` | Query, Optional | A comma-separated list of package names. If specified, only alerts for these packages will be returned. |
| `manifest` | `String` | Query, Optional | A comma-separated list of full manifest paths. If specified, only alerts for these manifests will be returned. |
| `scope` | [`Scope61Enum`](../../doc/models/scope-61-enum.md) | Query, Optional | The scope of the vulnerable dependency. If specified, only alerts with this scope will be returned. |
| `sort` | [`Sort18Enum`](../../doc/models/sort-18-enum.md) | Query, Optional | The property by which to sort the results.<br>`created` means when the alert was created.<br>`updated` means when the alert's state last changed. |
| `direction` | [`Direction1Enum`](../../doc/models/direction-1-enum.md) | Query, Optional | The direction to sort the results by. |
| `page` | `Integer` | Query, Optional | **Deprecated**. Page number of the results to fetch. Use cursor-based pagination with `before` or `after` instead.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `before` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results before this cursor. |
| `after` | `String` | Query, Optional | A cursor, as given in the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header). If specified, the query only searches for results after this cursor. |
| `first` | `Integer` | Query, Optional | **Deprecated**. The number of results per page (max 100), starting from the first matching result.<br>This parameter must not be used in combination with `last`.<br>Instead, use `per_page` in combination with `after` to fetch the first page of results.<br>**Default**: `30`<br>**Constraints**: `>= 1`, `<= 100` |
| `last` | `Integer` | Query, Optional | **Deprecated**. The number of results per page (max 100), starting from the last matching result.<br>This parameter must not be used in combination with `first`.<br>Instead, use `per_page` in combination with `before` to fetch the last page of results.<br>**Constraints**: `>= 1`, `<= 100` |

## Response Type

[`List<DependabotAlert>`](../../doc/models/dependabot-alert.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer page = 1;
Integer perPage = 30;
Integer first = 30;

dependabotController.dependabotListAlertsForRepoAsync(owner, repo, null, null, null, null, null, null, null, null, page, perPage, null, null, first, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "number": 2,
    "state": "dismissed",
    "dependency": {
      "package": {
        "ecosystem": "pip",
        "name": "django"
      },
      "manifest_path": "path/to/requirements.txt",
      "scope": "runtime"
    },
    "security_advisory": {
      "ghsa_id": "GHSA-rf4j-j272-fj86",
      "cve_id": "CVE-2018-6188",
      "summary": "Django allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive",
      "description": "django.contrib.auth.forms.AuthenticationForm in Django 2.0 before 2.0.2, and 1.11.8 and 1.11.9, allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive.",
      "vulnerabilities": [
        {
          "package": {
            "ecosystem": "pip",
            "name": "django"
          },
          "severity": "high",
          "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
          "first_patched_version": {
            "identifier": "2.0.2"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "django"
          },
          "severity": "high",
          "vulnerable_version_range": ">= 1.11.8, < 1.11.10",
          "first_patched_version": {
            "identifier": "1.11.10"
          }
        }
      ],
      "severity": "high",
      "cvss": {
        "vector_string": "CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:N/A:N",
        "score": 7.5
      },
      "cwes": [
        {
          "cwe_id": "CWE-200",
          "name": "Exposure of Sensitive Information to an Unauthorized Actor"
        }
      ],
      "identifiers": [
        {
          "type": "GHSA",
          "value": "GHSA-rf4j-j272-fj86"
        },
        {
          "type": "CVE",
          "value": "CVE-2018-6188"
        }
      ],
      "references": [
        {
          "url": "https://nvd.nist.gov/vuln/detail/CVE-2018-6188"
        },
        {
          "url": "https://github.com/advisories/GHSA-rf4j-j272-fj86"
        },
        {
          "url": "https://usn.ubuntu.com/3559-1/"
        },
        {
          "url": "https://www.djangoproject.com/weblog/2018/feb/01/security-releases/"
        },
        {
          "url": "http://www.securitytracker.com/id/1040422"
        }
      ],
      "published_at": "2018-10-03T21:13:54Z",
      "updated_at": "2022-04-26T18:35:37Z",
      "withdrawn_at": null
    },
    "security_vulnerability": {
      "package": {
        "ecosystem": "pip",
        "name": "django"
      },
      "severity": "high",
      "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
      "first_patched_version": {
        "identifier": "2.0.2"
      }
    },
    "url": "https://api.github.com/repos/octocat/hello-world/dependabot/alerts/2",
    "html_url": "https://github.com/octocat/hello-world/security/dependabot/2",
    "created_at": "2022-06-15T07:43:03Z",
    "updated_at": "2022-08-23T14:29:47Z",
    "dismissed_at": "2022-08-23T14:29:47Z",
    "dismissed_by": {
      "login": "octocat",
      "id": 1,
      "node_id": "MDQ6VXNlcjE=",
      "avatar_url": "https://github.com/images/error/octocat_happy.gif",
      "gravatar_id": "",
      "url": "https://api.github.com/users/octocat",
      "html_url": "https://github.com/octocat",
      "followers_url": "https://api.github.com/users/octocat/followers",
      "following_url": "https://api.github.com/users/octocat/following{/other_user}",
      "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
      "organizations_url": "https://api.github.com/users/octocat/orgs",
      "repos_url": "https://api.github.com/users/octocat/repos",
      "events_url": "https://api.github.com/users/octocat/events{/privacy}",
      "received_events_url": "https://api.github.com/users/octocat/received_events",
      "type": "User",
      "site_admin": false
    },
    "dismissed_reason": "tolerable_risk",
    "dismissed_comment": "This alert is accurate but we use a sanitizer.",
    "fixed_at": null
  },
  {
    "number": 1,
    "state": "open",
    "dependency": {
      "package": {
        "ecosystem": "pip",
        "name": "ansible"
      },
      "manifest_path": "path/to/requirements.txt",
      "scope": "runtime"
    },
    "security_advisory": {
      "ghsa_id": "GHSA-8f4m-hccc-8qph",
      "cve_id": "CVE-2021-20191",
      "summary": "Insertion of Sensitive Information into Log File in ansible",
      "description": "A flaw was found in ansible. Credentials, such as secrets, are being disclosed in console log by default and not protected by no_log feature when using those modules. An attacker can take advantage of this information to steal those credentials. The highest threat from this vulnerability is to data confidentiality.",
      "vulnerabilities": [
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": ">= 2.9.0, < 2.9.18",
          "first_patched_version": {
            "identifier": "2.9.18"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": "< 2.8.19",
          "first_patched_version": {
            "identifier": "2.8.19"
          }
        },
        {
          "package": {
            "ecosystem": "pip",
            "name": "ansible"
          },
          "severity": "medium",
          "vulnerable_version_range": ">= 2.10.0, < 2.10.7",
          "first_patched_version": {
            "identifier": "2.10.7"
          }
        }
      ],
      "severity": "medium",
      "cvss": {
        "vector_string": "CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N",
        "score": 5.5
      },
      "cwes": [
        {
          "cwe_id": "CWE-532",
          "name": "Insertion of Sensitive Information into Log File"
        }
      ],
      "identifiers": [
        {
          "type": "GHSA",
          "value": "GHSA-8f4m-hccc-8qph"
        },
        {
          "type": "CVE",
          "value": "CVE-2021-20191"
        }
      ],
      "references": [
        {
          "url": "https://nvd.nist.gov/vuln/detail/CVE-2021-20191"
        },
        {
          "url": "https://access.redhat.com/security/cve/cve-2021-20191"
        },
        {
          "url": "https://bugzilla.redhat.com/show_bug.cgi?id=1916813"
        }
      ],
      "published_at": "2021-06-01T17:38:00Z",
      "updated_at": "2021-08-12T23:06:00Z",
      "withdrawn_at": null
    },
    "security_vulnerability": {
      "package": {
        "ecosystem": "pip",
        "name": "ansible"
      },
      "severity": "medium",
      "vulnerable_version_range": "< 2.8.19",
      "first_patched_version": {
        "identifier": "2.8.19"
      }
    },
    "url": "https://api.github.com/repos/octocat/hello-world/dependabot/alerts/1",
    "html_url": "https://github.com/octocat/hello-world/security/dependabot/1",
    "created_at": "2022-06-14T15:21:52Z",
    "updated_at": "2022-06-14T15:21:52Z",
    "dismissed_at": null,
    "dismissed_by": null,
    "dismissed_reason": null,
    "dismissed_comment": null,
    "fixed_at": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposDependabotAlerts400ErrorException`](../../doc/models/repos-dependabot-alerts-400-error-exception.md) |
| 403 | Forbidden | [`ReposDependabotAlerts403ErrorException`](../../doc/models/repos-dependabot-alerts-403-error-exception.md) |
| 404 | Resource not found | [`ReposDependabotAlerts404ErrorException`](../../doc/models/repos-dependabot-alerts-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposDependabotAlerts422ErrorException`](../../doc/models/repos-dependabot-alerts-422-error-exception.md) |


# Dependabot Get-Alert

You must use an access token with the `security_events` scope to use this endpoint with private repositories.
You can also use tokens with the `public_repo` scope for public repositories only.
GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#get-a-dependabot-alert](https://docs.github.com/rest/reference/dependabot#get-a-dependabot-alert)

```java
CompletableFuture<ReposDependabotAlertsAlertNumberResponse> dependabotGetAlertAsync(
    final String owner,
    final String repo,
    final int alertNumber)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies a Dependabot alert in its repository.<br>You can find this at the end of the URL for a Dependabot alert within GitHub,<br>or in `number` fields in the response from the<br>`GET /repos/{owner}/{repo}/dependabot/alerts` operation. |

## Response Type

[`ReposDependabotAlertsAlertNumberResponse`](../../doc/models/repos-dependabot-alerts-alert-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;

dependabotController.dependabotGetAlertAsync(owner, repo, alertNumber).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "number": 1,
  "state": "open",
  "dependency": {
    "package": {
      "ecosystem": "pip",
      "name": "ansible"
    },
    "manifest_path": "path/to/requirements.txt",
    "scope": "runtime"
  },
  "security_advisory": {
    "ghsa_id": "GHSA-8f4m-hccc-8qph",
    "cve_id": "CVE-2021-20191",
    "summary": "Insertion of Sensitive Information into Log File in ansible",
    "description": "A flaw was found in ansible. Credentials, such as secrets, are being disclosed in console log by default and not protected by no_log feature when using those modules. An attacker can take advantage of this information to steal those credentials. The highest threat from this vulnerability is to data confidentiality.",
    "vulnerabilities": [
      {
        "package": {
          "ecosystem": "pip",
          "name": "ansible"
        },
        "severity": "medium",
        "vulnerable_version_range": ">= 2.9.0, < 2.9.18",
        "first_patched_version": {
          "identifier": "2.9.18"
        }
      },
      {
        "package": {
          "ecosystem": "pip",
          "name": "ansible"
        },
        "severity": "medium",
        "vulnerable_version_range": "< 2.8.19",
        "first_patched_version": {
          "identifier": "2.8.19"
        }
      },
      {
        "package": {
          "ecosystem": "pip",
          "name": "ansible"
        },
        "severity": "medium",
        "vulnerable_version_range": ">= 2.10.0, < 2.10.7",
        "first_patched_version": {
          "identifier": "2.10.7"
        }
      }
    ],
    "severity": "medium",
    "cvss": {
      "vector_string": "CVSS:3.1/AV:L/AC:L/PR:L/UI:N/S:U/C:H/I:N/A:N",
      "score": 5.5
    },
    "cwes": [
      {
        "cwe_id": "CWE-532",
        "name": "Insertion of Sensitive Information into Log File"
      }
    ],
    "identifiers": [
      {
        "type": "GHSA",
        "value": "GHSA-8f4m-hccc-8qph"
      },
      {
        "type": "CVE",
        "value": "CVE-2021-20191"
      }
    ],
    "references": [
      {
        "url": "https://nvd.nist.gov/vuln/detail/CVE-2021-20191"
      },
      {
        "url": "https://access.redhat.com/security/cve/cve-2021-20191"
      },
      {
        "url": "https://bugzilla.redhat.com/show_bug.cgi?id=1916813"
      }
    ],
    "published_at": "2021-06-01T17:38:00Z",
    "updated_at": "2021-08-12T23:06:00Z",
    "withdrawn_at": null
  },
  "security_vulnerability": {
    "package": {
      "ecosystem": "pip",
      "name": "ansible"
    },
    "severity": "medium",
    "vulnerable_version_range": "< 2.8.19",
    "first_patched_version": {
      "identifier": "2.8.19"
    }
  },
  "url": "https://api.github.com/repos/octocat/hello-world/dependabot/alerts/1",
  "html_url": "https://github.com/octocat/hello-world/security/dependabot/1",
  "created_at": "2022-06-14T15:21:52Z",
  "updated_at": "2022-06-14T15:21:52Z",
  "dismissed_at": null,
  "dismissed_by": null,
  "dismissed_reason": null,
  "dismissed_comment": null,
  "fixed_at": null
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposDependabotAlertsAlertNumber403ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-403-error-exception.md) |
| 404 | Resource not found | [`ReposDependabotAlertsAlertNumber404ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-404-error-exception.md) |


# Dependabot Update-Alert

You must use an access token with the `security_events` scope to use this endpoint with private repositories.
You can also use tokens with the `public_repo` scope for public repositories only.
GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#update-a-dependabot-alert](https://docs.github.com/rest/reference/dependabot#update-a-dependabot-alert)

```java
CompletableFuture<ReposDependabotAlertsAlertNumberResponse> dependabotUpdateAlertAsync(
    final String owner,
    final String repo,
    final int alertNumber,
    final ReposDependabotAlertsAlertNumberRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `alertNumber` | `int` | Template, Required | The number that identifies a Dependabot alert in its repository.<br>You can find this at the end of the URL for a Dependabot alert within GitHub,<br>or in `number` fields in the response from the<br>`GET /repos/{owner}/{repo}/dependabot/alerts` operation. |
| `body` | [`ReposDependabotAlertsAlertNumberRequest`](../../doc/models/repos-dependabot-alerts-alert-number-request.md) | Body, Required | - |

## Response Type

[`ReposDependabotAlertsAlertNumberResponse`](../../doc/models/repos-dependabot-alerts-alert-number-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int alertNumber = 48;
ReposDependabotAlertsAlertNumberRequest body = new ReposDependabotAlertsAlertNumberRequest();
body.setState(State172Enum.DISMISSED);
body.setDismissedReason(DismissedReason5Enum.TOLERABLE_RISK);
body.setDismissedComment("This alert is accurate but we use a sanitizer.");

dependabotController.dependabotUpdateAlertAsync(owner, repo, alertNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "number": 2,
  "state": "dismissed",
  "dependency": {
    "package": {
      "ecosystem": "pip",
      "name": "django"
    },
    "manifest_path": "path/to/requirements.txt",
    "scope": "runtime"
  },
  "security_advisory": {
    "ghsa_id": "GHSA-rf4j-j272-fj86",
    "cve_id": "CVE-2018-6188",
    "summary": "Django allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive",
    "description": "django.contrib.auth.forms.AuthenticationForm in Django 2.0 before 2.0.2, and 1.11.8 and 1.11.9, allows remote attackers to obtain potentially sensitive information by leveraging data exposure from the confirm_login_allowed() method, as demonstrated by discovering whether a user account is inactive.",
    "vulnerabilities": [
      {
        "package": {
          "ecosystem": "pip",
          "name": "django"
        },
        "severity": "high",
        "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
        "first_patched_version": {
          "identifier": "2.0.2"
        }
      },
      {
        "package": {
          "ecosystem": "pip",
          "name": "django"
        },
        "severity": "high",
        "vulnerable_version_range": ">= 1.11.8, < 1.11.10",
        "first_patched_version": {
          "identifier": "1.11.10"
        }
      }
    ],
    "severity": "high",
    "cvss": {
      "vector_string": "CVSS:3.0/AV:N/AC:L/PR:N/UI:N/S:U/C:H/I:N/A:N",
      "score": 7.5
    },
    "cwes": [
      {
        "cwe_id": "CWE-200",
        "name": "Exposure of Sensitive Information to an Unauthorized Actor"
      }
    ],
    "identifiers": [
      {
        "type": "GHSA",
        "value": "GHSA-rf4j-j272-fj86"
      },
      {
        "type": "CVE",
        "value": "CVE-2018-6188"
      }
    ],
    "references": [
      {
        "url": "https://nvd.nist.gov/vuln/detail/CVE-2018-6188"
      },
      {
        "url": "https://github.com/advisories/GHSA-rf4j-j272-fj86"
      },
      {
        "url": "https://usn.ubuntu.com/3559-1/"
      },
      {
        "url": "https://www.djangoproject.com/weblog/2018/feb/01/security-releases/"
      },
      {
        "url": "http://www.securitytracker.com/id/1040422"
      }
    ],
    "published_at": "2018-10-03T21:13:54Z",
    "updated_at": "2022-04-26T18:35:37Z",
    "withdrawn_at": null
  },
  "security_vulnerability": {
    "package": {
      "ecosystem": "pip",
      "name": "django"
    },
    "severity": "high",
    "vulnerable_version_range": ">= 2.0.0, < 2.0.2",
    "first_patched_version": {
      "identifier": "2.0.2"
    }
  },
  "url": "https://api.github.com/repos/octocat/hello-world/dependabot/alerts/2",
  "html_url": "https://github.com/octocat/hello-world/security/dependabot/2",
  "created_at": "2022-06-15T07:43:03Z",
  "updated_at": "2022-08-23T14:29:47Z",
  "dismissed_at": "2022-08-23T14:29:47Z",
  "dismissed_by": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": false
  },
  "dismissed_reason": "tolerable_risk",
  "dismissed_comment": "This alert is accurate but we use a sanitizer.",
  "fixed_at": null
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposDependabotAlertsAlertNumber400ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-400-error-exception.md) |
| 403 | Forbidden | [`ReposDependabotAlertsAlertNumber403ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-403-error-exception.md) |
| 404 | Resource not found | [`ReposDependabotAlertsAlertNumber404ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-404-error-exception.md) |
| 409 | Conflict | [`ReposDependabotAlertsAlertNumber409ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-409-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposDependabotAlertsAlertNumber422ErrorException`](../../doc/models/repos-dependabot-alerts-alert-number-422-error-exception.md) |


# Dependabot List-Repo-Secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#list-repository-secrets](https://docs.github.com/rest/reference/dependabot#list-repository-secrets)

```java
CompletableFuture<ReposDependabotSecretsResponse> dependabotListRepoSecretsAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposDependabotSecretsResponse`](../../doc/models/repos-dependabot-secrets-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

dependabotController.dependabotListRepoSecretsAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "secrets": [
    {
      "name": "AZURE_DEVOPS_PAT",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z"
    },
    {
      "name": "MY_ARTIFACTORY_PASSWORD",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z"
    }
  ]
}
```


# Dependabot Get-Repo-Public-Key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#get-a-repository-public-key](https://docs.github.com/rest/reference/dependabot#get-a-repository-public-key)

```java
CompletableFuture<ReposDependabotSecretsPublicKeyResponse> dependabotGetRepoPublicKeyAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposDependabotSecretsPublicKeyResponse`](../../doc/models/repos-dependabot-secrets-public-key-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

dependabotController.dependabotGetRepoPublicKeyAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Dependabot Get-Repo-Secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#get-a-repository-secret](https://docs.github.com/rest/reference/dependabot#get-a-repository-secret)

```java
CompletableFuture<ReposDependabotSecretsSecretNameResponse> dependabotGetRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`ReposDependabotSecretsSecretNameResponse`](../../doc/models/repos-dependabot-secrets-secret-name-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";

dependabotController.dependabotGetRepoSecretAsync(owner, repo, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "MY_ARTIFACTORY_PASSWORD",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z"
}
```


# Dependabot Create-or-Update-Repo-Secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository
permission to use this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/dependabot#create-or-update-a-repository-secret](https://docs.github.com/rest/reference/dependabot#create-or-update-a-repository-secret)

```java
CompletableFuture<Object> dependabotCreateOrUpdateRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName,
    final ReposDependabotSecretsSecretNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`ReposDependabotSecretsSecretNameRequest`](../../doc/models/repos-dependabot-secrets-secret-name-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";
ReposDependabotSecretsSecretNameRequest body = new ReposDependabotSecretsSecretNameRequest();
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");

dependabotController.dependabotCreateOrUpdateRepoSecretAsync(owner, repo, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Dependabot Delete-Repo-Secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/dependabot#delete-a-repository-secret](https://docs.github.com/rest/reference/dependabot#delete-a-repository-secret)

```java
CompletableFuture<Void> dependabotDeleteRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";

dependabotController.dependabotDeleteRepoSecretAsync(owner, repo, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

