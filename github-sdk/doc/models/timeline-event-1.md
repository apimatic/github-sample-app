
# Timeline Event 1

Timeline Event

## Structure

`TimelineEvent1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | Unique identifier of the issue comment | Integer getId() | setId(Integer id) |
| `NodeId` | `String` | Optional | - | String getNodeId() | setNodeId(String nodeId) |
| `Url` | `String` | Optional | URL for the issue comment | String getUrl() | setUrl(String url) |
| `Actor` | [`Actor2`](../../doc/models/actor-2.md) | Optional | - | Actor2 getActor() | setActor(Actor2 actor) |
| `Event` | `String` | Optional | - | String getEvent() | setEvent(String event) |
| `CommitId` | `String` | Optional | A commit SHA for the review. | String getCommitId() | setCommitId(String commitId) |
| `CommitUrl` | `String` | Optional | - | String getCommitUrl() | setCommitUrl(String commitUrl) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `PerformedViaGithubApp` | [`PerformedViaGithubApp2`](../../doc/models/performed-via-github-app-2.md) | Optional | - | PerformedViaGithubApp2 getPerformedViaGithubApp() | setPerformedViaGithubApp(PerformedViaGithubApp2 performedViaGithubApp) |
| `Label` | [`Label3`](../../doc/models/label-3.md) | Optional | - | Label3 getLabel() | setLabel(Label3 label) |
| `Milestone` | [`Milestone1`](../../doc/models/milestone-1.md) | Optional | - | Milestone1 getMilestone() | setMilestone(Milestone1 milestone) |
| `Rename` | [`Rename`](../../doc/models/rename.md) | Optional | - | Rename getRename() | setRename(Rename rename) |
| `ReviewRequester` | [`ReviewRequester`](../../doc/models/review-requester.md) | Optional | - | ReviewRequester getReviewRequester() | setReviewRequester(ReviewRequester reviewRequester) |
| `RequestedTeam` | [`RequestedTeam7`](../../doc/models/requested-team-7.md) | Optional | - | RequestedTeam7 getRequestedTeam() | setRequestedTeam(RequestedTeam7 requestedTeam) |
| `RequestedReviewer` | [`RequestedReviewer`](../../doc/models/requested-reviewer.md) | Optional | - | RequestedReviewer getRequestedReviewer() | setRequestedReviewer(RequestedReviewer requestedReviewer) |
| `DismissedReview` | [`DismissedReview`](../../doc/models/dismissed-review.md) | Optional | - | DismissedReview getDismissedReview() | setDismissedReview(DismissedReview dismissedReview) |
| `LockReason` | `String` | Optional | - | String getLockReason() | setLockReason(String lockReason) |
| `ProjectCard` | [`ProjectCard1`](../../doc/models/project-card-1.md) | Optional | - | ProjectCard1 getProjectCard() | setProjectCard(ProjectCard1 projectCard) |
| `Body` | `String` | Optional | Contents of the issue comment | String getBody() | setBody(String body) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `HtmlUrl` | `String` | Optional | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `User` | [`User2`](../../doc/models/user-2.md) | Optional | - | User2 getUser() | setUser(User2 user) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `IssueUrl` | `String` | Optional | - | String getIssueUrl() | setIssueUrl(String issueUrl) |
| `AuthorAssociation` | `Object` | Optional | - | Object getAuthorAssociation() | setAuthorAssociation(Object authorAssociation) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `Source` | [`Source`](../../doc/models/source.md) | Optional | - | Source getSource() | setSource(Source source) |
| `Sha` | `String` | Optional | SHA for the commit | String getSha() | setSha(String sha) |
| `Author` | [`Author1`](../../doc/models/author-1.md) | Optional | - | Author1 getAuthor() | setAuthor(Author1 author) |
| `Committer` | [`Committer1`](../../doc/models/committer-1.md) | Optional | - | Committer1 getCommitter() | setCommitter(Committer1 committer) |
| `Message` | `String` | Optional | Message describing the purpose of the commit | String getMessage() | setMessage(String message) |
| `Tree` | [`Tree2`](../../doc/models/tree-2.md) | Optional | - | Tree2 getTree() | setTree(Tree2 tree) |
| `Parents` | [`List<Parent2>`](../../doc/models/parent-2.md) | Optional | - | List<Parent2> getParents() | setParents(List<Parent2> parents) |
| `Verification` | [`Verification`](../../doc/models/verification.md) | Optional | - | Verification getVerification() | setVerification(Verification verification) |
| `State` | `String` | Optional | - | String getState() | setState(String state) |
| `PullRequestUrl` | `String` | Optional | - | String getPullRequestUrl() | setPullRequestUrl(String pullRequestUrl) |
| `Links` | [`Links10`](../../doc/models/links-10.md) | Optional | - | Links10 getLinks() | setLinks(Links10 links) |
| `SubmittedAt` | `LocalDateTime` | Optional | - | LocalDateTime getSubmittedAt() | setSubmittedAt(LocalDateTime submittedAt) |
| `Comments` | [`List<PullRequestReviewComment4>`](../../doc/models/pull-request-review-comment-4.md) | Optional | - | List<PullRequestReviewComment4> getComments() | setComments(List<PullRequestReviewComment4> comments) |
| `Assignee` | [`Assignee`](../../doc/models/assignee.md) | Optional | - | Assignee getAssignee() | setAssignee(Assignee assignee) |
| `StateReason` | `String` | Optional | - | String getStateReason() | setStateReason(String stateReason) |

## Example (as JSON)

```json
{
  "id": null,
  "node_id": null,
  "url": null,
  "actor": null,
  "event": null,
  "commit_id": null,
  "commit_url": null,
  "created_at": null,
  "performed_via_github_app": null,
  "label": null,
  "milestone": null,
  "rename": null,
  "review_requester": null,
  "requested_team": null,
  "requested_reviewer": null,
  "dismissed_review": null,
  "lock_reason": null,
  "project_card": null,
  "body": null,
  "body_text": null,
  "body_html": null,
  "html_url": null,
  "user": null,
  "updated_at": null,
  "issue_url": null,
  "author_association": null,
  "reactions": null,
  "source": null,
  "sha": null,
  "author": null,
  "committer": null,
  "message": null,
  "tree": null,
  "parents": null,
  "verification": null,
  "state": null,
  "pull_request_url": null,
  "_links": null,
  "submitted_at": null,
  "comments": null,
  "assignee": null,
  "state_reason": null
}
```

