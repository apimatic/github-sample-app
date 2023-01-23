
# Project 1

## Structure

`Project1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `String` | Required | Body of the project | String getBody() | setBody(String body) |
| `ColumnsUrl` | `String` | Required | - | String getColumnsUrl() | setColumnsUrl(String columnsUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Creator` | `Object` | Required | - | Object getCreator() | setCreator(Object creator) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | Name of the project | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `OwnerUrl` | `String` | Required | - | String getOwnerUrl() | setOwnerUrl(String ownerUrl) |
| `State` | [`State93Enum`](../../doc/models/state-93-enum.md) | Required | - | State93Enum getState() | setState(State93Enum state) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "body": "body6",
  "columns_url": "columns_url8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "creator": {
    "key1": "val1",
    "key2": "val2"
  },
  "html_url": "html_url0",
  "id": 112,
  "name": "name0",
  "node_id": "node_id2",
  "number": 158,
  "owner_url": "owner_url2",
  "state": "open",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4"
}
```

