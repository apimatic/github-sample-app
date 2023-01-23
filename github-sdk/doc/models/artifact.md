
# Artifact

An artifact

## Structure

`Artifact`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | The name of the artifact. | String getName() | setName(String name) |
| `SizeInBytes` | `int` | Required | The size in bytes of the artifact. | int getSizeInBytes() | setSizeInBytes(int sizeInBytes) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ArchiveDownloadUrl` | `String` | Required | - | String getArchiveDownloadUrl() | setArchiveDownloadUrl(String archiveDownloadUrl) |
| `Expired` | `boolean` | Required | Whether or not the artifact has expired. | boolean getExpired() | setExpired(boolean expired) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `ExpiresAt` | `LocalDateTime` | Required | - | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `WorkflowRun` | `Object` | Optional | - | Object getWorkflowRun() | setWorkflowRun(Object workflowRun) |

## Example (as JSON)

```json
{
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
```

