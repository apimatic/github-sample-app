
# Secret Scanning Location Issue Title

Represents an 'issue_title' secret scanning location type. This location type shows that a secret was detected in the title of an issue.

## Structure

`SecretScanningLocationIssueTitle`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IssueTitleUrl` | `String` | Required | The API URL to get the issue where the secret was detected. | String getIssueTitleUrl() | setIssueTitleUrl(String issueTitleUrl) |

## Example (as JSON)

```json
{
  "issue_title_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347"
}
```

