import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = "test-servlet")
public class MainServlet implements Servlet {

    private transient ServletConfig config;
    Logger logger = LoggerFactory.getLogger(MainServlet.class);

    public void init(ServletConfig servletConfig) throws ServletException {
        config = servletConfig;
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        logger.info(req.toString());
        res.getWriter().println("Test Servlet");
        logger.info(res.toString());
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        logger.info("Servlet destroyed.");
    }
}
