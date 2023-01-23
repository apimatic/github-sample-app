
# User Codespaces Exports Response

## Structure

`UserCodespacesExportsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Optional | State of the latest export | String getState() | setState(String state) |
| `CompletedAt` | `LocalDateTime` | Optional | Completion time of the last export operation | LocalDateTime getCompletedAt() | setCompletedAt(LocalDateTime completedAt) |
| `Branch` | `String` | Optional | Name of the exported branch | String getBranch() | setBranch(String branch) |
| `Sha` | `String` | Optional | Git commit SHA of the exported branch | String getSha() | setSha(String sha) |
| `Id` | `String` | Optional | Id for the export details | String getId() | setId(String id) |
| `ExportUrl` | `String` | Optional | Url for fetching export details | String getExportUrl() | setExportUrl(String exportUrl) |
| `HtmlUrl` | `String` | Optional | Web url for the exported branch | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |

## Example (as JSON)

```json
{
  "state": null,
  "completed_at": null,
  "branch": null,
  "sha": null,
  "id": null,
  "export_url": null,
  "html_url": null
}
```

