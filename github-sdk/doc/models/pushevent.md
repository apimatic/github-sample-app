
# Pushevent

## Structure

`Pushevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `After` | `String` | Required | The SHA of the most recent commit on `ref` after the push. | String getAfter() | setAfter(String after) |
| `BaseRef` | `String` | Required | - | String getBaseRef() | setBaseRef(String baseRef) |
| `Before` | `String` | Required | The SHA of the most recent commit on `ref` before the push. | String getBefore() | setBefore(String before) |
| `Commits` | [`List<Commit7>`](../../doc/models/commit-7.md) | Required | An array of commit objects describing the pushed commits. (Pushed commits are all commits that are included in the `compare` between the `before` commit and the `after` commit.) The array includes a maximum of 20 commits. If necessary, you can use the [Commits API](https://docs.github.com/rest/reference/repos#commits) to fetch additional commits. This limit is applied to timeline events only and isn't applied to webhook deliveries. | List<Commit7> getCommits() | setCommits(List<Commit7> commits) |
| `Compare` | `String` | Required | URL that shows the changes in this `ref` update, from the `before` commit to the `after` commit. For a newly created `ref` that is directly based on the default branch, this is the comparison between the head of the default branch and the `after` commit. Otherwise, this shows all commits until the `after` commit. | String getCompare() | setCompare(String compare) |
| `Created` | `boolean` | Required | Whether this push created the `ref`. | boolean getCreated() | setCreated(boolean created) |
| `Deleted` | `boolean` | Required | Whether this push deleted the `ref`. | boolean getDeleted() | setDeleted(boolean deleted) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Forced` | `boolean` | Required | Whether this push was a force push of the `ref`. | boolean getForced() | setForced(boolean forced) |
| `HeadCommit` | `Object` | Required | - | Object getHeadCommit() | setHeadCommit(Object headCommit) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Pusher` | [`Pusher`](../../doc/models/pusher.md) | Required | - | Pusher getPusher() | setPusher(Pusher pusher) |
| `Ref` | `String` | Required | The full git ref that was pushed. Example: `refs/heads/main` or `refs/tags/v3.14.1`. | String getRef() | setRef(String ref) |
| `Repository` | [`Repository161`](../../doc/models/repository-161.md) | Required | - | Repository161 getRepository() | setRepository(Repository161 repository) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "after": "after2",
  "base_ref": "base_ref6",
  "before": "before0",
  "commits": [
    {
      "added": null,
      "author": {
        "date": null,
        "email": "email7",
        "name": "name9",
        "username": null
      },
      "committer": {
        "date": null,
        "email": "email1",
        "name": "name5",
        "username": null
      },
      "distinct": true,
      "id": "id1",
      "message": "message9",
      "modified": null,
      "removed": null,
      "timestamp": "2016-03-13T12:52:32.123Z",
      "tree_id": "tree_id3",
      "url": "url5"
    }
  ],
  "compare": "compare8",
  "created": false,
  "deleted": false,
  "enterprise": null,
  "forced": false,
  "head_commit": {
    "key1": "val1",
    "key2": "val2"
  },
  "installation": null,
  "organization": null,
  "pusher": {
    "date": null,
    "email": null,
    "name": "name0",
    "username": null
  },
  "ref": "ref0",
  "repository": {
    "allow_auto_merge": null,
    "allow_forking": null,
    "allow_merge_commit": null,
    "allow_rebase_merge": null,
    "allow_squash_merge": null,
    "allow_update_branch": null,
    "archive_url": "archive_url0",
    "archived": false,
    "assignees_url": "assignees_url2",
    "blobs_url": "blobs_url6",
    "branches_url": "branches_url4",
    "clone_url": "clone_url0",
    "collaborators_url": "collaborators_url0",
    "comments_url": "comments_url4",
    "commits_url": "commits_url6",
    "compare_url": "compare_url8",
    "contents_url": "contents_url2",
    "contributors_url": "contributors_url8",
    "created_at": 30,
    "default_branch": "default_branch8",
    "delete_branch_on_merge": null,
    "deployments_url": "deployments_url6",
    "description": "description0",
    "disabled": null,
    "downloads_url": "downloads_url8",
    "events_url": "events_url8",
    "fork": false,
    "forks": 222,
    "forks_count": 148,
    "forks_url": "forks_url4",
    "full_name": "full_name6",
    "git_commits_url": "git_commits_url6",
    "git_refs_url": "git_refs_url0",
    "git_tags_url": "git_tags_url4",
    "git_url": "git_url0",
    "has_downloads": false,
    "has_issues": false,
    "has_pages": false,
    "has_projects": false,
    "has_wiki": false,
    "has_discussions": false,
    "homepage": "homepage6",
    "hooks_url": "hooks_url4",
    "html_url": "html_url0",
    "id": 10,
    "is_template": null,
    "issue_comment_url": "issue_comment_url4",
    "issue_events_url": "issue_events_url6",
    "issues_url": "issues_url4",
    "keys_url": "keys_url2",
    "labels_url": "labels_url6",
    "language": "language2",
    "languages_url": "languages_url4",
    "license": {
      "key1": "val1",
      "key2": "val2"
    },
    "master_branch": null,
    "merges_url": "merges_url2",
    "milestones_url": "milestones_url2",
    "mirror_url": "mirror_url4",
    "name": "name0",
    "node_id": "node_id2",
    "notifications_url": "notifications_url6",
    "open_issues": 210,
    "open_issues_count": 134,
    "organization": null,
    "owner": {
      "key1": "val1",
      "key2": "val2"
    },
    "permissions": null,
    "private": false,
    "public": null,
    "pulls_url": "pulls_url6",
    "pushed_at": 190,
    "releases_url": "releases_url6",
    "role_name": null,
    "size": 120,
    "ssh_url": "ssh_url4",
    "stargazers": null,
    "stargazers_count": 10,
    "stargazers_url": "stargazers_url0",
    "statuses_url": "statuses_url2",
    "subscribers_url": "subscribers_url2",
    "subscription_url": "subscription_url4",
    "svn_url": "svn_url0",
    "tags_url": "tags_url8",
    "teams_url": "teams_url2",
    "topics": [
      "topics9",
      "topics0",
      "topics1"
    ],
    "trees_url": "trees_url0",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "url": "url4",
    "visibility": "internal",
    "watchers": 230,
    "watchers_count": 218,
    "web_commit_signoff_required": null
  },
  "sender": null
}
```

