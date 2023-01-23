
# Enterprise

An enterprise on GitHub.

## Structure

`Enterprise`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | A short description of the enterprise. | String getDescription() | setDescription(String description) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `WebsiteUrl` | `String` | Optional | The enterprise's website URL. | String getWebsiteUrl() | setWebsiteUrl(String websiteUrl) |
| `Id` | `int` | Required | Unique identifier of the enterprise | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | The name of the enterprise. | String getName() | setName(String name) |
| `Slug` | `String` | Required | The slug url identifier for the enterprise. | String getSlug() | setSlug(String slug) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `AvatarUrl` | `String` | Required | - | String getAvatarUrl() | setAvatarUrl(String avatarUrl) |

## Example (as JSON)

```json
{
  "html_url": "https://github.com/enterprises/octo-business",
  "id": 42,
  "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
  "name": "Octo Business",
  "slug": "octo-business",
  "created_at": "01/26/2019 19:01:12",
  "updated_at": "01/26/2019 19:14:43",
  "avatar_url": null
}
```

