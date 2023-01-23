
# App 4

GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are first class actors within GitHub.

## Structure

`App4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Events` | [`List<Event3Enum>`](../../doc/models/event-3-enum.md) | Optional | The list of events for the GitHub app | List<Event3Enum> getEvents() | setEvents(List<Event3Enum> events) |
| `ExternalUrl` | `String` | Required | - | String getExternalUrl() | setExternalUrl(String externalUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `Integer` | Required | Unique identifier of the GitHub app | Integer getId() | setId(Integer id) |
| `Name` | `String` | Required | The name of the GitHub app | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Owner` | `Object` | Required | - | Object getOwner() | setOwner(Object owner) |
| `Permissions` | [`Permissions16`](../../doc/models/permissions-16.md) | Optional | - | Permissions16 getPermissions() | setPermissions(Permissions16 permissions) |
| `Slug` | `String` | Optional | The slug name of the GitHub app | String getSlug() | setSlug(String slug) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "created_at": "2016-03-13T12:52:32.123Z",
  "description": "description0",
  "events": null,
  "external_url": "external_url8",
  "html_url": "html_url0",
  "id": 112,
  "name": "name0",
  "node_id": "node_id2",
  "owner": {
    "key1": "val1",
    "key2": "val2"
  },
  "permissions": null,
  "slug": null,
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

