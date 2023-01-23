
# Base 2

## Structure

`Base2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `Repo` | [`Repo3`](../../doc/models/repo-3.md) | Required | - | Repo3 getRepo() | setRepo(Repo3 repo) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `User` | [`Owner3`](../../doc/models/owner-3.md) | Required | - | Owner3 getUser() | setUser(Owner3 user) |

## Example (as JSON)

```json
{
  "label": "label0",
  "ref": "ref0",
  "repo": {
    "archive_url": "archive_url4",
    "assignees_url": "assignees_url8",
    "blobs_url": "blobs_url0",
    "branches_url": "branches_url0",
    "collaborators_url": "collaborators_url6",
    "comments_url": "comments_url0",
    "commits_url": "commits_url0",
    "compare_url": "compare_url4",
    "contents_url": "contents_url6",
    "contributors_url": "contributors_url6",
    "deployments_url": "deployments_url8",
    "description": "description4",
    "downloads_url": "downloads_url2",
    "events_url": "events_url6",
    "fork": false,
    "forks_url": "forks_url0",
    "full_name": "full_name0",
    "git_commits_url": "git_commits_url0",
    "git_refs_url": "git_refs_url4",
    "git_tags_url": "git_tags_url8",
    "hooks_url": "hooks_url0",
    "html_url": "html_url6",
    "id": 94,
    "node_id": "node_id8",
    "issue_comment_url": "issue_comment_url8",
    "issue_events_url": "issue_events_url0",
    "issues_url": "issues_url0",
    "keys_url": "keys_url6",
    "labels_url": "labels_url8",
    "languages_url": "languages_url8",
    "merges_url": "merges_url6",
    "milestones_url": "milestones_url8",
    "name": "name4",
    "notifications_url": "notifications_url0",
    "owner": {
      "avatar_url": "avatar_url4",
      "events_url": "events_url0",
      "followers_url": "followers_url0",
      "following_url": "following_url0",
      "gists_url": "gists_url0",
      "gravatar_id": "gravatar_id6",
      "html_url": "html_url8",
      "id": 66,
      "node_id": "node_id4",
      "login": "login8",
      "organizations_url": "organizations_url2",
      "received_events_url": "received_events_url0",
      "repos_url": "repos_url0",
      "site_admin": false,
      "starred_url": "starred_url6",
      "subscriptions_url": "subscriptions_url4",
      "type": "type2",
      "url": "url2"
    },
    "private": false,
    "pulls_url": "pulls_url0",
    "releases_url": "releases_url2",
    "stargazers_url": "stargazers_url4",
    "statuses_url": "statuses_url6",
    "subscribers_url": "subscribers_url6",
    "subscription_url": "subscription_url0",
    "tags_url": "tags_url2",
    "teams_url": "teams_url6",
    "trees_url": "trees_url4",
    "url": "url8",
    "clone_url": "clone_url4",
    "default_branch": "default_branch2",
    "forks": 138,
    "forks_count": 232,
    "git_url": "git_url4",
    "has_downloads": false,
    "has_issues": false,
    "has_projects": false,
    "has_wiki": false,
    "has_pages": false,
    "has_discussions": false,
    "homepage": "homepage0",
    "language": "language6",
    "master_branch": null,
    "archived": false,
    "disabled": false,
    "visibility": null,
    "mirror_url": "mirror_url8",
    "open_issues": 38,
    "open_issues_count": 218,
    "permissions": null,
    "temp_clone_token": null,
    "allow_merge_commit": null,
    "allow_squash_merge": null,
    "allow_rebase_merge": null,
    "license": {
      "key1": "val1",
      "key2": "val2"
    },
    "pushed_at": "2016-03-13T12:52:32.123Z",
    "size": 220,
    "ssh_url": "ssh_url0",
    "stargazers_count": 74,
    "svn_url": "svn_url6",
    "topics": null,
    "watchers": 58,
    "watchers_count": 122,
    "created_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "allow_forking": null,
    "is_template": null,
    "web_commit_signoff_required": null
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

