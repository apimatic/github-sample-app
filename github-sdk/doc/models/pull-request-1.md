
# Pull Request 1

## Structure

`PullRequest1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MergedAt` | `LocalDateTime` | Optional | - | LocalDateTime getMergedAt() | setMergedAt(LocalDateTime mergedAt) |
| `DiffUrl` | `String` | Required | - | String getDiffUrl() | setDiffUrl(String diffUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `PatchUrl` | `String` | Required | - | String getPatchUrl() | setPatchUrl(String patchUrl) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "merged_at": null,
  "diff_url": "diff_url4",
  "html_url": "html_url0",
  "patch_url": "patch_url4",
  "url": "url4"
}
```

