
# Repos Actions Runs Run Id Artifacts Response

## Structure

`ReposActionsRunsRunIdArtifactsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `Artifacts` | [`List<Artifact>`](../../doc/models/artifact.md) | Required | - | List<Artifact> getArtifacts() | setArtifacts(List<Artifact> artifacts) |

## Example (as JSON)

```json
{
  "total_count": null,
  "artifacts": {
    "id": 5,
    "node_id": "MDEwOkNoZWNrU3VpdGU1",
    "name": "AdventureWorks.Framework",
    "size_in_bytes": 12345,
    "url": "https://api.github.com/repos/github/hello-world/actions/artifacts/5",
    "archive_download_url": "https://api.github.com/repos/github/hello-world/actions/artifacts/5/zip",
    "expired": null,
    "created_at": null,
    "expires_at": null,
    "updated_at": null
  }
}
```

