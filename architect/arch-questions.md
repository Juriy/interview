General questions
----------
- Describe the role of the architect in a project
- Describe most complex architecture that you created
- Describe your industry and domain experience

SDLC
----------
- Architect role in SCRUM process
- Architecture governance in SCRUM
- How to check code quality, top 5 things you check when you assess the code

Enterprise Architecture
----------
- What is Enterprise architecture? How is it different from systems (solution) architecture?
- TOGAF Framework?
- What is architecture Blueprint? What does it include? Do you have experience creating one?
- RFQ response. How would you organize the work in case of very limited time to bid?

Tools and Frameworks
----------
- Name several new features of Java 8 (ES 2015, or relevant tech)
- Spring / J2EE experience (or relevant .NET alternatives)
- Multithreading
- DBMS experience. NoSQL experience. Pros and Cons of different platforms.
- ESB 

Microservices
----------
- Enterprise Architecture patterns
- Microservice architecture
  - What are the benefits of µService architecture compared to monolithic
  - What are the challenges of µService architecture (when you would not recommend to use it)
  - What are the patterns of µService communication (synchronous / asynchronous)
  - What is a way to ensure data consistency without using distributed transactions (sagas, orchestration vs choreography)
  - Describe what does it mean when the system is eventually consistent
  - Scenario: you have a service that needs to update the database and publish an event *atomically*. How is it possible to achieve that (2PC is not an option)

- Migration scenarios: (monolith to microservices). What do you think are some of the most challenging parts of it?


Applied architecture
----------
- Big Data processing scenarios
- Risk management in architecture
- **How would you document your architecture (with emphasis on what kind of documents, views would he produce, if he would include any reasoning behind the decisions etc).**
*The idea is to check “Documenting software architecture” skill and knowledge of typical architecture views. A candidate might not know by heart the exact names, but have a general idea of different perspectives on the same system. This looks similar to the existing question “what is a structure of Software Architecture Document” but this one is more open-ended.*

- **You have performance req a system: “under a normal network conditions and average amount of connected users the system should respond within 1 second”. How would you check that your architecture will satisfy the requirement?** *Firstly they should be double-checking terms “normal network conditions” and “average amount of connected users”, what exactly those mean for the system? Then he should analyse several complex Scenarios against Process View and Physical View (he can name the views in a different way, but the idea is to check the performance of involved components plus any communication overhead). Another way would be building a prototype or comparing against some exiting system implementations if there are such.*

- **You have an option to choose between two platforms that provide similar functionality (for example, MySQL vs Postgres). How would you approach the evaluation?** *The idea is to check if a candidate will take into the account the environment, existing expertise and the requirements of particular project. The wrong answer is to evaluate features in vacuum.*
goog

.
- **You need to perform the architectural evaluation of the existing system. How would you approach it?**

REST
----------
- which methods for authenticating REST calls do you know (sessions, JWT, OAuth, etc)
- what is idempotent call (what is "idempotence"?). Which HTTP verbs should be idempotent?


Dev Ops 
----------
- CI/CD - experience setting up one (Jenkins / Bamboo, GitLab CI, Azure DevOps)
- What’s the difference between container virtualisation and hypervisor (VM) virtualisation? Name several weaknesses of each
- Which patterns (or tools) do you know to ensure fault-tolerancy of the services
- Experience with cloud providers and relevant services (Amazon, MS Azure)

