
# Head 2

## Structure

`Head2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `Repo` | `Object` | Required | - | Object getRepo() | setRepo(Object repo) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `User` | [`Owner3`](../../doc/models/owner-3.md) | Required | - | Owner3 getUser() | setUser(Owner3 user) |

## Example (as JSON)

```json
{
  "label": "label0",
  "ref": "ref0",
  "repo": {
    "key1": "val1",
    "key2": "val2"
  },
  "sha": "sha6",
  "user": {
    "avatar_url": "avatar_url6",
    "events_url": "events_url8",
    "followers_url": "followers_url8",
    "following_url": "following_url2",
    "gists_url": "gists_url2",
    "gravatar_id": "gravatar_id8",
    "html_url": "html_url0",
    "id": 76,
    "node_id": "node_id2",
    "login": "login0",
    "organizations_url": "organizations_url4",
    "received_events_url": "received_events_url2",
    "repos_url": "repos_url8",
    "site_admin": false,
    "starred_url": "starred_url2",
    "subscriptions_url": "subscriptions_url6",
    "type": "type0",
    "url": "url4"
  }
}
```

