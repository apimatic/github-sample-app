
# Search Labels Response

## Structure

`SearchLabelsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `IncompleteResults` | `boolean` | Required | - | boolean getIncompleteResults() | setIncompleteResults(boolean incompleteResults) |
| `Items` | [`List<LabelSearchResultItem>`](../../doc/models/label-search-result-item.md) | Required | - | List<LabelSearchResultItem> getItems() | setItems(List<LabelSearchResultItem> items) |

## Example (as JSON)

```json
{
  "total_count": 104,
  "incomplete_results": false,
  "items": [
    {
      "id": 171,
      "node_id": "node_id5",
      "url": "url1",
      "name": "name7",
      "color": "color1",
      "default": true,
      "description": "description7",
      "score": 117.27,
      "text_matches": null
    },
    {
      "id": 172,
      "node_id": "node_id4",
      "url": "url2",
      "name": "name8",
      "color": "color2",
      "default": false,
      "description": "description8",
      "score": 117.28,
      "text_matches": null
    }
  ]
}
```

