
# Renamed Issue Event

Renamed Issue Event

## Structure

`RenamedIssueEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Actor` | [`Actor2`](../../doc/models/actor-2.md) | Required | - | Actor2 getActor() | setActor(Actor2 actor) |
| `Event` | `String` | Required | - | String getEvent() | setEvent(String event) |
| `CommitId` | `String` | Required | - | String getCommitId() | setCommitId(String commitId) |
| `CommitUrl` | `String` | Required | - | String getCommitUrl() | setCommitUrl(String commitUrl) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `PerformedViaGithubApp` | `Object` | Required | - | Object getPerformedViaGithubApp() | setPerformedViaGithubApp(Object performedViaGithubApp) |
| `Rename` | [`Rename`](../../doc/models/rename.md) | Required | - | Rename getRename() | setRename(Rename rename) |

## Example (as JSON)

```json
{
  "id": null,
  "node_id": null,
  "url": null,
  "actor": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "event": null,
  "commit_id": null,
  "commit_url": null,
  "created_at": null,
  "performed_via_github_app": null,
  "rename": null
}
```

