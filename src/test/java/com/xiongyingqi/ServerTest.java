//package com.xiongyingqi;
//
//import com.xiongyingqi.web.filter.MobileRedirectFilter;
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.server.SessionIdManager;
//import org.eclipse.jetty.server.session.HashSessionIdManager;
//import org.eclipse.jetty.servlet.FilterHolder;
//import org.eclipse.jetty.servlet.FilterMapping;
//import org.eclipse.jetty.servlet.ServletContextHandler;
//import org.eclipse.jetty.servlet.ServletHandler;
//
///**
// * Created by qi<a href="http://xiongyingqi.com">xiongyingqi.com</a> on 15-4-23.
// */
//public class ServerTest {
//    private static final String CONTEXT_PATH = "src/main/webapp";
//    private static final String CONFIG_LOCATION = "com.xiongyingqi.jetty.config";
//    private static final String DEFAULT_PROFILE = "dev";
//    private static final String MAPPING_URL = "/*";
//
//
//    public static void main(String[] args) throws Exception {
//        Server server = new Server(9090);
//
//        ServletContextHandler contextHandler = new ServletContextHandler();
//        contextHandler.setContextPath(CONTEXT_PATH);
//
//        server.setHandler(contextHandler);
//
//        ServletHandler servletHandler = new ServletHandler();
//        contextHandler.setServletHandler(servletHandler);
//
//        FilterHolder filterHolder = new FilterHolder(new MobileRedirectFilter());
//        filterHolder.setName("mobileRedirectFilter");
//        filterHolder.setServletHandler(servletHandler);
//        servletHandler.setFilters(new FilterHolder[]{filterHolder});
//
//        FilterMapping filterMapping = new FilterMapping();
//        filterMapping.setPathSpec("*.jsp");
//        filterMapping.setFilterName("mobileRedirectFilter");
//        servletHandler.setFilterMappings(new FilterMapping[]{filterMapping});
//
//        SessionIdManager sessionIdManager = new HashSessionIdManager();
//        server.setSessionIdManager(sessionIdManager);
//
//        server.start();
//        server.join();
//    }
//
//
//
//}
