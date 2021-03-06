## Singleton Design Pattern

Singleton Pattern says that just "define a class that has only one instance and provides a global point of access to it".

In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.

There are two forms of singleton design pattern:

<b>Early Instantiation </b>: creation of instance at load time. <br>
<b>Lazy Instantiation </b>: creation of instance when required.

Advantage of Singleton Design Pattern: Saves memory because object is not created at each request. Only single instance is reused again and again.

Usage: Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.

Refer: [link](https://www.javatpoint.com/singleton-design-pattern-in-java)
