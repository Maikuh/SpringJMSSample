# Spring JMS Sample

## Description 
Sample Spring JMS application. Slightly modified version from [Spring's Official Guide](https://spring.io/guides/gs/messaging-jms/).

## Modification Explanation
1. The context in the main() method was made global, so that it can be accessed from other components and therefore made easier to use 
in a Controller for example.
2. The model is not exactly the same from the guide. Instead of it being an Email model, it's a model based on how a chat would work, 
sort of.

### Todo
> While writing this, I realized it'd be easier to make the JmsTemplate variable global instead of the context one, 
since it's not being used anywhere else. This means less code.
