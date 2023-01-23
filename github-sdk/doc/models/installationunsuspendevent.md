
# Installationunsuspendevent

## Structure

`Installationunsuspendevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"unsuspend"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation48`](../../doc/models/installation-48.md) | Required | - | Installation48 getInstallation() | setInstallation(Installation48 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repositories` | [`List<Repository5>`](../../doc/models/repository-5.md) | Optional | An array of repository objects that the installation can access. | List<Repository5> getRepositories() | setRepositories(List<Repository5> repositories) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `Requester` | `Object` | Optional | - | Object getRequester() | setRequester(Object requester) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Required | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "unsuspend",
  "installation": {
    "id": 1,
    "account": null,
    "repository_selection": null,
    "access_tokens_url": "https://api.github.com/installations/1/access_tokens",
    "repositories_url": "https://api.github.com/installation/repositories",
    "html_url": "https://github.com/organizations/github/settings/installations/1",
    "app_id": 1,
    "target_id": null,
    "target_type": "Organization",
    "permissions": null,
    "events": null,
    "created_at": null,
    "updated_at": null,
    "single_file_name": "config.yaml",
    "app_slug": "github-actions",
    "suspended_by": null,
    "suspended_at": null
  },
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

