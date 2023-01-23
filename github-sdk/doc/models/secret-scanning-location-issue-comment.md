
# Secret Scanning Location Issue Comment

Represents an 'issue_comment' secret scanning location type. This location type shows that a secret was detected in a comment on an issue.

## Structure

`SecretScanningLocationIssueComment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IssueCommentUrl` | `String` | Required | The API URL to get the issue comment where the secret was detected. | String getIssueCommentUrl() | setIssueCommentUrl(String issueCommentUrl) |

## Example (as JSON)

```json
{
  "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451"
}
```

