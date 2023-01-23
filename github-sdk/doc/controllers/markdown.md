# Markdown

Render GitHub flavored markdown

```java
MarkdownController markdownController = client.getMarkdownController();
```

## Class Name

`MarkdownController`

## Methods

* [Markdown Render](../../doc/controllers/markdown.md#markdown-render)
* [Markdown Render-Raw](../../doc/controllers/markdown.md#markdown-render-raw)


# Markdown Render

Render a Markdown document

API method documentation: [https://docs.github.com/rest/reference/markdown#render-a-markdown-document](https://docs.github.com/rest/reference/markdown#render-a-markdown-document)

```java
CompletableFuture<String> markdownRenderAsync(
    final MarkdownRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`MarkdownRequest`](../../doc/models/markdown-request.md) | Body, Required | - |

## Response Type

`String`

## Example Usage

```java
MarkdownRequest body = new MarkdownRequest();
body.setText("Hello **world**");

markdownController.markdownRenderAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"<p>Hello <strong>world</strong></p>"
```


# Markdown Render-Raw

You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.

API method documentation: [https://docs.github.com/rest/reference/markdown#render-a-markdown-document-in-raw-mode](https://docs.github.com/rest/reference/markdown#render-a-markdown-document-in-raw-mode)

```java
CompletableFuture<String> markdownRenderRawAsync(
    final String body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | `String` | Body, Optional | - |

## Response Type

`String`

## Example Usage

```java
String body = "{\"text\":\"Hello **world**\"}";

markdownController.markdownRenderRawAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"<p>Hello <strong>world</strong></p>"
```

