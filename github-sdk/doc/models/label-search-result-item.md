
# Label Search Result Item

Label Search Result Item

## Structure

`LabelSearchResultItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Color` | `String` | Required | - | String getColor() | setColor(String color) |
| `Default` | `boolean` | Required | - | boolean getDefault() | setDefault(boolean mDefault) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `Score` | `double` | Required | - | double getScore() | setScore(double score) |
| `TextMatches` | [`List<SearchResultTextMatch>`](../../doc/models/search-result-text-match.md) | Optional | - | List<SearchResultTextMatch> getTextMatches() | setTextMatches(List<SearchResultTextMatch> textMatches) |

## Example (as JSON)

```json
{
  "id": 112,
  "node_id": "node_id2",
  "url": "url4",
  "name": "name0",
  "color": "color6",
  "default": false,
  "description": "description0",
  "score": 147.4,
  "text_matches": null
}
```

