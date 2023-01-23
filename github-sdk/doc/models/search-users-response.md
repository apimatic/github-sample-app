
# Search Users Response

## Structure

`SearchUsersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalCount` | `int` | Required | - | int getTotalCount() | setTotalCount(int totalCount) |
| `IncompleteResults` | `boolean` | Required | - | boolean getIncompleteResults() | setIncompleteResults(boolean incompleteResults) |
| `Items` | [`List<UserSearchResultItem>`](../../doc/models/user-search-result-item.md) | Required | - | List<UserSearchResultItem> getItems() | setItems(List<UserSearchResultItem> items) |

## Example (as JSON)

```json
{
  "total_count": 104,
  "incomplete_results": false,
  "items": [
    {
      "login": "login7",
      "id": 171,
      "node_id": "node_id5",
      "avatar_url": "avatar_url3",
      "gravatar_id": "gravatar_id5",
      "url": "url1",
      "html_url": "html_url3",
      "followers_url": "followers_url1",
      "subscriptions_url": "subscriptions_url3",
      "organizations_url": "organizations_url1",
      "repos_url": "repos_url1",
      "received_events_url": "received_events_url9",
      "type": "type3",
      "score": 117.27,
      "following_url": "following_url9",
      "gists_url": "gists_url9",
      "starred_url": "starred_url5",
      "events_url": "events_url9",
      "public_repos": null,
      "public_gists": null,
      "followers": null,
      "following": null,
      "created_at": null,
      "updated_at": null,
      "name": null,
      "bio": null,
      "email": null,
      "location": null,
      "site_admin": true,
      "hireable": null,
      "text_matches": null,
      "blog": null,
      "company": null,
      "suspended_at": null
    },
    {
      "login": "login8",
      "id": 172,
      "node_id": "node_id4",
      "avatar_url": "avatar_url4",
      "gravatar_id": "gravatar_id6",
      "url": "url2",
      "html_url": "html_url2",
      "followers_url": "followers_url0",
      "subscriptions_url": "subscriptions_url4",
      "organizations_url": "organizations_url2",
      "repos_url": "repos_url0",
      "received_events_url": "received_events_url0",
      "type": "type2",
      "score": 117.28,
      "following_url": "following_url0",
      "gists_url": "gists_url0",
      "starred_url": "starred_url4",
      "events_url": "events_url0",
      "public_repos": null,
      "public_gists": null,
      "followers": null,
      "following": null,
      "created_at": null,
      "updated_at": null,
      "name": null,
      "bio": null,
      "email": null,
      "location": null,
      "site_admin": false,
      "hireable": null,
      "text_matches": null,
      "blog": null,
      "company": null,
      "suspended_at": null
    }
  ]
}
```

