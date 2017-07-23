# Description

Yet another transaction management application.

# Usage

## Run application

Use `./gradlew bootRun` to run the application locally.
The default port is 8080.

## Build artifacts

Use `./gradlew build` to build the application artifacts.

## Clean application

Use `./gradlew clean` to clean the application artifacts.

# API

Use `./gradlew bSUD` in order to build the application API documentation.
The API document can be found at `transapp-api/build/docs/swaggerui/index.html`.

# Technical description

The requirement was to implement a way to retrieve statistics for a specific sliding window
of the last 60 seconds before the request.

The basic implementation choices were:
- spring boot because it is easy to setup without boilerplate code
- h2 db because it is an easy to integrate with spring boot in-memory database
- a main table for transaction persistence and views for the sliding window implementation in order to achieve O(1) preformance at the time of statistics retrieval.
- Groovy & spock framework for quick and clear unit tests

# TODO

- Add more unit tests
- Add API level test layer
- Check concurrency and performance regarding the schema and the views
- Handle exceptional cases

# Q&A

For questions please contact Christos Grivas <chgrivas7@gmail.com>
