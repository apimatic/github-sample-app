
# Repos Pulls Pull Number Request

## Structure

`ReposPullsPullNumberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Title` | `String` | Optional | The title of the pull request. | String getTitle() | setTitle(String title) |
| `Body` | `String` | Optional | The contents of the pull request. | String getBody() | setBody(String body) |
| `State` | [`State13Enum`](../../doc/models/state-13-enum.md) | Optional | - | State13Enum getState() | setState(State13Enum state) |
| `Base` | `String` | Optional | The name of the branch you want your changes pulled into. This should be an existing branch on the current repository. You cannot update the base branch on a pull request to point to another repository. | String getBase() | setBase(String base) |
| `MaintainerCanModify` | `Boolean` | Optional | Indicates whether [maintainers can modify](https://docs.github.com/articles/allowing-changes-to-a-pull-request-branch-created-from-a-fork/) the pull request. | Boolean getMaintainerCanModify() | setMaintainerCanModify(Boolean maintainerCanModify) |

## Example (as JSON)

```json
{
  "title": null,
  "body": null,
  "state": null,
  "base": null,
  "maintainer_can_modify": null
}
```

