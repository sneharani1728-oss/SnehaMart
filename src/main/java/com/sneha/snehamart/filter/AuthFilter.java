package com.sneha.snehamart.filter;
import javax.servlet.*;import javax.servlet.annotation.WebFilter;import javax.servlet.http.*;import java.io.IOException;
/** Rejects API requests for private marketplace operations without a session. */
@WebFilter(urlPatterns={"/api/v1/cart","/api/v1/cart/*","/api/v1/orders","/api/v1/reviews","/api/v1/seller/*","/api/v1/admin","/api/v1/admin/*","/api/v1/wishlist/*"})
public final class AuthFilter implements Filter {public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException{HttpServletRequest q=(HttpServletRequest)req;HttpServletResponse s=(HttpServletResponse)res;if(q.getSession(false)==null||q.getSession(false).getAttribute("user")==null){s.setStatus(401);s.setContentType("application/json;charset=UTF-8");s.getWriter().write("{\"success\":false,\"data\":null,\"error\":{\"code\":\"UNAUTHENTICATED\",\"message\":\"Please sign in first.\"}}");return;}chain.doFilter(req,res);}}
