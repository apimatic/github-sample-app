
# Release Asset

Data related to a release.

## Structure

`ReleaseAsset`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `BrowserDownloadUrl` | `String` | Required | - | String getBrowserDownloadUrl() | setBrowserDownloadUrl(String browserDownloadUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | The file name of the asset. | String getName() | setName(String name) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
| `State` | [`State14Enum`](../../doc/models/state-14-enum.md) | Required | - | State14Enum getState() | setState(State14Enum state) |
| `ContentType` | `String` | Required | - | String getContentType() | setContentType(String contentType) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `DownloadCount` | `int` | Required | - | int getDownloadCount() | setDownloadCount(int downloadCount) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Uploader` | `Object` | Required | - | Object getUploader() | setUploader(Object uploader) |

## Example (as JSON)

```json
{
  "url": null,
  "browser_download_url": null,
  "id": null,
  "node_id": null,
  "name": "Team Environment",
  "label": null,
  "state": null,
  "content_type": null,
  "size": null,
  "download_count": null,
  "created_at": null,
  "updated_at": null,
  "uploader": null
}
```

