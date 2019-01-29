

# Networking, HTTP, Web technologies
---


### What is the difference between HTML and XML?

HTML = Hypertext Markup Language
XML = Extensible Markup Language

HTML example:
```html
<html>
<head><title>Books</title><head>

<body>

<h2>Books</h2>
<hr>

<em>Sense and Sensibility</em>, <b>Jane Austen</b>, 1811<br>
<em>Pride and Prejudice</em>, <b>Jane Austen</b>, 1813<br>
<em>Alice in Wonderland</em>, <b>Lewis Carroll</b>, 1866<br>
<em>Through the Looking Glass<</em>, <b>Lewis Carroll</b>, 1872<br>

</body>
</html>
```

XML example:
```xml
<books>
   <book>
      <title>Sense and Sensibility</title>
      <author>Jane Austen</author>
      <year>1811</year>
   </book>

   <book>
      <title>Pride and Prejudice</title>
      <author>Jane Austen</author>
      <year>1813</year>
   </book>

   <book>
      <title>Alice in Wonderland</title>
      <author>Lewis Carroll</author>
      <year>1866</year>
   </book>

   <book>
      <title>Through the Looking Glass</title>
      <author>Lewis Carroll</author>
      <year>1872</year>
   </book>
</books>
```

* HTML was designed to sidplay data - with focus on how data looks
* HTML works with predefined tags (like h1, p, table etc.)
* XML was designed to carry data - with focus on what data is
* XML does not use predefined tags - the tags are invented by the author
* With XML the author must define both the tags and the document structure

[Source](https://stackoverflow.com/questions/47471354/why-xml-is-called-extensible-markup-language)
---

### What is XSLT?

### When to use AJAX? Bring examples.
### What is SOA? When to use?
### What kind of HTTP status codes do you know?
### What is a REST API?
### What is JSON? When to use?
### What is TCP/IP? What layers does it define, what are they responsible for?
### What’s the difference between TCP and UDP?
### How does an HTTP Request look like? What are the most relevant HTTP header fields?
### How does an HTTP Response look like? What are the most relevant HTTP header fields?
### What is DNS? How does it work?
