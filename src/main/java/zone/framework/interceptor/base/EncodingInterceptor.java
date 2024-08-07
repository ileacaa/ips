package zone.framework.interceptor.base;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 字符集编码拦截器
 * 
 * @author linux liu
 * 
 */
public class EncodingInterceptor extends AbstractInterceptor {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = Logger.getLogger(EncodingInterceptor.class);

	public String intercept(ActionInvocation actionInvocation) throws Exception {
		//ActionContext actionContext = actionInvocation.getInvocationContext();
		ServletActionContext.getResponse().setCharacterEncoding("utf-8");
		ServletActionContext.getRequest().setCharacterEncoding("utf-8");
		return actionInvocation.invoke();
	}

}
