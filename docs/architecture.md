# Architecture

Browser (JSP, CSS, vanilla JS fetch) → filters → ApiServlet front controller → JdbcDAO → HikariCP → H2. HttpSession stores signed-in identity/role. DatabaseListener initializes the pool and schema/seed scripts, and closes the pool at shutdown.

Patterns in this prototype: front controller (ApiServlet), DAO (JdbcDAO), connection pool lifecycle singleton (ServletContextListener). Checkout transaction still resides in servlet and should move to service/DAO. DAO factory, swappable payment strategy, service/DTO packages, AuthFilter, request-ID filter, and builder pattern remain for the next architecture pass.

Required diagrams: docs/diagrams/er.md, use-cases.md, place-order.md.
