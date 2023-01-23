
# Converted Noteto Issue Issue Event

Converted Note to Issue Issue Event

## Structure

`ConvertedNotetoIssueIssueEvent`

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
| `PerformedViaGithubApp` | [`PerformedViaGithubApp`](../../doc/models/performed-via-github-app.md) | Required | - | PerformedViaGithubApp getPerformedViaGithubApp() | setPerformedViaGithubApp(PerformedViaGithubApp performedViaGithubApp) |
| `ProjectCard` | [`ProjectCard1`](../../doc/models/project-card-1.md) | Optional | - | ProjectCard1 getProjectCard() | setProjectCard(ProjectCard1 projectCard) |

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
  "performed_via_github_app": {
    "id": 37,
    "node_id": "MDExOkludGVncmF0aW9uMQ==",
    "owner": null,
    "name": "Probot Owners",
    "description": "The description of the app.",
    "external_url": "https://example.com",
    "html_url": "https://github.com/apps/super-ci",
    "created_at": "07/09/2017 01:18:44",
    "updated_at": "07/09/2017 01:18:44",
    "permissions": null,
    "events": [
      "label",
      "deployment"
    ]
  }
}
```

