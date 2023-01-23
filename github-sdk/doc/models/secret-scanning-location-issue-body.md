
# Secret Scanning Location Issue Body

Represents an 'issue_body' secret scanning location type. This location type shows that a secret was detected in the body of an issue.

## Structure

`SecretScanningLocationIssueBody`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IssueBodyUrl` | `String` | Required | The API URL to get the issue where the secret was detected. | String getIssueBodyUrl() | setIssueBodyUrl(String issueBodyUrl) |

## Example (as JSON)

```json
{
  "issue_body_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347"
}
```

