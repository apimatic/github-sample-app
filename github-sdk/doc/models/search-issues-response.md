
# Search Issues Response

## Structure

`SearchIssuesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `IncompleteResults` | `boolean` | Required | - | boolean getIncompleteResults() | setIncompleteResults(boolean incompleteResults) |
| `Items` | [`List<IssueSearchResultItem>`](../../doc/models/issue-search-result-item.md) | Required | - | List<IssueSearchResultItem> getItems() | setItems(List<IssueSearchResultItem> items) |

## Example (as JSON)

```json
{
  "total_count": 104,
  "incomplete_results": false,
  "items": [
    {
      "url": "url1",
      "repository_url": "repository_url7",
      "labels_url": "labels_url1",
      "comments_url": "comments_url3",
      "events_url": "events_url9",
      "html_url": "html_url3",
      "id": 171,
      "node_id": "node_id5",
      "number": 99,
      "title": "title7",
      "locked": true,
      "active_lock_reason": null,
      "assignees": null,
      "user": {
        "key1": "val1",
        "key2": "val2"
      },
      "labels": [
        {
          "id": null,
          "node_id": null,
          "url": null,
          "name": null,
          "color": null,
          "default": null,
          "description": null
        },
        {
          "id": null,
          "node_id": null,
          "url": null,
          "name": null,
          "color": null,
          "default": null,
          "description": null
        }
      ],
      "state": "state7",
      "state_reason": null,
      "assignee": {
        "key1": "val1",
        "key2": "val2"
      },
      "milestone": {
        "key1": "val1",
        "key2": "val2"
      },
      "comments": 133,
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "closed_at": "2016-03-13T12:52:32.123Z",
      "text_matches": null,
      "pull_request": null,
      "body": null,
      "score": 117.27,
      "author_association": "FIRST_TIME_CONTRIBUTOR",
      "draft": null,
      "repository": null,
      "body_html": null,
      "body_text": null,
      "timeline_url": null,
      "performed_via_github_app": null,
      "reactions": null
    },
    {
      "url": "url2",
      "repository_url": "repository_url8",
      "labels_url": "labels_url2",
      "comments_url": "comments_url4",
      "events_url": "events_url0",
      "html_url": "html_url2",
      "id": 172,
      "node_id": "node_id4",
      "number": 98,
      "title": "title6",
      "locked": false,
      "active_lock_reason": null,
      "assignees": null,
      "user": {
        "key1": "val1",
        "key2": "val2"
      },
      "labels": [
        {
          "id": null,
          "node_id": null,
          "url": null,
          "name": null,
          "color": null,
          "default": null,
          "description": null
        }
      ],
      "state": "state6",
      "state_reason": null,
      "assignee": {
        "key1": "val1",
        "key2": "val2"
      },
      "milestone": {
        "key1": "val1",
        "key2": "val2"
      },
      "comments": 134,
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "closed_at": "2016-03-13T12:52:32.123Z",
      "text_matches": null,
      "pull_request": null,
      "body": null,
      "score": 117.28,
      "author_association": "MANNEQUIN",
      "draft": null,
      "repository": null,
      "body_html": null,
      "body_text": null,
      "timeline_url": null,
      "performed_via_github_app": null,
      "reactions": null
    }
  ]
}
```

