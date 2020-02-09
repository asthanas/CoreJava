

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/life")
public class LifecycleServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LifecycleServlet() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("** Inside INIT method ");
	}

	
	public void destroy() {
		System.out.println("** Indside destroy menthod ");
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("** Inside service method....");
	}

}
