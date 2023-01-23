
# User Migrations Response

## Structure

`UserMigrationsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Owner` | `Object` | Required | - | Object getOwner() | setOwner(Object owner) |
| `Guid` | `String` | Required | - | String getGuid() | setGuid(String guid) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `LockRepositories` | `boolean` | Required | - | boolean getLockRepositories() | setLockRepositories(boolean lockRepositories) |
| `ExcludeMetadata` | `boolean` | Required | - | boolean getExcludeMetadata() | setExcludeMetadata(boolean excludeMetadata) |
| `ExcludeGitData` | `boolean` | Required | - | boolean getExcludeGitData() | setExcludeGitData(boolean excludeGitData) |
| `ExcludeAttachments` | `boolean` | Required | - | boolean getExcludeAttachments() | setExcludeAttachments(boolean excludeAttachments) |
| `ExcludeReleases` | `boolean` | Required | - | boolean getExcludeReleases() | setExcludeReleases(boolean excludeReleases) |
| `ExcludeOwnerProjects` | `boolean` | Required | - | boolean getExcludeOwnerProjects() | setExcludeOwnerProjects(boolean excludeOwnerProjects) |
| `OrgMetadataOnly` | `boolean` | Required | - | boolean getOrgMetadataOnly() | setOrgMetadataOnly(boolean orgMetadataOnly) |
| `Repositories` | [`List<Repository>`](../../doc/models/repository.md) | Required | - | List<Repository> getRepositories() | setRepositories(List<Repository> repositories) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `ArchiveUrl` | `String` | Optional | - | String getArchiveUrl() | setArchiveUrl(String archiveUrl) |
| `Exclude` | `List<Object>` | Optional | - | List<Object> getExclude() | setExclude(List<Object> exclude) |

## Example (as JSON)

```json
{
  "id": 79,
  "owner": null,
  "guid": "0b989ba4-242f-11e5-81e1-c7b6966d2516",
  "state": "pending",
  "lock_repositories": true,
  "exclude_metadata": null,
  "exclude_git_data": null,
  "exclude_attachments": null,
  "exclude_releases": null,
  "exclude_owner_projects": null,
  "org_metadata_only": null,
  "repositories": {
    "id": 42,
    "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
    "name": "Team Environment",
    "full_name": "octocat/Hello-World",
    "license": null,
    "forks": null,
    "owner": {
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
    "private": null,
    "html_url": "https://github.com/octocat/Hello-World",
    "description": "This your first repo!",
    "fork": null,
    "url": "https://api.github.com/repos/octocat/Hello-World",
    "archive_url": "http://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
    "assignees_url": "http://api.github.com/repos/octocat/Hello-World/assignees{/user}",
    "blobs_url": "http://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
    "branches_url": "http://api.github.com/repos/octocat/Hello-World/branches{/branch}",
    "collaborators_url": "http://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
    "comments_url": "http://api.github.com/repos/octocat/Hello-World/comments{/number}",
    "commits_url": "http://api.github.com/repos/octocat/Hello-World/commits{/sha}",
    "compare_url": "http://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
    "contents_url": "http://api.github.com/repos/octocat/Hello-World/contents/{+path}",
    "contributors_url": "http://api.github.com/repos/octocat/Hello-World/contributors",
    "deployments_url": "http://api.github.com/repos/octocat/Hello-World/deployments",
    "downloads_url": "http://api.github.com/repos/octocat/Hello-World/downloads",
    "events_url": "http://api.github.com/repos/octocat/Hello-World/events",
    "forks_url": "http://api.github.com/repos/octocat/Hello-World/forks",
    "git_commits_url": "http://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
    "git_refs_url": "http://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
    "git_tags_url": "http://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
    "git_url": "git:github.com/octocat/Hello-World.git",
    "issue_comment_url": "http://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
    "issue_events_url": "http://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
    "issues_url": "http://api.github.com/repos/octocat/Hello-World/issues{/number}",
    "keys_url": "http://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
    "labels_url": "http://api.github.com/repos/octocat/Hello-World/labels{/name}",
    "languages_url": "http://api.github.com/repos/octocat/Hello-World/languages",
    "merges_url": "http://api.github.com/repos/octocat/Hello-World/merges",
    "milestones_url": "http://api.github.com/repos/octocat/Hello-World/milestones{/number}",
    "notifications_url": "http://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
    "pulls_url": "http://api.github.com/repos/octocat/Hello-World/pulls{/number}",
    "releases_url": "http://api.github.com/repos/octocat/Hello-World/releases{/id}",
    "ssh_url": "git@github.com:octocat/Hello-World.git",
    "stargazers_url": "http://api.github.com/repos/octocat/Hello-World/stargazers",
    "statuses_url": "http://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
    "subscribers_url": "http://api.github.com/repos/octocat/Hello-World/subscribers",
    "subscription_url": "http://api.github.com/repos/octocat/Hello-World/subscription",
    "tags_url": "http://api.github.com/repos/octocat/Hello-World/tags",
    "teams_url": "http://api.github.com/repos/octocat/Hello-World/teams",
    "trees_url": "http://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
    "clone_url": "https://github.com/octocat/Hello-World.git",
    "mirror_url": "git:git.example.com/octocat/Hello-World",
    "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks",
    "svn_url": "https://svn.github.com/octocat/Hello-World",
    "homepage": "https://github.com",
    "language": null,
    "forks_count": 9,
    "stargazers_count": 80,
    "watchers_count": 80,
    "size": 108,
    "default_branch": "master",
    "open_issues_count": 0,
    "has_issues": true,
    "has_projects": true,
    "has_wiki": true,
    "has_pages": null,
    "has_downloads": true,
    "archived": null,
    "disabled": null,
    "pushed_at": "01/26/2011 19:06:43",
    "created_at": "01/26/2011 19:01:12",
    "updated_at": "01/26/2011 19:14:43",
    "open_issues": null,
    "watchers": null
  },
  "url": "https://api.github.com/orgs/octo-org/migrations/79",
  "created_at": "07/07/2015 03:33:38",
  "updated_at": "07/07/2015 03:33:38",
  "node_id": null
}
```

