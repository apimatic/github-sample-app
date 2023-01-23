# Gitignore

View gitignore templates

```java
GitignoreController gitignoreController = client.getGitignoreController();
```

## Class Name

`GitignoreController`

## Methods

* [Gitignore Get-All-Templates](../../doc/controllers/gitignore.md#gitignore-get-all-templates)
* [Gitignore Get-Template](../../doc/controllers/gitignore.md#gitignore-get-template)


# Gitignore Get-All-Templates

List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user).

API method documentation: [https://docs.github.com/rest/reference/gitignore#get-all-gitignore-templates](https://docs.github.com/rest/reference/gitignore#get-all-gitignore-templates)

```java
CompletableFuture<List<String>> gitignoreGetAllTemplatesAsync()
```

## Response Type

`List<String>`

## Example Usage

```java
gitignoreController.gitignoreGetAllTemplatesAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
[
  "Actionscript",
  "Android",
  "AppceleratorTitanium",
  "Autotools",
  "Bancha",
  "C",
  "C++"
]
```


# Gitignore Get-Template

The API also allows fetching the source of a single template.
Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.

API method documentation: [https://docs.github.com/rest/reference/gitignore#get-a-gitignore-template](https://docs.github.com/rest/reference/gitignore#get-a-gitignore-template)

```java
CompletableFuture<GitignoreTemplatesResponse> gitignoreGetTemplateAsync(
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Template, Required | - |

## Response Type

[`GitignoreTemplatesResponse`](../../doc/models/gitignore-templates-response.md)

## Example Usage

```java
String name = "name0";

gitignoreController.gitignoreGetTemplateAsync(name).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "C",
  "source": "# Object files\n*.o\n\n# Libraries\n*.lib\n*.a\n\n# Shared objects (inc. Windows DLLs)\n*.dll\n*.so\n*.so.*\n*.dylib\n\n# Executables\n*.exe\n*.out\n*.app\n"
}
```

