
# Pull Request

Pull requests let you tell others about changes you've pushed to a repository on GitHub. Once a pull request is sent, interested parties can review the set of changes, discuss potential modifications, and even push follow-up commits if necessary.

## Structure

`PullRequest`

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
| `Number` | `int` | Required | Number uniquely identifying the pull request within its repository. | int getNumber() | setNumber(int number) |
| `State` | [`State13Enum`](../../doc/models/state-13-enum.md) | Required | - | State13Enum getState() | setState(State13Enum state) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `Title` | `String` | Required | The title of the pull request. | String getTitle() | setTitle(String title) |
| `User` | `Object` | Required | - | Object getUser() | setUser(Object user) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `Labels` | [`List<Label8>`](../../doc/models/label-8.md) | Required | - | List<Label8> getLabels() | setLabels(List<Label8> labels) |
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
| `RequestedTeams` | [`List<TeamSimple>`](../../doc/models/team-simple.md) | Optional | - | List<TeamSimple> getRequestedTeams() | setRequestedTeams(List<TeamSimple> requestedTeams) |
| `Head` | [`Head2`](../../doc/models/head-2.md) | Required | - | Head2 getHead() | setHead(Head2 head) |
| `Base` | [`Base2`](../../doc/models/base-2.md) | Required | - | Base2 getBase() | setBase(Base2 base) |
| `Links` | [`Links2`](../../doc/models/links-2.md) | Required | - | Links2 getLinks() | setLinks(Links2 links) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `AutoMerge` | `Object` | Required | - | Object getAutoMerge() | setAutoMerge(Object autoMerge) |
| `Draft` | `Boolean` | Optional | Indicates whether or not the pull request is a draft. | Boolean getDraft() | setDraft(Boolean draft) |
| `Merged` | `boolean` | Required | - | boolean getMerged() | setMerged(boolean merged) |
| `Mergeable` | `Boolean` | Required | - | Boolean getMergeable() | setMergeable(Boolean mergeable) |
| `Rebaseable` | `Boolean` | Optional | - | Boolean getRebaseable() | setRebaseable(Boolean rebaseable) |
| `MergeableState` | `String` | Required | - | String getMergeableState() | setMergeableState(String mergeableState) |
| `MergedBy` | `Object` | Required | - | Object getMergedBy() | setMergedBy(Object mergedBy) |
| `Comments` | `int` | Required | - | int getComments() | setComments(int comments) |
| `ReviewComments` | `int` | Required | - | int getReviewComments() | setReviewComments(int reviewComments) |
| `MaintainerCanModify` | `boolean` | Required | Indicates whether maintainers can modify the pull request. | boolean getMaintainerCanModify() | setMaintainerCanModify(boolean maintainerCanModify) |
| `Commits` | `int` | Required | - | int getCommits() | setCommits(int commits) |
| `Additions` | `int` | Required | - | int getAdditions() | setAdditions(int additions) |
| `Deletions` | `int` | Required | - | int getDeletions() | setDeletions(int deletions) |
| `ChangedFiles` | `int` | Required | - | int getChangedFiles() | setChangedFiles(int changedFiles) |

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
  "number": 42,
  "state": null,
  "locked": true,
  "title": "Amazing new feature",
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
  "head": null,
  "base": null,
  "_links": null,
  "author_association": null,
  "auto_merge": null,
  "merged": null,
  "mergeable": true,
  "mergeable_state": "clean",
  "merged_by": null,
  "comments": 10,
  "review_comments": 0,
  "maintainer_can_modify": true,
  "commits": 3,
  "additions": 100,
  "deletions": 3,
  "changed_files": 5
}
```

