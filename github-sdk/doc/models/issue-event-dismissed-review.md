
# Issue Event Dismissed Review

## Structure

`IssueEventDismissedReview`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `ReviewId` | `int` | Required | - | int getReviewId() | setReviewId(int reviewId) |
| `DismissalMessage` | `String` | Required | - | String getDismissalMessage() | setDismissalMessage(String dismissalMessage) |
| `DismissalCommitId` | `String` | Optional | - | String getDismissalCommitId() | setDismissalCommitId(String dismissalCommitId) |

## Example (as JSON)

```json
{
  "state": "state4",
  "review_id": 74,
  "dismissal_message": "dismissal_message8",
  "dismissal_commit_id": null
}
```

