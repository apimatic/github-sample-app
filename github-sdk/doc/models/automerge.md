
# Automerge

The status of auto merging a pull request.

## Structure

`Automerge`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EnabledBy` | [`EnabledBy`](../../doc/models/enabled-by.md) | Required | - | EnabledBy getEnabledBy() | setEnabledBy(EnabledBy enabledBy) |
| `MergeMethod` | [`MergeMethodEnum`](../../doc/models/merge-method-enum.md) | Required | - | MergeMethodEnum getMergeMethod() | setMergeMethod(MergeMethodEnum mergeMethod) |
| `CommitTitle` | `String` | Required | Title for the merge commit message. | String getCommitTitle() | setCommitTitle(String commitTitle) |
| `CommitMessage` | `String` | Required | Commit message for the merge commit. | String getCommitMessage() | setCommitMessage(String commitMessage) |

## Example (as JSON)

```json
{
  "enabled_by": {
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
  "merge_method": null,
  "commit_title": null,
  "commit_message": null
}
```

