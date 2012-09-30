package org.hawknetwork.hawkrota.servlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HawkRotaServlet extends HttpServlet {
	
	public static final String REQUEST_TYPE_PARAMETER_NAME = "requestType";
	
	public static final int INVALID_REQUEST_TYPE_ERROR_CODE = 1;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
		String respString = "";
		RequestType requestType = RequestType.fromVal(req.getParameter(REQUEST_TYPE_PARAMETER_NAME));
		if (requestType == null) {
			respString = "e"+Integer.toString(INVALID_REQUEST_TYPE_ERROR_CODE);
		} else {
			switch(requestType) {
			case PROCESS_AND_WAIT:
				respString = process(req,true);
				break;
			case PROCESS_AND_NEED_ACKNOWLEDGEMENT:
				respString = process(req,false);
				break;
			case STATUS_UPDATE:
				respString = null; //TODO
				break;
			case INPUT_DATA:
				respString = null; //TODO
				break;
			default:
				respString = "e"+Integer.toString(INVALID_REQUEST_TYPE_ERROR_CODE);	
			}
		}
		resp.getWriter().print(respString);
	}
	
	private String process(HttpServletRequest req, boolean wait) {
		//TODO
		return null;
	}
	
}
