
# Pull Request 32

## Structure

`PullRequest32`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Links` | [`Links2`](../../doc/models/links-2.md) | Required | - | Links2 getLinks() | setLinks(Links2 links) |
| `ActiveLockReason` | `Object` | Required | - | Object getActiveLockReason() | setActiveLockReason(Object activeLockReason) |
| `Additions` | `Integer` | Optional | - | Integer getAdditions() | setAdditions(Integer additions) |
| `Assignee` | `Object` | Required | - | Object getAssignee() | setAssignee(Object assignee) |
| `Assignees` | [`List<PullRequest32Assignees>`]($m/PullRequest32Assignees) | Required | - | List<PullRequest32Assignees> getAssignees() | setAssignees(List<PullRequest32Assignees> assignees) |
| `AuthorAssociation` | [`AuthorAssociationEnum`](../../doc/models/author-association-enum.md) | Required | - | AuthorAssociationEnum getAuthorAssociation() | setAuthorAssociation(AuthorAssociationEnum authorAssociation) |
| `AutoMerge` | `Object` | Required | - | Object getAutoMerge() | setAutoMerge(Object autoMerge) |
| `Base` | [`Base12`](../../doc/models/base-12.md) | Required | - | Base12 getBase() | setBase(Base12 base) |
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
| `Head` | [`Head12`](../../doc/models/head-12.md) | Required | - | Head12 getHead() | setHead(Head12 head) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `IssueUrl` | `String` | Required | - | String getIssueUrl() | setIssueUrl(String issueUrl) |
| `Labels` | [`List<Label10>`](../../doc/models/label-10.md) | Required | - | List<Label10> getLabels() | setLabels(List<Label10> labels) |
| `Locked` | `boolean` | Required | - | boolean getLocked() | setLocked(boolean locked) |
| `MaintainerCanModify` | `Boolean` | Optional | Indicates whether maintainers can modify the pull request. | Boolean getMaintainerCanModify() | setMaintainerCanModify(Boolean maintainerCanModify) |
| `MergeCommitSha` | `String` | Required | - | String getMergeCommitSha() | setMergeCommitSha(String mergeCommitSha) |
| `Mergeable` | `Boolean` | Optional | - | Boolean getMergeable() | setMergeable(Boolean mergeable) |
| `MergeableState` | `String` | Optional | - | String getMergeableState() | setMergeableState(String mergeableState) |
| `Merged` | `String` | Required, Constant | **Default**: `"False"` | String getMerged() | setMerged(String merged) |
| `MergedAt` | `LocalDateTime` | Required | - | LocalDateTime getMergedAt() | setMergedAt(LocalDateTime mergedAt) |
| `MergedBy` | `Object` | Required | - | Object getMergedBy() | setMergedBy(Object mergedBy) |
| `Milestone` | `Object` | Required | - | Object getMilestone() | setMilestone(Object milestone) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Number` | `int` | Required | Number uniquely identifying the pull request within its repository. | int getNumber() | setNumber(int number) |
| `PatchUrl` | `String` | Required | - | String getPatchUrl() | setPatchUrl(String patchUrl) |
| `Rebaseable` | `Boolean` | Optional | - | Boolean getRebaseable() | setRebaseable(Boolean rebaseable) |
| `RequestedReviewers` | [`List<PullRequest32RequestedReviewers>`]($m/PullRequest32RequestedReviewers) | Required | - | List<PullRequest32RequestedReviewers> getRequestedReviewers() | setRequestedReviewers(List<PullRequest32RequestedReviewers> requestedReviewers) |
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
  "_links": null,
  "active_lock_reason": null,
  "assignee": null,
  "assignees": null,
  "author_association": null,
  "auto_merge": null,
  "base": null,
  "body": null,
  "closed_at": null,
  "comments_url": null,
  "commits_url": null,
  "created_at": null,
  "diff_url": null,
  "draft": null,
  "head": null,
  "html_url": null,
  "id": null,
  "issue_url": null,
  "labels": null,
  "locked": null,
  "merge_commit_sha": null,
  "merged": "False",
  "merged_at": null,
  "merged_by": null,
  "milestone": null,
  "node_id": null,
  "number": null,
  "patch_url": null,
  "requested_reviewers": null,
  "requested_teams": null,
  "review_comment_url": null,
  "review_comments_url": null,
  "state": null,
  "statuses_url": null,
  "title": null,
  "updated_at": null,
  "url": null,
  "user": null
}
```

