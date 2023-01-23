
# Pull Request 42

## Structure

`PullRequest42`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Links` | [`Links2`](../../doc/models/links-2.md) | Required | - | Links2 getLinks() | setLinks(Links2 links) |
| `ActiveLockReason` | `Object` | Required | - | Object getActiveLockReason() | setActiveLockReason(Object activeLockReason) |
| `Additions` | `Integer` | Optional | - | Integer getAdditions() | setAdditions(Integer additions) |
| `Assignee` | `Object` | Required | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assignees` | [`List<PullRequest42Assignees>`]($m/PullRequest42Assignees) | Required | - | List<PullRequest42Assignees> getAssignees() | setAssignees(List<PullRequest42Assignees> assignees) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `AutoMerge` | `Object` | Required | - | Object getAutoMerge() | setAutoMerge(Object autoMerge) |
| `Base` | [`Base11`](../../doc/models/base-11.md) | Required | - | Base11 getBase() | setBase(Base11 base) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `ChangedFiles` | `Integer` | Optional | - | Integer getChangedFiles() | setChangedFiles(Integer changedFiles) |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `Comments` | `Integer` | Optional | - | Integer getComments() | setComments(Integer comments) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `Commits` | `Integer` | Optional | - | Integer getCommits() | setCommits(Integer commits) |
| `CommitsUrl` | `String` | Required | - | String getCommitsUrl() | setCommitsUrl(String commitsUrl) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Deletions` | `Integer` | Optional | - | Integer getDeletions() | setDeletions(Integer deletions) |
| `DiffUrl` | `String` | Required | - | String getDiffUrl() | setDiffUrl(String diffUrl) |
| `Draft` | `boolean` | Required | Indicates whether or not the pull request is a draft. | boolean getDraft() | setDraft(boolean draft) |
| `Head` | [`Head20`](../../doc/models/head-20.md) | Required | - | Head20 getHead() | setHead(Head20 head) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `IssueUrl` | `String` | Required | - | String getIssueUrl() | setIssueUrl(String issueUrl) |
| `Labels` | [`List<Label10>`](../../doc/models/label-10.md) | Required | - | List<Label10> getLabels() | setLabels(List<Label10> labels) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `MaintainerCanModify` | `Boolean` | Optional | Indicates whether maintainers can modify the pull request. | Boolean getMaintainerCanModify() | setMaintainerCanModify(Boolean maintainerCanModify) |
| `MergeCommitSha` | `String` | Required | - | String getMergeCommitSha() | setMergeCommitSha(String mergeCommitSha) |
| `Mergeable` | `Boolean` | Optional | - | Boolean getMergeable() | setMergeable(Boolean mergeable) |
| `MergeableState` | `String` | Optional | - | String getMergeableState() | setMergeableState(String mergeableState) |
| `Merged` | `Boolean` | Required | - | Boolean getMerged() | setMerged(Boolean merged) |
| `MergedAt` | `LocalDateTime` | Required | - | LocalDateTime getMergedAt() | setMergedAt(LocalDateTime mergedAt) |
| `MergedBy` | `Object` | Required | - | Object getMergedBy() | setMergedBy(Object mergedBy) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | Number uniquely identifying the pull request within its repository. | int getNumber() | setNumber(int number) |
| `PatchUrl` | `String` | Required | - | String getPatchUrl() | setPatchUrl(String patchUrl) |
| `Rebaseable` | `Boolean` | Optional | - | Boolean getRebaseable() | setRebaseable(Boolean rebaseable) |
| `RequestedReviewers` | [`List<PullRequest42RequestedReviewers>`]($m/PullRequest42RequestedReviewers) | Required | - | List<PullRequest42RequestedReviewers> getRequestedReviewers() | setRequestedReviewers(List<PullRequest42RequestedReviewers> requestedReviewers) |
| `RequestedTeams` | [`List<Team4>`](../../doc/models/team-4.md) | Required | - | List<Team4> getRequestedTeams() | setRequestedTeams(List<Team4> requestedTeams) |
| `ReviewCommentUrl` | `String` | Required | - | String getReviewCommentUrl() | setReviewCommentUrl(String reviewCommentUrl) |
| `ReviewComments` | `Integer` | Optional | - | Integer getReviewComments() | setReviewComments(Integer reviewComments) |
| `ReviewCommentsUrl` | `String` | Required | - | String getReviewCommentsUrl() | setReviewCommentsUrl(String reviewCommentsUrl) |
| `State` | [`State13Enum`](../../doc/models/state-13-enum.md) | Required | - | State13Enum getState() | setState(State13Enum state) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `Title` | `String` | Required | The title of the pull request. | String getTitle() | setTitle(String title) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |

## Example (as JSON)

```json
{
  "_links": {
    "comments": {
      "href": "href4"
    },
    "commits": {
      "href": "href2"
    },
    "statuses": {
      "href": "href4"
    },
    "html": null,
    "issue": null,
    "review_comments": null,
    "review_comment": null,
    "self": null
  },
  "active_lock_reason": {
    "key1": "val1",
    "key2": "val2"
  },
  "additions": null,
  "assignee": {
    "key1": "val1",
    "key2": "val2"
  },
  "assignees": [
    {
      "key0": {
        "key1": "val1",
        "key2": "val2"
      }
    },
    {
      "key0": {
        "key1": "val1",
        "key2": "val2"
      },
      "key1": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "author_association": "COLLABORATOR",
  "auto_merge": {
    "key1": "val1",
    "key2": "val2"
  },
  "base": {
    "label": "label6",
    "ref": "ref6",
    "repo": {
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
      "created_at": 124,
      "default_branch": "default_branch6",
      "delete_branch_on_merge": null,
      "deployments_url": "deployments_url8",
      "description": "description2",
      "disabled": null,
      "downloads_url": "downloads_url6",
      "events_url": "events_url0",
      "fork": false,
      "forks": 60,
      "forks_count": 54,
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
      "homepage": "homepage4",
      "hooks_url": "hooks_url6",
      "html_url": "html_url2",
      "id": 172,
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
      "merge_commit_message": null,
      "merge_commit_title": null,
      "merges_url": "merges_url0",
      "milestones_url": "milestones_url4",
      "mirror_url": "mirror_url2",
      "name": "name8",
      "node_id": "node_id4",
      "notifications_url": "notifications_url4",
      "open_issues": 116,
      "open_issues_count": 40,
      "organization": null,
      "owner": {
        "key1": "val1",
        "key2": "val2"
      },
      "permissions": null,
      "private": false,
      "public": null,
      "pulls_url": "pulls_url4",
      "pushed_at": 96,
      "releases_url": "releases_url8",
      "role_name": null,
      "size": 214,
      "squash_merge_commit_message": null,
      "squash_merge_commit_title": null,
      "ssh_url": "ssh_url6",
      "stargazers": null,
      "stargazers_count": 104,
      "stargazers_url": "stargazers_url8",
      "statuses_url": "statuses_url0",
      "subscribers_url": "subscribers_url0",
      "subscription_url": "subscription_url6",
      "svn_url": "svn_url2",
      "tags_url": "tags_url6",
      "teams_url": "teams_url0",
      "topics": [
        "topics7"
      ],
      "trees_url": "trees_url8",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "url": "url2",
      "use_squash_pr_title_as_default": null,
      "visibility": "private",
      "watchers": 136,
      "watchers_count": 56,
      "web_commit_signoff_required": null
    },
    "sha": "sha2",
    "user": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "body": "body6",
  "changed_files": null,
  "closed_at": "2016-03-13T12:52:32.123Z",
  "comments": null,
  "comments_url": "comments_url4",
  "commits": null,
  "commits_url": "commits_url4",
  "created_at": "2016-03-13T12:52:32.123Z",
  "deletions": null,
  "diff_url": "diff_url4",
  "draft": false,
  "head": {
    "label": "label8",
    "ref": "ref8",
    "repo": {
      "allow_auto_merge": null,
      "allow_forking": null,
      "allow_merge_commit": null,
      "allow_rebase_merge": null,
      "allow_squash_merge": null,
      "allow_update_branch": null,
      "archive_url": "archive_url6",
      "archived": false,
      "assignees_url": "assignees_url6",
      "blobs_url": "blobs_url2",
      "branches_url": "branches_url8",
      "clone_url": "clone_url6",
      "collaborators_url": "collaborators_url4",
      "comments_url": "comments_url2",
      "commits_url": "commits_url2",
      "compare_url": "compare_url2",
      "contents_url": "contents_url8",
      "contributors_url": "contributors_url2",
      "created_at": 198,
      "default_branch": "default_branch4",
      "delete_branch_on_merge": null,
      "deployments_url": "deployments_url0",
      "description": "description6",
      "disabled": null,
      "downloads_url": "downloads_url4",
      "events_url": "events_url8",
      "fork": false,
      "forks": 94,
      "forks_count": 20,
      "forks_url": "forks_url2",
      "full_name": "full_name2",
      "git_commits_url": "git_commits_url2",
      "git_refs_url": "git_refs_url4",
      "git_tags_url": "git_tags_url0",
      "git_url": "git_url6",
      "has_downloads": false,
      "has_issues": false,
      "has_pages": false,
      "has_projects": false,
      "has_wiki": false,
      "homepage": "homepage2",
      "hooks_url": "hooks_url2",
      "html_url": "html_url4",
      "id": 138,
      "is_template": null,
      "issue_comment_url": "issue_comment_url0",
      "issue_events_url": "issue_events_url2",
      "issues_url": "issues_url8",
      "keys_url": "keys_url8",
      "labels_url": "labels_url0",
      "language": "language8",
      "languages_url": "languages_url0",
      "license": {
        "key1": "val1",
        "key2": "val2"
      },
      "master_branch": null,
      "merge_commit_message": null,
      "merge_commit_title": null,
      "merges_url": "merges_url8",
      "milestones_url": "milestones_url6",
      "mirror_url": "mirror_url0",
      "name": "name6",
      "node_id": "node_id6",
      "notifications_url": "notifications_url2",
      "open_issues": 82,
      "open_issues_count": 6,
      "organization": null,
      "owner": {
        "key1": "val1",
        "key2": "val2"
      },
      "permissions": null,
      "private": false,
      "public": null,
      "pulls_url": "pulls_url2",
      "pushed_at": 62,
      "releases_url": "releases_url0",
      "role_name": null,
      "size": 248,
      "squash_merge_commit_message": null,
      "squash_merge_commit_title": null,
      "ssh_url": "ssh_url2",
      "stargazers": null,
      "stargazers_count": 118,
      "stargazers_url": "stargazers_url6",
      "statuses_url": "statuses_url8",
      "subscribers_url": "subscribers_url8",
      "subscription_url": "subscription_url2",
      "svn_url": "svn_url4",
      "tags_url": "tags_url4",
      "teams_url": "teams_url8",
      "topics": [
        "topics5",
        "topics6"
      ],
      "trees_url": "trees_url6",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "url": "url0",
      "use_squash_pr_title_as_default": null,
      "visibility": "public",
      "watchers": 102,
      "watchers_count": 90,
      "web_commit_signoff_required": null
    },
    "sha": "sha4",
    "user": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "html_url": "html_url0",
  "id": 112,
  "issue_url": "issue_url4",
  "labels": [
    {
      "color": "color2",
      "default": false,
      "description": "description6",
      "id": 46,
      "name": "name4",
      "node_id": "node_id8",
      "url": "url8"
    },
    {
      "color": "color1",
      "default": true,
      "description": "description5",
      "id": 47,
      "name": "name5",
      "node_id": "node_id7",
      "url": "url9"
    }
  ],
  "locked": false,
  "maintainer_can_modify": null,
  "merge_commit_sha": "merge_commit_sha0",
  "mergeable": null,
  "mergeable_state": null,
  "merged": false,
  "merged_at": "2016-03-13T12:52:32.123Z",
  "merged_by": {
    "key1": "val1",
    "key2": "val2"
  },
  "milestone": {
    "key1": "val1",
    "key2": "val2"
  },
  "node_id": "node_id2",
  "number": 158,
  "patch_url": "patch_url4",
  "rebaseable": null,
  "requested_reviewers": [
    {
      "key1": "val1",
      "key2": "val2"
    }
  ],
  "requested_teams": [
    {
      "deleted": null,
      "description": null,
      "html_url": null,
      "id": 130,
      "members_url": null,
      "name": "name8",
      "node_id": null,
      "parent": null,
      "permission": null,
      "privacy": null,
      "repositories_url": null,
      "slug": null,
      "url": null
    },
    {
      "deleted": null,
      "description": null,
      "html_url": null,
      "id": 131,
      "members_url": null,
      "name": "name9",
      "node_id": null,
      "parent": null,
      "permission": null,
      "privacy": null,
      "repositories_url": null,
      "slug": null,
      "url": null
    }
  ],
  "review_comment_url": "review_comment_url0",
  "review_comments": null,
  "review_comments_url": "review_comments_url4",
  "state": "open",
  "statuses_url": "statuses_url2",
  "title": "title4",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "url": "url4",
  "user": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

