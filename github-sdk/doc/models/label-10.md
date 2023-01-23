
# Label 10

## Structure

`Label10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Color` | `String` | Required | 6-character hex code, without the leading #, identifying the color | String getColor() | setColor(String color) |
| `Default` | `boolean` | Required | - | boolean getDefault() | setDefault(boolean mDefault) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | The name of the label. | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | URL for the label | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "color": "color6",
  "default": false,
  "description": "description0",
  "id": 112,
  "name": "name0",
  "node_id": "node_id2",
  "url": "url4"
}
```

