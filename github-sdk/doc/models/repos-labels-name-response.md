
# Repos Labels Name Response

## Structure

`ReposLabelsNameResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | - | long getId() | setId(long id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | URL for the label | String getUrl() | setUrl(String url) |
| `Name` | `String` | Required | The name of the label. | String getName() | setName(String name) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Color` | `String` | Required | 6-character hex code, without the leading #, identifying the color | String getColor() | setColor(String color) |
| `Default` | `boolean` | Required | - | boolean getDefault() | setDefault(boolean mDefault) |

## Example (as JSON)

```json
{
  "id": 208045946,
  "node_id": "MDU6TGFiZWwyMDgwNDU5NDY=",
  "url": "https://api.github.com/repositories/42/labels/bug",
  "name": "bug",
  "description": "Something isn't working",
  "color": "FFFFFF",
  "default": true
}
```

