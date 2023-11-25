package com.web.framework.invoker;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.framework.exception.BussinessException;
import com.web.framework.vo.AbstractVo;

import jakarta.servlet.http.HttpSession;

@Component("framework.removesessioninvoker")
public class RemoveSessionInvoker extends Invoker{

	@Autowired
	private HttpSession httpSession;
	
	
	@Override
	public void execute(AbstractVo featureVo) throws BussinessException {
		
		httpSession.invalidate();
		
	}

}
