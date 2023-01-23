
# Project Cardmovedevent

## Structure

`ProjectCardmovedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"moved"` | String getAction() | setAction(String action) |
| `Changes` | [`Changes17`](../../doc/models/changes-17.md) | Optional | - | Changes17 getChanges() | setChanges(Changes17 changes) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `ProjectCard` | [`ProjectCard11`](../../doc/models/project-card-11.md) | Required | - | ProjectCard11 getProjectCard() | setProjectCard(ProjectCard11 projectCard) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Required | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "moved",
  "project_card": null,
  "sender": {
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
  }
}
```

