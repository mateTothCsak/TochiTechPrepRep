

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

**SOA** is an acronym for Service-oriented architecture, an architectural style of building application - a collection of services which are communicating with each other. This can be a data
passing or two or more services coordinating an activity. 

When to use?
* If you want to integrate heterogenous technologies and applications.
* If you want to keep business logic in one place (easier to change).
* Multiple use case for the same business processes

---

### What kind of HTTP status codes do you know?

**Class 1xx - Infomational**: If an HTTP status code 1xx is transmitted, the server in the client that the request is in motion. The class combines codes that are responsible for delivering information to the client during the request.

**Class 2xx - Success**: A 2xx code announces a succesful operation. If the code is transmitted it means that the client's request was recieved by the server, understood and accepted.

**Class 3xx - Redirection**: A 3xx code shows that the server's request was received. 3xx codes appear during redirections and forwardings.

**Class 4xx - Client error**: If a 4xx code appears then there's benn a client error. The server has received the request, but cannot perform it.

**Class 5xx - Server error**: A 5xx code is shown when the server has failed to perform the request. These server error codes report that the request cannot be performed at present or is not possible at all, which thanm leads to an HTML error page. 

*Examples:*
*200 OK
*300 Multiple Choices
*301 Moved Permanently
*302 Found
*304 Not Modified
*307 Temporary Redirect
*400 Bad Request
*401 Unauthorized
*403 Forbidden
*404 Not Found
*410 Gone
*500 Internal Server Error
*501 Not Implemented
*503 Service Unavailable
*550 Permission denied

---


### What is a REST API?

**REST** = Representational State Transfer
**API** = Application Programming Interface

REST is an architectural style that defines a set of constraints to be used for creating we services.
Web Services that conform to REST are also called RESTful services, and they provide interoperability between computer systems on the Internet.

REST-compilant web services allow the requesting systems to access and manipulate textual representations of web resources by using a uniform and predefined set of stateless operations.

By usind a stateless protocol and standard operations, REST systems aim for fast performance, reliability, and the ability to grow by re-using components that can be managed and updated without affecting the system as a whole, even while it is running. 

*Architectural constraints*:
1. Client-server architecture
2. Statelessness
3. Cacheability
4. Layered system

*HTTP-based restful APIs are defined with the following aspects*:
* A base url like -> http://api.example.com/resources
* A media type that defines state transitions data elements, like
1. application/json
2. text/html
3. text/css
4. image/png
* Standard HTTP methods (GET, POST, PUT, DELETE)

---


### What is JSON? When to use?

**JSON** = JavaScript Object Notations

JSON is a syntax for pasing around ogjects that contain name/value pairs, arrays and other objects. It is derived from the JavaScript programming language for representing simple data structures and associative arrays, called objects. Despite its a relationship to JavaScript, it is language-independent, with parsers available for most programming languages.

For today JSON has became the preffered format over XML as format for data trasnmition, because it is much more leightweight. (Simpler and takes up less space)

---


### What is TCP/IP? What layers does it define, what are they responsible for?

**TCP** = Transmision Control Protocol
**IP** = Internet Protocol
**OSI** = Open System Interconnection

TCP and IP are two protocols belonging to different layers in the OSI model stack.
TCP is responsible for the data delivery of a packet and IP is responsible for the logical addressing.
In the other words, IP obtains the address and TCP guarantees delivery of data to that address. 

*Application layer* - focuses on communication from high-level perspective, such as sending/recieving data. Protocols at this level: HTTP(web), Simple Mail Transfer Protocol (email)
*Transport layer* - provides end-to-end communication services for applications. Most used protocol at this layer: TCP and **User Datagram Protocol** (UDP)
*Internet layer* - exchanges datagram across machines. IP belongs here, which defines IP adresses and its function is routing.
*Link layer* - identifies the network protocol type of the packet. Also provides error control and "framing"
*Physical network* - specifies the characteristics of the hardware to be used for the network. 

---


### What’s the difference between TCP and UDP?

**TCP**

Transmission Control Protocol provides apps a way to deliver (and recieve) am ordered and error-checked stream of information packets over the network.

**UDP*

User Datagram Protocol is used by apps to deliver faster stream of information without any error-checking. The sender does not wait to make sure the recipient received the packets. 

---


### How does an HTTP Request look like? What are the most relevant HTTP header fields?
![HTTP Request](../../resources/images/httprequest.png)



---


### How does an HTTP Response look like? What are the most relevant HTTP header fields?



---


### What is DNS? How does it work?

**DNS** = Domain Name System

DNS is like a directory wich matches names with numbers. In this case names are website URLs, and numbers are IP addresses. DNS were created, because for most people it is easier to remember words instead of sets of numbers.

The DNS directory is not sorted in one place, this is a distributed system. It is stored on domain name servers all around the world, which are communicating with each other. In fact, some sites have hundreds or more IP addresses that correspond with a single domain name. For example, the server your computer reaches for google.com is likely completely different from the server that someone in another country would reach by typing the same site name into their browser. Another reason for the distributed nature, is the amount of time it would take a user to get a response.

DNS information is also cached locally on clients computer to make browsing faster. It is not necessary to get IP address again and again every time you want to reach google. Additional caching can occur on the routers used to connect clients to the internet, as well as on the servers of the user's Internet Service Provider (ISP).

---