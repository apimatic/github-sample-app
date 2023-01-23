
# Changes 4

## Structure

`Changes4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NewDiscussion` | [`Discussion1`](../../doc/models/discussion-1.md) | Required | - | Discussion1 getNewDiscussion() | setNewDiscussion(Discussion1 newDiscussion) |
| `NewRepository` | [`NewRepository`](../../doc/models/new-repository.md) | Required | - | NewRepository getNewRepository() | setNewRepository(NewRepository newRepository) |

## Example (as JSON)

```json
{
  "new_discussion": {
    "active_lock_reason": "active_lock_reason4",
    "answer_chosen_at": "answer_chosen_at2",
    "answer_chosen_by": {
      "key1": "val1",
      "key2": "val2"
    },
    "answer_html_url": "answer_html_url0",
    "author_association": "MANNEQUIN",
    "body": "body2",
    "category": {
      "created_at": "2016-03-13T12:52:32.123Z",
      "description": "description4",
      "emoji": "emoji8",
      "id": 252,
      "is_answerable": false,
      "name": "name6",
      "node_id": null,
      "repository_id": 114,
      "slug": "slug0",
      "updated_at": "updated_at8"
    },
    "comments": 202,
    "created_at": "2016-03-13T12:52:32.123Z",
    "html_url": "html_url4",
    "id": 92,
    "locked": false,
    "node_id": "node_id6",
    "number": 178,
    "reactions": null,
    "repository_url": "repository_url6",
    "state": "open",
    "timeline_url": null,
    "title": "title8",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "user": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "new_repository": {
    "allow_auto_merge": null,
    "allow_forking": null,
    "allow_merge_commit": null,
    "allow_rebase_merge": null,
    "allow_squash_merge": null,
    "allow_update_branch": null,
    "archive_url": "archive_url8",
    "archived": false,
    "assignees_url": "assignees_url4",
    "blobs_url": "blobs_url4",
    "branches_url": "branches_url6",
    "clone_url": "clone_url8",
    "collaborators_url": "collaborators_url2",
    "comments_url": "comments_url6",
    "commits_url": "commits_url4",
    "compare_url": "compare_url0",
    "contents_url": "contents_url0",
    "contributors_url": "contributors_url0",
    "created_at": 30,
    "default_branch": "default_branch6",
    "delete_branch_on_merge": null,
    "deployments_url": "deployments_url8",
    "description": "description2",
    "disabled": null,
    "downloads_url": "downloads_url6",
    "events_url": "events_url0",
    "fork": false,
    "forks": 162,
    "forks_count": 208,
    "forks_url": "forks_url6",
    "full_name": "full_name4",
    "git_commits_url": "git_commits_url4",
    "git_refs_url": "git_refs_url2",
    "git_tags_url": "git_tags_url2",
    "git_url": "git_url8",
    "has_downloads": false,
    "has_issues": false,
    "has_pages": false,
    "has_projects": false,
    "has_wiki": false,
    "has_discussions": false,
    "homepage": "homepage4",
    "hooks_url": "hooks_url4",
    "html_url": "html_url2",
    "id": 70,
    "is_template": null,
    "issue_comment_url": "issue_comment_url2",
    "issue_events_url": "issue_events_url4",
    "issues_url": "issues_url6",
    "keys_url": "keys_url0",
    "labels_url": "labels_url2",
    "language": "language0",
    "languages_url": "languages_url2",
    "license": {
      "key1": "val1",
      "key2": "val2"
    },
    "master_branch": null,
    "merges_url": "merges_url0",
    "milestones_url": "milestones_url4",
    "mirror_url": "mirror_url2",
    "name": "name8",
    "node_id": "node_id4",
    "notifications_url": "notifications_url4",
    "open_issues": 14,
    "open_issues_count": 194,
    "organization": null,
    "owner": {
      "key1": "val1",
      "key2": "val2"
    },
    "permissions": null,
    "private": false,
    "public": null,
    "pulls_url": "pulls_url4",
    "pushed_at": 250,
    "releases_url": "releases_url8",
    "role_name": null,
    "size": 60,
    "ssh_url": "ssh_url6",
    "stargazers": null,
    "stargazers_count": 206,
    "stargazers_url": "stargazers_url8",
    "statuses_url": "statuses_url0",
    "subscribers_url": "subscribers_url0",
    "subscription_url": "subscription_url6",
    "svn_url": "svn_url2",
    "tags_url": "tags_url6",
    "teams_url": "teams_url0",
    "topics": [
      "topics7",
      "topics8"
    ],
    "trees_url": "trees_url8",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "url": "url2",
    "visibility": "public",
    "watchers": 34,
    "watchers_count": 158,
    "web_commit_signoff_required": null
  }
}
```

