
# Head 35

## Structure

`Head35`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
| `Ref` | `String` | Required | - | String getRef() | setRef(String ref) |
| `Repo` | [`Repo20`](../../doc/models/repo-20.md) | Required | - | Repo20 getRepo() | setRepo(Repo20 repo) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "label": "label0",
  "ref": "ref0",
  "repo": {
    "allow_auto_merge": null,
    "allow_forking": null,
    "allow_merge_commit": null,
    "allow_rebase_merge": null,
    "allow_squash_merge": null,
    "allow_update_branch": null,
    "archive_url": "archive_url4",
    "archived": false,
    "assignees_url": "assignees_url8",
    "blobs_url": "blobs_url0",
    "branches_url": "branches_url0",
    "clone_url": "clone_url4",
    "collaborators_url": "collaborators_url6",
    "comments_url": "comments_url0",
    "commits_url": "commits_url0",
    "compare_url": "compare_url4",
    "contents_url": "contents_url6",
    "contributors_url": "contributors_url6",
    "created_at": 154,
    "default_branch": "default_branch2",
    "delete_branch_on_merge": null,
    "deployments_url": "deployments_url8",
    "description": "description4",
    "disabled": null,
    "downloads_url": "downloads_url2",
    "events_url": "events_url6",
    "fork": false,
    "forks": 138,
    "forks_count": 232,
    "forks_url": "forks_url0",
    "full_name": "full_name0",
    "git_commits_url": "git_commits_url0",
    "git_refs_url": "git_refs_url4",
    "git_tags_url": "git_tags_url8",
    "git_url": "git_url4",
    "has_downloads": false,
    "has_issues": false,
    "has_pages": false,
    "has_projects": false,
    "has_wiki": false,
    "has_discussions": false,
    "homepage": "homepage0",
    "hooks_url": "hooks_url0",
    "html_url": "html_url6",
    "id": 94,
    "is_template": null,
    "issue_comment_url": "issue_comment_url8",
    "issue_events_url": "issue_events_url0",
    "issues_url": "issues_url0",
    "keys_url": "keys_url6",
    "labels_url": "labels_url8",
    "language": "language6",
    "languages_url": "languages_url8",
    "license": {
      "key1": "val1",
      "key2": "val2"
    },
    "master_branch": null,
    "merge_commit_message": null,
    "merge_commit_title": null,
    "merges_url": "merges_url6",
    "milestones_url": "milestones_url8",
    "mirror_url": "mirror_url8",
    "name": "name4",
    "node_id": "node_id8",
    "notifications_url": "notifications_url0",
    "open_issues": 38,
    "open_issues_count": 218,
    "organization": null,
    "owner": {
      "key1": "val1",
      "key2": "val2"
    },
    "permissions": null,
    "private": false,
    "public": null,
    "pulls_url": "pulls_url0",
    "pushed_at": 18,
    "releases_url": "releases_url2",
    "role_name": null,
    "size": 220,
    "squash_merge_commit_message": null,
    "squash_merge_commit_title": null,
    "ssh_url": "ssh_url0",
    "stargazers": null,
    "stargazers_count": 74,
    "stargazers_url": "stargazers_url4",
    "statuses_url": "statuses_url6",
    "subscribers_url": "subscribers_url6",
    "subscription_url": "subscription_url0",
    "svn_url": "svn_url6",
    "tags_url": "tags_url2",
    "teams_url": "teams_url6",
    "topics": [
      "topics3",
      "topics4"
    ],
    "trees_url": "trees_url4",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "url": "url8",
    "use_squash_pr_title_as_default": null,
    "visibility": "public",
    "watchers": 58,
    "watchers_count": 122,
    "web_commit_signoff_required": null
  },
  "sha": "sha6",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

