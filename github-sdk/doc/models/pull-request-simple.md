
# Pull Request Simple

Pull Request Simple

## Structure

`PullRequestSimple`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `DiffUrl` | `String` | Required | - | String getDiffUrl() | setDiffUrl(String diffUrl) |
| `PatchUrl` | `String` | Required | - | String getPatchUrl() | setPatchUrl(String patchUrl) |
| `IssueUrl` | `String` | Required | - | String getIssueUrl() | setIssueUrl(String issueUrl) |
| `CommitsUrl` | `String` | Required | - | String getCommitsUrl() | setCommitsUrl(String commitsUrl) |
| `ReviewCommentsUrl` | `String` | Required | - | String getReviewCommentsUrl() | setReviewCommentsUrl(String reviewCommentsUrl) |
| `ReviewCommentUrl` | `String` | Required | - | String getReviewCommentUrl() | setReviewCommentUrl(String reviewCommentUrl) |
| `CommentsUrl` | `String` | Required | - | String getCommentsUrl() | setCommentsUrl(String commentsUrl) |
| `StatusesUrl` | `String` | Required | - | String getStatusesUrl() | setStatusesUrl(String statusesUrl) |
| `Number` | `int` | Required | - | int getNumber() | setNumber(int number) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `Title` | `String` | Required | - | String getTitle() | setTitle(String title) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Labels` | [`List<Label1>`](../../doc/models/label-1.md) | Required | - | List<Label1> getLabels() | setLabels(List<Label1> labels) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `ActiveLockReason` | `String` | Optional | - | String getActiveLockReason() | setActiveLockReason(String activeLockReason) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ClosedAt` | `LocalDateTime` | Required | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `MergedAt` | `LocalDateTime` | Required | - | LocalDateTime getMergedAt() | setMergedAt(LocalDateTime mergedAt) |
| `MergeCommitSha` | `String` | Required | - | String getMergeCommitSha() | setMergeCommitSha(String mergeCommitSha) |
| `Assignee` | `Object` | Required | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assignees` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Optional | - | List<SimpleUser> getAssignees() | setAssignees(List<SimpleUser> assignees) |
| `RequestedReviewers` | [`List<SimpleUser>`](../../doc/models/simple-user.md) | Optional | - | List<SimpleUser> getRequestedReviewers() | setRequestedReviewers(List<SimpleUser> requestedReviewers) |
| `RequestedTeams` | [`List<Team>`](../../doc/models/team.md) | Optional | - | List<Team> getRequestedTeams() | setRequestedTeams(List<Team> requestedTeams) |
| `Head` | [`Head1`](../../doc/models/head-1.md) | Required | - | Head1 getHead() | setHead(Head1 head) |
| `Base` | [`Base1`](../../doc/models/base-1.md) | Required | - | Base1 getBase() | setBase(Base1 base) |
| `Links` | [`Links2`](../../doc/models/links-2.md) | Required | - | Links2 getLinks() | setLinks(Links2 links) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `AutoMerge` | `Object` | Required | - | Object getAutoMerge() | setAutoMerge(Object autoMerge) |
| `Draft` | `Boolean` | Optional | Indicates whether or not the pull request is a draft. | Boolean getDraft() | setDraft(Boolean draft) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347",
  "id": 1,
  "node_id": "MDExOlB1bGxSZXF1ZXN0MQ==",
  "html_url": "https://github.com/octocat/Hello-World/pull/1347",
  "diff_url": "https://github.com/octocat/Hello-World/pull/1347.diff",
  "patch_url": "https://github.com/octocat/Hello-World/pull/1347.patch",
  "issue_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347",
  "commits_url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347/commits",
  "review_comments_url": "https://api.github.com/repos/octocat/Hello-World/pulls/1347/comments",
  "review_comment_url": "https://api.github.com/repos/octocat/Hello-World/pulls/comments{/number}",
  "comments_url": "https://api.github.com/repos/octocat/Hello-World/issues/1347/comments",
  "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/6dcb09b5b57875f334f61aebed695e2e4193db5e",
  "number": 1347,
  "state": "open",
  "locked": true,
  "title": "new-feature",
  "user": null,
  "body": "Please pull these awesome changes",
  "labels": null,
  "milestone": null,
  "created_at": "01/26/2011 19:01:12",
  "updated_at": "01/26/2011 19:01:12",
  "closed_at": "01/26/2011 19:01:12",
  "merged_at": "01/26/2011 19:01:12",
  "merge_commit_sha": "e5bd3914e2e596debea16f433f57875b5b90bcd6",
  "assignee": null,
  "head": {
    "label": null,
    "ref": null,
    "repo": {
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
    "sha": null,
    "user": null
  },
  "base": {
    "label": null,
    "ref": null,
    "repo": {
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
    "sha": null,
    "user": null
  },
  "_links": null,
  "author_association": null,
  "auto_merge": null
}
```

