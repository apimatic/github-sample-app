
# Repos Dependabot Alerts Alert Number Response

## Structure

`ReposDependabotAlertsAlertNumberResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `int` | Required | The security alert number. | int getNumber() | setNumber(int number) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Required | - | StateEnum getState() | setState(StateEnum state) |
| `Dependency` | [`Dependency3`](../../doc/models/dependency-3.md) | Required | - | Dependency3 getDependency() | setDependency(Dependency3 dependency) |
| `SecurityAdvisory` | [`SecurityAdvisory1`](../../doc/models/security-advisory-1.md) | Required | - | SecurityAdvisory1 getSecurityAdvisory() | setSecurityAdvisory(SecurityAdvisory1 securityAdvisory) |
| `SecurityVulnerability` | [`SecurityVulnerability`](../../doc/models/security-vulnerability.md) | Required | - | SecurityVulnerability getSecurityVulnerability() | setSecurityVulnerability(SecurityVulnerability securityVulnerability) |
| `Url` | `String` | Required | The REST API URL of the alert resource. | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | The GitHub URL of the alert resource. | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `CreatedAt` | `LocalDateTime` | Required | The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DismissedAt` | `LocalDateTime` | Required | The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getDismissedAt() | setDismissedAt(LocalDateTime dismissedAt) |
| `DismissedBy` | `Object` | Required | - | Object getDismissedBy() | setDismissedBy(Object dismissedBy) |
| `DismissedReason` | `Object` | Required | - | Object getDismissedReason() | setDismissedReason(Object dismissedReason) |
| `DismissedComment` | `String` | Required | An optional comment associated with the alert's dismissal.<br>**Constraints**: *Maximum Length*: `280` | String getDismissedComment() | setDismissedComment(String dismissedComment) |
| `FixedAt` | `LocalDateTime` | Required | The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`. | LocalDateTime getFixedAt() | setFixedAt(LocalDateTime fixedAt) |

## Example (as JSON)

```json
{
  "number": 158,
  "state": "open",
  "dependency": {
    "package": null,
    "manifest_path": null,
    "scope": null
  },
  "security_advisory": {
    "ghsa_id": "ghsa_id8",
    "cve_id": "cve_id8",
    "summary": "summary0",
    "description": "description2",
    "vulnerabilities": [
      {
        "package": {
          "ecosystem": "ecosystem5",
          "name": "name9"
        },
        "severity": "critical",
        "vulnerable_version_range": "vulnerable_version_range9",
        "first_patched_version": {
          "key1": "val1",
          "key2": "val2"
        }
      },
      {
        "package": {
          "ecosystem": "ecosystem6",
          "name": "name0"
        },
        "severity": "low",
        "vulnerable_version_range": "vulnerable_version_range0",
        "first_patched_version": {
          "key1": "val1",
          "key2": "val2"
        }
      },
      {
        "package": {
          "ecosystem": "ecosystem7",
          "name": "name1"
        },
        "severity": "medium",
        "vulnerable_version_range": "vulnerable_version_range1",
        "first_patched_version": {
          "key1": "val1",
          "key2": "val2"
        }
      }
    ],
    "severity": "low",
    "cvss": {
      "score": 243.74,
      "vector_string": "vector_string4"
    },
    "cwes": [
      {
        "cwe_id": "cwe_id0",
        "name": "name8"
      },
      {
        "cwe_id": "cwe_id1",
        "name": "name7"
      },
      {
        "cwe_id": "cwe_id2",
        "name": "name6"
      }
    ],
    "identifiers": [
      {
        "type": "CVE",
        "value": "value6"
      },
      {
        "type": "GHSA",
        "value": "value7"
      }
    ],
    "references": [
      {
        "url": "url2"
      }
    ],
    "published_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "withdrawn_at": "2016-03-13T12:52:32.123Z"
  },
  "security_vulnerability": {
    "package": {
      "ecosystem": "ecosystem2",
      "name": "name6"
    },
    "severity": "low",
    "vulnerable_version_range": "vulnerable_version_range6",
    "first_patched_version": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "url": "url4",
  "html_url": "html_url0",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "dismissed_at": "2016-03-13T12:52:32.123Z",
  "dismissed_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_reason": {
    "key1": "val1",
    "key2": "val2"
  },
  "dismissed_comment": "dismissed_comment2",
  "fixed_at": "2016-03-13T12:52:32.123Z"
}
```

