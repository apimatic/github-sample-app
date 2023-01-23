
# User Projects Response

## Structure

`UserProjectsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OwnerUrl` | `String` | Required | - | String getOwnerUrl() | setOwnerUrl(String ownerUrl) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `ColumnsUrl` | `String` | Required | - | String getColumnsUrl() | setColumnsUrl(String columnsUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Name` | `String` | Required | Name of the project | String getName() | setName(String name) |
| `Body` | `String` | Required | Body of the project | String getBody() | setBody(String body) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `State` | `String` | Required | State of the project; either 'open' or 'closed' | String getState() | setState(String state) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `OrganizationPermission` | [`OrganizationPermissionEnum`](../../doc/models/organization-permission-enum.md) | Optional | - | OrganizationPermissionEnum getOrganizationPermission() | setOrganizationPermission(OrganizationPermissionEnum organizationPermission) |
| `Private` | `Boolean` | Optional | Whether or not this project can be seen by everyone. Only present if owner is an organization. | Boolean getPrivate() | setPrivate(Boolean mPrivate) |

## Example (as JSON)

```json
{
  "owner_url": "https://api.github.com/repos/api-playground/projects-test",
  "url": "https://api.github.com/projects/1002604",
  "html_url": "https://github.com/api-playground/projects-test/projects/12",
  "columns_url": "https://api.github.com/projects/1002604/columns",
  "id": 1002604,
  "node_id": "MDc6UHJvamVjdDEwMDI2MDQ=",
  "name": "Week One Sprint",
  "body": "This project represents the sprint of the first week in January",
  "number": 1,
  "state": "open",
  "creator": null,
  "created_at": "04/10/2011 20:09:31",
  "updated_at": "03/03/2014 18:58:10"
}
```

