Repo cleanup
============

A clean kitchen is a happy kitchen. Please revise your git ignore file
to only add and commit files that a necessary for building your project

Remove the entrypoint.sh script because you don't need it anymore. Don't 
forget to adapt your dockerfile. 


CI / CD 
=======

What is CI/CD. Prepare a short presentation (10 min). How does this relate
to the 12 factor app manifesto?

Please add a travis job to test your java application and building of the docker container


Http Endpoints
==============

Remember HTTP? Remember express.js? The java equivalent is embedded jetty. Please fork the following Repo https://github.com/querwurzelt/embedded-jetty-poc
and get the application to work. What is is doing?


health Endpoint
---------------

Please us the project as a reference to implement your own endpoint in your crawler which
returns the string "UP" when browsing the url ".../health". This is a typical endpoint that most apis are providing.
here is an example: http://rss-import-production.ipool.asideas.de/admin/health

You have to change the dyno type from WORKER to WEB because now your app is serving http requests

ping pong endpoint
------------------

Implement an endpoint under .../api/pingpong that takes a query parameter echo. If the value in the parameter
is "ping", please return "pong". If the value is "pong", please respond with "ping". Otherwise the status code 400


health Returns json
-------------------

Please chance your health endpoint response to use json to machines and other programs can read your data.

```json 
{
    status: "up"
}
```

In order to solve the conversion of your object to an json, please add a new dependency implementation(“org.eclipse.jetty:jetty-util:9.4.27.v20200227”) and 
use the class https://www.eclipse.org/jetty/javadoc/current/org/eclipse/jetty/util/ajax/JSON.html


Search endpoint
---------------

Implement an endpoint under .../api/search that returns the 10 latest articles as json.

You have to implement a new use case method that returns the latest 10 articles and also implement a new method in the database repository class.

Searching for sport
----------------------

Extend your search endpoint to allow a user get latest 10 articles for a given category.

For example:

    /api/search?category="SPORT" 
I

You have to implement a new usecase method and a new db repository method that does a category search.

Searching for sugarman
----------------------

Extend your search endpoint to allow a user to search for a specific term.

For example:

    /api/search?term="Sugarman" 
I

You have to implement a new usecase method and a new db repository method that does a term search. 
