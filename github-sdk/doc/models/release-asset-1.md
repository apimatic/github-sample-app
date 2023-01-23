
# Release Asset 1

Data related to a release.

## Structure

`ReleaseAsset1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrowserDownloadUrl` | `String` | Required | - | String getBrowserDownloadUrl() | setBrowserDownloadUrl(String browserDownloadUrl) |
| `ContentType` | `String` | Required | - | String getContentType() | setContentType(String contentType) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DownloadCount` | `int` | Required | - | int getDownloadCount() | setDownloadCount(int downloadCount) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
| `Name` | `String` | Required | The file name of the asset. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `State` | `String` | Required, Constant | State of the release asset.<br>**Default**: `"uploaded"` | String getState() | setState(String state) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Uploader` | `Object` | Optional | - | Object getUploader() | setUploader(Object uploader) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "browser_download_url": null,
  "content_type": null,
  "created_at": null,
  "download_count": null,
  "id": null,
  "label": null,
  "name": null,
  "node_id": null,
  "size": null,
  "state": "uploaded",
  "updated_at": null,
  "url": null
}
```

