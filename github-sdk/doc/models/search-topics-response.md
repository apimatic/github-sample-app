
# Search Topics Response

## Structure

`SearchTopicsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `IncompleteResults` | `boolean` | Required | - | boolean getIncompleteResults() | setIncompleteResults(boolean incompleteResults) |
| `Items` | [`List<TopicSearchResultItem>`](../../doc/models/topic-search-result-item.md) | Required | - | List<TopicSearchResultItem> getItems() | setItems(List<TopicSearchResultItem> items) |

## Example (as JSON)

```json
{
  "total_count": 104,
  "incomplete_results": false,
  "items": [
    {
      "name": "name7",
      "display_name": "display_name7",
      "short_description": "short_description3",
      "description": "description7",
      "created_by": "created_by5",
      "released": "released7",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "featured": true,
      "curated": true,
      "score": 117.27,
      "repository_count": null,
      "logo_url": null,
      "text_matches": null,
      "related": null,
      "aliases": null
    },
    {
      "name": "name8",
      "display_name": "display_name8",
      "short_description": "short_description4",
      "description": "description8",
      "created_by": "created_by6",
      "released": "released8",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "featured": false,
      "curated": false,
      "score": 117.28,
      "repository_count": null,
      "logo_url": null,
      "text_matches": null,
      "related": null,
      "aliases": null
    }
  ]
}
```

