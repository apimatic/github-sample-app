
# Selected Actions

## Structure

`SelectedActions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GithubOwnedAllowed` | `Boolean` | Optional | Whether GitHub-owned actions are allowed. For example, this includes the actions in the `actions` organization. | Boolean getGithubOwnedAllowed() | setGithubOwnedAllowed(Boolean githubOwnedAllowed) |
| `VerifiedAllowed` | `Boolean` | Optional | Whether actions from GitHub Marketplace verified creators are allowed. Set to `true` to allow all actions by GitHub Marketplace verified creators. | Boolean getVerifiedAllowed() | setVerifiedAllowed(Boolean verifiedAllowed) |
| `PatternsAllowed` | `List<String>` | Optional | Specifies a list of string-matching patterns to allow specific action(s) and reusable workflow(s). Wildcards, tags, and SHAs are allowed. For example, `monalisa/octocat@*`, `monalisa/octocat@v2`, `monalisa/*`." | List<String> getPatternsAllowed() | setPatternsAllowed(List<String> patternsAllowed) |

## Example (as JSON)

```json
{
  "github_owned_allowed": null,
  "verified_allowed": null,
  "patterns_allowed": null
}
```

