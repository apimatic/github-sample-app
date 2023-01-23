
# Repos Pulls Pull Number Update Branch Request

## Structure

`ReposPullsPullNumberUpdateBranchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExpectedHeadSha` | `String` | Optional | The expected SHA of the pull request's HEAD ref. This is the most recent commit on the pull request's branch. If the expected SHA does not match the pull request's HEAD, you will receive a `422 Unprocessable Entity` status. You can use the "[List commits](https://docs.github.com/rest/reference/repos#list-commits)" endpoint to find the most recent commit SHA. Default: SHA of the pull request's current HEAD ref. | String getExpectedHeadSha() | setExpectedHeadSha(String expectedHeadSha) |

## Example (as JSON)

```json
{
  "expected_head_sha": null
}
```

