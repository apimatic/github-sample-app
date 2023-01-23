
# Installation Repositoriesaddedevent

## Structure

`InstallationRepositoriesaddedevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"added"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation48`](../../doc/models/installation-48.md) | Required | - | Installation48 getInstallation() | setInstallation(Installation48 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `RepositoriesAdded` | [`List<RepositoriesAdded>`](../../doc/models/repositories-added.md) | Required | An array of repository objects, which were added to the installation. | List<RepositoriesAdded> getRepositoriesAdded() | setRepositoriesAdded(List<RepositoriesAdded> repositoriesAdded) |
| `RepositoriesRemoved` | [`List<RepositoriesRemoved>`](../../doc/models/repositories-removed.md) | Required | An array of repository objects, which were removed from the installation. | List<RepositoriesRemoved> getRepositoriesRemoved() | setRepositoriesRemoved(List<RepositoriesRemoved> repositoriesRemoved) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `RepositorySelection` | [`RepositorySelectionEnum`](../../doc/models/repository-selection-enum.md) | Required | - | RepositorySelectionEnum getRepositorySelection() | setRepositorySelection(RepositorySelectionEnum repositorySelection) |
| `Requester` | `Object` | Required | - | Object getRequester() | setRequester(Object requester) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Required | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "added",
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
  "repositories_added": null,
  "repositories_removed": null,
  "repository_selection": null,
  "requester": null,
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

