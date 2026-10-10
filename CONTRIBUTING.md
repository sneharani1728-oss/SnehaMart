# Contributing

1. Install Git, JDK 17, Maven and Tomcat 9. Clone the repository and branch feature/name.
2. Open an issue with motivation, acceptance criteria, affected layers, migration/API impact.
3. Use Conventional Commit prefixes: feat:, fix:, test:, docs:. Never commit real credentials or DB files.
4. Add/update tests and docs. Run mvn -B clean verify.
5. Open a self-reviewed PR with change summary and verification. Merge after CI is green.

Local run: mvn -B clean package, deploy target/snehamart.war to Tomcat 9.
