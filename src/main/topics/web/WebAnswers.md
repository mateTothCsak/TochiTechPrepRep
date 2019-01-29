

# Networking, HTTP, Web technologies
---


### What is the difference between HTML and XML?

**HTML** = Hypertext Markup Language

**XML** = Extensible Markup Language


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

XSL (eXtensible Stylesheet Language) is a styling language for XML - like CSS is a styling language for HTML. 

XMSLT stands for **eXtensible Stylesheet Language Transformations** and is a language used for transforming XML
documents into other XML documents, or into other formats.

*Eg. you can print out the content of an XML file as/into a HTL page with XSLT*


---


### When to use AJAX? Bring examples.

**AJAX** = Asynchronous Javascript and XML

Ajax is not a programming language, but a technique for web applications to send and recieve data asynchronously, 
without impacting the other content or reloading the page. AJAX uses XML HttpRequest object to communicate with
the server, Javascript/DOM to make the request and XML as a format to transfer data,

Ajax *Pro*-s:
1. Makes the webpage fast
2. Stylish
3. Reducing server load - less number of requests means less exectution for the server 
(loading in smaller amount of data as well - in my understandings)

Ajax *Con*-s:
1. Bad for search engine optimalization
2. Bookmark problem
3. Multiple Http request

Where should you ajax?
* Form validation
* Light Box
* Sort or Filter
* Vote or Rating
* Chat websites
* Blog comments
* Captcha

[Sources](http://voidcanvas.com/should-i-use-ajax-if-yes-when-where-and-why/)

[Example code for AJAX](https://codepen.io/eclairereese/pen/rLMzeY)


---


### What is SOA? When to use?
### What kind of HTTP status codes do you know?
### What is a REST API?
### What is JSON? When to use?
### What is TCP/IP? What layers does it define, what are they responsible for?
### What’s the difference between TCP and UDP?
### How does an HTTP Request look like? What are the most relevant HTTP header fields?
### How does an HTTP Response look like? What are the most relevant HTTP header fields?
### What is DNS? How does it work?
