
# Repos Pulls Pull Number Requested Reviewers Request 3

## Structure

`ReposPullsPullNumberRequestedReviewersRequest3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reviewers` | `List<String>` | Required | An array of user `login`s that will be removed. | List<String> getReviewers() | setReviewers(List<String> reviewers) |
| `TeamReviewers` | `List<String>` | Optional | An array of team `slug`s that will be removed. | List<String> getTeamReviewers() | setTeamReviewers(List<String> teamReviewers) |

## Example (as JSON)

```json
{
  "reviewers": [
    "reviewers5",
    "reviewers6"
  ],
  "team_reviewers": null
}
```

