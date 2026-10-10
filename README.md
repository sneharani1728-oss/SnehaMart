# SnehaMart ✳

Little luxuries for your very own kind of lovely. Multi-seller marketplace for tailored dresses, accessories, and mini tech accessories for tech girlies.

## Project

A curated marketplace with Buyer, Seller, and Admin roles. Buyers search products, manage a cart, place mock orders, see order history and review purchases. Sellers manage listings and incoming orders. Admins view users and orders.

## Architecture

Browser (JSP, CSS, vanilla JS) → versioned Servlet API → JDBC DAO → HikariCP → H2. See docs/architecture.md and the three diagrams in docs/diagrams/.

## Stack

JDK 17 · Tomcat 9 · Servlet 4 (javax) · Maven · JSP/JSTL · JDBC · HikariCP · H2 · Gson · jBCrypt · SLF4J/Logback.

## Run locally

Install JDK 17, Maven, Tomcat 9. Set SNEHAMART_JDBC_URL, SNEHAMART_DB_USER and SNEHAMART_DB_PASSWORD (see .env.example). Run mvn -B clean package, copy target/snehamart.war into Tomcat webapps, start Tomcat, open http://localhost:8080/snehamart/. DatabaseListener applies the schema and demo seed on startup.

Demo credentials: admin@snehamart.local / password and boutique@snehamart.local / password. Remove/change these before public deployment. New buyers and sellers can register.

## API and database

JSON API uses /api/v1 and the {success,data,error} envelope. Health: GET /api/v1/health. Initial schema is src/main/resources/db/migrations/V1__init_schema.sql; repeatable demo data is db/seed.sql.

## Diagrams and delivery

ER, use-case, and order sequence diagrams: docs/diagrams/. No public deployment URL or screenshots are configured yet.

## Current limitations

Checkout is mock-only. Chat uses local FAQ answers. Product images reference Unsplash. Servlet route orchestration still contains business flow and checkout logic that should move into a service layer; automated test coverage, AuthFilter, request-ID filter, Checkstyle, and cloud deployment remain to be completed before final evaluation.
