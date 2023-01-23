
# Repos Pulls Request

## Structure

`ReposPullsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | The title of the new pull request. Required unless `issue` is specified. | String getTitle() | setTitle(String title) |
| `Head` | `String` | Required | The name of the branch where your changes are implemented. For cross-repository pull requests in the same network, namespace `head` with a user like this: `username:branch`. | String getHead() | setHead(String head) |
| `Base` | `String` | Required | The name of the branch you want the changes pulled into. This should be an existing branch on the current repository. You cannot submit a pull request to one repository that requests a merge to a base of another repository. | String getBase() | setBase(String base) |
| `Body` | `String` | Optional | The contents of the pull request. | String getBody() | setBody(String body) |
| `MaintainerCanModify` | `Boolean` | Optional | Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request. | Boolean getMaintainerCanModify() | setMaintainerCanModify(Boolean maintainerCanModify) |
| `Draft` | `Boolean` | Optional | Indicates whether the pull request is a draft. See "[Draft Pull Requests](https://docs.github.com/articles/about-pull-requests#draft-pull-requests)" in the GitHub Help documentation to learn more. | Boolean getDraft() | setDraft(Boolean draft) |
| `Issue` | `Integer` | Optional | An issue in the repository to convert to a pull request. The issue title, body, and comments will become the title, body, and comments on the new pull request. Required unless `title` is specified. | Integer getIssue() | setIssue(Integer issue) |

## Example (as JSON)

```json
{
  "title": null,
  "head": "head8",
  "base": "base6",
  "body": null,
  "maintainer_can_modify": null,
  "draft": null,
  "issue": null
}
```

